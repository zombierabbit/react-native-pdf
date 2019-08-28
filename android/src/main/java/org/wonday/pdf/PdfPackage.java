package org.wonday.pdf;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;

public class PdfPackage implements ReactPackage {

  @Override
  public List<NativeModule> createNativeModules(
      ReactApplicationContext reactContext) {
    return Arrays.asList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Arrays.<ViewManager>asList(new RCTPdfManager(reactContext));
  }
}

package u3;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.telephony.TelephonyCallback;
import android.view.View;
import android.window.SplashScreenView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ CameraExtensionCharacteristics d(Object obj2) {
        return (CameraExtensionCharacteristics) obj2;
    }

    public static /* synthetic */ ExtensionSessionConfiguration e(int i, List list, Executor executor, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        return new ExtensionSessionConfiguration(i, list, executor, cameraExtensionSession$StateCallback);
    }

    public static /* synthetic */ InputConfiguration f(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo g(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* bridge */ /* synthetic */ TelephonyCallback h(Object obj2) {
        return (TelephonyCallback) obj2;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView i(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return CameraExtensionCharacteristics.class;
    }

    public static /* synthetic */ void m() {
    }
}

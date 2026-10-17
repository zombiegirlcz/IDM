package yu;

import android.os.Build;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.QuirkSettings;
import com.revolut.camera.CameraXQuirkModeExperiment;
import e4m.e;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import th0.l;
import vc.s;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements e {
    public static CameraXConfig a() {
        Set setB;
        ih0.b remoteConfig = ((th0.a) l.Companion.c()).f();
        xu.l configuredMode = xu.l.CLOSE_DEVICE_AND_DISABLE_ABORT;
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(configuredMode, "defaultMode");
        CameraXQuirkModeExperiment.f50680c.getClass();
        String strE = ((ii0.b) remoteConfig).e("EID_CAMERAX_QUIRK_MODE");
        xu.l lVar = null;
        if (!d0.W(strE)) {
            xu.l.Companion.getClass();
            xu.l[] lVarArrValues = xu.l.values();
            int length = lVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    configuredMode = null;
                    break;
                }
                xu.l lVar2 = lVarArrValues[i];
                if (Intrinsics.f(lVar2.a(), strE)) {
                    configuredMode = lVar2;
                    break;
                }
                i++;
            }
            if (configuredMode == null) {
                configuredMode = xu.l.OFF;
            }
        }
        Intrinsics.checkNotNullParameter(configuredMode, "mode");
        CameraXConfig cameraXConfigDefaultConfig = Camera2Config.INSTANCE.defaultConfig();
        Intrinsics.checkNotNullParameter(configuredMode, "configuredMode");
        Set set = bv.a.f18920a;
        if (Build.VERSION.SDK_INT >= 35 && bv.a.f18920a.contains(Build.MODEL)) {
            lVar = configuredMode;
        }
        if (lVar == null) {
            lVar = xu.l.OFF;
        }
        int i2 = bv.b.f18921a[lVar.ordinal()];
        if (i2 == 1) {
            setB = h0.f322473a;
        } else if (i2 == 2) {
            setB = y0.b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
        } else if (i2 == 3) {
            setB = y0.b(DisableAbortCapturesOnStopQuirk.class);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Class[] elements = {CloseCameraDeviceOnCameraGraphCloseQuirk.class, DisableAbortCapturesOnStopQuirk.class};
            Intrinsics.checkNotNullParameter(elements, "elements");
            setB = kotlin.collections.d.y0(elements);
        }
        if (!setB.isEmpty()) {
            cameraXConfigDefaultConfig = CameraXConfig.Builder.fromConfig(cameraXConfigDefaultConfig).setQuirkSettings(QuirkSettings.withQuirksForceEnabled(setB)).build();
            Intrinsics.checkNotNullExpressionValue(cameraXConfigDefaultConfig, "build(...)");
        }
        s.k(cameraXConfigDefaultConfig);
        return cameraXConfigDefaultConfig;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}

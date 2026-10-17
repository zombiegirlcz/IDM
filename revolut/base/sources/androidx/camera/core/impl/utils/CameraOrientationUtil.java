package androidx.camera.core.impl.utils;

import a0.d;
import androidx.camera.core.Logger;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraOrientationUtil {
    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (Logger.isVerboseEnabled("CameraOrientationUtil")) {
            StringBuilder sbW = a.w("getRelativeImageRotation: destRotationDegrees=", i, i2, ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbW.append(z);
            sbW.append(", result=");
            sbW.append(i3);
            Logger.d("CameraOrientationUtil", sbW.toString());
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(d.n("Unsupported surface rotation: ", i));
    }
}

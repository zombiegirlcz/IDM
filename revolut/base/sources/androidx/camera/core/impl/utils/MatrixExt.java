package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MatrixExt {
    private static final float[] sTemp = new float[16];

    private static void denormalize(float[] fArr, float f, float f4) {
        Matrix.translateM(fArr, 0, -f, -f4, BitmapDescriptorFactory.HUE_RED);
    }

    private static void normalize(float[] fArr, float f, float f4) {
        Matrix.translateM(fArr, 0, f, f4, BitmapDescriptorFactory.HUE_RED);
    }

    public static void preRotate(float[] fArr, float f, float f4, float f5) {
        normalize(fArr, f4, f5);
        Matrix.rotateM(fArr, 0, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        denormalize(fArr, f4, f5);
    }

    public static void preVerticalFlip(float[] fArr, float f) {
        normalize(fArr, BitmapDescriptorFactory.HUE_RED, f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, BitmapDescriptorFactory.HUE_RED, f);
    }
}

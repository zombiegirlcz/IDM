package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    public abstract PointF convertPoint(float f, float f4);

    public final MeteringPoint createPoint(float f, float f4) {
        return createPoint(f, f4, getDefaultPointSize());
    }

    public void setSurfaceAspectRatio(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public final MeteringPoint createPoint(float f, float f4, float f5) {
        PointF pointFConvertPoint = convertPoint(f, f4);
        return new MeteringPoint(pointFConvertPoint.x, pointFConvertPoint.y, f5, this.mSurfaceAspectRatio);
    }
}

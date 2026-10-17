package androidx.camera.core;

import android.util.Rational;

/* JADX INFO: loaded from: classes15.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private Rational mSurfaceAspectRatio;

    public MeteringPoint(float f, float f4, float f5, Rational rational) {
        this.mNormalizedX = f;
        this.mNormalizedY = f4;
        this.mSize = f5;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }
}

package androidx.constraintlayout.core.motion.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public class SpringStopEngine implements StopEngine {
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d) {
        if (d <= 0.0d) {
            return;
        }
        double d5 = this.mStiffness;
        double d6 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d5 / ((double) this.mMass)) * d) * 4.0d)) + 1.0d);
        double d10 = d / ((double) iSqrt);
        int i = 0;
        while (i < iSqrt) {
            float f = this.mPos;
            double d15 = this.mTargetPos;
            float f4 = this.mV;
            double d41 = d5;
            double d51 = ((-d5) * (((double) f) - d15)) - (((double) f4) * d6);
            float f5 = this.mMass;
            double d68 = d6;
            double d81 = (((d51 / ((double) f5)) * d10) / 2.0d) + ((double) f4);
            double d82 = ((((-((((d10 * d81) / 2.0d) + ((double) f)) - d15)) * d41) - (d81 * d68)) / ((double) f5)) * d10;
            double d95 = (d82 / 2.0d) + ((double) f4);
            float f6 = f4 + ((float) d82);
            this.mV = f6;
            float f32 = f + ((float) (d95 * d10));
            this.mPos = f32;
            int i2 = this.mBoundaryMode;
            if (i2 > 0) {
                if (f32 < BitmapDescriptorFactory.HUE_RED && (i2 & 1) == 1) {
                    this.mPos = -f32;
                    this.mV = -f6;
                }
                float f35 = this.mPos;
                if (f35 > 1.0f && (i2 & 2) == 2) {
                    this.mPos = 2.0f - f35;
                    this.mV = -this.mV;
                }
            }
            i++;
            d5 = d41;
            d6 = d68;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        compute(f - this.mLastTime);
        this.mLastTime = f;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = ((double) this.mPos) - this.mTargetPos;
        double d5 = this.mStiffness;
        double d6 = this.mV;
        return Math.sqrt((((d5 * d) * d) + ((d6 * d6) * ((double) this.mMass))) / d5) <= ((double) this.mStopThreshold);
    }

    public void springConfig(float f, float f4, float f5, float f6, float f32, float f35, float f36, int i) {
        this.mTargetPos = f4;
        this.mDamping = f35;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = f5;
        this.mStiffness = f32;
        this.mMass = f6;
        this.mStopThreshold = f36;
        this.mBoundaryMode = i;
        this.mLastTime = BitmapDescriptorFactory.HUE_RED;
    }
}

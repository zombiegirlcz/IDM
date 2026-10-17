package androidx.constraintlayout.core.motion.utils;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public class StopLogicEngine implements StopEngine {
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f) {
        this.mDone = false;
        float f4 = this.mStage1Duration;
        if (f <= f4) {
            float f5 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f5) * f) * f) / (f4 * 2.0f)) + (f5 * f);
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return this.mStage1EndPosition;
        }
        float f6 = f - f4;
        float f32 = this.mStage2Duration;
        if (f6 < f32) {
            float f35 = this.mStage1EndPosition;
            float f36 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f36) * f6) * f6) / (f32 * 2.0f)) + (f36 * f6) + f35;
        }
        if (i == 2) {
            return this.mStage2EndPosition;
        }
        float f37 = f6 - f32;
        float f41 = this.mStage3Duration;
        if (f37 > f41) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f42 = this.mStage2EndPosition;
        float f57 = this.mStage3Velocity;
        return ((f57 * f37) + f42) - (((f57 * f37) * f37) / (f41 * 2.0f));
    }

    private void setup(float f, float f4, float f5, float f6, float f32) {
        this.mDone = false;
        this.mStage3EndPosition = f4;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0E-4f;
        }
        float f35 = f / f5;
        float f36 = (f35 * f) / 2.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt((f4 - ((((-f) / f5) * f) / 2.0f)) * f5);
            if (fSqrt < f6) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = BitmapDescriptorFactory.HUE_RED;
                float f37 = (fSqrt - f) / f5;
                this.mStage1Duration = f37;
                this.mStage2Duration = fSqrt / f5;
                this.mStage1EndPosition = ((f + fSqrt) * f37) / 2.0f;
                this.mStage2EndPosition = f4;
                this.mStage3EndPosition = f4;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f6;
            this.mStage3Velocity = f6;
            float f41 = (f6 - f) / f5;
            this.mStage1Duration = f41;
            float f42 = f6 / f5;
            this.mStage3Duration = f42;
            float f57 = ((f + f6) * f41) / 2.0f;
            float f69 = (f42 * f6) / 2.0f;
            this.mStage2Duration = ((f4 - f57) - f69) / f6;
            this.mStage1EndPosition = f57;
            this.mStage2EndPosition = f4 - f69;
            this.mStage3EndPosition = f4;
            return;
        }
        if (f36 >= f4) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f;
            this.mStage2Velocity = BitmapDescriptorFactory.HUE_RED;
            this.mStage1EndPosition = f4;
            this.mStage1Duration = (2.0f * f4) / f;
            return;
        }
        float f75 = f4 - f36;
        float f77 = f75 / f;
        if (f77 + f35 < f32) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f;
            this.mStage3Velocity = BitmapDescriptorFactory.HUE_RED;
            this.mStage1EndPosition = f75;
            this.mStage2EndPosition = f4;
            this.mStage1Duration = f77;
            this.mStage2Duration = f35;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f5 * f4));
        float f81 = (fSqrt2 - f) / f5;
        this.mStage1Duration = f81;
        float f82 = fSqrt2 / f5;
        this.mStage2Duration = f82;
        if (fSqrt2 < f6) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = BitmapDescriptorFactory.HUE_RED;
            this.mStage1Duration = f81;
            this.mStage2Duration = f82;
            this.mStage1EndPosition = ((f + fSqrt2) * f81) / 2.0f;
            this.mStage2EndPosition = f4;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f;
        this.mStage2Velocity = f6;
        this.mStage3Velocity = f6;
        float f93 = (f6 - f) / f5;
        this.mStage1Duration = f93;
        float f94 = f6 / f5;
        this.mStage3Duration = f94;
        float f99 = ((f + f6) * f93) / 2.0f;
        float f100 = (f94 * f6) / 2.0f;
        this.mStage2Duration = ((f4 - f99) - f100) / f6;
        this.mStage1EndPosition = f99;
        this.mStage2EndPosition = f4 - f100;
        this.mStage3EndPosition = f4;
    }

    public void config(float f, float f4, float f5, float f6, float f32, float f35) {
        this.mDone = false;
        this.mStartPosition = f;
        boolean z = f > f4;
        this.mBackwards = z;
        if (z) {
            setup(-f5, f - f4, f32, f35, f6);
        } else {
            setup(f5, f4 - f, f32, f35, f6);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float fCalcY = calcY(f);
        this.mLastPosition = fCalcY;
        this.mLastTime = f;
        return this.mBackwards ? this.mStartPosition - fCalcY : this.mStartPosition + fCalcY;
    }

    public float getVelocity(float f) {
        float f4;
        float f5;
        float f6 = this.mStage1Duration;
        if (f <= f6) {
            f4 = this.mStage1Velocity;
            f5 = this.mStage2Velocity;
        } else {
            int i = this.mNumberOfStages;
            if (i == 1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            f -= f6;
            f6 = this.mStage2Duration;
            if (f >= f6) {
                if (i == 2) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f32 = f - f6;
                float f35 = this.mStage3Duration;
                if (f32 >= f35) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                float f36 = this.mStage3Velocity;
                return f36 - ((f32 * f36) / f35);
            }
            f4 = this.mStage2Velocity;
            f5 = this.mStage3Velocity;
        }
        return (((f5 - f4) * f) / f6) + f4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.mStage3EndPosition - this.mLastPosition) < 1.0E-5f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastTime) : getVelocity(this.mLastTime);
    }
}

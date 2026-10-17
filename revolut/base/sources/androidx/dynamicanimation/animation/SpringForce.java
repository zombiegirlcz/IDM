package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public final class SpringForce {
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.mDampingRatio;
        if (d > 1.0d) {
            double d5 = this.mNaturalFreq;
            this.mGammaPlus = (Math.sqrt((d * d) - 1.0d) * d5) + ((-d) * d5);
            double d6 = this.mDampingRatio;
            double d10 = this.mNaturalFreq;
            this.mGammaMinus = ((-d6) * d10) - (Math.sqrt((d6 * d6) - 1.0d) * d10);
        } else if (d >= 0.0d && d < 1.0d) {
            this.mDampedFreq = Math.sqrt(1.0d - (d * d)) * this.mNaturalFreq;
        }
        this.mInitialized = true;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public boolean isAtEquilibrium(float f, float f4) {
        return ((double) Math.abs(f4)) < this.mVelocityThreshold && ((double) Math.abs(f - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f) {
        this.mFinalPosition = f;
        return this;
    }

    public SpringForce setStiffness(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f);
        this.mInitialized = false;
        return this;
    }

    public void setValueThreshold(double d) {
        double dAbs = Math.abs(d);
        this.mValueThreshold = dAbs;
        this.mVelocityThreshold = dAbs * 62.5d;
    }

    public DynamicAnimation.MassState updateValues(double d, double d5, long j2) {
        double dSin;
        double dCos;
        init();
        double d6 = j2 / 1000.0d;
        double d10 = d - this.mFinalPosition;
        double d15 = this.mDampingRatio;
        if (d15 > 1.0d) {
            double d41 = this.mGammaMinus;
            double d51 = this.mGammaPlus;
            double d68 = d10 - (((d41 * d10) - d5) / (d41 - d51));
            double d81 = ((d10 * d41) - d5) / (d41 - d51);
            dSin = (Math.pow(2.718281828459045d, this.mGammaPlus * d6) * d81) + (Math.pow(2.718281828459045d, d41 * d6) * d68);
            double d82 = this.mGammaMinus;
            double dPow = Math.pow(2.718281828459045d, d82 * d6) * d68 * d82;
            double d95 = this.mGammaPlus;
            dCos = (Math.pow(2.718281828459045d, d95 * d6) * d81 * d95) + dPow;
        } else if (d15 == 1.0d) {
            double d100 = this.mNaturalFreq;
            double d101 = (d100 * d10) + d5;
            double d102 = (d101 * d6) + d10;
            double dPow2 = Math.pow(2.718281828459045d, (-d100) * d6) * d102;
            double dPow3 = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d6) * d102;
            double d103 = this.mNaturalFreq;
            dCos = (Math.pow(2.718281828459045d, (-d103) * d6) * d101) + (dPow3 * (-d103));
            dSin = dPow2;
        } else {
            double d104 = 1.0d / this.mDampedFreq;
            double d105 = this.mNaturalFreq;
            double d106 = ((d15 * d105 * d10) + d5) * d104;
            dSin = ((Math.sin(this.mDampedFreq * d6) * d106) + (Math.cos(this.mDampedFreq * d6) * d10)) * Math.pow(2.718281828459045d, (-d15) * d105 * d6);
            double d107 = this.mNaturalFreq;
            double d108 = this.mDampingRatio;
            double d109 = (-d107) * dSin * d108;
            double dPow4 = Math.pow(2.718281828459045d, (-d108) * d107 * d6);
            double d110 = this.mDampedFreq;
            double dSin2 = Math.sin(d110 * d6) * (-d110) * d10;
            double d111 = this.mDampedFreq;
            dCos = (((Math.cos(d111 * d6) * d106 * d111) + dSin2) * dPow4) + d109;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (dSin + this.mFinalPosition);
        massState.mVelocity = (float) dCos;
        return massState;
    }

    public SpringForce(float f) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f;
    }
}

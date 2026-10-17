package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0005R$\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0005¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core", "(FFJ)J", "updateValues", "F", "getFinalPosition", "()F", "setFinalPosition", "", "naturalFreq", "D", "value", "dampingRatio", "getDampingRatio", "setDampingRatio", "getStiffness", "setStiffness", "stiffness", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpringSimulation {
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= BitmapDescriptorFactory.HUE_RED) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core, reason: not valid java name */
    public final long m583updateValuesIJZedt4$animation_core(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f = lastDisplacement - this.finalPosition;
        double d = timeElapsed / 1000.0d;
        float f4 = this.dampingRatio;
        double d5 = ((double) f4) * ((double) f4);
        double d6 = this.naturalFreq;
        double d10 = ((double) (-f4)) * d6;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d5 - ((double) 1)) * d6;
            double d15 = d10 + dSqrt;
            double d41 = d10 - dSqrt;
            double d51 = f;
            double d68 = ((d41 * d51) - ((double) lastVelocity)) / (d41 - d15);
            double d81 = d51 - d68;
            double d82 = d41 * d;
            double d95 = d * d15;
            dSin = (Math.exp(d95) * d68) + (Math.exp(d82) * d81);
            dExp = Math.exp(d82) * d81 * d41;
            dExp2 = Math.exp(d95) * d68 * d15;
        } else {
            if (f4 != 1.0f) {
                double d100 = 1;
                double dSqrt2 = Math.sqrt(d100 - d5) * d6;
                double d101 = f;
                double d102 = (((-d10) * d101) + ((double) lastVelocity)) * (d100 / dSqrt2);
                double d103 = dSqrt2 * d;
                double d104 = d * d10;
                dSin = ((Math.sin(d103) * d102) + (Math.cos(d103) * d101)) * Math.exp(d104);
                dCos = (((Math.cos(d103) * dSqrt2 * d102) + (Math.sin(d103) * (-dSqrt2) * d101)) * Math.exp(d104)) + (d10 * dSin);
                return Motion.m582constructorimpl((((long) Float.floatToRawIntBits((float) dCos)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((float) (dSin + ((double) this.finalPosition))) << 32));
            }
            double d105 = f;
            double d106 = (d6 * d105) + ((double) lastVelocity);
            double d107 = (-d6) * d;
            double d108 = (d * d106) + d105;
            dSin = Math.exp(d107) * d108;
            dExp = Math.exp(d107) * d108 * (-this.naturalFreq);
            dExp2 = Math.exp(d107) * d106;
        }
        dCos = dExp2 + dExp;
        return Motion.m582constructorimpl((((long) Float.floatToRawIntBits((float) dCos)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((float) (dSin + ((double) this.finalPosition))) << 32));
    }
}

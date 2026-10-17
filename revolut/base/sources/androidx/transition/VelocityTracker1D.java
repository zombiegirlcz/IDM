package androidx.transition;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
class VelocityTracker1D {
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f) {
        return (float) (Math.sqrt(Math.abs(f) * 2.0f) * ((double) Math.signum(f)));
    }

    public void addDataPoint(long j2, float f) {
        int i = (this.mIndex + 1) % 20;
        this.mIndex = i;
        this.mTimeSamples[i] = j2;
        this.mDataSamples[i] = f;
    }

    public float calculateVelocity() {
        float fKineticEnergyToVelocity;
        int i = this.mIndex;
        if (i == 0 && this.mTimeSamples[i] == Long.MIN_VALUE) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j2 = this.mTimeSamples[i];
        int i2 = 0;
        long j3 = j2;
        while (true) {
            long j5 = this.mTimeSamples[i];
            if (j5 == Long.MIN_VALUE) {
                break;
            }
            float f = j2 - j5;
            float fAbs = Math.abs(j5 - j3);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j3 = j5;
        }
        if (i2 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i2 == 2) {
            int i3 = this.mIndex;
            int i5 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.mTimeSamples;
            float f4 = jArr[i3] - jArr[i5];
            if (f4 == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float[] fArr = this.mDataSamples;
            fKineticEnergyToVelocity = (fArr[i3] - fArr[i5]) / f4;
        } else {
            int i6 = this.mIndex;
            int i21 = ((i6 - i2) + 21) % 20;
            int i22 = (i6 + 21) % 20;
            long j16 = this.mTimeSamples[i21];
            float f5 = this.mDataSamples[i21];
            int i32 = i21 + 1;
            float f6 = 0.0f;
            for (int i33 = i32 % 20; i33 != i22; i33 = (i33 + 1) % 20) {
                long j22 = this.mTimeSamples[i33];
                float f32 = j22 - j16;
                if (f32 != BitmapDescriptorFactory.HUE_RED) {
                    float f35 = this.mDataSamples[i33];
                    float f36 = (f35 - f5) / f32;
                    float fAbs2 = (Math.abs(f36) * (f36 - kineticEnergyToVelocity(f6))) + f6;
                    if (i33 == i32) {
                        fAbs2 *= 0.5f;
                    }
                    f6 = fAbs2;
                    f5 = f35;
                    j16 = j22;
                }
            }
            fKineticEnergyToVelocity = kineticEnergyToVelocity(f6);
        }
        return fKineticEnergyToVelocity * 1000.0f;
    }
}

package androidx.core.view;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
class VelocityTrackerFallback {
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = BitmapDescriptorFactory.HUE_RED;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = BitmapDescriptorFactory.HUE_RED;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j2;
        int i = this.mDataPointsBufferSize;
        if (i < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = this.mDataPointsBufferLastUsedIndex;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j3 = this.mEventTimes[i2];
        while (true) {
            jArr = this.mEventTimes;
            j2 = jArr[i3];
            if (j3 - j2 <= 100) {
                break;
            }
            this.mDataPointsBufferSize--;
            i3 = (i3 + 1) % 20;
        }
        int i5 = this.mDataPointsBufferSize;
        if (i5 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i5 == 2) {
            int i6 = (i3 + 1) % 20;
            return j2 == jArr[i6] ? BitmapDescriptorFactory.HUE_RED : this.mMovements[i6] / (r2 - j2);
        }
        float f = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < this.mDataPointsBufferSize - 1; i22++) {
            int i32 = i22 + i3;
            long[] jArr2 = this.mEventTimes;
            long j5 = jArr2[i32 % 20];
            int i33 = (i32 + 1) % 20;
            if (jArr2[i33] != j5) {
                i21++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(f);
                float f4 = this.mMovements[i33] / (this.mEventTimes[i33] - j5);
                float fAbs = (Math.abs(f4) * (f4 - fKineticEnergyToVelocity)) + f;
                if (i21 == 1) {
                    fAbs *= 0.5f;
                }
                f = fAbs;
            }
        }
        return kineticEnergyToVelocity(f);
    }

    private static float kineticEnergyToVelocity(float f) {
        return (f < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > 40) {
            clear();
        }
        int i = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i;
        int i2 = this.mDataPointsBufferSize;
        if (i2 != 20) {
            this.mDataPointsBufferSize = i2 + 1;
        }
        this.mMovements[i] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    public void computeCurrentVelocity(int i, float f) {
        float currentVelocity = getCurrentVelocity() * i;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.mLastComputedVelocity = -Math.abs(f);
        } else if (this.mLastComputedVelocity > Math.abs(f)) {
            this.mLastComputedVelocity = Math.abs(f);
        }
    }

    public float getAxisVelocity(int i) {
        return i != 26 ? BitmapDescriptorFactory.HUE_RED : this.mLastComputedVelocity;
    }
}

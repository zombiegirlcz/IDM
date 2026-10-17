package androidx.media3.exoplayer.video;

import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
class VideoFrameReleaseEarlyTimeForecaster {
    private double derivativeOfEarlyTime;
    private Range<Double> derivativeOfEarlyTimeRange;
    private long lastFrameEarlyUs;
    private long lastFramePresentationTimeUs;

    public VideoFrameReleaseEarlyTimeForecaster(float f) {
        Preconditions.checkArgument(f > BitmapDescriptorFactory.HUE_RED);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        this.derivativeOfEarlyTimeRange = range;
        this.derivativeOfEarlyTime = ((Double) range.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    private double calculateDerivativeFromLastFrame(long j2, long j3) {
        long j5 = this.lastFramePresentationTimeUs;
        if (j5 != -9223372036854775807L) {
            if (this.lastFrameEarlyUs != -9223372036854775807L && j2 != j5) {
                return (j3 - r4) / (j2 - j5);
            }
        }
        return ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
    }

    private void updateDerivativeWithExponentialMovingAverage(double d) {
        this.derivativeOfEarlyTime = (d * 0.20000000298023224d) + (this.derivativeOfEarlyTime * 0.800000011920929d);
    }

    public void onVideoFrameProcessed(long j2, long j3) {
        Preconditions.checkArgument(j2 != -9223372036854775807L);
        Preconditions.checkArgument(j3 != -9223372036854775807L);
        updateDerivativeWithExponentialMovingAverage(((Double) this.derivativeOfEarlyTimeRange.clamp(Double.valueOf(calculateDerivativeFromLastFrame(j2, j3)))).doubleValue());
        this.lastFramePresentationTimeUs = j2;
        this.lastFrameEarlyUs = j3;
    }

    public long predictEarlyUs(long j2) {
        if (this.lastFramePresentationTimeUs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (((j2 - r0) * this.derivativeOfEarlyTime) + this.lastFrameEarlyUs);
    }

    public void reset() {
        this.derivativeOfEarlyTime = ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    public void setPlaybackSpeed(float f) {
        Preconditions.checkArgument(f > BitmapDescriptorFactory.HUE_RED);
        this.derivativeOfEarlyTimeRange = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        reset();
    }
}

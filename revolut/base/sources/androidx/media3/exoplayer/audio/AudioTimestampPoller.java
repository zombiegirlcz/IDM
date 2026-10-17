package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;

/* JADX INFO: loaded from: classes15.dex */
final class AudioTimestampPoller {
    private final AudioTimestampWrapper audioTimestamp;
    private final AudioTrackPositionTracker.Listener errorListener;
    private long initialTimestampPositionFrames;
    private long initialTimestampSystemTimeUs;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private final int sampleRate;
    private int state;

    public static final class AudioTimestampWrapper {
        private long accumulatedRawTimestampFramePosition;
        private final AudioTimestamp audioTimestamp = new AudioTimestamp();
        private final AudioTrack audioTrack;
        private boolean expectTimestampFramePositionReset;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public void expectTimestampFramePositionReset() {
            this.expectTimestampFramePositionReset = true;
        }

        public long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j2 = this.audioTimestamp.framePosition;
                long j3 = this.lastTimestampRawPositionFrames;
                if (j3 > j2) {
                    if (this.expectTimestampFramePositionReset) {
                        this.accumulatedRawTimestampFramePosition += j3;
                        this.expectTimestampFramePositionReset = false;
                    } else {
                        this.rawTimestampFramePositionWrapCount++;
                    }
                }
                this.lastTimestampRawPositionFrames = j2;
                this.lastTimestampPositionFrames = j2 + this.accumulatedRawTimestampFramePosition + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack, AudioTrackPositionTracker.Listener listener) {
        this.audioTimestamp = new AudioTimestampWrapper(audioTrack);
        this.sampleRate = audioTrack.getSampleRate();
        this.errorListener = listener;
        reset();
    }

    private void checkTimestampIsPlausibleAndUpdateErrorState(long j2, float f, long j3) {
        long timestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
        long jComputeTimestampPositionUs = computeTimestampPositionUs(j2, f);
        if (Math.abs(timestampSystemTimeUs - j2) > LivenessConstants.MAX_VIDEO_SIZE_BYTES) {
            this.errorListener.onSystemTimeUsMismatch(this.audioTimestamp.getTimestampPositionFrames(), timestampSystemTimeUs, j2, j3);
            updateState(4);
        } else if (Math.abs(jComputeTimestampPositionUs - j3) > LivenessConstants.MAX_VIDEO_SIZE_BYTES) {
            this.errorListener.onPositionFramesMismatch(this.audioTimestamp.getTimestampPositionFrames(), timestampSystemTimeUs, j2, j3);
            updateState(4);
        } else if (this.state == 4) {
            reset();
        }
    }

    private long computeTimestampPositionUs(long j2, float f) {
        return computeTimestampPositionUs(this.audioTimestamp.getTimestampPositionFrames(), this.audioTimestamp.getTimestampSystemTimeUs(), j2, f);
    }

    private boolean isTimestampAdvancingFromInitialTimestamp(long j2, float f) {
        long timestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
        long j3 = this.initialTimestampPositionFrames;
        if (timestampPositionFrames <= j3) {
            return false;
        }
        return Math.abs(computeTimestampPositionUs(j2, f) - computeTimestampPositionUs(j3, this.initialTimestampSystemTimeUs, j2, f)) < 1000;
    }

    private void updateState(int i) {
        this.state = i;
        if (i == 0) {
            this.lastTimestampSampleTimeUs = 0L;
            this.initialTimestampPositionFrames = -1L;
            this.initialTimestampSystemTimeUs = -9223372036854775807L;
            this.initializeSystemTimeUs = System.nanoTime() / 1000;
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 1) {
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.sampleIntervalUs = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.sampleIntervalUs = 500000L;
        }
    }

    public void expectTimestampFramePositionReset() {
        this.audioTimestamp.expectTimestampFramePositionReset();
    }

    public long getTimestampPositionUs(long j2, float f) {
        return computeTimestampPositionUs(j2, f);
    }

    public boolean hasAdvancingTimestamp() {
        return this.state == 2;
    }

    public boolean isWaitingForAdvancingTimestamp() {
        int i = this.state;
        return i == 0 || i == 1;
    }

    public void maybePollTimestamp(long j2, float f, long j3) {
        if (j2 - this.lastTimestampSampleTimeUs < this.sampleIntervalUs) {
            return;
        }
        this.lastTimestampSampleTimeUs = j2;
        boolean zMaybeUpdateTimestamp = this.audioTimestamp.maybeUpdateTimestamp();
        if (zMaybeUpdateTimestamp) {
            checkTimestampIsPlausibleAndUpdateErrorState(j2, f, j3);
        }
        int i = this.state;
        if (i == 0) {
            if (!zMaybeUpdateTimestamp) {
                if (j2 - this.initializeSystemTimeUs > 500000) {
                    updateState(3);
                    return;
                }
                return;
            } else {
                if (this.audioTimestamp.getTimestampSystemTimeUs() >= this.initializeSystemTimeUs) {
                    this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
                    this.initialTimestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
                    updateState(1);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (!zMaybeUpdateTimestamp) {
                reset();
                return;
            }
            if (isTimestampAdvancingFromInitialTimestamp(j2, f)) {
                updateState(2);
                return;
            } else if (j2 - this.initializeSystemTimeUs > 2000000) {
                updateState(3);
                return;
            } else {
                this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
                this.initialTimestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
                return;
            }
        }
        if (i == 2) {
            if (zMaybeUpdateTimestamp) {
                return;
            }
            reset();
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
        } else if (zMaybeUpdateTimestamp) {
            reset();
        }
    }

    public void reset() {
        updateState(0);
    }

    private long computeTimestampPositionUs(long j2, long j3, long j5, float f) {
        return Util.getMediaDurationForPlayoutDuration(j5 - j3, f) + Util.sampleCountToDurationUs(j2, this.sampleRate);
    }
}

package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes.dex */
public interface LoadControl {

    public static final class Parameters {
        public final long bufferedDurationUs;
        public final long lastRebufferRealtimeMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final Timeline timeline;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, float f, boolean z, boolean z3, long j5, long j16) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j2;
            this.bufferedDurationUs = j3;
            this.playbackSpeed = f;
            this.playWhenReady = z;
            this.rebuffering = z3;
            this.targetLiveOffsetUs = j5;
            this.lastRebufferRealtimeMs = j16;
        }
    }

    Allocator getAllocator(PlayerId playerId);

    long getBackBufferDurationUs(PlayerId playerId);

    void onPrepared(PlayerId playerId);

    void onReleased(PlayerId playerId);

    void onStopped(PlayerId playerId);

    void onTracksSelected(Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    boolean retainBackBufferFromKeyframe(PlayerId playerId);

    boolean shouldContinueLoading(Parameters parameters);

    boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2);

    boolean shouldStartPlayback(Parameters parameters);
}

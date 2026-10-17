package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface Renderer extends PlayerMessage.Target {

    public interface WakeupListener {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z3, long j3, long j5, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException;

    default void enableMayRenderStartOfStream() {
    }

    RendererCapabilities getCapabilities();

    default long getDurationToProgressUs(long j2, long j3) {
        if (getState() == 1) {
            return (isReady() || isEnded()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    MediaClock getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, PlayerId playerId, Clock clock);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void release();

    void render(long j2, long j3) throws ExoPlaybackException;

    void replaceStream(Format[] formatArr, SampleStream sampleStream, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j2, boolean z) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f, float f4) throws ExoPlaybackException {
    }

    void setTimeline(Timeline timeline);

    void start() throws ExoPlaybackException;

    void stop();

    default boolean supportsResetPositionWithoutKeyFrameReset(long j2) {
        return false;
    }
}

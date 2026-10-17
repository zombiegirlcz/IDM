package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends Player {
    public static final int DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS;

    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z) {
        }

        void onSleepingForOffloadChanged(boolean z);
    }

    public static final class Builder {
        public static boolean experimentalEnableStuckPlayingDetection = true;
        Function<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        AudioOutputProvider audioOutputProvider;
        Supplier<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier<LoadControl> loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        Supplier<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;
        long releaseTimeoutMs;
        Supplier<RenderersFactory> renderersFactorySupplier;
        ScrubbingModeParameters scrubbingModeParameters;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        int stuckBufferingDetectionTimeoutMs;
        int stuckPlayingDetectionTimeoutMs;
        int stuckPlayingNotEndingTimeoutMs;
        int stuckSuppressedDetectionTimeoutMs;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        Supplier<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;
        boolean wakeModeSet;

        public Builder(Context context) {
            this(context, new m4.b(context, 0), new m4.b(context, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            Preconditions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            Preconditions.checkState(!this.buildCalled);
            Preconditions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new m4.b(trackSelector, 4);
            return this;
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, new m4.b(context, 2), new m4.c(0), new m4.b(context, 3), new i4.a(2));
        }

        private Builder(Context context, Supplier<RenderersFactory> supplier, Supplier<MediaSource.Factory> supplier2, Supplier<TrackSelector> supplier3, Supplier<LoadControl> supplier4, Supplier<BandwidthMeter> supplier5, Function<Clock, AnalyticsCollector> function) {
            this.context = (Context) Preconditions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS;
            this.maxSeekToPreviousPositionMs = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
            this.scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.stuckBufferingDetectionTimeoutMs = 600000;
            this.stuckPlayingDetectionTimeoutMs = experimentalEnableStuckPlayingDetection ? ExoPlayer.DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS : Integer.MAX_VALUE;
            this.stuckPlayingNotEndingTimeoutMs = experimentalEnableStuckPlayingDetection ? DateTimeConstants.MILLIS_PER_MINUTE : Integer.MAX_VALUE;
            this.stuckSuppressedDetectionTimeoutMs = 600000;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
        }
    }

    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j2) {
            this.targetPreloadDurationUs = j2;
        }
    }

    static {
        DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS = Util.isRunningOnEmulator() ? 30000 : 10000;
    }

    @Override // androidx.media3.common.Player
    ExoPlaybackException getPlayerError();

    boolean isScrubbingModeEnabled();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    void setMediaSource(MediaSource mediaSource);

    void setScrubbingModeEnabled(boolean z);
}

package androidx.camera.video;

import android.content.Context;
import android.location.Location;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.OutputStorage;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.muxer.Media3MuxerImpl;
import androidx.camera.video.internal.muxer.MediaMuxerImpl;
import androidx.camera.video.internal.muxer.Muxer;
import androidx.camera.video.internal.muxer.MuxerException;
import androidx.camera.video.internal.muxer.MuxerFactory;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import b0.m;
import com.google.common.util.concurrent.ListenableFuture;
import ie.a0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public final class Recorder implements VideoOutput {
    private static final Executor AUDIO_EXECUTOR;
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    private static final MuxerFactory DEFAULT_MUXER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final VideoEncoderInfo.Finder DEFAULT_VIDEO_ENCODER_INFO_FINDER;
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final OutputStorage.Factory OUTPUT_STORAGE_FACTORY_DEFAULT;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));
    private static final VideoSpec VIDEO_SPEC_DEFAULT;
    static long sRetrySetupVideoDelayMs;
    static int sRetrySetupVideoMaxCount;
    private final EncoderFactory mAudioEncoderFactory;
    private final Executor mExecutor;
    private final MutableStateObservable<Boolean> mIsRecording;
    SurfaceRequest mLatestSurfaceRequest;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private final MuxerFactory mMuxerFactory;
    private final OutputStorage.Factory mOutputStorageFactory;
    private final long mRequiredFreeStorageBytes;
    final Executor mSequentialExecutor;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    private final Executor mUserProvidedExecutor;
    private final int mVideoCapabilitiesSource;
    private final EncoderFactory mVideoEncoderFactory;
    VideoEncoderSession mVideoEncoderSession;
    Timebase mVideoSourceTimebase;
    private final Object mLock = new Object();
    private final MutableStateObservable<Range<Integer>> mVideoEncoderBitrateRange = MutableStateObservable.withInitialState(null);
    private State mState = State.CONFIGURING;
    private State mNonPendingState = null;
    int mStreamId = 0;
    RecordingRecord mActiveRecordingRecord = null;
    RecordingRecord mPendingRecordingRecord = null;
    private long mLastGeneratedRecordingId = 0;
    RecordingRecord mInProgressRecording = null;
    boolean mInProgressRecordingStopping = false;
    private SurfaceRequest.TransformationInfo mInProgressTransformationInfo = null;
    private SurfaceRequest.TransformationInfo mSourceTransformationInfo = null;
    private VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles = null;
    final List<ListenableFuture<Void>> mEncodingFutures = new ArrayList();
    Integer mAudioTrackIndex = null;
    Integer mVideoTrackIndex = null;
    Surface mLatestSurface = null;
    Surface mActiveSurface = null;
    Muxer mMuxer = null;
    AudioSource mAudioSource = null;
    Encoder mVideoEncoder = null;
    OutputConfig mVideoOutputConfig = null;
    Encoder mAudioEncoder = null;
    OutputConfig mAudioOutputConfig = null;
    AudioState mAudioState = AudioState.INITIALIZING;
    Uri mOutputUri = Uri.EMPTY;
    long mRecordingBytes = 0;
    long mRecordingAudioBytes = 0;
    long mRecordingDurationUs = 0;
    long mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
    int mFirstRecordingVideoBitrate = 0;
    long mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
    long mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
    long mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
    long mFileSizeLimitInBytes = 0;
    long mDurationLimitUs = 0;
    int mRecordingStopError = 1;
    Throwable mRecordingStopErrorCause = null;
    EncodedData mPendingFirstVideoData = null;
    final RingBuffer<EncodedData> mPendingAudioRingBuffer = new ArrayRingBuffer(60);
    Throwable mAudioErrorCause = null;
    boolean mIsAudioSourceSilenced = false;
    VideoOutput.SourceState mSourceState = VideoOutput.SourceState.INACTIVE;
    ScheduledFuture<?> mSourceNonStreamingTimeout = null;
    private boolean mNeedsResetBeforeNextStart = false;
    private VideoEncoderConfig mVideoEncoderConfig = null;
    VideoEncoderSession mVideoEncoderSessionToRelease = null;
    double mAudioAmplitude = 0.0d;
    private boolean mShouldSendResumeEvent = false;
    private SetupVideoTask mSetupVideoTask = null;
    private OutputStorage mOutputStorage = null;
    private long mAvailableBytesAboveRequired = Long.MAX_VALUE;
    private boolean mHasGlProcessing = false;

    public enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class Builder {
        private EncoderFactory mAudioEncoderFactory;
        private final MediaSpec.Builder mMediaSpecBuilder;
        private MuxerFactory mMuxerFactory;
        private OutputStorage.Factory mOutputStorageFactory;
        private long mRequiredFreeStorageBytes;
        private EncoderFactory mVideoEncoderFactory;
        private int mVideoCapabilitiesSource = 0;
        private Executor mExecutor = null;

        public Builder() {
            EncoderFactory encoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
            this.mVideoEncoderFactory = encoderFactory;
            this.mAudioEncoderFactory = encoderFactory;
            this.mMuxerFactory = Recorder.DEFAULT_MUXER_FACTORY;
            this.mOutputStorageFactory = Recorder.OUTPUT_STORAGE_FACTORY_DEFAULT;
            this.mRequiredFreeStorageBytes = -1L;
            this.mMediaSpecBuilder = Recorder.MEDIA_SPEC_DEFAULT.toBuilder();
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoCapabilitiesSource, this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mMuxerFactory, this.mOutputStorageFactory, this.mRequiredFreeStorageBytes);
        }

        public Builder setAspectRatio(int i) {
            this.mMediaSpecBuilder.configureVideo(new s0.b(i, 1));
            return this;
        }

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setQualitySelector(QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new a70.a(qualitySelector, 5));
            return this;
        }

        public Builder setTargetVideoEncodingBitRate(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(j6.a.l(i, "The requested target bitrate ", " is not supported. Target bitrate must be greater than 0."));
            }
            this.mMediaSpecBuilder.configureVideo(new s0.b(i, 0));
            return this;
        }

        public Builder setVideoCapabilitiesSource(int i) {
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            Preconditions.checkArgument(z, "Not a supported video capabilities source: " + i);
            this.mVideoCapabilitiesSource = i;
            return this;
        }
    }

    public static abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MuxerSupplier> mMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new e());
        private final AtomicBoolean mMuted = new AtomicBoolean(false);
        private final MutableStateObservable<Boolean> mRecordingState = MutableStateObservable.withInitialState(Boolean.FALSE);

        public interface AudioSourceSupplier {
            AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException;
        }

        public interface MuxerSupplier {
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri2) {
            if (consumer != null) {
                this.mCloseGuard.close();
                consumer.accept(uri2);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        public static RecordingRecord from(PendingRecording pendingRecording, long j2) {
            AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.getIsAudioEnabled(), pendingRecording.getIsPersistent(), j2);
            autoValue_Recorder_RecordingRecord.mute(pendingRecording.getIsAudioInitialMuted());
            return autoValue_Recorder_RecordingRecord;
        }

        private static AudioSourceSupplier getAudioSourceSupplier(final Context context) {
            if (Build.VERSION.SDK_INT < 31) {
                context = null;
            }
            return new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                public AudioSource get(AudioSettings audioSettings, Executor executor) throws AudioSourceAccessException {
                    return new AudioSource(audioSettings, executor, context);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Muxer lambda$initializeRecording$1(MuxerFactory muxerFactory, OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i, Consumer consumer) throws IOException {
            ((q2j.k) muxerFactory).getClass();
            Muxer muxerLambda$static$0 = Recorder.lambda$static$0(i);
            Uri uriFromFile = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w("Recorder", "Failed to create folder for " + file.getAbsolutePath());
                }
                Logger.d("Recorder", "Muxer.setOutput by path = " + file.getAbsolutePath());
                muxerLambda$static$0.setOutput(file.getAbsolutePath(), i);
                uriFromFile = Uri.fromFile(file);
            } else {
                if (!(outputOptions instanceof FileDescriptorOutputOptions)) {
                    throw new AssertionError("Invalid output options type: ".concat(outputOptions.getClass().getSimpleName()));
                }
                Logger.d("Recorder", "Muxer.setOutput by ParcelFileDescriptor");
                muxerLambda$static$0.setOutput(parcelFileDescriptor, i);
            }
            consumer.accept(uriFromFile);
            return muxerLambda$static$0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(Uri uri2) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateVideoRecordEvent$5(VideoRecordEvent videoRecordEvent) {
            getEventListener().accept(videoRecordEvent);
        }

        private void updateRecordingState(VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof VideoRecordEvent.Start) || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
                this.mRecordingState.setState(Boolean.TRUE);
            } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
                this.mRecordingState.setState(Boolean.FALSE);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void finalizeRecording(Uri uri2) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri2);
            }
        }

        public abstract Executor getCallbackExecutor();

        public abstract Consumer<VideoRecordEvent> getEventListener();

        public abstract OutputOptions getOutputOptions();

        public abstract long getRecordingId();

        public StateObservable<Boolean> getRecordingState() {
            return this.mRecordingState;
        }

        public abstract boolean hasAudioEnabled();

        public void initializeRecording(Context context, MuxerFactory muxerFactory) throws IOException {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            OutputOptions outputOptions = getOutputOptions();
            ParcelFileDescriptor parcelFileDescriptorDup = outputOptions instanceof FileDescriptorOutputOptions ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMuxerSupplier.set(new f(this, muxerFactory, outputOptions, parcelFileDescriptorDup));
            if (hasAudioEnabled()) {
                this.mAudioSourceSupplier.set(getAudioSourceSupplier(context));
            }
        }

        public boolean isMuted() {
            return this.mMuted.get();
        }

        public abstract boolean isPersistent();

        public void mute(boolean z) {
            this.mMuted.set(z);
        }

        public AudioSource performOneTimeAudioSourceCreation(AudioSettings audioSettings) throws AudioSourceAccessException {
            if (!hasAudioEnabled()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
            if (andSet != null) {
                return andSet.get(audioSettings, Recorder.AUDIO_EXECUTOR);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        public Muxer performOneTimeMuxerCreation(int i, Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MuxerSupplier andSet = this.mMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time muxer creation has already occurred for recording " + this);
            }
            try {
                f fVar = (f) andSet;
                return fVar.f6893a.lambda$initializeRecording$1(fVar.f6894b, fVar.f6895c, fVar.d, i, consumer);
            } catch (RuntimeException e) {
                throw new IOException("Failed to create Muxer by " + e, e);
            }
        }

        public void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent) {
            updateVideoRecordEvent(videoRecordEvent, true);
        }

        public void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent, boolean z) {
            if (!Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            if (z) {
                String strConcat = "Sending VideoRecordEvent ".concat(videoRecordEvent.getClass().getSimpleName());
                if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                    VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                    if (finalize.hasError()) {
                        StringBuilder sbS = p.a.s(strConcat);
                        sbS.append(" [error: " + VideoRecordEvent.Finalize.errorToString(finalize.getError()) + "]");
                        strConcat = sbS.toString();
                    }
                }
                Logger.d("Recorder", strConcat);
            }
            updateRecordingState(videoRecordEvent);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new c(this, videoRecordEvent));
            } catch (RejectedExecutionException e) {
                Logger.e("Recorder", "The callback executor is invalid.", e);
            }
        }
    }

    public class SetupVideoTask {
        private final int mMaxRetryCount;
        private final SurfaceRequest mSurfaceRequest;
        private final Timebase mTimebase;
        private boolean mIsFailedRetryCanceled = false;
        private int mRetryCount = 0;
        private ScheduledFuture<?> mRetryFuture = null;

        /* JADX INFO: renamed from: androidx.camera.video.Recorder$SetupVideoTask$1, reason: invalid class name */
        public class AnonymousClass1 implements FutureCallback<Encoder> {
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            public AnonymousClass1(VideoEncoderSession videoEncoderSession) {
                this.val$videoEncoderSession = videoEncoderSession;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onFailure$0() {
                if (SetupVideoTask.this.mIsFailedRetryCanceled) {
                    return;
                }
                Logger.d("Recorder", "Retry setupVideo #" + SetupVideoTask.this.mRetryCount);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.setupVideo(setupVideoTask.mSurfaceRequest, SetupVideoTask.this.mTimebase);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                Logger.w("Recorder", "VideoEncoder Setup error: " + th10, th10);
                if (SetupVideoTask.this.mRetryCount >= SetupVideoTask.this.mMaxRetryCount) {
                    Recorder.this.onEncoderSetupError(th10);
                    return;
                }
                SetupVideoTask.access$608(SetupVideoTask.this);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.mRetryFuture = Recorder.scheduleTask(new h(this, 0), Recorder.this.mSequentialExecutor, Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder) {
                Logger.d("Recorder", "VideoEncoder is created. " + encoder);
                if (encoder == null) {
                    return;
                }
                Preconditions.checkState(Recorder.this.mVideoEncoderSession == this.val$videoEncoderSession);
                Preconditions.checkState(Recorder.this.mVideoEncoder == null);
                Recorder.this.onVideoEncoderReady(this.val$videoEncoderSession);
                Recorder.this.onConfigured();
            }
        }

        public SetupVideoTask(SurfaceRequest surfaceRequest, Timebase timebase, boolean z, int i) {
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            Recorder.this.mHasGlProcessing = z;
            this.mMaxRetryCount = i;
        }

        public static /* synthetic */ int access$608(SetupVideoTask setupVideoTask) {
            int i = setupVideoTask.mRetryCount;
            setupVideoTask.mRetryCount = i + 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setupVideo$0(SurfaceRequest surfaceRequest, Timebase timebase) {
            if (surfaceRequest.isServiced() || (Recorder.this.mVideoEncoderSession.isConfiguredSurfaceRequest(surfaceRequest) && !Recorder.this.isPersistentRecordingInProgress())) {
                Logger.w("Recorder", "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + Recorder.this.mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
                return;
            }
            EncoderFactory encoderFactory = Recorder.this.mVideoEncoderFactory;
            Recorder recorder = Recorder.this;
            VideoEncoderSession videoEncoderSession = new VideoEncoderSession(encoderFactory, recorder.mSequentialExecutor, recorder.mExecutor);
            Recorder recorder2 = Recorder.this;
            MediaSpec mediaSpec = (MediaSpec) recorder2.getObservableData(recorder2.mMediaSpec);
            DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
            VideoEncoderConfig videoEncoderConfigWorkaroundDataSpaceIfRequired = VideoConfigUtil.workaroundDataSpaceIfRequired(VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, Recorder.this.mResolvedEncoderProfiles), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate()), Recorder.this.mHasGlProcessing);
            Recorder.this.mVideoEncoderConfig = videoEncoderConfigWorkaroundDataSpaceIfRequired;
            ListenableFuture<Encoder> listenableFutureConfigure = videoEncoderSession.configure(surfaceRequest, videoEncoderConfigWorkaroundDataSpaceIfRequired);
            Recorder.this.mVideoEncoderSession = videoEncoderSession;
            Futures.addCallback(listenableFutureConfigure, new AnonymousClass1(videoEncoderSession), Recorder.this.mSequentialExecutor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupVideo(final SurfaceRequest surfaceRequest, final Timebase timebase) {
            Recorder.this.safeToCloseVideoEncoder().addListener(new Runnable() { // from class: androidx.camera.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6896a.lambda$setupVideo$0(surfaceRequest, timebase);
                }
            }, Recorder.this.mSequentialExecutor);
        }

        public void cancelFailedRetry() {
            if (this.mIsFailedRetryCanceled) {
                return;
            }
            this.mIsFailedRetryCanceled = true;
            ScheduledFuture<?> scheduledFuture = this.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.mRetryFuture = null;
            }
        }

        public void start() {
            setupVideo(this.mSurfaceRequest, this.mTimebase);
        }
    }

    public enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        Quality quality = Quality.FHD;
        QualitySelector qualitySelectorFromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(quality));
        DEFAULT_QUALITY_SELECTOR = qualitySelectorFromOrderedList;
        VideoSpec videoSpecBuild = VideoSpec.builder().setQualitySelector(qualitySelectorFromOrderedList).setAspectRatio(-1).build();
        VIDEO_SPEC_DEFAULT = videoSpecBuild;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(videoSpecBuild).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new q2j.k(27);
        DEFAULT_VIDEO_ENCODER_INFO_FINDER = VideoEncoderInfoImpl.FINDER;
        DEFAULT_MUXER_FACTORY = new q2j.k(28);
        OUTPUT_STORAGE_FACTORY_DEFAULT = new q2j.k(29);
        AUDIO_EXECUTOR = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    public Recorder(Executor executor, MediaSpec mediaSpec, int i, EncoderFactory encoderFactory, EncoderFactory encoderFactory2, MuxerFactory muxerFactory, OutputStorage.Factory factory, long j2) {
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        Executor executorNewSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mSequentialExecutor = executorNewSequentialExecutor;
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mVideoCapabilitiesSource = i;
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mIsRecording = MutableStateObservable.withInitialState(Boolean.FALSE);
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
        this.mMuxerFactory = muxerFactory;
        this.mOutputStorageFactory = factory;
        this.mVideoEncoderSession = new VideoEncoderSession(encoderFactory, executorNewSequentialExecutor, executor);
        j2 = j2 == -1 ? 52428800L : j2;
        this.mRequiredFreeStorageBytes = j2;
        Logger.d("Recorder", "mRequiredFreeStorageBytes = " + StorageUtil.formatSize(j2));
    }

    private void clearPendingAudioRingBuffer() {
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            this.mPendingAudioRingBuffer.dequeue().close();
        }
    }

    private MediaSpec composeRecorderMediaSpec(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new m(4));
        }
        return builder.build();
    }

    private void configureInternal(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        if (surfaceRequest.isServiced()) {
            Logger.w("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new ryd.j(this, 18));
        this.mResolvedEncoderProfiles = getEncoderProfilesResolver(surfaceRequest.getCamera().getCameraInfo(), surfaceRequest.getSessionType()).findNearestHigherSupportedEncoderProfilesFor(surfaceRequest.getResolution(), surfaceRequest.getDynamicRange());
        Logger.d("Recorder", "mResolvedEncoderProfiles = " + this.mResolvedEncoderProfiles);
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null) {
            setupVideoTask.cancelFailedRetry();
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, this.mHasGlProcessing, z ? sRetrySetupVideoMaxCount : 0);
        this.mSetupVideoTask = setupVideoTask2;
        setupVideoTask2.start();
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i, Throwable th10) {
        Uri uri2 = Uri.EMPTY;
        recordingRecord.finalizeRecording(uri2);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0L, 0L, AudioStats.of(1, this.mAudioErrorCause, 0.0d, 0L)), OutputResults.of(uri2), i, th10));
    }

    private List<EncodedData> getAudioDataToWriteAndClearCache(long j2) {
        ArrayList arrayList = new ArrayList();
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            EncodedData encodedDataDequeue = this.mPendingAudioRingBuffer.dequeue();
            if (encodedDataDequeue.getPresentationTimeUs() >= j2) {
                arrayList.add(encodedDataDequeue);
            }
        }
        return arrayList;
    }

    private static EncoderProfilesResolver getEncoderProfilesResolverInternal(int i, CameraInfo cameraInfo, int i2) {
        return EncoderProfilesResolverFactory.getResolver(cameraInfo, i, i2, DEFAULT_VIDEO_ENCODER_INFO_FINDER);
    }

    private static VideoCapabilities getVideoCapabilitiesInternal(int i, CameraInfo cameraInfo, int i2, String str) {
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        return "video/*".equals(str) ? new RecorderVideoCapabilities(getEncoderProfilesResolverInternal(i, cameraInfo, i2), cameraInfoInternal) : new MimeMatchedVideoCapabilities(str, cameraInfoInternal, DEFAULT_VIDEO_ENCODER_INFO_FINDER);
    }

    private boolean hasInsufficientStorage(long j2) {
        return j2 < this.mRequiredFreeStorageBytes;
    }

    private boolean hasInsufficientStorageOrException(Throwable th10) {
        if (StorageUtil.isStorageFullException(th10)) {
            return true;
        }
        return hasInsufficientStorage(((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes());
    }

    private boolean hasInvalidRecordData() {
        if (this.mRecordingBytes > 0) {
            return isAudioEnabled() && this.mRecordingAudioBytes <= 0;
        }
        return true;
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int iOrdinal = audioState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            RecordingRecord recordingRecord = this.mInProgressRecording;
            if (recordingRecord == null || !recordingRecord.isMuted()) {
                return this.mIsAudioSourceSilenced ? 2 : 0;
            }
            return 5;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + audioState);
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || state == State.STOPPING) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$composeRecorderMediaSpec$10(VideoSpec.Builder builder) {
        builder.setAspectRatio(VIDEO_SPEC_DEFAULT.getAspectRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureInternal$9(SurfaceRequest.TransformationInfo transformationInfo) {
        this.mSourceTransformationInfo = transformationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupAndStartMuxer$11(Uri uri2) {
        this.mOutputUri = uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$4() {
        SurfaceRequest surfaceRequest = this.mLatestSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        configureInternal(surfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Muxer lambda$static$0(int i) {
        if (i == 0 || i == 2) {
            Logger.d("Recorder", "Create Media3MuxerImpl");
            return new Media3MuxerImpl();
        }
        Logger.d("Recorder", "Create MediaMuxerImpl");
        return new MediaMuxerImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateEncoderCallbacks$12(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                Recorder recorder = Recorder.this;
                if (recorder.mMuxer != null) {
                    try {
                        recorder.writeVideoData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th10) {
                        if (encodedData != null) {
                            try {
                                encodedData.close();
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                            }
                        }
                        throw th10;
                    }
                }
                if (recorder.mInProgressRecordingStopping) {
                    Logger.d("Recorder", "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                EncodedData encodedData2 = recorder.mPendingFirstVideoData;
                if (encodedData2 != null) {
                    encodedData2.close();
                    Recorder.this.mPendingFirstVideoData = null;
                    z = true;
                } else {
                    z = false;
                }
                if (!encodedData.isKeyFrame()) {
                    if (z) {
                        Logger.d("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.d("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.mVideoEncoder.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Recorder recorder2 = Recorder.this;
                recorder2.mPendingFirstVideoData = encodedData;
                if (!recorder2.isAudioEnabled() || !Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                    Logger.d("Recorder", "Received video keyframe. Starting muxer...");
                    Recorder.this.setupAndStartMuxer(recordingRecord);
                } else if (z) {
                    Logger.d("Recorder", "Replaced cached video keyframe with newer keyframe.");
                } else {
                    Logger.d("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEncoderCallbacks$13(CallbackToFutureAdapter.Completer completer, Throwable th10) {
        if (this.mAudioErrorCause == null) {
            if (th10 instanceof EncodeException) {
                setAudioState(AudioState.ERROR_ENCODER);
            } else {
                setAudioState(AudioState.ERROR_SOURCE);
            }
            this.mAudioErrorCause = th10;
            updateInProgressStatusEvent(true);
            completer.set(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateEncoderCallbacks$14(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        final dw.f fVar = new dw.f(this, completer, 5);
        this.mAudioSource.setAudioSourceCallback(this.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onAmplitudeValue(double d) {
                Recorder.this.mAudioAmplitude = d;
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onError(Throwable th10) {
                Logger.e("Recorder", "Error occurred after audio source started.", th10);
                if (th10 instanceof AudioSourceAccessException) {
                    fVar.accept(th10);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onSilenceStateChanged(boolean z) {
                Recorder recorder = Recorder.this;
                if (recorder.mIsAudioSourceSilenced != z) {
                    recorder.mIsAudioSourceSilenced = z;
                    recorder.updateInProgressStatusEvent(true);
                } else {
                    Logger.w("Recorder", "Audio source silenced transitions to the same state " + z);
                }
            }
        });
        this.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.5
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(EncodeException encodeException) {
                if (Recorder.this.mAudioErrorCause == null) {
                    fVar.accept(encodeException);
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(EncodedData encodedData) {
                Recorder recorder = Recorder.this;
                if (recorder.mAudioState == AudioState.DISABLED) {
                    encodedData.close();
                    throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
                }
                if (recorder.mMuxer == null) {
                    if (recorder.mInProgressRecordingStopping) {
                        Logger.d("Recorder", "Drop audio data since recording is stopping.");
                    } else {
                        recorder.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.d("Recorder", "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMuxer(recordingRecord);
                        } else {
                            Logger.d("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    }
                    encodedData.close();
                    return;
                }
                try {
                    recorder.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th10) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                        }
                    }
                    throw th10;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        recordingRecord.getRecordingState().addObserver(CameraXExecutors.directExecutor(), new Observable.Observer<Boolean>() { // from class: androidx.camera.video.Recorder.7
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(Throwable th10) {
                Recorder.this.mIsRecording.setError(th10);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(Boolean bool) {
                Recorder.this.mIsRecording.setState(bool);
            }
        });
        this.mPendingRecordingRecord = null;
        if (z) {
            setState(State.PAUSED);
            return recordingRecord;
        }
        setState(State.RECORDING);
        return recordingRecord;
    }

    public static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    private void onRecordingFinalized(RecordingRecord recordingRecord) {
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        boolean z;
        boolean z3;
        RecordingRecord recordingRecord2;
        Exception exc2;
        int i;
        synchronized (this.mLock) {
            try {
                RecordingRecord recordingRecord3 = this.mActiveRecordingRecord;
                if (recordingRecord3 != recordingRecord) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                recordingRecord3.getRecordingState().removeObservers();
                recordingRecordMakePendingRecordingActiveLocked = null;
                this.mActiveRecordingRecord = null;
                z = true;
                z3 = false;
                switch (this.mState.ordinal()) {
                    case 1:
                        z = false;
                    case 2:
                        if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                            recordingRecord2 = this.mPendingRecordingRecord;
                            this.mPendingRecordingRecord = null;
                            setState(State.CONFIGURING);
                            exc2 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                            i = 4;
                            z3 = z;
                            z = false;
                        } else if (this.mVideoEncoder != null) {
                            exc2 = null;
                            i = 0;
                            recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            z3 = z;
                            z = false;
                            recordingRecord2 = null;
                        } else {
                            recordingRecord2 = null;
                            exc2 = null;
                            i = 0;
                            z3 = z;
                            z = false;
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.mState);
                    case 4:
                    case 5:
                    case 6:
                        setState(State.IDLING);
                        recordingRecord2 = null;
                        exc2 = null;
                        z = false;
                        i = 0;
                        break;
                    case 7:
                        recordingRecord2 = null;
                        exc2 = null;
                        i = 0;
                        break;
                    default:
                        recordingRecord2 = null;
                        exc2 = null;
                        z = false;
                        i = 0;
                        break;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            reset();
        } else if (recordingRecordMakePendingRecordingActiveLocked != null) {
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z3);
        } else if (recordingRecord2 != null) {
            finalizePendingRecording(recordingRecord2, i, exc2);
        }
    }

    private void onResetVideo() {
        boolean z;
        SurfaceRequest surfaceRequest;
        synchronized (this.mLock) {
            try {
                switch (this.mState.ordinal()) {
                    case 1:
                    case 2:
                        updateNonPendingState(State.CONFIGURING);
                        z = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (isPersistentRecordingInProgress()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        setState(State.CONFIGURING);
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        if (!z || (surfaceRequest = this.mLatestSurfaceRequest) == null || surfaceRequest.isServiced()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSurfaceRequestedInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$onSurfaceRequested$1(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.mLatestSurfaceRequest.willNotProvideSurface();
        }
        this.mHasGlProcessing = z;
        this.mLatestSurfaceRequest = surfaceRequest;
        this.mVideoSourceTimebase = timebase;
        configureInternal(surfaceRequest, timebase, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pauseInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$pause$5(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    private void releaseCurrentAudioSource() {
        final AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.mAudioSource = null;
        Logger.d("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(audioSource.release(), new FutureCallback<Void>() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                Logger.d("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r2) {
                Logger.d("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }
        }, CameraXExecutors.directExecutor());
    }

    private void reset() {
        if (this.mAudioEncoder != null) {
            Logger.d("Recorder", "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(AudioState.INITIALIZING);
        resetVideo();
    }

    private void resetVideo() {
        if (this.mVideoEncoder != null) {
            Logger.d("Recorder", "Releasing video encoder.");
            tryReleaseVideoEncoder();
        }
        onResetVideo();
    }

    private void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableFuture<Void> safeToCloseVideoEncoder() {
        Logger.d("Recorder", "Try to safely release video encoder: " + this.mVideoEncoder);
        return this.mVideoEncoderSession.signalTermination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledFuture<?> scheduleTask(Runnable runnable, Executor executor, long j2, TimeUnit timeUnit) {
        return CameraXExecutors.mainThreadExecutor().schedule(new p6.e(executor, runnable, 17), j2, timeUnit);
    }

    private void setStreamId(int i) {
        if (this.mStreamId == i) {
            return;
        }
        Logger.d("Recorder", "Transitioning streamId: " + this.mStreamId + " --> " + i);
        this.mStreamId = i;
        this.mStreamInfo.setState(StreamInfo.of(i, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    private void setupAudio(RecordingRecord recordingRecord) throws InvalidConfigException, AudioSourceAccessException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        AudioMimeInfo audioMimeInfoResolveAudioMimeInfo = AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.mResolvedEncoderProfiles);
        Timebase timebase = Timebase.UPTIME;
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) Preconditions.checkNotNull(this.mVideoEncoderConfig);
        AudioSettings audioSettingsResolveAudioSettings = AudioConfigUtil.resolveAudioSettings(audioMimeInfoResolveAudioMimeInfo, mediaSpec.getAudioSpec(), videoEncoderConfig.isSlowMotion() ? new Rational(videoEncoderConfig.getCaptureFrameRate(), videoEncoderConfig.getEncodeFrameRate()) : null);
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        AudioSource audioSource = setupAudioSource(recordingRecord, audioSettingsResolveAudioSettings);
        this.mAudioSource = audioSource;
        Logger.d("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        AudioEncoderConfig audioEncoderConfigResolveAudioEncoderConfig = AudioConfigUtil.resolveAudioEncoderConfig(audioMimeInfoResolveAudioMimeInfo, timebase, audioSettingsResolveAudioSettings, mediaSpec.getAudioSpec());
        EncoderFactory encoderFactory = this.mAudioEncoderFactory;
        Executor executor = this.mExecutor;
        int sessionType = ((SurfaceRequest) Preconditions.checkNotNull(this.mLatestSurfaceRequest)).getSessionType();
        ((q2j.k) encoderFactory).getClass();
        EncoderImpl encoderImpl = new EncoderImpl(executor, audioEncoderConfigResolveAudioEncoderConfig, sessionType);
        this.mAudioEncoder = encoderImpl;
        Encoder.EncoderInput input = encoderImpl.getInput();
        if (!(input instanceof Encoder.ByteBufferInput)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
    }

    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSettings audioSettings) throws AudioSourceAccessException {
        return recordingRecord.performOneTimeAudioSourceCreation(audioSettings);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void startInternal(androidx.camera.video.Recorder.RecordingRecord r10) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.startInternal(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z) {
        startInternal(recordingRecord);
        if (z) {
            lambda$pause$5(recordingRecord);
        }
    }

    private static int supportedMuxerFormatOrDefaultFrom(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, int i) {
        if (videoValidatedEncoderProfilesProxy != null) {
            int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
            if (recommendedFileFormat == 1) {
                return 2;
            }
            if (recommendedFileFormat == 2) {
                return 0;
            }
            if (recommendedFileFormat == 9) {
                return 1;
            }
        }
        return i;
    }

    private void tryReleaseVideoEncoder() {
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
        if (videoEncoderSession == null) {
            safeToCloseVideoEncoder();
            return;
        }
        Preconditions.checkState(videoEncoderSession.getVideoEncoder() == this.mVideoEncoder);
        Logger.d("Recorder", "Releasing video encoder: " + this.mVideoEncoder);
        this.mVideoEncoderSessionToRelease.terminateNow();
        this.mVideoEncoderSessionToRelease = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        setLatestSurface(null);
    }

    private void updateEncoderCallbacks(final RecordingRecord recordingRecord, boolean z) {
        if (!this.mEncodingFutures.isEmpty()) {
            ListenableFuture listenableFutureAllAsList = Futures.allAsList(this.mEncodingFutures);
            if (!listenableFutureAllAsList.isDone()) {
                listenableFutureAllAsList.cancel(true);
            }
            this.mEncodingFutures.clear();
        }
        final int i = 0;
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.video.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Recorder f6885b;

            {
                this.f6885b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                switch (i) {
                    case 0:
                        return this.f6885b.lambda$updateEncoderCallbacks$12(recordingRecord, completer);
                    default:
                        return this.f6885b.lambda$updateEncoderCallbacks$14(recordingRecord, completer);
                }
            }
        }));
        if (isAudioEnabled() && !z) {
            final int i2 = 1;
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver(this) { // from class: androidx.camera.video.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recorder f6885b;

                {
                    this.f6885b = this;
                }

                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    switch (i2) {
                        case 0:
                            return this.f6885b.lambda$updateEncoderCallbacks$12(recordingRecord, completer);
                        default:
                            return this.f6885b.lambda$updateEncoderCallbacks$14(recordingRecord, completer);
                    }
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
                if (Recorder.this.mInProgressRecording.isPersistent()) {
                    return;
                }
                Logger.d("Recorder", "Encodings end with error: " + th10);
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mMuxer == null ? 8 : 6, th10);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Void> list) {
                Logger.d("Recorder", "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, recorder.mRecordingStopErrorCause);
            }
        }, CameraXExecutors.directExecutor());
    }

    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    public void finalizeInProgressRecording(int i, Throwable th10) {
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        if (this.mMuxer != null) {
            try {
                try {
                    Logger.d("Recorder", "Muxer.stop()");
                    this.mMuxer.stop();
                } catch (MuxerException e) {
                    Logger.w("Recorder", "Muxer failed to stop with error: " + e, e);
                    if (i == 0) {
                        i = hasInsufficientStorageOrException(e) ? 3 : hasInvalidRecordData() ? 8 : 1;
                        th10 = e;
                    }
                }
            } finally {
                Logger.d("Recorder", "Muxer.release()");
                this.mMuxer.release();
                this.mMuxer = null;
            }
        } else if (i == 0) {
            i = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults outputResultsOf = OutputResults.of(this.mOutputUri);
        this.mInProgressRecording.updateVideoRecordEvent(i == 0 ? VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, outputResultsOf) : VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, outputResultsOf, i, th10));
        RecordingRecord recordingRecord = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingAudioBytes = 0L;
        this.mRecordingDurationUs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        this.mAudioAmplitude = 0.0d;
        this.mOutputStorage = null;
        this.mAvailableBytesAboveRequired = Long.MAX_VALUE;
        clearPendingAudioRingBuffer();
        setInProgressTransformationInfo(null);
        int iOrdinal = this.mAudioState.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            setAudioState(AudioState.IDLING);
            this.mAudioSource.stop();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            setAudioState(AudioState.INITIALIZING);
        }
        onRecordingFinalized(recordingRecord);
    }

    @Override // androidx.camera.video.VideoOutput
    public EncoderProfilesResolver getEncoderProfilesResolver(CameraInfo cameraInfo, int i) {
        return getEncoderProfilesResolverInternal(i == 1 ? 2 : 1, cameraInfo, this.mVideoCapabilitiesSource);
    }

    public RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(TimeUnit.MICROSECONDS.toNanos(this.mRecordingDurationUs), this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause, this.mAudioAmplitude, this.mRecordingAudioBytes));
    }

    @Override // androidx.camera.video.VideoOutput
    public VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i) {
        return getVideoCapabilitiesInternal(i == 1 ? 2 : 1, cameraInfo, this.mVideoCapabilitiesSource, ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getMimeType());
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    public <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    public boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ENABLED;
    }

    public boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    public boolean isPersistentRecordingInProgress() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        return recordingRecord != null && recordingRecord.isPersistent();
    }

    @Override // androidx.camera.video.VideoOutput
    public boolean isQualitySelectorDefault() {
        return getQualitySelector() == DEFAULT_QUALITY_SELECTOR;
    }

    @Override // androidx.camera.video.VideoOutput
    public Observable<Boolean> isSourceStreamRequired() {
        return this.mIsRecording;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0005, B:5:0x000e, B:29:0x0081, B:7:0x0013, B:10:0x0020, B:11:0x0027, B:14:0x002b, B:15:0x0039, B:16:0x004c, B:19:0x0050, B:23:0x0059, B:25:0x005f, B:26:0x006b, B:27:0x0077), top: B:45:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfigured() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onConfigured():void");
    }

    public void onEncoderSetupError(Throwable th10) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            try {
                recordingRecord = null;
                switch (this.mState) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        recordingRecord = recordingRecord2;
                    case CONFIGURING:
                        setStreamId(-1);
                        setState(State.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th10);
        }
    }

    public void onInProgressRecordingInternalError(RecordingRecord recordingRecord, int i, Throwable th10) throws Throwable {
        Throwable th11;
        if (recordingRecord != this.mInProgressRecording) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.mLock) {
            try {
                try {
                    boolean z = false;
                    switch (this.mState) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                        case RECORDING:
                        case PAUSED:
                            try {
                                setState(State.STOPPING);
                                z = true;
                                break;
                            } catch (Throwable th12) {
                                th11 = th12;
                                throw th11;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (recordingRecord != this.mActiveRecordingRecord) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z) {
                                lambda$stop$7(recordingRecord, -1L, i, th10);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    th11 = th;
                    throw th11;
                }
            } catch (Throwable th14) {
                th = th14;
            }
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSourceStateChanged(VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new p6.e(this, sourceState, 18));
    }

    /* JADX INFO: renamed from: onSourceStateChangedInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$onSourceStateChanged$2(VideoOutput.SourceState sourceState) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 == sourceState) {
            Logger.d("Recorder", "Video source transitions to the same state: " + sourceState);
            return;
        }
        Logger.d("Recorder", "Video source has transitioned to state: " + sourceState);
        if (sourceState != VideoOutput.SourceState.INACTIVE) {
            if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            }
            notifyEncoderSourceStopped(encoder);
            return;
        }
        if (this.mActiveSurface == null) {
            SetupVideoTask setupVideoTask = this.mSetupVideoTask;
            if (setupVideoTask != null) {
                setupVideoTask.cancelFailedRetry();
                this.mSetupVideoTask = null;
            }
            requestReset(4, null, false);
            return;
        }
        this.mNeedsResetBeforeNextStart = true;
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord == null || recordingRecord.isPersistent()) {
            return;
        }
        onInProgressRecordingInternalError(this.mInProgressRecording, 4, null);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME, false);
    }

    public void onVideoEncoderReady(final VideoEncoderSession videoEncoderSession) {
        Encoder encoder = (Encoder) Preconditions.checkNotNull(videoEncoderSession.getVideoEncoder());
        this.mVideoEncoder = encoder;
        this.mVideoEncoderBitrateRange.setState(((VideoEncoderInfo) encoder.getEncoderInfo()).getSupportedBitrateRange());
        this.mFirstRecordingVideoBitrate = this.mVideoEncoder.getConfiguredBitrate();
        Surface activeSurface = videoEncoderSession.getActiveSurface();
        this.mActiveSurface = activeSurface;
        setLatestSurface(activeSurface);
        Futures.addCallback(videoEncoderSession.getReadyToReleaseFuture(), new FutureCallback<Encoder>() { // from class: androidx.camera.video.Recorder.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                Logger.d("Recorder", "Error in ReadyToReleaseFuture: " + th10);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Encoder encoder2) {
                Encoder encoder3;
                Logger.d("Recorder", "VideoEncoder can be released: " + encoder2);
                if (encoder2 == null) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = Recorder.this.mSourceNonStreamingTimeout;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder3 = Recorder.this.mVideoEncoder) != null && encoder3 == encoder2) {
                    Recorder.notifyEncoderSourceStopped(encoder3);
                }
                Recorder recorder = Recorder.this;
                recorder.mVideoEncoderSessionToRelease = videoEncoderSession;
                recorder.setLatestSurface(null);
                Recorder recorder2 = Recorder.this;
                recorder2.requestReset(4, null, recorder2.isPersistentRecordingInProgress());
            }
        }, this.mSequentialExecutor);
    }

    public void pause(Recording recording) {
        synchronized (this.mLock) {
            try {
                if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                    Logger.d("Recorder", "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                    return;
                }
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        setState(State.PENDING_PAUSED);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            setState(State.PAUSED);
                            this.mSequentialExecutor.execute(new c(this, this.mActiveRecordingRecord, 0));
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
            } finally {
            }
        }
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void requestReset(int i, Throwable th10, boolean z) {
        boolean z3;
        boolean z4;
        synchronized (this.mLock) {
            try {
                z3 = true;
                z4 = false;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        updateNonPendingState(State.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        Preconditions.checkState(this.mInProgressRecording != null, "In-progress recording shouldn't be null when in state " + this.mState);
                        if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!isPersistentRecordingInProgress()) {
                            setState(State.RESETTING);
                            z4 = true;
                            z3 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        setState(State.RESETTING);
                        z3 = false;
                        break;
                    case RESETTING:
                    default:
                        z3 = false;
                        break;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        if (!z3) {
            if (z4) {
                lambda$stop$7(this.mInProgressRecording, -1L, i, th10);
            }
        } else if (z) {
            resetVideo();
        } else {
            reset();
        }
    }

    public void setAudioState(AudioState audioState) {
        Logger.d("Recorder", "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    public void setInProgressTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.d("Recorder", "Update stream transformation info: " + transformationInfo);
        this.mInProgressTransformationInfo = transformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState), transformationInfo));
        }
    }

    public void setLatestSurface(Surface surface) {
        int iHashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th10) {
                    throw th10;
                }
            } else {
                iHashCode = 0;
            }
            setStreamId(iHashCode);
        }
    }

    public void setState(State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d("Recorder", "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamStateInternalStateToStreamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                }
                State state2 = this.mState;
                this.mNonPendingState = state2;
                streamStateInternalStateToStreamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamStateInternalStateToStreamState == null) {
            streamStateInternalStateToStreamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamStateInternalStateToStreamState, this.mInProgressTransformationInfo));
    }

    public void setupAndStartMuxer(RecordingRecord recordingRecord) {
        if (this.mMuxer != null) {
            throw new AssertionError("Unable to set up muxer when one already exists.");
        }
        if (isAudioEnabled() && this.mPendingAudioRingBuffer.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start muxer.");
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            throw new AssertionError("Muxer cannot be started without an encoded video frame.");
        }
        try {
            this.mPendingFirstVideoData = null;
            List<EncodedData> audioDataToWriteAndClearCache = getAudioDataToWriteAndClearCache(encodedData.getPresentationTimeUs());
            long size = encodedData.size();
            Iterator<EncodedData> it8 = audioDataToWriteAndClearCache.iterator();
            while (it8.hasNext()) {
                size += it8.next().size();
            }
            long j2 = this.mFileSizeLimitInBytes;
            if (j2 != 0 && size > j2) {
                Logger.d("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(recordingRecord, 2, null);
                encodedData.close();
                return;
            }
            int i = 3;
            try {
                MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                Muxer muxerPerformOneTimeMuxerCreation = recordingRecord.performOneTimeMuxerCreation(mediaSpec.getOutputFormat() == -1 ? supportedMuxerFormatOrDefaultFrom(this.mResolvedEncoderProfiles, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat())) : MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat()), new a70.a(this, 4));
                SurfaceRequest.TransformationInfo transformationInfo = this.mSourceTransformationInfo;
                if (transformationInfo != null) {
                    setInProgressTransformationInfo(transformationInfo);
                    try {
                        muxerPerformOneTimeMuxerCreation.setOrientationDegrees(transformationInfo.getRotationDegrees());
                    } catch (IllegalArgumentException e) {
                        muxerPerformOneTimeMuxerCreation.release();
                        onInProgressRecordingInternalError(recordingRecord, 5, e);
                        encodedData.close();
                        return;
                    }
                }
                Location location = recordingRecord.getOutputOptions().getLocation();
                if (location != null) {
                    try {
                        muxerPerformOneTimeMuxerCreation.setLocation(location.getLatitude(), location.getLongitude());
                    } catch (IllegalArgumentException e2) {
                        muxerPerformOneTimeMuxerCreation.release();
                        onInProgressRecordingInternalError(recordingRecord, 5, e2);
                        encodedData.close();
                        return;
                    }
                }
                VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) Preconditions.checkNotNull(this.mVideoEncoderConfig);
                if (videoEncoderConfig.isSlowMotion()) {
                    try {
                        muxerPerformOneTimeMuxerCreation.setCaptureFps(videoEncoderConfig.getCaptureFrameRate());
                    } catch (IllegalArgumentException e4) {
                        muxerPerformOneTimeMuxerCreation.release();
                        onInProgressRecordingInternalError(recordingRecord, 5, e4);
                        encodedData.close();
                        return;
                    }
                }
                try {
                    Logger.d("Recorder", "Muxer.addTrack() for video " + ((androidx.camera.video.internal.encoder.i) this.mVideoOutputConfig).a());
                    this.mVideoTrackIndex = Integer.valueOf(muxerPerformOneTimeMuxerCreation.addTrack((MediaFormat) Preconditions.checkNotNull(((androidx.camera.video.internal.encoder.i) this.mVideoOutputConfig).a())));
                    if (isAudioEnabled()) {
                        Logger.d("Recorder", "Muxer.addTrack() for audio " + ((androidx.camera.video.internal.encoder.i) this.mAudioOutputConfig).a());
                        this.mAudioTrackIndex = Integer.valueOf(muxerPerformOneTimeMuxerCreation.addTrack((MediaFormat) Preconditions.checkNotNull(((androidx.camera.video.internal.encoder.i) this.mAudioOutputConfig).a())));
                    }
                    Logger.d("Recorder", "Muxer.start()");
                    muxerPerformOneTimeMuxerCreation.start();
                    this.mMuxer = muxerPerformOneTimeMuxerCreation;
                    writeVideoData(encodedData, recordingRecord);
                    Iterator<EncodedData> it9 = audioDataToWriteAndClearCache.iterator();
                    while (it9.hasNext()) {
                        writeAudioData(it9.next(), recordingRecord);
                    }
                    encodedData.close();
                } catch (MuxerException e5) {
                    Logger.w("Recorder", "Failed to setup and start muxer", e5);
                    muxerPerformOneTimeMuxerCreation.release();
                    if (!hasInsufficientStorageOrException(e5)) {
                        i = 1;
                    }
                    onInProgressRecordingInternalError(recordingRecord, i, e5);
                    encodedData.close();
                }
            } catch (IOException e6) {
                if (!hasInsufficientStorageOrException(e6)) {
                    i = 5;
                }
                onInProgressRecordingInternalError(recordingRecord, i, e6);
                encodedData.close();
            }
        } catch (Throwable th10) {
            try {
                encodedData.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public Recording start(PendingRecording pendingRecording) {
        long j2;
        RecordingRecord recordingRecord;
        int i;
        RecordingRecord recordingRecord2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            try {
                j2 = this.mLastGeneratedRecordingId + 1;
                this.mLastGeneratedRecordingId = j2;
                recordingRecord = null;
                i = 0;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        State state = this.mState;
                        State state2 = State.IDLING;
                        if (state == state2) {
                            Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            RecordingRecord recordingRecordFrom = RecordingRecord.from(pendingRecording, j2);
                            recordingRecordFrom.initializeRecording(pendingRecording.getApplicationContext(), this.mMuxerFactory);
                            this.mPendingRecordingRecord = recordingRecordFrom;
                            State state3 = this.mState;
                            if (state3 == state2) {
                                setState(State.PENDING_RECORDING);
                                final int i2 = 0;
                                this.mSequentialExecutor.execute(new Runnable(this) { // from class: s0.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ Recorder f258736b;

                                    {
                                        this.f258736b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i2) {
                                            case 0:
                                                this.f258736b.tryServicePendingRecording();
                                                break;
                                            default:
                                                this.f258736b.lambda$start$4();
                                                break;
                                        }
                                    }
                                });
                            } else if (state3 == State.ERROR) {
                                setState(State.PENDING_RECORDING);
                                final int i3 = 1;
                                this.mSequentialExecutor.execute(new Runnable(this) { // from class: s0.a

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ Recorder f258736b;

                                    {
                                        this.f258736b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                this.f258736b.tryServicePendingRecording();
                                                break;
                                            default:
                                                this.f258736b.lambda$start$4();
                                                break;
                                        }
                                    }
                                });
                            } else {
                                setState(State.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e) {
                            e = e;
                            i = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        recordingRecord2 = (RecordingRecord) Preconditions.checkNotNull(this.mPendingRecordingRecord);
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        recordingRecord2 = this.mActiveRecordingRecord;
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (recordingRecord != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i == 0) {
            return Recording.from(pendingRecording, j2);
        }
        Logger.e("Recorder", "Recording was started when the Recorder had encountered error " + e);
        finalizePendingRecording(RecordingRecord.from(pendingRecording, j2), i, e);
        return Recording.createFinalizedFrom(pendingRecording, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void stop(androidx.camera.video.Recording r13, int r14, java.lang.Throwable r15) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            java.lang.Object r1 = r12.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r2 = r12.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L6c
            boolean r2 = isSameRecording(r13, r2)     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L32
            androidx.camera.video.Recorder$RecordingRecord r2 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2d
            boolean r2 = isSameRecording(r13, r2)     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L32
            java.lang.String r14 = "Recorder"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            androidx.camera.video.OutputOptions r13 = r13.getOutputOptions()     // Catch: java.lang.Throwable -> L2d
            r15.append(r13)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L2d
            androidx.camera.core.Logger.d(r14, r13)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto La7
        L32:
            androidx.camera.video.Recorder$State r0 = r12.mState     // Catch: java.lang.Throwable -> L6c
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L9e;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L40;
                case 7: goto L40;
                default: goto L3c;
            }
        L3c:
            r6 = r12
            r10 = r14
            r11 = r15
            goto L83
        L40:
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2d
            boolean r13 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2d
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L2d
            goto L3c
        L4a:
            androidx.camera.video.Recorder$State r13 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> L6c
            r12.setState(r13)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L6c
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6c
            long r8 = r13.toMicros(r3)     // Catch: java.lang.Throwable -> L6c
            androidx.camera.video.Recorder$RecordingRecord r7 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.Executor r13 = r12.mSequentialExecutor     // Catch: java.lang.Throwable -> L6c
            androidx.camera.video.d r5 = new androidx.camera.video.d     // Catch: java.lang.Throwable -> L6c
            r6 = r12
            r10 = r14
            r11 = r15
            r5.<init>()     // Catch: java.lang.Throwable -> L69
            r13.execute(r5)     // Catch: java.lang.Throwable -> L69
            goto L83
        L69:
            r0 = move-exception
        L6a:
            r13 = r0
            goto La7
        L6c:
            r0 = move-exception
            r6 = r12
            goto L6a
        L6f:
            r6 = r12
            r10 = r14
            r11 = r15
            androidx.camera.video.Recorder$RecordingRecord r14 = r6.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L69
            boolean r13 = isSameRecording(r13, r14)     // Catch: java.lang.Throwable -> L69
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L69
            androidx.camera.video.Recorder$RecordingRecord r13 = r6.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L69
            r6.mPendingRecordingRecord = r2     // Catch: java.lang.Throwable -> L69
            r12.restoreNonPendingState()     // Catch: java.lang.Throwable -> L69
            r2 = r13
        L83:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L9d
            r13 = 10
            if (r10 != r13) goto L91
            java.lang.String r13 = "Recorder"
            java.lang.String r14 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            androidx.camera.core.Logger.e(r13, r14)
        L91:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Recording was stopped before any data could be produced."
            r13.<init>(r14, r11)
            r14 = 8
            r12.finalizePendingRecording(r2, r14, r13)
        L9d:
            return
        L9e:
            r6 = r12
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.String r14 = "Calling stop() while idling or initializing is invalid."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L69
            throw r13     // Catch: java.lang.Throwable -> L69
        La7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.stop(androidx.camera.video.Recording, int, java.lang.Throwable):void");
    }

    /* JADX INFO: renamed from: stopInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$stop$7(RecordingRecord recordingRecord, long j2, int i, Throwable th10) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i;
        this.mRecordingStopErrorCause = th10;
        if (isAudioEnabled()) {
            clearPendingAudioRingBuffer();
            this.mAudioEncoder.stop(j2);
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            this.mSourceNonStreamingTimeout = scheduleTask(new androidx.compose.ui.platform.b(9), this.mSequentialExecutor, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        this.mVideoEncoder.stop(j2);
    }

    public void tryServicePendingRecording() {
        boolean z;
        RecordingRecord recordingRecordMakePendingRecordingActiveLocked;
        int i;
        RecordingRecord recordingRecord;
        Throwable th10;
        synchronized (this.mLock) {
            try {
                Logger.d("Recorder", "tryServicePendingRecording on state: " + this.mState);
                int iOrdinal = this.mState.ordinal();
                boolean z3 = true;
                z = false;
                recordingRecordMakePendingRecordingActiveLocked = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        i = 0;
                        recordingRecord = null;
                    }
                    th10 = recordingRecord;
                } else {
                    z3 = false;
                }
                if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    restoreNonPendingState();
                    recordingRecord = recordingRecord2;
                    i = 4;
                    z = z3;
                    th10 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                } else {
                    if (this.mActiveRecordingRecord != null || this.mNeedsResetBeforeNextStart) {
                        Logger.w("Recorder", "PendingRecording is not handled, active recording = " + this.mActiveRecordingRecord + ", need reset flag = " + this.mNeedsResetBeforeNextStart);
                    } else {
                        if (this.mVideoEncoder != null) {
                            recordingRecord = null;
                            recordingRecordMakePendingRecordingActiveLocked = makePendingRecordingActiveLocked(this.mState);
                            i = 0;
                        }
                        z = z3;
                        th10 = recordingRecord;
                    }
                    i = 0;
                    recordingRecord = null;
                    z = z3;
                    th10 = recordingRecord;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        if (recordingRecordMakePendingRecordingActiveLocked != null) {
            startRecording(recordingRecordMakePendingRecordingActiveLocked, z);
        } else if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, i, th10);
        }
    }

    public void updateInProgressStatusEvent(boolean z) {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()), z);
        }
    }

    public void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) throws Throwable {
        if (this.mAudioEncoder == null) {
            Logger.d("Recorder", "Ignore the audio data since the audio encoder has been released.");
            return;
        }
        if (encodedData.getPresentationTimeUs() < this.mFirstRecordingVideoDataTimeUs) {
            Logger.d("Recorder", "Skipping audio data: timestamp precedes first video frame.");
            return;
        }
        long size = encodedData.size() + this.mRecordingBytes;
        long j2 = this.mFileSizeLimitInBytes;
        if (j2 != 0 && size > j2) {
            Logger.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j3 = presentationTimeUs - this.mFirstRecordingVideoDataTimeUs;
        if (this.mFirstRecordingAudioDataTimeUs == Long.MAX_VALUE) {
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            Logger.d("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
        } else if (this.mDurationLimitUs != 0) {
            Preconditions.checkState(this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long j5 = (presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs) + j3;
            if (j5 > this.mDurationLimitUs) {
                Logger.d("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(j5), Long.valueOf(this.mDurationLimitUs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        encodedData.getBufferInfo().presentationTimeUs = j3;
        try {
            this.mMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingAudioBytes = encodedData.size() + this.mRecordingAudioBytes;
            this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
        } catch (MuxerException e) {
            Logger.w("Recorder", "writeAudioData failed", e);
            onInProgressRecordingInternalError(recordingRecord, hasInsufficientStorageOrException(e) ? 3 : 1, e);
        }
    }

    public void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) throws Throwable {
        if (this.mVideoEncoder == null) {
            Logger.d("Recorder", "Ignore the video data since the video encoder has been released.");
            return;
        }
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to Muxer.");
        }
        long size = encodedData.size() + this.mRecordingBytes;
        long j2 = this.mFileSizeLimitInBytes;
        long j3 = 0;
        if (j2 != 0 && size > j2) {
            Logger.d("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j5 = this.mFirstRecordingVideoDataTimeUs;
        if (j5 == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            Logger.d("Recorder", String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
        } else {
            long j16 = presentationTimeUs - j5;
            if (this.mDurationLimitUs != 0) {
                Preconditions.checkState(this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
                long j22 = (presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + j16;
                if (j22 > this.mDurationLimitUs) {
                    Logger.d("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(j22), Long.valueOf(this.mDurationLimitUs)));
                    onInProgressRecordingInternalError(recordingRecord, 9, null);
                    return;
                }
            }
            j3 = j16;
        }
        encodedData.getBufferInfo().presentationTimeUs = j3;
        try {
            this.mMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            this.mRecordingDurationUs = j3;
            this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
            updateInProgressStatusEvent(encodedData.isKeyFrame());
            if (size > this.mAvailableBytesAboveRequired) {
                long availableBytes = ((OutputStorage) Preconditions.checkNotNull(this.mOutputStorage)).getAvailableBytes();
                Logger.d("Recorder", "availableBytes = " + StorageUtil.formatSize(availableBytes));
                if (hasInsufficientStorage(availableBytes)) {
                    onInProgressRecordingInternalError(recordingRecord, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(availableBytes), Long.valueOf(this.mRequiredFreeStorageBytes))));
                } else {
                    this.mAvailableBytesAboveRequired = availableBytes - this.mRequiredFreeStorageBytes;
                }
            }
        } catch (MuxerException e) {
            Logger.w("Recorder", "writeVideoData failed", e);
            onInProgressRecordingInternalError(recordingRecord, hasInsufficientStorageOrException(e) ? 3 : 1, e);
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        synchronized (this.mLock) {
            try {
                Logger.d("Recorder", "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
                if (this.mState == State.ERROR) {
                    setState(State.CONFIGURING);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.mSequentialExecutor.execute(new a0(this, surfaceRequest, timebase, z, 2));
    }

    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        return prepareRecordingInternal(context, fileDescriptorOutputOptions);
    }
}

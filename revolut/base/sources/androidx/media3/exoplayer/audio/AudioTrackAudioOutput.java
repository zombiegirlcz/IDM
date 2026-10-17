package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kt0.d;

/* JADX INFO: loaded from: classes15.dex */
public final class AudioTrackAudioOutput implements AudioOutput {
    private static int pendingReleaseCount;
    private static ScheduledExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private final AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private int bytesUntilNextAvSync;
    private final CapabilityChangeListener capabilityChangeListener;
    private final AudioOutputProvider.OutputConfig config;
    private int framesPerEncodedSample;
    private boolean hasBeenStopped;
    private final boolean isOutputPcm;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private int lastUnderrunCount;
    private final ListenerSet<AudioOutput.Listener> listeners;
    private final StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private OnRoutingChangedListenerApi24 onRoutingChangedListener;
    private final int pcmFrameSize;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface CapabilityChangeListener {
        void onRecoverableWriteError();

        void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo);
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static final class OnRoutingChangedListenerApi24 {
        private final AudioTrack audioTrack;
        private final CapabilityChangeListener capabilityChangeListener;
        private AudioRouting.OnRoutingChangedListener listener;
        private final Handler playbackThreadHandler;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$0(AudioDeviceInfo audioDeviceInfo) {
            if (this.listener == null) {
                return;
            }
            this.capabilityChangeListener.onRoutedDeviceChanged(audioDeviceInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRoutingChanged$1(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                this.playbackThreadHandler.post(new b(this, routedDevice, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(AudioRouting audioRouting) {
            if (this.listener == null) {
                return;
            }
            BackgroundExecutor.get().execute(new b(this, audioRouting, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            this.audioTrack.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) Preconditions.checkNotNull(this.listener));
            this.listener = null;
        }

        private OnRoutingChangedListenerApi24(AudioTrack audioTrack, CapabilityChangeListener capabilityChangeListener) {
            this.audioTrack = audioTrack;
            this.capabilityChangeListener = capabilityChangeListener;
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.playbackThreadHandler = handlerCreateHandlerForCurrentLooper;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.a
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    this.f7484a.onRoutingChanged(audioRouting);
                }
            };
            this.listener = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerCreateHandlerForCurrentLooper);
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j2) {
            Log.w("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(final long j2) {
            AudioTrackAudioOutput.this.listeners.sendEvent(new ListenerSet.Event() { // from class: androidx.media3.exoplayer.audio.c
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj2) {
                    ((AudioOutput.Listener) obj2).onPositionAdvancing(j2);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j2, long j3, long j5, long j16) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbV.append(j3);
            sbV.append(", ");
            sbV.append(j5);
            sbV.append(", ");
            sbV.append(j16);
            sbV.append(", ");
            sbV.append(AudioTrackAudioOutput.this.getWrittenFrames());
            String string = sbV.toString();
            if (AudioTrackAudioOutputProvider.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w("AudioTrackAudioOutput", string);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j2, long j3, long j5, long j16) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbV.append(j3);
            sbV.append(", ");
            sbV.append(j5);
            sbV.append(", ");
            sbV.append(j16);
            sbV.append(", ");
            sbV.append(AudioTrackAudioOutput.this.getWrittenFrames());
            String string = sbV.toString();
            if (AudioTrackAudioOutputProvider.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w("AudioTrackAudioOutput", string);
        }
    }

    public final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler;

        /* JADX INFO: Access modifiers changed from: private */
        public void unregister() {
            AudioTrackAudioOutput.this.audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }

        private StreamEventCallbackV29() {
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
            this.handler = handlerCreateHandlerForCurrentLooper;
            AudioTrack$StreamEventCallback audioTrack$StreamEventCallback = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.AudioTrackAudioOutput.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new o0.a(3));
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new o0.a(4));
                }

                public void onTearDown(AudioTrack audioTrack) {
                    AudioTrackAudioOutput.this.listeners.sendEvent(new o0.a(3));
                }
            };
            this.callback = audioTrack$StreamEventCallback;
            AudioTrack audioTrack = AudioTrackAudioOutput.this.audioTrack;
            Objects.requireNonNull(handlerCreateHandlerForCurrentLooper);
            audioTrack.registerStreamEventCallback(new a3.b(handlerCreateHandlerForCurrentLooper, 3), audioTrack$StreamEventCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.OutputConfig outputConfig, CapabilityChangeListener capabilityChangeListener, Clock clock) {
        this.audioTrack = audioTrack;
        this.config = outputConfig;
        this.capabilityChangeListener = capabilityChangeListener;
        ListenerSet<AudioOutput.Listener> listenerSet = new ListenerSet<>(Thread.currentThread());
        this.listeners = listenerSet;
        listenerSet.setThrowsWhenUsingWrongThread(false);
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(outputConfig.encoding);
        this.isOutputPcm = zIsEncodingLinearPcm;
        if (zIsEncodingLinearPcm) {
            this.pcmFrameSize = Util.getPcmFrameSize(outputConfig.encoding, Integer.bitCount(outputConfig.channelMask));
        } else {
            this.pcmFrameSize = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener(), clock, audioTrack, outputConfig.encoding, this.pcmFrameSize, outputConfig.bufferSize);
        if (capabilityChangeListener != null) {
            this.onRoutingChangedListener = new OnRoutingChangedListenerApi24(audioTrack, capabilityChangeListener);
        }
        this.offloadStreamEventCallbackV29 = isOffloadedPlayback() ? new StreamEventCallbackV29() : null;
    }

    private int getAudioOutputUnderrunCount(long j2) {
        return this.audioTrack.getUnderrunCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.isOutputPcm ? Util.ceilDivide(this.writtenPcmBytes, this.pcmFrameSize) : this.writtenEncodedFrames;
    }

    private boolean hasPendingAudioTrackUnderruns(long j2) {
        int audioOutputUnderrunCount = getAudioOutputUnderrunCount(j2);
        boolean z = audioOutputUnderrunCount > this.lastUnderrunCount;
        this.lastUnderrunCount = audioOutputUnderrunCount;
        return z;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return i == -6 || i == -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$0(ListenerSet listenerSet) {
        listenerSet.sendEvent(new o0.a(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, Handler handler, ListenerSet listenerSet) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new d(listenerSet, 28));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        ((ScheduledExecutorService) Preconditions.checkNotNull(releaseExecutor)).shutdown();
                        releaseExecutor = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th10) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new d(listenerSet, 28));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i2 = pendingReleaseCount - 1;
                    pendingReleaseCount = i2;
                    if (i2 == 0) {
                        ((ScheduledExecutorService) Preconditions.checkNotNull(releaseExecutor)).shutdown();
                        releaseExecutor = null;
                    }
                    throw th10;
                } finally {
                }
            }
        }
    }

    private void maybeReportUnderrun() {
        if (hasPendingAudioTrackUnderruns(getWrittenFrames())) {
            this.listeners.sendEvent(new o0.a(1));
        }
    }

    private static void releaseAudioTrackAsync(AudioTrack audioTrack, ListenerSet<AudioOutput.Listener> listenerSet) {
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (releaseExecutorLock) {
            try {
                if (releaseExecutor == null) {
                    releaseExecutor = Util.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                pendingReleaseCount++;
                releaseExecutor.schedule(new b0.d(audioTrack, 18, handlerCreateHandlerForCurrentLooper, listenerSet), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private int writeWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, long j2) {
        return audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j2 * 1000);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void addListener(AudioOutput.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void attachAuxEffect(int i) {
        this.audioTrack.attachAuxEffect(i);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getAudioSessionId() {
        return this.audioTrack.getAudioSessionId();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public PlaybackParameters getPlaybackParameters() {
        PlaybackParams playbackParams = this.audioTrack.getPlaybackParams();
        return new PlaybackParameters(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public long getPositionUs() {
        return this.audioTrackPositionTracker.getCurrentPositionUs();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public int getSampleRate() {
        return this.audioTrack.getSampleRate();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isOffloadedPlayback() {
        return Build.VERSION.SDK_INT >= 29 && this.audioTrack.isOffloadedPlayback();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean isStalled() {
        return this.audioTrackPositionTracker.isStalled(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void pause() {
        this.audioTrackPositionTracker.pause();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void play() {
        this.audioTrackPositionTracker.start();
        if (!this.hasBeenStopped || isOffloadedPlayback()) {
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void release() {
        if (this.audioTrackPositionTracker.isPlaying()) {
            this.audioTrack.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && isOffloadedPlayback()) {
            ((StreamEventCallbackV29) Preconditions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister();
        }
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24 = this.onRoutingChangedListener;
        if (onRoutingChangedListenerApi24 != null) {
            onRoutingChangedListenerApi24.release();
            this.onRoutingChangedListener = null;
        }
        releaseAudioTrackAsync(this.audioTrack, this.listeners);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setAuxEffectSendLevel(float f) {
        this.audioTrack.setAuxEffectSendLevel(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadDelayPadding(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setOffloadEndOfStream() {
        if (Build.VERSION.SDK_INT >= 29 && this.audioTrack.getPlayState() == 3) {
            this.audioTrack.setOffloadEndOfStream();
            this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        try {
            this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e) {
            Log.w("AudioTrackAudioOutput", "Failed to set playback params", e);
        }
        this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(this.audioTrack.getPlaybackParams().getSpeed());
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPlayerId(PlayerId playerId) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionId = playerId.getLogSessionId();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.audioTrack.setLogSessionId(logSessionId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.audioTrack.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void setVolume(float f) {
        this.audioTrack.setVolume(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public void stop() {
        if (this.hasBeenStopped) {
            return;
        }
        this.hasBeenStopped = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public boolean write(ByteBuffer byteBuffer, int i, long j2) throws AudioOutput.WriteException {
        int iWrite;
        CapabilityChangeListener capabilityChangeListener;
        if (!this.isOutputPcm && this.framesPerEncodedSample == 0) {
            this.framesPerEncodedSample = DefaultAudioSink.getFramesPerEncodedSample(this.config.encoding, byteBuffer);
        }
        maybeReportUnderrun();
        int iRemaining = byteBuffer.remaining();
        if (this.config.isTunneling) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j2;
            }
            iWrite = writeWithAvSync(this.audioTrack, byteBuffer, j2);
        } else {
            iWrite = this.audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite < 0) {
            boolean zIsAudioTrackDeadObject = isAudioTrackDeadObject(iWrite);
            if (zIsAudioTrackDeadObject && (capabilityChangeListener = this.capabilityChangeListener) != null) {
                capabilityChangeListener.onRecoverableWriteError();
            }
            throw new AudioOutput.WriteException(iWrite, zIsAudioTrackDeadObject);
        }
        boolean z = iWrite == iRemaining;
        if (this.isOutputPcm) {
            this.writtenPcmBytes += (long) iWrite;
            return z;
        }
        if (z) {
            this.writtenEncodedFrames = (((long) this.framesPerEncodedSample) * ((long) i)) + this.writtenEncodedFrames;
        }
        return z;
    }
}

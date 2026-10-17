package androidx.media3.exoplayer.audio;

import a0.d;
import android.media.AudioDeviceInfo;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i, int i2, int i3, boolean z, boolean z3, int i5) {
            this.encoding = i;
            this.sampleRate = i2;
            this.channelConfig = i3;
            this.tunneling = z;
            this.offload = z3;
            this.bufferSize = i5;
        }
    }

    public interface Listener {
        void onAudioCapabilitiesChanged();

        void onAudioSessionIdChanged(int i);

        void onAudioSinkError(Exception exc2);

        void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig);

        void onAudioTrackReleased(AudioTrackConfig audioTrackConfig);

        void onOffloadBufferEmptying();

        void onOffloadBufferFull();

        void onPositionAdvancing(long j2);

        void onPositionDiscontinuity();

        void onSilenceSkipped();

        void onSkipSilenceEnabledChanged(boolean z);

        void onUnderrun(int i, long j2, long j3);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        public UnexpectedDiscontinuityException(long j2, long j3) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbV.append(j2);
            super(sbV.toString());
            this.actualPresentationTimeUs = j2;
            this.expectedPresentationTimeUs = j3;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format, boolean z) {
            super(d.n("AudioTrack write failed: ", i));
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format;
        }
    }

    void configure(Format format, int i, int[] iArr) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z);

    AudioOffloadSupport getFormatOffloadSupport(Format format);

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j2, int i) throws WriteException, InitializationException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioOutputProvider(AudioOutputProvider audioOutputProvider);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setClock(Clock clock);

    void setListener(Listener listener);

    void setOffloadDelayPadding(int i, int i2);

    void setOffloadMode(int i);

    default void setOutputStreamOffsetUs(long j2) {
    }

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlayerId(PlayerId playerId);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setSkipSilenceEnabled(boolean z);

    void setVirtualDeviceId(int i);

    void setVolume(float f);

    boolean supportsFormat(Format format);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th10, Format format) {
            super(th10);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i2, int i3, int i5, int i6, Format format, boolean z, Exception exc2) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("AudioTrack init failed ", i, i2, " Config(", ", ");
            t61.a.x(sbW, i3, ", ", i5, ", ");
            sbW.append(i6);
            sbW.append(") ");
            sbW.append(format);
            sbW.append(z ? " (recoverable)" : "");
            this(sbW.toString(), i, format, z, exc2);
        }

        public InitializationException(String str, int i, Format format, boolean z, Throwable th10) {
            super(str, th10);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = format;
        }
    }
}

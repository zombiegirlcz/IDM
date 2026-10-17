package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.function.BiConsumer;
import o4.f;

/* JADX INFO: loaded from: classes15.dex */
public final class AudioTrackAudioOutputProvider implements AudioOutputProvider {
    public static boolean failOnSpuriousAudioTimestamp;
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
    private final DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> builderModifier;
    private final CapabilityChangeListener capabilityChangeListener;
    private Clock clock;
    private final Context context;
    private Context contextWithDeviceId;
    private ListenerSet<AudioOutputProvider.Listener> listeners;
    private Looper playbackLooper;

    public static final class Builder {
        private AudioCapabilities audioCapabilities;
        private DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
        private BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> audioTrackBuilderModifier;
        private DefaultAudioSink.AudioTrackBufferSizeProvider bufferSizeProvider;
        private final Context context;

        public Builder(Context context) {
            this.context = context != null ? context.getApplicationContext() : null;
            this.bufferSizeProvider = DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
            if (context == null) {
                this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            }
        }

        public static /* synthetic */ DefaultAudioSink.AudioTrackProvider access$600(Builder builder) {
            builder.getClass();
            return null;
        }

        public AudioTrackAudioOutputProvider build() {
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new AudioTrackAudioOutputProvider(this);
        }

        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            if (this.context == null) {
                this.audioCapabilities = audioCapabilities;
            }
            return this;
        }

        public Builder setAudioOffloadSupportProvider(DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioTrackBufferSizeProvider(DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.bufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setAudioTrackProvider(DefaultAudioSink.AudioTrackProvider audioTrackProvider) {
            return this;
        }
    }

    public final class CapabilityChangeListener implements AudioTrackAudioOutput.CapabilityChangeListener {
        private CapabilityChangeListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRecoverableWriteError() {
            if (AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver != null) {
                AudioTrackAudioOutputProvider audioTrackAudioOutputProvider = AudioTrackAudioOutputProvider.this;
                AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                audioTrackAudioOutputProvider.audioCapabilities = audioCapabilities;
                AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver.overrideCapabilities(audioCapabilities);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackAudioOutput.CapabilityChangeListener
        public void onRoutedDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
            if (AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver != null) {
                AudioTrackAudioOutputProvider.this.audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
        }
    }

    private int getAudioOutputChannelConfig(int i) {
        return Util.getAudioTrackChannelConfig(i);
    }

    private AudioAttributes getAudioTrackAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        return z ? getAudioTrackTunnelingAttributes() : audioAttributes.getPlatformAudioAttributes();
    }

    private int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        Preconditions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private AudioAttributes getAudioTrackTunnelingAttributes() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private int getFormatSupportLevel(AudioOutputProvider.FormatConfig formatConfig) {
        Format format = formatConfig.format;
        if (!Objects.equals(format.sampleMimeType, "audio/raw")) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(format, formatConfig.audioAttributes) ? 2 : 0;
        }
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            int i = format.pcmEncoding;
            return (i == 2 || (formatConfig.enableHighResolutionPcmOutput && i == 4)) ? 2 : 1;
        }
        Log.w("ATAudioOutputProvider", "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    private static String getLooperThreadName(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private void updateAudioCapabilitiesReceiver(AudioOutputProvider.FormatConfig formatConfig) {
        Context context;
        verifySinglePlaybackLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver == null && (context = this.context) != null) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = new AudioCapabilitiesReceiver(context, new f(this), formatConfig.audioAttributes, formatConfig.preferredDevice);
            this.audioCapabilitiesReceiver = audioCapabilitiesReceiver2;
            this.audioCapabilities = audioCapabilitiesReceiver2.register();
        } else if (audioCapabilitiesReceiver != null) {
            AudioDeviceInfo audioDeviceInfo = formatConfig.preferredDevice;
            if (audioDeviceInfo != null) {
                audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
            }
            this.audioCapabilitiesReceiver.setAudioAttributes(formatConfig.audioAttributes);
        }
        Preconditions.checkNotNull(this.audioCapabilities);
    }

    private void verifySinglePlaybackLooper() {
        if (this.context == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        Preconditions.checkState(looper == null || looper == looperMyLooper, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", getLooperThreadName(looper), getLooperThreadName(looperMyLooper));
        this.playbackLooper = looperMyLooper;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void addListener(AudioOutputProvider.Listener listener) {
        verifySinglePlaybackLooper();
        if (this.listeners == null) {
            ListenerSet<AudioOutputProvider.Listener> listenerSet = new ListenerSet<>(Thread.currentThread());
            this.listeners = listenerSet;
            listenerSet.setThrowsWhenUsingWrongThread(false);
        }
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.FormatSupport getFormatSupport(AudioOutputProvider.FormatConfig formatConfig) {
        updateAudioCapabilitiesReceiver(formatConfig);
        AudioOffloadSupport audioOffloadSupport = this.audioOffloadSupportProvider.getAudioOffloadSupport(formatConfig.format, formatConfig.audioAttributes);
        return new AudioOutputProvider.FormatSupport.Builder().setFormatSupportLevel(getFormatSupportLevel(formatConfig)).setIsFormatSupportedForOffload(audioOffloadSupport.isFormatSupported).setIsGaplessSupportedForOffload(audioOffloadSupport.isGaplessSupported).setIsSpeedChangeSupportedForOffload(audioOffloadSupport.isSpeedChangeSupported).build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioOutputProvider.OutputConfig getOutputConfig(AudioOutputProvider.FormatConfig formatConfig) throws AudioOutputProvider.ConfigurationException {
        int i;
        boolean z;
        int i2;
        int i3;
        int audioOutputChannelConfig;
        int pcmFrameSize;
        boolean z3;
        Format format = formatConfig.format;
        updateAudioCapabilitiesReceiver(formatConfig);
        if (Objects.equals(format.sampleMimeType, "audio/raw")) {
            Preconditions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            int i5 = format.pcmEncoding;
            i = format.sampleRate;
            audioOutputChannelConfig = getAudioOutputChannelConfig(format.channelCount);
            pcmFrameSize = Util.getPcmFrameSize(i5, format.channelCount);
            z = formatConfig.enablePlaybackParameters;
            i2 = i5;
            z3 = false;
            i3 = 0;
        } else {
            i = format.sampleRate;
            AudioOffloadSupport audioOffloadSupport = formatConfig.enableOffload ? this.audioOffloadSupportProvider.getAudioOffloadSupport(format, formatConfig.audioAttributes) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (formatConfig.enableOffload && audioOffloadSupport.isFormatSupported) {
                int encoding = MimeTypes.getEncoding((String) Preconditions.checkNotNull(format.sampleMimeType), format.codecs);
                int audioOutputChannelConfig2 = getAudioOutputChannelConfig(format.channelCount);
                z3 = audioOffloadSupport.isGaplessSupported;
                z = true;
                i3 = 1;
                i2 = encoding;
                audioOutputChannelConfig = audioOutputChannelConfig2;
                pcmFrameSize = -1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, formatConfig.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioOutputProvider.ConfigurationException("Unable to configure passthrough for: " + format);
                }
                int iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                z = formatConfig.enablePlaybackParameters;
                i2 = iIntValue;
                i3 = 2;
                audioOutputChannelConfig = iIntValue2;
                pcmFrameSize = -1;
                z3 = false;
            }
        }
        int i6 = format.bitrate;
        if (Objects.equals(format.sampleMimeType, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int i21 = i6;
        int bufferSizeInBytes = formatConfig.preferredBufferSize;
        if (bufferSizeInBytes == -1) {
            int i22 = i;
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i, audioOutputChannelConfig, i2), i2, i3, pcmFrameSize != -1 ? pcmFrameSize : 1, i22, i21, z ? 8.0d : 1.0d);
            i = i22;
        }
        return new AudioOutputProvider.OutputConfig.Builder().setSampleRate(i).setChannelMask(audioOutputChannelConfig).setEncoding(i2).setBufferSize(bufferSizeInBytes).setAudioSessionId(formatConfig.audioSessionId).setAudioAttributes(formatConfig.audioAttributes).setIsOffload(i3 == 1).setIsTunneling(formatConfig.enableTunneling).setUsePlaybackParameters(z).setUseOffloadGapless(z3).setVirtualDeviceId(formatConfig.virtualDeviceId).build();
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        verifySinglePlaybackLooper();
        AudioCapabilities audioCapabilities2 = this.audioCapabilities;
        if (audioCapabilities2 == null || audioCapabilities.equals(audioCapabilities2)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.sendEvent(new o0.a(5));
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void release() {
        ListenerSet<AudioOutputProvider.Listener> listenerSet = this.listeners;
        if (listenerSet != null) {
            listenerSet.release();
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public void setClock(Clock clock) {
        this.clock = clock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AudioTrackAudioOutputProvider(Builder builder) {
        this.context = builder.context;
        this.builderModifier = builder.audioTrackBuilderModifier;
        this.audioOffloadSupportProvider = (DefaultAudioSink.AudioOffloadSupportProvider) Preconditions.checkNotNull(builder.audioOffloadSupportProvider);
        this.audioTrackBufferSizeProvider = builder.bufferSizeProvider;
        this.audioCapabilities = builder.audioCapabilities;
        Builder.access$600(builder);
        this.capabilityChangeListener = builder.context != null ? new CapabilityChangeListener() : null;
        this.clock = Clock.DEFAULT;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutputProvider
    public AudioTrackAudioOutput getAudioOutput(AudioOutputProvider.OutputConfig outputConfig) throws AudioOutputProvider.InitializationException {
        Context context;
        try {
            int i = outputConfig.audioSessionId;
            if (outputConfig.virtualDeviceId == -1 || this.context == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context2 = this.contextWithDeviceId;
                if (context2 == null || context2.getDeviceId() != outputConfig.virtualDeviceId) {
                    this.contextWithDeviceId = this.context.createDeviceContext(outputConfig.virtualDeviceId);
                }
                context = this.contextWithDeviceId;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributes(outputConfig.audioAttributes, outputConfig.isTunneling)).setAudioFormat(new AudioFormat.Builder().setSampleRate(outputConfig.sampleRate).setChannelMask(outputConfig.channelMask).setEncoding(outputConfig.encoding).build()).setTransferMode(1).setBufferSizeInBytes(outputConfig.bufferSize).setSessionId(i);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                sessionId.setOffloadedPlayback(outputConfig.isOffload);
            }
            if (i2 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            BiConsumer<AudioTrack.Builder, AudioOutputProvider.OutputConfig> biConsumer = this.builderModifier;
            if (biConsumer != null) {
                biConsumer.accept(sessionId, outputConfig);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new AudioTrackAudioOutput(audioTrackBuild, outputConfig, this.capabilityChangeListener, this.clock);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new AudioOutputProvider.InitializationException();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new AudioOutputProvider.InitializationException(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new AudioOutputProvider.InitializationException(e);
        }
    }
}

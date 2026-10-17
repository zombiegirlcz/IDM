package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Api29 {
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Api31 {
        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
        }
    }

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context == null ? null : context.getApplicationContext();
    }

    private boolean isOffloadVariableRateSupported(Context context) {
        Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = AudioManagerCompat.getAudioManager(context).getParameters("offloadVariableRateSupported");
            this.isOffloadVariableRateSupported = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.isOffloadVariableRateSupported = Boolean.FALSE;
        }
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        Preconditions.checkNotNull(format);
        Preconditions.checkNotNull(audioAttributes);
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || format.sampleRate == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        int encoding = MimeTypes.getEncoding((String) Preconditions.checkNotNull(format.sampleMimeType), format.codecs);
        if (encoding == 0 || i < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormat = Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            return i >= 31 ? Api31.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getPlatformAudioAttributes(), zIsOffloadVariableRateSupported) : Api29.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getPlatformAudioAttributes(), zIsOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }
}

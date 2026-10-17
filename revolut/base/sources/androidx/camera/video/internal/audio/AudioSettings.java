package androidx.camera.video.internal.audio;

import a0.d;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(192000, 48000, Integer.valueOf(MicAvailabilityHelper.SAMPLE_RATE_HZ), 24000, 22050, 16000, 12000, 11025, Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED), 4800));

    public static abstract class Builder {
        public abstract AudioSettings autoBuild();

        public final AudioSettings build() {
            AudioSettings audioSettingsAutoBuild = autoBuild();
            String strR = audioSettingsAutoBuild.getAudioSource() == -1 ? " audioSource" : "";
            if (audioSettingsAutoBuild.getCaptureSampleRate() <= 0) {
                strR = d.r(strR, " captureSampleRate");
            }
            if (audioSettingsAutoBuild.getEncodeSampleRate() <= 0) {
                strR = d.r(strR, " encodeSampleRate");
            }
            if (audioSettingsAutoBuild.getChannelCount() <= 0) {
                strR = d.r(strR, " channelCount");
            }
            if (audioSettingsAutoBuild.getAudioFormat() == -1) {
                strR = d.r(strR, " audioFormat");
            }
            if (strR.isEmpty()) {
                return audioSettingsAutoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strR));
        }

        public abstract Builder setAudioFormat(int i);

        public abstract Builder setAudioSource(int i);

        public abstract Builder setCaptureSampleRate(int i);

        public abstract Builder setChannelCount(int i);

        public abstract Builder setEncodeSampleRate(int i);
    }

    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setCaptureSampleRate(-1).setEncodeSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();
}

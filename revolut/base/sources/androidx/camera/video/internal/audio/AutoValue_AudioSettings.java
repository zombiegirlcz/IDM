package androidx.camera.video.internal.audio;

import a0.d;
import androidx.camera.video.internal.audio.AudioSettings;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int captureSampleRate;
    private final int channelCount;
    private final int encodeSampleRate;

    public static final class Builder extends AudioSettings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer captureSampleRate;
        private Integer channelCount;
        private Integer encodeSampleRate;

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings autoBuild() {
            String strR = this.audioSource == null ? " audioSource" : "";
            if (this.captureSampleRate == null) {
                strR = d.r(strR, " captureSampleRate");
            }
            if (this.encodeSampleRate == null) {
                strR = d.r(strR, " encodeSampleRate");
            }
            if (this.channelCount == null) {
                strR = d.r(strR, " channelCount");
            }
            if (this.audioFormat == null) {
                strR = d.r(strR, " audioFormat");
            }
            if (strR.isEmpty()) {
                return new AutoValue_AudioSettings(this.audioSource.intValue(), this.captureSampleRate.intValue(), this.encodeSampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strR));
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i) {
            this.audioFormat = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i) {
            this.audioSource = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setCaptureSampleRate(int i) {
            this.captureSampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setEncodeSampleRate(int i) {
            this.encodeSampleRate = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof AudioSettings) {
            AudioSettings audioSettings = (AudioSettings) obj2;
            if (this.audioSource == audioSettings.getAudioSource() && this.captureSampleRate == audioSettings.getCaptureSampleRate() && this.encodeSampleRate == audioSettings.getEncodeSampleRate() && this.channelCount == audioSettings.getChannelCount() && this.audioFormat == audioSettings.getAudioFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getCaptureSampleRate() {
        return this.captureSampleRate;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getEncodeSampleRate() {
        return this.encodeSampleRate;
    }

    public int hashCode() {
        return ((((((((this.audioSource ^ 1000003) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount) * 1000003) ^ this.audioFormat;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("AudioSettings{audioSource=");
        sb6.append(this.audioSource);
        sb6.append(", captureSampleRate=");
        sb6.append(this.captureSampleRate);
        sb6.append(", encodeSampleRate=");
        sb6.append(this.encodeSampleRate);
        sb6.append(", channelCount=");
        sb6.append(this.channelCount);
        sb6.append(", audioFormat=");
        return j6.a.v(sb6, "}", this.audioFormat);
    }

    private AutoValue_AudioSettings(int i, int i2, int i3, int i5, int i6) {
        this.audioSource = i;
        this.captureSampleRate = i2;
        this.encodeSampleRate = i3;
        this.channelCount = i5;
        this.audioFormat = i6;
    }
}

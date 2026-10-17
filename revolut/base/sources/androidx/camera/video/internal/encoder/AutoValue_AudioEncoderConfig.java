package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {
    private final int bitrate;
    private final int captureSampleRate;
    private final int channelCount;
    private final int encodeSampleRate;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final int profile;

    public static final class Builder extends AudioEncoderConfig.Builder {
        private Integer bitrate;
        private Integer captureSampleRate;
        private Integer channelCount;
        private Integer encodeSampleRate;
        private Timebase inputTimebase;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig autoBuild() {
            String strR = this.mimeType == null ? " mimeType" : "";
            if (this.profile == null) {
                strR = a0.d.r(strR, " profile");
            }
            if (this.inputTimebase == null) {
                strR = a0.d.r(strR, " inputTimebase");
            }
            if (this.bitrate == null) {
                strR = a0.d.r(strR, " bitrate");
            }
            if (this.captureSampleRate == null) {
                strR = a0.d.r(strR, " captureSampleRate");
            }
            if (this.encodeSampleRate == null) {
                strR = a0.d.r(strR, " encodeSampleRate");
            }
            if (this.channelCount == null) {
                strR = a0.d.r(strR, " channelCount");
            }
            if (strR.isEmpty()) {
                return new AutoValue_AudioEncoderConfig(this.mimeType, this.profile.intValue(), this.inputTimebase, this.bitrate.intValue(), this.captureSampleRate.intValue(), this.encodeSampleRate.intValue(), this.channelCount.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strR));
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setBitrate(int i) {
            this.bitrate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setCaptureSampleRate(int i) {
            this.captureSampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setEncodeSampleRate(int i) {
            this.encodeSampleRate = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setInputTimebase(Timebase timebase) {
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.inputTimebase = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig.Builder
        public AudioEncoderConfig.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof AudioEncoderConfig) {
            AudioEncoderConfig audioEncoderConfig = (AudioEncoderConfig) obj2;
            if (this.mimeType.equals(audioEncoderConfig.getMimeType()) && this.profile == audioEncoderConfig.getProfile() && this.inputTimebase.equals(audioEncoderConfig.getInputTimebase()) && this.bitrate == audioEncoderConfig.getBitrate() && this.captureSampleRate == audioEncoderConfig.getCaptureSampleRate() && this.encodeSampleRate == audioEncoderConfig.getEncodeSampleRate() && this.channelCount == audioEncoderConfig.getChannelCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getCaptureSampleRate() {
        return this.captureSampleRate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getEncodeSampleRate() {
        return this.encodeSampleRate;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public Timebase getInputTimebase() {
        return this.inputTimebase;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig, androidx.camera.video.internal.encoder.EncoderConfig
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return ((((((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003) ^ this.inputTimebase.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb6.append(this.mimeType);
        sb6.append(", profile=");
        sb6.append(this.profile);
        sb6.append(", inputTimebase=");
        sb6.append(this.inputTimebase);
        sb6.append(", bitrate=");
        sb6.append(this.bitrate);
        sb6.append(", captureSampleRate=");
        sb6.append(this.captureSampleRate);
        sb6.append(", encodeSampleRate=");
        sb6.append(this.encodeSampleRate);
        sb6.append(", channelCount=");
        return j6.a.v(sb6, "}", this.channelCount);
    }

    private AutoValue_AudioEncoderConfig(String str, int i, Timebase timebase, int i2, int i3, int i5, int i6) {
        this.mimeType = str;
        this.profile = i;
        this.inputTimebase = timebase;
        this.bitrate = i2;
        this.captureSampleRate = i3;
        this.encodeSampleRate = i5;
        this.channelCount = i6;
    }
}

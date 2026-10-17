package org.tensorflow.lite.support.audio;

import a0.d;
import j6.a;
import org.tensorflow.lite.support.audio.TensorAudio;

/* JADX INFO: loaded from: classes14.dex */
final class AutoValue_TensorAudio_TensorAudioFormat extends TensorAudio.TensorAudioFormat {
    private final int channels;
    private final int sampleRate;

    public static final class Builder extends TensorAudio.TensorAudioFormat.Builder {
        private Integer channels;
        private Integer sampleRate;

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat autoBuild() {
            String strR = this.channels == null ? " channels" : "";
            if (this.sampleRate == null) {
                strR = d.r(strR, " sampleRate");
            }
            if (strR.isEmpty()) {
                return new AutoValue_TensorAudio_TensorAudioFormat(this.channels.intValue(), this.sampleRate.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strR));
        }

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat.Builder setChannels(int i) {
            this.channels = Integer.valueOf(i);
            return this;
        }

        @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat.Builder
        public TensorAudio.TensorAudioFormat.Builder setSampleRate(int i) {
            this.sampleRate = Integer.valueOf(i);
            return this;
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof TensorAudio.TensorAudioFormat) {
            TensorAudio.TensorAudioFormat tensorAudioFormat = (TensorAudio.TensorAudioFormat) obj2;
            if (this.channels == tensorAudioFormat.getChannels() && this.sampleRate == tensorAudioFormat.getSampleRate()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat
    public int getChannels() {
        return this.channels;
    }

    @Override // org.tensorflow.lite.support.audio.TensorAudio.TensorAudioFormat
    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return ((this.channels ^ 1000003) * 1000003) ^ this.sampleRate;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("TensorAudioFormat{channels=");
        sb6.append(this.channels);
        sb6.append(", sampleRate=");
        return a.v(sb6, "}", this.sampleRate);
    }

    private AutoValue_TensorAudio_TensorAudioFormat(int i, int i2) {
        this.channels = i;
        this.sampleRate = i2;
    }
}

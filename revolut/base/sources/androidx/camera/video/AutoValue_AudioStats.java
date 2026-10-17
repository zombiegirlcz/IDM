package androidx.camera.video;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_AudioStats extends AudioStats {
    private final double audioAmplitudeInternal;
    private final long audioBytesRecorded;
    private final int audioState;
    private final Throwable errorCause;

    public AutoValue_AudioStats(int i, double d, long j2, Throwable th10) {
        this.audioState = i;
        this.audioAmplitudeInternal = d;
        this.audioBytesRecorded = j2;
        this.errorCause = th10;
    }

    public boolean equals(Object obj2) {
        Throwable th10;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof AudioStats) {
            AudioStats audioStats = (AudioStats) obj2;
            if (this.audioState == audioStats.getAudioState() && Double.doubleToLongBits(this.audioAmplitudeInternal) == Double.doubleToLongBits(audioStats.getAudioAmplitudeInternal()) && this.audioBytesRecorded == audioStats.getAudioBytesRecorded() && ((th10 = this.errorCause) != null ? th10.equals(audioStats.getErrorCause()) : audioStats.getErrorCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioStats
    public double getAudioAmplitudeInternal() {
        return this.audioAmplitudeInternal;
    }

    @Override // androidx.camera.video.AudioStats
    public long getAudioBytesRecorded() {
        return this.audioBytesRecorded;
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
        return this.audioState;
    }

    @Override // androidx.camera.video.AudioStats
    public Throwable getErrorCause() {
        return this.errorCause;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.audioState ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.audioAmplitudeInternal) >>> 32) ^ Double.doubleToLongBits(this.audioAmplitudeInternal)))) * 1000003;
        long j2 = this.audioBytesRecorded;
        int i = (iDoubleToLongBits ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Throwable th10 = this.errorCause;
        return i ^ (th10 == null ? 0 : th10.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.audioState + ", audioAmplitudeInternal=" + this.audioAmplitudeInternal + ", audioBytesRecorded=" + this.audioBytesRecorded + ", errorCause=" + this.errorCause + "}";
    }
}

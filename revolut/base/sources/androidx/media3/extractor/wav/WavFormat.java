package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes15.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i, int i2, int i3, int i5, int i6, int i21, byte[] bArr) {
        this.formatType = i;
        this.numChannels = i2;
        this.frameRateHz = i3;
        this.averageBytesPerSecond = i5;
        this.blockSize = i6;
        this.bitsPerSample = i21;
        this.extraData = bArr;
    }
}

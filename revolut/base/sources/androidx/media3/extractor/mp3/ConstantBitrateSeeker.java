package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes15.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataEndPosition;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j2, long j3, MpegAudioUtil.Header header, boolean z) {
        this(j2, j3, header.bitrate, header.frameSize, z);
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j2) {
        return new ConstantBitrateSeeker(j2, this.firstFramePosition, this.bitrate, this.frameSize, this.allowSeeksIfLengthUnknown);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.firstFramePosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return getTimeUsAtPosition(j2);
    }

    public ConstantBitrateSeeker(long j2, long j3, int i, int i2, boolean z) {
        super(j2, j3, i, i2, z);
        long j5 = j2;
        this.firstFramePosition = j3;
        this.bitrate = i;
        this.frameSize = i2;
        this.allowSeeksIfLengthUnknown = z;
        this.dataEndPosition = j5 == -1 ? -1L : j5;
    }
}

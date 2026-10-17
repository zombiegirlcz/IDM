package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
final class XingSeeker implements Seeker {
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j2, int i, long j3, int i2, long j5, long[] jArr) {
        this.dataStartPosition = j2;
        this.xingFrameSize = i;
        this.durationUs = j3;
        this.bitrate = i2;
        this.dataSize = j5;
        this.tableOfContents = jArr;
        this.dataEndPosition = j5 != -1 ? j2 + j5 : -1L;
    }

    public static XingSeeker create(XingFrame xingFrame, long j2) {
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == -9223372036854775807L) {
            return null;
        }
        MpegAudioUtil.Header header = xingFrame.header;
        return new XingSeeker(j2, header.frameSize, jComputeDurationUs, header.bitrate, xingFrame.dataSize, xingFrame.tableOfContents);
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.durationUs * ((long) i)) / 100;
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
        return this.dataStartPosition + ((long) this.xingFrameSize);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j2, 0L, this.durationUs);
        double d = (jConstrainValue * 100.0d) / this.durationUs;
        double d5 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d;
                double d6 = ((long[]) Preconditions.checkNotNull(this.tableOfContents))[i];
                d5 = d6 + (((i == 99 ? 256.0d : r3[i + 1]) - d6) * (d - ((double) i)));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d5 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        long j3 = j2 - this.dataStartPosition;
        if (!isSeekable() || j3 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Preconditions.checkNotNull(this.tableOfContents);
        double d = (j3 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j5 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        return Math.round((j5 == (iBinarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }
}

package androidx.media3.extractor.mp3;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes15.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j2, long j3, long[] jArr, int i, int i2) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.encoderDelay = i;
        this.encoderPadding = i2;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i;
        int i2;
        int i3 = parsableByteArray.readInt();
        int unsignedIntToInt = (i3 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i3 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        if ((i3 & 4) == 4) {
            jArr = new long[100];
            for (int i5 = 0; i5 < 100; i5++) {
                jArr[i5] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i3 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i2 = unsignedInt24 & 4095;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, unsignedInt, jArr2, i, i2);
    }

    public long computeDurationUs() {
        long j2 = this.frameCount;
        if (j2 == -1 || j2 == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j2 * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }
}

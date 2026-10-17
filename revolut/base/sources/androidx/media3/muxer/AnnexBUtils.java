package androidx.media3.muxer;

import android.util.Pair;
import androidx.media3.common.Format;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
abstract class AnnexBUtils {
    public static boolean doesSampleContainAnnexBNalUnits(Format format) {
        String str = format.sampleMimeType;
        Preconditions.checkNotNull(str);
        return str.equals("video/dolby-vision") ? ((Integer) ((Pair) Preconditions.checkNotNull(Boxes.getDolbyVisionProfileAndLevel(format))).first).intValue() != 10 : str.equals("video/avc") || str.equals("video/hevc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r2 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int findNalEndIndex(java.nio.ByteBuffer r4, int r5) {
        /*
        L0:
            int r0 = r4.limit()
            int r0 = r0 + (-4)
            r1 = 1
            if (r5 > r0) goto L34
            int r0 = r4.getInt(r5)
            r2 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r2 == 0) goto L4c
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L16
            goto L4c
        L16:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L32
            if (r2 != r1) goto L1f
            goto L32
        L1f:
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            if (r1 != 0) goto L28
            int r5 = r5 + 2
            goto L0
        L28:
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L2f
            int r5 = r5 + 3
            goto L0
        L2f:
            int r5 = r5 + 4
            goto L0
        L32:
            int r5 = r5 + r1
            return r5
        L34:
            int r0 = r4.limit()
            int r0 = r0 + (-3)
            if (r5 != r0) goto L4d
            short r0 = r4.getShort(r5)
            int r2 = r5 + 2
            byte r2 = r4.get(r2)
            if (r0 != 0) goto L4d
            if (r2 == 0) goto L4c
            if (r2 != r1) goto L4d
        L4c:
            return r5
        L4d:
            int r4 = r4.limit()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.muxer.AnnexBUtils.findNalEndIndex(java.nio.ByteBuffer, int):int");
    }

    public static ImmutableList<ByteBuffer> findNalUnits(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return ImmutableList.of();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int iSkipLeadingZerosAndFindNalStartCodeIndex = skipLeadingZerosAndFindNalStartCodeIndex(byteBufferAsReadOnlyBuffer, byteBufferAsReadOnlyBuffer.position()) + 3;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i = iSkipLeadingZerosAndFindNalStartCodeIndex;
        boolean z = true;
        while (iSkipLeadingZerosAndFindNalStartCodeIndex < byteBufferAsReadOnlyBuffer.limit()) {
            if (!z) {
                int iSkipLeadingZerosAndFindNalStartCodeIndex2 = skipLeadingZerosAndFindNalStartCodeIndex(byteBufferAsReadOnlyBuffer, iSkipLeadingZerosAndFindNalStartCodeIndex);
                if (iSkipLeadingZerosAndFindNalStartCodeIndex2 == byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                i = iSkipLeadingZerosAndFindNalStartCodeIndex2 + 3;
                z = true;
                iSkipLeadingZerosAndFindNalStartCodeIndex = i;
            } else {
                iSkipLeadingZerosAndFindNalStartCodeIndex = findNalEndIndex(byteBufferAsReadOnlyBuffer, iSkipLeadingZerosAndFindNalStartCodeIndex);
                builder.add(getBytes(byteBufferAsReadOnlyBuffer, i, iSkipLeadingZerosAndFindNalStartCodeIndex - i));
                z = false;
            }
        }
        return builder.build();
    }

    private static ByteBuffer getBytes(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        return byteBufferDuplicate.slice();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int skipLeadingZerosAndFindNalStartCodeIndex(java.nio.ByteBuffer r5, int r6) {
        /*
        L0:
            int r0 = r5.limit()
            int r0 = r0 + (-4)
            r1 = 0
            r2 = 1
            if (r6 > r0) goto L2e
            int r0 = r5.getInt(r6)
            r3 = r0 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L15
            goto L4c
        L15:
            if (r3 != 0) goto L19
            r3 = r2
            goto L1a
        L19:
            r3 = r1
        L1a:
            java.lang.String r4 = "Invalid Nal units"
            com.google.common.base.Preconditions.checkState(r3, r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L25
            int r6 = r6 + r2
            return r6
        L25:
            if (r0 != 0) goto L28
            r1 = r2
        L28:
            com.google.common.base.Preconditions.checkState(r1, r4)
            int r6 = r6 + 1
            goto L0
        L2e:
            int r0 = r5.limit()
            int r0 = r0 + (-3)
            java.lang.String r3 = "Invalid NAL units"
            if (r6 > r0) goto L54
            short r0 = r5.getShort(r6)
            if (r0 != 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = r1
        L41:
            com.google.common.base.Preconditions.checkState(r0, r3)
            int r0 = r6 + 2
            byte r0 = r5.get(r0)
            if (r0 != r2) goto L4d
        L4c:
            return r6
        L4d:
            if (r0 != 0) goto L50
            r1 = r2
        L50:
            com.google.common.base.Preconditions.checkState(r1, r3)
            goto L69
        L54:
            int r0 = r5.limit()
            if (r6 >= r0) goto L69
            byte r0 = r5.get(r6)
            if (r0 != 0) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            com.google.common.base.Preconditions.checkState(r0, r3)
            int r6 = r6 + 1
            goto L54
        L69:
            int r5 = r5.limit()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.muxer.AnnexBUtils.skipLeadingZerosAndFindNalStartCodeIndex(java.nio.ByteBuffer, int):int");
    }

    public static ByteBuffer stripEmulationPrevention(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit());
        int i = 0;
        for (int i2 = 0; i2 < byteBuffer.limit(); i2++) {
            if (byteBuffer.get(i2) != 3 || i < 2) {
                byteBufferAllocate.put(byteBuffer.get(i2));
            }
            i = byteBuffer.get(i2) == 0 ? i + 1 : 0;
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}

package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes15.dex */
abstract class FixedSampleSizeRechunker {

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;
        public final long totalSize;

        private Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j2, long j3) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j2;
            this.totalSize = j3;
        }
    }

    public static Results rechunk(int i, long[] jArr, int[] iArr, long j2) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int iCeilDivide = 0;
        for (int i5 : iArr2) {
            iCeilDivide += Util.ceilDivide(i5, i2);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        int iMax = 0;
        while (i3 < iArr2.length) {
            int i32 = iArr2[i3];
            long j3 = jArr[i3];
            while (i32 > 0) {
                int iMin = Math.min(i2, i32);
                jArr2[i22] = j3;
                int i33 = i * iMin;
                iArr3[i22] = i33;
                i21 += i33;
                iMax = Math.max(iMax, i33);
                jArr3[i22] = ((long) i6) * j2;
                iArr4[i22] = 1;
                j3 += (long) iArr3[i22];
                i6 += iMin;
                i32 -= iMin;
                i22++;
                i2 = i2;
            }
            i3++;
            iArr2 = iArr;
        }
        return new Results(jArr2, iArr3, iMax, jArr3, iArr4, j2 * ((long) i6), i21);
    }
}

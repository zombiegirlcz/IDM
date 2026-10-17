package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes14.dex */
public class AsconPermutationFriend {

    public static class AsconPermutation {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f228341x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public long f228342x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public long f228343x2;
        public long x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public long f228344x4;

        public void p(int i) {
            if (i == 12) {
                round(240L);
                round(225L);
                round(210L);
                round(195L);
            }
            if (i >= 8) {
                round(180L);
                round(165L);
            }
            round(150L);
            round(135L);
            round(120L);
            round(105L);
            round(90L);
            round(75L);
        }

        public void round(long j2) {
            long j3 = this.f228343x2 ^ j2;
            this.f228343x2 = j3;
            long j5 = this.f228341x0;
            long j16 = this.f228344x4;
            long j22 = j5 ^ j16;
            long j42 = this.f228342x1;
            long j46 = j42 ^ j3;
            long j47 = j42 | j3;
            long j57 = this.x3;
            long j58 = ((j57 ^ j47) ^ j5) ^ (j42 & j22);
            long j65 = (j22 ^ (j47 | j57)) ^ ((j42 & j3) & j57);
            long j69 = ((~j57) & j16) ^ j46;
            long j76 = j46 ^ (j5 | (j57 ^ j16));
            long j85 = (j57 ^ (j16 | j42)) ^ (j5 & j42);
            this.f228341x0 = Longs.rotateRight(j58, 28) ^ (Longs.rotateRight(j58, 19) ^ j58);
            this.f228342x1 = (Longs.rotateRight(j65, 39) ^ j65) ^ Longs.rotateRight(j65, 61);
            this.f228343x2 = ~((Longs.rotateRight(j69, 1) ^ j69) ^ Longs.rotateRight(j69, 6));
            this.x3 = (Longs.rotateRight(j76, 10) ^ j76) ^ Longs.rotateRight(j76, 17);
            this.f228344x4 = Longs.rotateRight(j85, 41) ^ (Longs.rotateRight(j85, 7) ^ j85);
        }

        public void set(long j2, long j3, long j5, long j16, long j22) {
            this.f228341x0 = j2;
            this.f228342x1 = j3;
            this.f228343x2 = j5;
            this.x3 = j16;
            this.f228344x4 = j22;
        }
    }

    public static AsconPermutation getAsconPermutation(ISAPDigest.Friend friend) {
        if (friend != null) {
            return new AsconPermutation();
        }
        throw new NullPointerException("This method is only for use by ISAPDigest or Ascon Digest");
    }
}

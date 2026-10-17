package com.google.common.hash;

import a0.d;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i, int i2) {
        return i2 <= 32 ? i2 <= 16 ? hashLength0to16(bArr, i, i2) : hashLength17to32(bArr, i, i2) : i2 <= 64 ? hashLength33To64(bArr, i, i2) : hashLength65Plus(bArr, i, i2);
    }

    private static long hashLength0to16(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j2 = (((long) i2) * 2) + K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i) + K2;
            long jLoad642 = LittleEndianByteArray.load64(bArr, (i + i2) - 8);
            return hashLength16((Long.rotateRight(jLoad642, 37) * j2) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad642) * j2, j2);
        }
        if (i2 >= 4) {
            return hashLength16(((long) i2) + ((((long) LittleEndianByteArray.load32(bArr, i)) & BodyPartID.bodyIdMax) << 3), ((long) LittleEndianByteArray.load32(bArr, (i + i2) - 4)) & BodyPartID.bodyIdMax, ((long) (i2 * 2)) + K2);
        }
        if (i2 <= 0) {
            return K2;
        }
        return shiftMix((((long) ((bArr[i] & UnsignedBytes.MAX_VALUE) + ((bArr[(i2 >> 1) + i] & UnsignedBytes.MAX_VALUE) << 8))) * K2) ^ (((long) (i2 + ((bArr[(i2 - 1) + i] & 255) << 2))) * K0)) * K2;
    }

    private static long hashLength16(long j2, long j3, long j5) {
        long j16 = (j2 ^ j3) * j5;
        long j22 = ((j16 ^ (j16 >>> 47)) ^ j3) * j5;
        return (j22 ^ (j22 >>> 47)) * j5;
    }

    private static long hashLength17to32(byte[] bArr, int i, int i2) {
        long j2 = (((long) i2) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i) * K1;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j2;
        return hashLength16(Long.rotateRight(jLoad643, 30) + Long.rotateRight(jLoad64 + jLoad642, 43) + (LittleEndianByteArray.load64(bArr, i3 - 16) * K2), jLoad643 + Long.rotateRight(jLoad642 + K2, 18) + jLoad64, j2);
    }

    private static long hashLength33To64(byte[] bArr, int i, int i2) {
        long j2 = (((long) i2) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i) * K2;
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        int i3 = i + i2;
        long jLoad643 = LittleEndianByteArray.load64(bArr, i3 - 8) * j2;
        long jRotateRight = Long.rotateRight(jLoad643, 30) + Long.rotateRight(jLoad64 + jLoad642, 43) + (LittleEndianByteArray.load64(bArr, i3 - 16) * K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad643 + Long.rotateRight(jLoad642 + K2, 18) + jLoad64, j2);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i + 16) * j2;
        long jLoad645 = LittleEndianByteArray.load64(bArr, i + 24);
        long jLoad646 = (jRotateRight + LittleEndianByteArray.load64(bArr, i3 - 32)) * j2;
        return hashLength16(Long.rotateRight(jLoad646, 30) + Long.rotateRight(jLoad644 + jLoad645, 43) + ((jHashLength16 + LittleEndianByteArray.load64(bArr, i3 - 24)) * j2), Long.rotateRight(jLoad645 + jLoad64, 18) + jLoad644 + jLoad646, j2);
    }

    private static long hashLength65Plus(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long j2 = 81;
        long j3 = K1;
        long j5 = (j2 * K1) + 113;
        long jShiftMix = shiftMix((j5 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j2 * K2) + LittleEndianByteArray.load64(bArr, i);
        char c2 = 1;
        int i3 = i2 - 1;
        char c3 = '@';
        int iB = d.b(i3, 64, 64, i);
        int i5 = i3 & 63;
        int i6 = iB + i5;
        int i21 = i6 - 63;
        long j16 = jShiftMix;
        long jLoad642 = j5;
        long j22 = jLoad64;
        int i22 = i;
        while (true) {
            long jRotateRight = Long.rotateRight(j22 + jLoad642 + jArr[0] + LittleEndianByteArray.load64(bArr2, i22 + 8), 37) * j3;
            long jRotateRight2 = Long.rotateRight(jLoad642 + jArr[c2] + LittleEndianByteArray.load64(bArr2, i22 + 48), 42) * j3;
            long j42 = jRotateRight ^ jArr2[c2];
            jLoad642 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr2, i22 + 40);
            long jRotateRight3 = Long.rotateRight(j16 + jArr2[0], 33) * j3;
            long j46 = j3;
            char c5 = c3;
            int i32 = i5;
            char c6 = c2;
            weakHashLength32WithSeeds(bArr2, i22, jArr[c2] * j3, j42 + jArr2[0], jArr);
            int i33 = i22;
            long[] jArr3 = jArr;
            weakHashLength32WithSeeds(bArr2, i33 + 32, jRotateRight3 + jArr2[c6], LittleEndianByteArray.load64(bArr2, i33 + 16) + jLoad642, jArr2);
            i22 = i33 + 64;
            if (i22 == iB) {
                long j47 = ((j42 & 255) << c6) + j46;
                long j57 = jArr2[0] + ((long) i32);
                jArr2[0] = j57;
                long j58 = jArr3[0] + j57;
                jArr3[0] = j58;
                jArr2[0] = jArr2[0] + j58;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad642 + jArr3[0] + LittleEndianByteArray.load64(bArr2, i6 - 55), 37) * j47;
                long jRotateRight5 = Long.rotateRight(jLoad642 + jArr3[c6] + LittleEndianByteArray.load64(bArr2, i6 - 15), 42) * j47;
                long j65 = jRotateRight4 ^ (jArr2[c6] * 9);
                long jLoad643 = (jArr3[0] * 9) + LittleEndianByteArray.load64(bArr2, i6 - 23) + jRotateRight5;
                long jRotateRight6 = Long.rotateRight(j42 + jArr2[0], 33) * j47;
                weakHashLength32WithSeeds(bArr2, i21, jArr3[c6] * j47, j65 + jArr2[0], jArr3);
                weakHashLength32WithSeeds(bArr2, i6 - 31, jArr2[c6] + jRotateRight6, LittleEndianByteArray.load64(bArr2, i6 - 47) + jLoad643, jArr2);
                return hashLength16(ch.qos.logback.core.util.a.d(shiftMix(jLoad643), K0, hashLength16(jArr3[0], jArr2[0], j47), j65), hashLength16(jArr3[c6], jArr2[c6], j47) + jRotateRight6, j47);
            }
            bArr2 = bArr;
            c3 = c5;
            i5 = i32;
            j22 = jRotateRight3;
            j16 = j42;
            c2 = c6;
            jArr = jArr3;
            j3 = j46;
        }
    }

    private static long shiftMix(long j2) {
        return j2 ^ (j2 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i, long j2, long j3, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i);
        long jLoad642 = LittleEndianByteArray.load64(bArr, i + 8);
        long jLoad643 = LittleEndianByteArray.load64(bArr, i + 16);
        long jLoad644 = LittleEndianByteArray.load64(bArr, i + 24);
        long j5 = j2 + jLoad64;
        long j16 = jLoad642 + j5 + jLoad643;
        long jRotateRight = Long.rotateRight(j16, 44) + Long.rotateRight(j3 + j5 + jLoad644, 21);
        jArr[0] = j16 + jLoad644;
        jArr[1] = jRotateRight + j5;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}

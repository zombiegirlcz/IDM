package org.bouncycastle.pqc.crypto.mayo;

import a10.b;
import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class MayoSigner implements MessageSigner {
    private static final long EVEN_2BYTES = 281470681808895L;
    private static final long EVEN_BYTES = 71777214294589695L;
    private static final int F_TAIL_LEN = 4;
    private MayoParameters params;
    private MayoPrivateKeyParameters privKey;
    private MayoPublicKeyParameters pubKey;
    private SecureRandom random;

    private static long ctCompare64(int i, int i2) {
        return (-(i ^ i2)) >> 63;
    }

    private static void mVecMultiplyBins(int i, int i2, long[] jArr, long[] jArr2) {
        int i3 = i + i;
        int i5 = i3 + i;
        int i6 = i5 + i;
        int i21 = i6 + i;
        int i22 = i21 + i;
        int i32 = i22 + i;
        int i33 = i32 + i;
        int i43 = i33 + i;
        int i59 = i43 + i;
        int i66 = i59 + i;
        int i74 = i66 + i;
        int i92 = i74 + i;
        int i96 = i92 + i;
        int i99 = i96 + i;
        int i100 = 0;
        int i101 = 0;
        while (i100 < i2) {
            int i102 = i100;
            int i103 = i101;
            int i104 = 0;
            while (i104 < i) {
                long j2 = jArr[i103 + i21];
                long j3 = j2 & 1229782938247303441L;
                long j5 = (jArr[i103 + i59] ^ ((j2 & (-1229782938247303442L)) >>> 1)) ^ ((j3 << 3) + j3);
                long j16 = jArr[i103 + i66];
                long j22 = (j16 & (-8608480567731124088L)) >>> 3;
                long j42 = (jArr[i103 + i74] ^ ((j16 & 8608480567731124087L) << 1)) ^ ((j22 << 1) + j22);
                long j46 = j5 & 1229782938247303441L;
                long j47 = (jArr[i103 + i32] ^ ((j5 & (-1229782938247303442L)) >>> 1)) ^ ((j46 << 3) + j46);
                long j57 = (j42 & (-8608480567731124088L)) >>> 3;
                long j58 = (jArr[i103 + i22] ^ ((j42 & 8608480567731124087L) << 1)) ^ ((j57 << 1) + j57);
                long j65 = j47 & 1229782938247303441L;
                long j69 = (jArr[i103 + i96] ^ ((j47 & (-1229782938247303442L)) >>> 1)) ^ ((j65 << 3) + j65);
                long j76 = (j58 & (-8608480567731124088L)) >>> 3;
                long j85 = (jArr[i103 + i5] ^ ((j58 & 8608480567731124087L) << 1)) ^ ((j76 << 1) + j76);
                long j100 = j69 & 1229782938247303441L;
                long j101 = (jArr[i103 + i99] ^ ((j69 & (-1229782938247303442L)) >>> 1)) ^ ((j100 << 3) + j100);
                long j102 = (j85 & (-8608480567731124088L)) >>> 3;
                long j103 = (jArr[i103 + i33] ^ ((j85 & 8608480567731124087L) << 1)) ^ ((j102 << 1) + j102);
                long j104 = j101 & 1229782938247303441L;
                long j105 = (jArr[i103 + i92] ^ ((j101 & (-1229782938247303442L)) >>> 1)) ^ ((j104 << 3) + j104);
                long j106 = (j103 & (-8608480567731124088L)) >>> 3;
                long j107 = (jArr[i103 + i6] ^ ((j103 & 8608480567731124087L) << 1)) ^ ((j106 << 1) + j106);
                long j108 = j105 & 1229782938247303441L;
                long j109 = (jArr[i103 + i43] ^ ((j105 & (-1229782938247303442L)) >>> 1)) ^ ((j108 << 3) + j108);
                long j110 = (j107 & (-8608480567731124088L)) >>> 3;
                long j111 = (jArr[i103 + i3] ^ ((j107 & 8608480567731124087L) << 1)) ^ ((j110 << 1) + j110);
                long j112 = j109 & 1229782938247303441L;
                long j113 = (jArr[i103 + i] ^ ((j109 & (-1229782938247303442L)) >>> 1)) ^ ((j112 << 3) + j112);
                long j114 = (j111 & (-8608480567731124088L)) >>> 3;
                jArr2[(i101 >> 4) + i104] = (j113 ^ ((j111 & 8608480567731124087L) << 1)) ^ ((j114 << 1) + j114);
                i104++;
                i103++;
            }
            i100 = i102 + 1;
            i101 += i << 4;
        }
    }

    private static void mayoGenericMCalculatePS(MayoParameters mayoParameters, long[] jArr, int i, int i2, byte[] bArr, int i3, int i5, int i6, long[] jArr2) {
        int i21 = i3;
        int i22 = i5;
        int i32 = i22 + i21;
        int mVecLimbs = mayoParameters.getMVecLimbs();
        long[] jArr3 = new long[((mayoParameters.getN() * (mayoParameters.getK() * mVecLimbs)) * mVecLimbs) << 4];
        int i33 = i22 * mVecLimbs;
        int i43 = 0;
        int i59 = 0;
        int i66 = 0;
        int i74 = 0;
        while (i43 < i21) {
            for (int i92 = i43; i92 < i21; i92++) {
                int i96 = 0;
                int i99 = 0;
                while (i96 < i6) {
                    Nat.xorTo64(mVecLimbs, jArr, i66, jArr3, (((i74 + i96) << 4) + (bArr[i99 + i92] & 255)) * mVecLimbs);
                    i96++;
                    i99 += i32;
                }
                i66 += mVecLimbs;
            }
            int i100 = i59;
            int i101 = 0;
            while (i101 < i22) {
                int i102 = 0;
                int i103 = 0;
                while (i102 < i6) {
                    Nat.xorTo64(mVecLimbs, jArr, i + i100, jArr3, (((i74 + i102) << 4) + (bArr[i103 + i101 + i3] & 255)) * mVecLimbs);
                    i102++;
                    i103 += i32;
                }
                i101++;
                i100 += mVecLimbs;
                i22 = i5;
            }
            i43++;
            i74 += i6;
            i59 += i33;
            i21 = i3;
            i22 = i5;
        }
        int i104 = i3 * i6;
        int i105 = 0;
        int i106 = i3;
        while (i106 < i32) {
            for (int i107 = i106; i107 < i32; i107++) {
                int i108 = 0;
                int i109 = 0;
                while (i108 < i6) {
                    Nat.xorTo64(mVecLimbs, jArr, i2 + i105, jArr3, (((i104 + i108) << 4) + (bArr[i109 + i107] & 255)) * mVecLimbs);
                    i108++;
                    i109 += i32;
                }
                i105 += mVecLimbs;
            }
            i106++;
            i104 += i6;
        }
        mVecMultiplyBins(mVecLimbs, i32 * i6, jArr3, jArr2);
    }

    private static void mayoGenericMCalculateSPS(long[] jArr, byte[] bArr, int i, int i2, int i3, long[] jArr2) {
        int i5 = i2;
        int i6 = i5 * i5;
        long[] jArr3 = new long[(i * i6) << 4];
        int i21 = i5 * i;
        int i22 = 0;
        int i32 = 0;
        int i33 = 0;
        while (i22 < i5) {
            int i43 = 0;
            int i59 = 0;
            while (i43 < i3) {
                int i66 = ((bArr[i32 + i43] & 255) * i) + i33;
                int i74 = 0;
                int i92 = 0;
                while (i74 < i5) {
                    Nat.xorTo64(i, jArr, i59 + i92, jArr3, i66 + (i92 << 4));
                    i74++;
                    i92 += i;
                    i5 = i2;
                }
                i43++;
                i59 += i21;
                i5 = i2;
            }
            i22++;
            i32 += i3;
            i33 += i21 << 4;
            i5 = i2;
        }
        mVecMultiplyBins(i, i6, jArr3, jArr2);
    }

    private static int mulTable(int i) {
        int i2 = i * 134480385;
        int i3 = (-252645136) & i2;
        return (i2 ^ (i3 >>> 4)) ^ (i3 >>> 3);
    }

    private static void transpose16x16Nibbles(long[] jArr, int i) {
        for (int i2 = 0; i2 < 16; i2 += 2) {
            int i3 = i + i2;
            int i5 = i3 + 1;
            long j2 = jArr[i3];
            long j3 = ((j2 >>> 4) ^ jArr[i5]) & 1085102592571150095L;
            jArr[i3] = j2 ^ (j3 << 4);
            jArr[i5] = jArr[i5] ^ j3;
        }
        int i6 = i;
        for (int i21 = 0; i21 < 16; i21 += 4) {
            long j5 = jArr[i6];
            long j16 = ((j5 >>> 8) ^ jArr[i6 + 2]) & EVEN_BYTES;
            int i22 = i6 + 1;
            long j22 = EVEN_BYTES & ((jArr[i22] >>> 8) ^ jArr[i6 + 3]);
            jArr[i6] = j5 ^ (j16 << 8);
            int i32 = i6 + 2;
            jArr[i22] = jArr[i22] ^ (j22 << 8);
            int i33 = i6 + 3;
            jArr[i32] = jArr[i32] ^ j16;
            i6 += 4;
            jArr[i33] = jArr[i33] ^ j22;
        }
        for (int i43 = 0; i43 < 4; i43++) {
            int i59 = i + i43;
            long j42 = jArr[i59];
            int i66 = i59 + 4;
            long j46 = ((j42 >>> 16) ^ jArr[i66]) & EVEN_2BYTES;
            int i74 = i59 + 8;
            int i92 = i59 + 12;
            long j47 = EVEN_2BYTES & ((jArr[i74] >>> 16) ^ jArr[i92]);
            jArr[i59] = j42 ^ (j46 << 16);
            jArr[i74] = jArr[i74] ^ (j47 << 16);
            jArr[i66] = jArr[i66] ^ j46;
            jArr[i92] = jArr[i92] ^ j47;
        }
        for (int i96 = 0; i96 < 8; i96++) {
            int i99 = i + i96;
            long j57 = jArr[i99];
            int i100 = i99 + 8;
            long j58 = ((j57 >>> 32) ^ jArr[i100]) & BodyPartID.bodyIdMax;
            jArr[i99] = j57 ^ (j58 << 32);
            jArr[i100] = jArr[i100] ^ j58;
        }
    }

    private static void vecMulAddU64(int i, long[] jArr, byte b4, long[] jArr2) {
        int iMulTable = mulTable(b4 & UnsignedBytes.MAX_VALUE);
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = jArr[i2];
            jArr2[i2] = ((((j2 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j2 & 1229782938247303441L) * ((long) (iMulTable & 255))) ^ (((j2 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j2 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i2];
        }
    }

    public void computeA(long[] jArr, byte[] bArr) {
        char c2;
        int i;
        char c3;
        int i2;
        int i3;
        int k = this.params.getK();
        int o = this.params.getO();
        int m3 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int aCols = this.params.getACols();
        int[] fTail = this.params.getFTail();
        int i5 = o * k;
        int i6 = o * mVecLimbs;
        int i21 = 4;
        int i22 = ((i5 + 15) >> 4) << 4;
        long[] jArr2 = new long[(((m3 + 7) >>> 3) * i22) << 4];
        int i32 = m3 & 15;
        if (i32 != 0) {
            long j2 = (1 << (i32 << 2)) - 1;
            int i33 = mVecLimbs - 1;
            c2 = 3;
            int i43 = 0;
            while (i43 < i5) {
                jArr[i33] = jArr[i33] & j2;
                i43++;
                i33 += mVecLimbs;
            }
        } else {
            c2 = 3;
        }
        int i59 = 0;
        int i66 = 0;
        int i74 = 0;
        int i92 = 0;
        int i96 = 0;
        while (i59 < k) {
            int i99 = k - 1;
            int i100 = i99 * i6;
            int i101 = i21;
            int i102 = i99 * o;
            int i103 = i96;
            int i104 = i99;
            while (i104 >= i59) {
                int i105 = 0;
                int i106 = 0;
                while (true) {
                    i2 = k;
                    i3 = aCols;
                    if (i105 >= o) {
                        break;
                    }
                    int i107 = 0;
                    int i108 = 0;
                    while (i107 < mVecLimbs) {
                        long j3 = jArr[i100 + i107 + i106];
                        int iC = b.C(i74, i105, i103, i108);
                        jArr2[iC] = jArr2[iC] ^ (j3 << i92);
                        if (i92 > 0) {
                            int i109 = iC + i22;
                            jArr2[i109] = jArr2[i109] ^ (j3 >>> (64 - i92));
                        }
                        i107++;
                        i108 += i22;
                    }
                    i105++;
                    i106 += mVecLimbs;
                    k = i2;
                    aCols = i3;
                }
                if (i59 != i104) {
                    int i110 = 0;
                    int i111 = 0;
                    while (i110 < o) {
                        int i112 = i111;
                        int i113 = 0;
                        int i114 = 0;
                        while (i114 < mVecLimbs) {
                            long j5 = jArr[i66 + i114 + i112];
                            int iC2 = b.C(i102, i110, i103, i113);
                            jArr2[iC2] = jArr2[iC2] ^ (j5 << i92);
                            if (i92 > 0) {
                                int i115 = iC2 + i22;
                                jArr2[i115] = jArr2[i115] ^ (j5 >>> (64 - i92));
                            }
                            i114++;
                            i113 += i22;
                        }
                        i110++;
                        i111 = i112 + mVecLimbs;
                    }
                }
                int i116 = i92 + 4;
                if (i116 == 64) {
                    i103 += i22;
                    i92 = 0;
                } else {
                    i92 = i116;
                }
                i104--;
                i100 -= i6;
                i102 -= o;
                k = i2;
                aCols = i3;
            }
            i59++;
            i74 += o;
            i66 += i6;
            i96 = i103;
            i21 = i101;
        }
        int i117 = k;
        int i118 = aCols;
        int i119 = i21;
        int i120 = 0;
        while (true) {
            i = (i117 + 1) * i117;
            if (i120 >= ((((i >> 1) + m3) + 15) >>> 4) * i22) {
                break;
            }
            transpose16x16Nibbles(jArr2, i120);
            i120 += 16;
        }
        byte[] bArr2 = new byte[16];
        int i121 = 0;
        int i122 = 0;
        while (true) {
            c3 = 1;
            if (i121 >= i119) {
                break;
            }
            int i123 = fTail[i121];
            bArr2[i122] = (byte) GF16.mul(i123, 1);
            bArr2[i122 + 1] = (byte) GF16.mul(i123, 2);
            int i124 = i122 + 3;
            bArr2[i122 + 2] = (byte) GF16.mul(i123, 4);
            i122 += 4;
            bArr2[i124] = (byte) GF16.mul(i123, 8);
            i121++;
            i119 = 4;
        }
        int i125 = 0;
        while (i125 < i22) {
            int i126 = m3;
            while (i126 < (i >>> 1) + m3) {
                long j16 = jArr2[((i126 >>> 4) * i22) + i125 + (i126 & 15)];
                long j22 = j16 & 1229782938247303441L;
                long j42 = (j16 >>> c3) & 1229782938247303441L;
                long j46 = (j16 >>> 2) & 1229782938247303441L;
                long j47 = (j16 >>> c2) & 1229782938247303441L;
                int i127 = 0;
                int i128 = 0;
                while (i127 < 4) {
                    int i129 = (i126 + i127) - m3;
                    int i130 = ((i129 >> 4) * i22) + i125 + (i129 & 15);
                    long j57 = j47;
                    jArr2[i130] = jArr2[i130] ^ ((((((long) bArr2[i128 + 1]) * j42) ^ (((long) bArr2[i128]) * j22)) ^ (((long) bArr2[i128 + 2]) * j46)) ^ (j57 * ((long) bArr2[i128 + 3])));
                    i127++;
                    i128 += 4;
                    i = i;
                    j47 = j57;
                }
                i126++;
                c3 = 1;
            }
            i125 += 16;
            c3 = 1;
        }
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr2);
        for (int i131 = 0; i131 < m3; i131 += 16) {
            int i132 = 0;
            while (true) {
                int i133 = i118 - 1;
                if (i132 < i133) {
                    int i134 = 0;
                    while (true) {
                        int i135 = i134 + i131;
                        if (i135 < m3) {
                            GF16.decode(bArrLongToLittleEndian, ((((i131 * i22) >> 4) + i132) + i134) << 3, bArr, (i135 * i118) + i132, Math.min(16, i133 - i132));
                            i134++;
                        }
                    }
                    i132 += 16;
                }
            }
        }
    }

    public void computeRHS(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i;
        int[] iArr;
        int m3 = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int k = this.params.getK();
        int[] fTail = this.params.getFTail();
        int i2 = ((m3 - 1) & 15) << 2;
        int i3 = m3 & 15;
        int i5 = 0;
        if (i3 != 0) {
            long j2 = (1 << (i3 << 2)) - 1;
            int i6 = k * k;
            int i21 = mVecLimbs - 1;
            int i22 = 0;
            while (i22 < i6) {
                jArr[i21] = jArr[i21] & j2;
                i22++;
                i21 += mVecLimbs;
            }
        }
        long[] jArr2 = new long[mVecLimbs];
        byte[] bArr3 = new byte[mVecLimbs << 3];
        int i32 = k * mVecLimbs;
        int i33 = k - 1;
        int i43 = i33 * mVecLimbs;
        int i59 = i43 * k;
        while (i33 >= 0) {
            int i66 = i33;
            int i74 = i43;
            int i92 = i59;
            while (i66 < k) {
                int i96 = mVecLimbs - 1;
                long j3 = jArr2[i96];
                int i99 = i66;
                int i100 = (int) ((j3 >>> i2) & 15);
                jArr2[i96] = j3 << 4;
                for (int i101 = mVecLimbs - 2; i101 >= 0; i101--) {
                    int i102 = i101 + 1;
                    jArr2[i102] = jArr2[i102] ^ (jArr2[i101] >>> 60);
                    jArr2[i101] = jArr2[i101] << 4;
                }
                Pack.longToLittleEndian(jArr2, bArr3, i5);
                int i103 = i5;
                for (int i104 = 4; i103 < i104; i104 = 4) {
                    int i105 = fTail[i103];
                    if (i105 == 0) {
                        i = k;
                        iArr = fTail;
                    } else {
                        i = k;
                        iArr = fTail;
                        long jMul = GF16.mul(i100, i105);
                        if ((i103 & 1) == 0) {
                            int i106 = i103 >> 1;
                            bArr3[i106] = (byte) (bArr3[i106] ^ ((byte) (jMul & 15)));
                        } else {
                            int i107 = i103 >> 1;
                            bArr3[i107] = (byte) (bArr3[i107] ^ ((byte) ((jMul & 15) << 4)));
                        }
                    }
                    i103++;
                    k = i;
                    fTail = iArr;
                }
                int i108 = k;
                int[] iArr2 = fTail;
                Pack.littleEndianToLong(bArr3, 0, jArr2);
                int i109 = i59 + i74;
                int i110 = i92 + i43;
                boolean z = i33 == i99;
                for (int i111 = 0; i111 < mVecLimbs; i111++) {
                    long j5 = jArr[i109 + i111];
                    if (!z) {
                        j5 ^= jArr[i110 + i111];
                    }
                    jArr2[i111] = jArr2[i111] ^ j5;
                }
                i66 = i99 + 1;
                i74 += mVecLimbs;
                i92 += i32;
                k = i108;
                fTail = iArr2;
                i5 = 0;
            }
            i33--;
            i43 -= mVecLimbs;
            i59 -= i32;
            i5 = 0;
        }
        Pack.longToLittleEndian(jArr2, bArr3, i5);
        while (i5 < m3) {
            int i112 = i5 >> 1;
            bArr2[i5] = (byte) (bArr[i5] ^ (bArr3[i112] & 15));
            int i113 = i5 + 1;
            bArr2[i113] = (byte) (((bArr3[i112] >>> 4) & 15) ^ bArr[i113]);
            i5 += 2;
        }
    }

    public void ef(byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        int i6 = (i2 + 15) >> 4;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        long[] jArr3 = new long[i * i6];
        int i21 = 16;
        int k = (this.params.getK() * this.params.getO()) + 16;
        byte[] bArr2 = new byte[k >> 1];
        int i22 = k >> 4;
        int i32 = 0;
        int i33 = 0;
        int i43 = 0;
        while (i32 < i) {
            int i59 = 0;
            while (i59 < i6) {
                long j2 = 0;
                int i66 = 0;
                while (i66 < i21) {
                    int i74 = (i59 << 4) + i66;
                    if (i74 < i2) {
                        i3 = i66;
                        i5 = i32;
                        j2 |= (((long) bArr[i74 + i33]) & 15) << (i3 << 2);
                    } else {
                        i3 = i66;
                        i5 = i32;
                    }
                    i66 = i3 + 1;
                    i32 = i5;
                    i21 = 16;
                }
                jArr3[i59 + i43] = j2;
                i59++;
                i21 = 16;
            }
            i32++;
            i33 += i2;
            i43 += i6;
            i21 = 16;
        }
        int i92 = 0;
        int i96 = 0;
        while (i92 < i2) {
            int iMax = Math.max(0, (i92 + i) - i2);
            int i99 = i - 1;
            int iMin = Math.min(i99, i92);
            Arrays.clear(jArr);
            Arrays.clear(jArr2);
            int iMin2 = Math.min(i99, iMin + 32);
            int i100 = iMax * i6;
            int i101 = i100;
            int i102 = 0;
            int i103 = i92;
            int i104 = i22;
            long j3 = -1;
            while (iMax <= iMin2) {
                long j5 = ~ctCompare64(iMax, i96);
                long j16 = (((long) i96) - ((long) iMax)) >> 63;
                for (int i105 = 0; i105 < i6; i105++) {
                    jArr[i105] = jArr[i105] ^ ((j5 | (j16 & j3)) & jArr3[i101 + i105]);
                }
                i102 = (int) ((jArr[i103 >>> 4] >>> ((i103 & 15) << 2)) & 15);
                j3 = ~((-i102) >> 63);
                iMax++;
                i101 += i6;
            }
            vecMulAddU64(i6, jArr, GF16.inv((byte) i102), jArr2);
            int i106 = i100;
            int i107 = iMax;
            while (i107 <= iMin) {
                int i108 = i106;
                int i109 = i102;
                int i110 = i107;
                long j22 = (~j3) & (~ctCompare64(i107, i96));
                long j42 = ~j22;
                int i111 = i108;
                int i112 = 0;
                while (i112 < i6) {
                    jArr3[i111] = (j42 & jArr3[i111]) | (j22 & jArr2[i112]);
                    i112++;
                    i111++;
                }
                i107 = i110 + 1;
                i106 = i108 + i6;
                i102 = i109;
            }
            int i113 = i102;
            int i114 = iMax;
            while (i114 < i) {
                vecMulAddU64(i6, jArr2, (byte) (((int) ((jArr3[(i103 >>> 4) + i100] >>> ((i103 & 15) << 2)) & 15)) & (i114 > i96 ? -1 : 0)), jArr3, i100);
                i114++;
                i100 += i6;
            }
            if (i113 != 0) {
                i96++;
            }
            i92 = i103 + 1;
            i22 = i104;
        }
        int i115 = i22;
        int i116 = 0;
        int i117 = 0;
        int i118 = 0;
        while (i118 < i) {
            Pack.longToLittleEndian(jArr3, i116, i115, bArr2, 0);
            GF16.decode(bArr2, 0, bArr, i117, i2);
            i117 += i2;
            i118++;
            i116 += i6;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        int i;
        byte[] bArr13;
        int i2;
        byte[] bArr14;
        int i3;
        int i5;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        int i6;
        long[] jArr;
        int i21;
        long[] jArr2;
        int i22;
        int k = this.params.getK();
        int v = this.params.getV();
        int o = this.params.getO();
        int n3 = this.params.getN();
        int m3 = this.params.getM();
        int vBytes = this.params.getVBytes();
        int oBytes = this.params.getOBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        int p1Limbs = this.params.getP1Limbs();
        int pkSeedBytes = this.params.getPkSeedBytes();
        int digestBytes = this.params.getDigestBytes();
        int skSeedBytes = this.params.getSkSeedBytes();
        byte[] bArr18 = new byte[this.params.getMBytes()];
        byte[] bArr19 = new byte[m3];
        byte[] bArr20 = new byte[saltBytes];
        byte[] bArr21 = new byte[m3];
        int i32 = k * vBytes;
        int rBytes = this.params.getRBytes() + i32;
        int i33 = i32;
        int i43 = v * k;
        int i59 = k;
        byte[] bArr22 = new byte[i43];
        int i66 = i59 * o;
        int i74 = i59 * n3;
        byte[] bArr23 = bArr22;
        int i92 = i66 + 1;
        byte[] bArr24 = new byte[rBytes];
        byte[] bArr25 = new byte[((m3 + 7) / 8) * 8 * i92];
        byte[] bArr26 = new byte[i74];
        byte[] bArr27 = new byte[i74];
        int i96 = digestBytes + saltBytes;
        int i99 = i74;
        int i100 = i96 + skSeedBytes;
        byte[] bArr28 = new byte[i92];
        int i101 = i100 + 1;
        int i102 = rBytes;
        byte[] bArr29 = new byte[i101];
        int i103 = i101;
        int sigBytes = this.params.getSigBytes();
        byte[] bArr30 = new byte[sigBytes];
        long[] jArr3 = new long[this.params.getP2Limbs() + p1Limbs];
        int i104 = v * o;
        byte[] bArr31 = new byte[i104];
        byte[] bArr32 = bArr18;
        long[] jArr4 = new long[i66 * mVecLimbs];
        long[] jArr5 = new long[i59 * i59 * mVecLimbs];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        try {
            byte[] seedSk = this.privKey.getSeedSk();
            int i105 = pkSeedBytes + oBytes;
            byte[] bArr33 = new byte[i105];
            byte[] bArr34 = bArr20;
            try {
                sHAKEDigest.update(seedSk, 0, seedSk.length);
                sHAKEDigest.doFinal(bArr33, 0, i105);
                GF16.decode(bArr33, pkSeedBytes, bArr31, 0, i104);
                Utils.expandP1P2(this.params, jArr3, bArr33);
                int i106 = o * mVecLimbs;
                int i107 = 0;
                int i108 = 0;
                int i109 = 0;
                int i110 = 0;
                while (i107 < v) {
                    int i111 = i108;
                    int i112 = i109;
                    int i113 = i110;
                    int i114 = i107;
                    while (i114 < v) {
                        if (i114 == i107) {
                            i113 += mVecLimbs;
                            i21 = i106;
                            jArr2 = jArr3;
                            i22 = mVecLimbs;
                        } else {
                            i21 = i106;
                            int i115 = p1Limbs;
                            int i116 = 0;
                            while (i116 < o) {
                                long[] jArr6 = jArr3;
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr6, i113, bArr31[i111 + i116], jArr3, i109 + i115);
                                int i117 = mVecLimbs;
                                GF16Utils.mVecMulAdd(i117, jArr6, i113, bArr31[i108 + i116], jArr6, i112 + i115);
                                i116++;
                                i115 += i117;
                                mVecLimbs = i117;
                                jArr3 = jArr6;
                            }
                            jArr2 = jArr3;
                            i22 = mVecLimbs;
                            i113 += i22;
                        }
                        i114++;
                        i111 += o;
                        i112 += i21;
                        mVecLimbs = i22;
                        jArr3 = jArr2;
                        i106 = i21;
                    }
                    i107++;
                    i108 += o;
                    i109 += i106;
                    jArr3 = jArr3;
                    i110 = i113;
                }
                long[] jArr7 = jArr3;
                int i118 = mVecLimbs;
                Arrays.fill(bArr33, (byte) 0);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.doFinal(bArr29, 0, digestBytes);
                try {
                    this.random.nextBytes(bArr34);
                    int i119 = saltBytes;
                    System.arraycopy(bArr34, 0, bArr29, digestBytes, i119);
                    System.arraycopy(seedSk, 0, bArr29, i96, skSeedBytes);
                    int i120 = i100;
                    sHAKEDigest.update(bArr29, 0, i120);
                    sHAKEDigest.doFinal(bArr34, 0, i119);
                    System.arraycopy(bArr34, 0, bArr29, digestBytes, i119);
                    sHAKEDigest.update(bArr29, 0, i96);
                    byte[] bArr35 = bArr32;
                    try {
                        sHAKEDigest.doFinal(bArr35, 0, this.params.getMBytes());
                        try {
                            GF16.decode(bArr35, bArr19, m3);
                            long[] jArr8 = new long[i43 * i118];
                            bArr34 = bArr34;
                            try {
                                byte[] bArr36 = new byte[v];
                                int i121 = 0;
                                while (true) {
                                    if (i121 > 255) {
                                        i = i119;
                                        bArr13 = bArr29;
                                        i2 = v;
                                        bArr14 = bArr36;
                                        bArr32 = bArr35;
                                        bArr4 = bArr21;
                                        i3 = i59;
                                        bArr6 = bArr24;
                                        bArr7 = bArr25;
                                        i5 = i99;
                                        bArr15 = bArr28;
                                        bArr16 = bArr30;
                                        break;
                                    }
                                    try {
                                        bArr29[i120] = (byte) i121;
                                        int i122 = i118;
                                        int i123 = i103;
                                        int i124 = 0;
                                        sHAKEDigest.update(bArr29, 0, i123);
                                        i103 = i123;
                                        bArr32 = bArr35;
                                        bArr6 = bArr24;
                                        int i125 = i102;
                                        try {
                                            sHAKEDigest.doFinal(bArr6, 0, i125);
                                            i102 = i125;
                                            while (true) {
                                                i6 = i59;
                                                if (i124 >= i6) {
                                                    break;
                                                }
                                                i59 = i6;
                                                byte[] bArr37 = bArr29;
                                                int i126 = i120;
                                                byte[] bArr38 = bArr23;
                                                try {
                                                    GF16.decode(bArr6, i124 * vBytes, bArr38, i124 * v, v);
                                                    i124++;
                                                    bArr23 = bArr38;
                                                    bArr29 = bArr37;
                                                    i120 = i126;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    bArr5 = bArr38;
                                                    bArr11 = bArr19;
                                                    bArr2 = bArr37;
                                                    bArr4 = bArr21;
                                                    bArr7 = bArr25;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr10 = bArr28;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                            }
                                            i = i119;
                                            bArr13 = bArr29;
                                            int i127 = i120;
                                            long[] jArr9 = jArr8;
                                            int i128 = i121;
                                            long[] jArr10 = jArr7;
                                            byte[] bArr39 = bArr23;
                                            i5 = i99;
                                            bArr16 = bArr30;
                                            long[] jArr11 = jArr4;
                                            bArr14 = bArr36;
                                            SHAKEDigest sHAKEDigest2 = sHAKEDigest;
                                            int i129 = i66;
                                            bArr15 = bArr28;
                                            try {
                                                GF16Utils.mulAddMatXMMat(i122, bArr39, jArr10, p1Limbs, jArr11, i6, v, o);
                                                int i130 = v;
                                                try {
                                                    GF16Utils.mulAddMUpperTriangularMatXMatTrans(i122, jArr10, bArr39, jArr9, i130, i6);
                                                    jArr = jArr5;
                                                    GF16Utils.mulAddMatXMMat(i122, bArr39, jArr9, jArr, i6, i130);
                                                    i3 = i6;
                                                    i2 = i130;
                                                    bArr4 = bArr21;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    bArr23 = bArr39;
                                                    bArr4 = bArr21;
                                                    bArr7 = bArr25;
                                                    bArr11 = bArr19;
                                                    bArr10 = bArr15;
                                                    bArr5 = bArr23;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    bArr2 = bArr13;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                                try {
                                                    computeRHS(jArr, bArr19, bArr4);
                                                    bArr7 = bArr25;
                                                    try {
                                                        computeA(jArr11, bArr7);
                                                        bArr23 = bArr39;
                                                        int i131 = i33;
                                                        try {
                                                            GF16.decode(bArr6, i131, bArr15, 0, i129);
                                                            byte[] bArr40 = bArr26;
                                                            try {
                                                                if (sampleSolution(bArr7, bArr4, bArr15, bArr40)) {
                                                                    bArr26 = bArr40;
                                                                    break;
                                                                }
                                                                i33 = i131;
                                                                bArr26 = bArr40;
                                                                Arrays.fill(jArr11, 0L);
                                                                Arrays.fill(jArr, 0L);
                                                                bArr21 = bArr4;
                                                                bArr25 = bArr7;
                                                                jArr5 = jArr;
                                                                i59 = i3;
                                                                jArr4 = jArr11;
                                                                i66 = i129;
                                                                bArr28 = bArr15;
                                                                bArr24 = bArr6;
                                                                bArr36 = bArr14;
                                                                sHAKEDigest = sHAKEDigest2;
                                                                jArr7 = jArr10;
                                                                i118 = i122;
                                                                jArr8 = jArr9;
                                                                bArr35 = bArr32;
                                                                i120 = i127;
                                                                i119 = i;
                                                                i99 = i5;
                                                                bArr30 = bArr16;
                                                                v = i2;
                                                                i121 = i128 + 1;
                                                                bArr29 = bArr13;
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                                bArr26 = bArr40;
                                                                bArr11 = bArr19;
                                                                bArr10 = bArr15;
                                                                bArr5 = bArr23;
                                                                bArr8 = bArr26;
                                                                bArr9 = bArr27;
                                                                bArr12 = bArr32;
                                                                bArr3 = bArr34;
                                                                bArr2 = bArr13;
                                                                Arrays.fill(bArr12, (byte) 0);
                                                                Arrays.fill(bArr11, (byte) 0);
                                                                Arrays.fill(bArr4, (byte) 0);
                                                                Arrays.fill(bArr3, (byte) 0);
                                                                Arrays.fill(bArr6, (byte) 0);
                                                                Arrays.fill(bArr5, (byte) 0);
                                                                Arrays.fill(bArr7, (byte) 0);
                                                                Arrays.fill(bArr8, (byte) 0);
                                                                Arrays.fill(bArr10, (byte) 0);
                                                                Arrays.fill(bArr9, (byte) 0);
                                                                Arrays.fill(bArr2, (byte) 0);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        bArr23 = bArr39;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    bArr23 = bArr39;
                                                    bArr7 = bArr25;
                                                    bArr11 = bArr19;
                                                    bArr10 = bArr15;
                                                    bArr5 = bArr23;
                                                    bArr8 = bArr26;
                                                    bArr9 = bArr27;
                                                    bArr12 = bArr32;
                                                    bArr3 = bArr34;
                                                    bArr2 = bArr13;
                                                    Arrays.fill(bArr12, (byte) 0);
                                                    Arrays.fill(bArr11, (byte) 0);
                                                    Arrays.fill(bArr4, (byte) 0);
                                                    Arrays.fill(bArr3, (byte) 0);
                                                    Arrays.fill(bArr6, (byte) 0);
                                                    Arrays.fill(bArr5, (byte) 0);
                                                    Arrays.fill(bArr7, (byte) 0);
                                                    Arrays.fill(bArr8, (byte) 0);
                                                    Arrays.fill(bArr10, (byte) 0);
                                                    Arrays.fill(bArr9, (byte) 0);
                                                    Arrays.fill(bArr2, (byte) 0);
                                                    throw th;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                bArr23 = bArr39;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            bArr13 = bArr29;
                                            bArr4 = bArr21;
                                            bArr7 = bArr25;
                                            bArr15 = bArr28;
                                            bArr11 = bArr19;
                                            bArr10 = bArr15;
                                            bArr5 = bArr23;
                                            bArr8 = bArr26;
                                            bArr9 = bArr27;
                                            bArr12 = bArr32;
                                            bArr3 = bArr34;
                                            bArr2 = bArr13;
                                            Arrays.fill(bArr12, (byte) 0);
                                            Arrays.fill(bArr11, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr10, (byte) 0);
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                        bArr13 = bArr29;
                                        bArr32 = bArr35;
                                        bArr4 = bArr21;
                                        bArr6 = bArr24;
                                    }
                                }
                                byte[] bArr41 = bArr19;
                                int i132 = 0;
                                int i133 = 0;
                                int i134 = 0;
                                int i135 = 0;
                                while (i134 < i3) {
                                    int i136 = i133;
                                    bArr10 = bArr15;
                                    byte[] bArr42 = bArr31;
                                    byte[] bArr43 = bArr14;
                                    bArr11 = bArr41;
                                    int i137 = i132;
                                    int i138 = i2;
                                    int i139 = o;
                                    byte[] bArr44 = bArr26;
                                    bArr12 = bArr32;
                                    bArr3 = bArr34;
                                    try {
                                        GF16Utils.matMul(bArr42, bArr44, i135, bArr43, i139, i138);
                                        bArr17 = bArr10;
                                        int i140 = i134;
                                        int i141 = i3;
                                        int i142 = i135;
                                        bArr5 = bArr23;
                                        bArr8 = bArr26;
                                        bArr9 = bArr27;
                                        try {
                                            Bytes.xor(i138, bArr5, i137, bArr43, bArr9, i136);
                                            System.arraycopy(bArr8, i142, bArr9, i136 + i138, i139);
                                            int i143 = i142 + i139;
                                            bArr41 = bArr11;
                                            bArr34 = bArr3;
                                            bArr32 = bArr12;
                                            bArr26 = bArr8;
                                            i2 = i138;
                                            bArr23 = bArr5;
                                            bArr27 = bArr9;
                                            i132 = i137 + i138;
                                            i3 = i141;
                                            bArr15 = bArr17;
                                            o = i139;
                                            i134 = i140 + 1;
                                            bArr14 = bArr43;
                                            i135 = i143;
                                            i133 = i136 + n3;
                                            bArr31 = bArr42;
                                        } catch (Throwable th19) {
                                            th = th19;
                                            bArr10 = bArr17;
                                            bArr2 = bArr13;
                                            Arrays.fill(bArr12, (byte) 0);
                                            Arrays.fill(bArr11, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr10, (byte) 0);
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th20) {
                                        th = th20;
                                        bArr8 = bArr44;
                                        bArr5 = bArr23;
                                        bArr9 = bArr27;
                                        bArr2 = bArr13;
                                        Arrays.fill(bArr12, (byte) 0);
                                        Arrays.fill(bArr11, (byte) 0);
                                        Arrays.fill(bArr4, (byte) 0);
                                        Arrays.fill(bArr3, (byte) 0);
                                        Arrays.fill(bArr6, (byte) 0);
                                        Arrays.fill(bArr5, (byte) 0);
                                        Arrays.fill(bArr7, (byte) 0);
                                        Arrays.fill(bArr8, (byte) 0);
                                        Arrays.fill(bArr10, (byte) 0);
                                        Arrays.fill(bArr9, (byte) 0);
                                        Arrays.fill(bArr2, (byte) 0);
                                        throw th;
                                    }
                                }
                                bArr17 = bArr15;
                                bArr5 = bArr23;
                                bArr8 = bArr26;
                                bArr9 = bArr27;
                                bArr11 = bArr41;
                                bArr12 = bArr32;
                                bArr3 = bArr34;
                                byte[] bArr45 = bArr16;
                                GF16.encode(bArr9, bArr45, i5);
                                System.arraycopy(bArr3, 0, bArr45, sigBytes - i, i);
                                byte[] bArrConcatenate = Arrays.concatenate(bArr45, bArr);
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr17, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr13, (byte) 0);
                                return bArrConcatenate;
                            } catch (Throwable th21) {
                                th = th21;
                                bArr2 = bArr29;
                                bArr11 = bArr19;
                                bArr12 = bArr35;
                                bArr4 = bArr21;
                                bArr5 = bArr23;
                                bArr6 = bArr24;
                                bArr7 = bArr25;
                                bArr8 = bArr26;
                                bArr9 = bArr27;
                                bArr10 = bArr28;
                                bArr3 = bArr34;
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr10, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                throw th;
                            }
                        } catch (Throwable th22) {
                            th = th22;
                            bArr2 = bArr29;
                            bArr11 = bArr19;
                            bArr3 = bArr34;
                            bArr12 = bArr35;
                            bArr4 = bArr21;
                            bArr5 = bArr23;
                            bArr6 = bArr24;
                            bArr7 = bArr25;
                            bArr8 = bArr26;
                            bArr9 = bArr27;
                            bArr10 = bArr28;
                        }
                    } catch (Throwable th23) {
                        th = th23;
                        bArr2 = bArr29;
                        bArr3 = bArr34;
                        bArr12 = bArr35;
                        bArr4 = bArr21;
                        bArr5 = bArr23;
                        bArr6 = bArr24;
                        bArr7 = bArr25;
                        bArr8 = bArr26;
                        bArr9 = bArr27;
                        bArr10 = bArr28;
                        bArr11 = bArr19;
                    }
                } catch (Throwable th24) {
                    th = th24;
                    bArr2 = bArr29;
                    bArr3 = bArr34;
                    bArr4 = bArr21;
                    bArr5 = bArr23;
                    bArr6 = bArr24;
                    bArr7 = bArr25;
                    bArr8 = bArr26;
                    bArr9 = bArr27;
                    bArr10 = bArr28;
                    bArr11 = bArr19;
                    bArr12 = bArr32;
                    Arrays.fill(bArr12, (byte) 0);
                    Arrays.fill(bArr11, (byte) 0);
                    Arrays.fill(bArr4, (byte) 0);
                    Arrays.fill(bArr3, (byte) 0);
                    Arrays.fill(bArr6, (byte) 0);
                    Arrays.fill(bArr5, (byte) 0);
                    Arrays.fill(bArr7, (byte) 0);
                    Arrays.fill(bArr8, (byte) 0);
                    Arrays.fill(bArr10, (byte) 0);
                    Arrays.fill(bArr9, (byte) 0);
                    Arrays.fill(bArr2, (byte) 0);
                    throw th;
                }
            } catch (Throwable th25) {
                th = th25;
                bArr2 = bArr29;
                bArr4 = bArr21;
                bArr5 = bArr23;
                bArr6 = bArr24;
                bArr7 = bArr25;
                bArr8 = bArr26;
                bArr9 = bArr27;
                bArr10 = bArr28;
                bArr11 = bArr19;
            }
        } catch (Throwable th26) {
            th = th26;
            bArr2 = bArr29;
            bArr3 = bArr20;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (!z) {
            MayoPublicKeyParameters mayoPublicKeyParameters = (MayoPublicKeyParameters) cipherParameters;
            this.pubKey = mayoPublicKeyParameters;
            this.params = mayoPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
            return;
        }
        this.pubKey = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (MayoPrivateKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.privKey = (MayoPrivateKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.params = this.privKey.getParameters();
    }

    public boolean sampleSolution(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i;
        boolean z;
        int i2;
        int k = this.params.getK();
        int o = this.params.getO();
        int m3 = this.params.getM();
        int aCols = this.params.getACols();
        int i3 = k * o;
        byte b4 = 0;
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        byte[] bArr5 = new byte[m3];
        int i5 = i3 + 1;
        byte[] bArr6 = bArr;
        GF16Utils.matMul(bArr6, bArr3, 0, bArr5, i5, m3);
        int i6 = i3;
        int i21 = 0;
        while (i21 < m3) {
            bArr6[i6] = (byte) (bArr2[i21] ^ bArr5[i21]);
            i21++;
            i6 += i5;
        }
        ef(bArr6, m3, aCols);
        int i22 = m3 - 1;
        int i32 = i22 * aCols;
        int i33 = i32;
        int i43 = 0;
        boolean z3 = false;
        while (true) {
            i = aCols - 1;
            z = true;
            if (i43 >= i) {
                break;
            }
            if (bArr6[i33] == 0) {
                z = false;
            }
            z3 |= z;
            i43++;
            i33++;
        }
        if (!z3) {
            return false;
        }
        while (i22 >= 0) {
            int iMin = Math.min((32 / (m3 - i22)) + i22, i3);
            int i59 = i22;
            byte b5 = b4;
            while (i59 <= iMin) {
                byte b7 = (byte) ((-(bArr6[i32 + i59] & UnsignedBytes.MAX_VALUE)) >> 31);
                byte b13 = (byte) ((~b5) & b7 & bArr6[(i32 + aCols) - 1]);
                bArr4[i59] = (byte) (bArr4[i59] ^ b13);
                int i66 = i59;
                int i74 = i;
                int i92 = 0;
                while (i92 < i22) {
                    boolean z4 = z;
                    byte b15 = b7;
                    long j2 = 0;
                    int i96 = 0;
                    int i99 = 0;
                    while (true) {
                        if (i96 >= 8) {
                            break;
                        }
                        int i100 = i96;
                        j2 ^= ((long) (bArr[i66 + i99] & UnsignedBytes.MAX_VALUE)) << (i100 << 3);
                        i96 = i100 + 1;
                        i99 += aCols;
                    }
                    long jMulFx8 = GF16Utils.mulFx8(b13, j2);
                    int i101 = 0;
                    int i102 = 0;
                    for (i2 = 8; i101 < i2; i2 = 8) {
                        int i103 = i74 + i102;
                        bArr[i103] = (byte) (bArr[i103] ^ ((byte) ((jMulFx8 >> (i101 << 3)) & 15)));
                        i101++;
                        i102 += aCols;
                        i22 = i22;
                    }
                    i92 += 8;
                    int i104 = aCols << 3;
                    i66 += i104;
                    i74 += i104;
                    z = z4;
                    b7 = b15;
                }
                b5 = (byte) (b5 | b7);
                i59++;
                bArr6 = bArr;
            }
            i22--;
            i32 -= aCols;
            bArr6 = bArr;
            b4 = 0;
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int m3 = this.params.getM();
        int n3 = this.params.getN();
        int k = this.params.getK();
        int i = k * n3;
        int p1Limbs = this.params.getP1Limbs();
        int p2Limbs = this.params.getP2Limbs();
        int p3Limbs = this.params.getP3Limbs();
        int mBytes = this.params.getMBytes();
        int sigBytes = this.params.getSigBytes();
        int digestBytes = this.params.getDigestBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        byte[] bArr3 = new byte[mBytes];
        byte[] bArr4 = new byte[m3];
        byte[] bArr5 = new byte[m3 << 1];
        byte[] bArr6 = new byte[i];
        int i2 = p1Limbs + p2Limbs;
        long[] jArr = new long[i2 + p3Limbs];
        byte[] bArr7 = new byte[digestBytes + saltBytes];
        byte[] encoded = this.pubKey.getEncoded();
        Utils.expandP1P2(this.params, jArr, encoded);
        Utils.unpackMVecs(encoded, this.params.getPkSeedBytes(), jArr, i2, p3Limbs / mVecLimbs, m3);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr2, sigBytes - saltBytes, saltBytes);
        sHAKEDigest.doFinal(bArr3, 0, mBytes);
        GF16.decode(bArr3, bArr4, m3);
        GF16.decode(bArr2, bArr6, i);
        long[] jArr2 = new long[k * k * mVecLimbs];
        long[] jArr3 = new long[i * mVecLimbs];
        MayoParameters mayoParameters = this.params;
        mayoGenericMCalculatePS(mayoParameters, jArr, p1Limbs, i2, bArr6, mayoParameters.getV(), this.params.getO(), k, jArr3);
        mayoGenericMCalculateSPS(jArr3, bArr6, mVecLimbs, k, n3, jArr2);
        computeRHS(jArr2, new byte[m3], bArr5);
        return Arrays.constantTimeAreEqual(m3, bArr5, 0, bArr4, 0);
    }

    private static void vecMulAddU64(int i, long[] jArr, byte b4, long[] jArr2, int i2) {
        int iMulTable = mulTable(b4 & UnsignedBytes.MAX_VALUE);
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = jArr[i3];
            int i5 = i2 + i3;
            jArr2[i5] = ((((j2 >>> 3) & 1229782938247303441L) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j2 & 1229782938247303441L) * ((long) (iMulTable & 255))) ^ (((j2 >>> 1) & 1229782938247303441L) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j2 >>> 2) & 1229782938247303441L) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i5];
        }
    }
}

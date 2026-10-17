package org.bouncycastle.pqc.crypto.cmce;

import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;
    private GF gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i, int i2, int i3, int[] iArr, boolean z, int i5) {
        BENES benes13;
        this.usePivots = z;
        this.SYS_N = i2;
        this.SYS_T = i3;
        this.GFBITS = i;
        this.poly = iArr;
        this.defaultKeySize = i5;
        this.IRR_BYTES = i3 * 2;
        this.COND_BYTES = ((i * 2) - 1) * (1 << (i - 4));
        int i6 = i3 * i;
        this.PK_NROWS = i6;
        int i21 = i2 - i6;
        this.PK_NCOLS = i21;
        this.PK_ROW_BYTES = (i21 + 7) / 8;
        this.SYND_BYTES = (i6 + 7) / 8;
        this.GFMASK = (1 << i) - 1;
        if (i == 12) {
            this.gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i;
        int i2 = this.SYS_T;
        short[] sArr3 = new short[i2 + 1];
        short[] sArr4 = new short[i2 + 1];
        short s2 = 1;
        short[] sArr5 = new short[i2 + 1];
        int i3 = 0;
        for (int i5 = 0; i5 < this.SYS_T + 1; i5++) {
            sArr5[i5] = 0;
            sArr4[i5] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s3 = 1;
        short s4 = 0;
        short s6 = 0;
        while (s4 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i6 = 0; i6 <= min(s4, this.SYS_T); i6++) {
                iGf_mul_ext ^= this.gf.gf_mul_ext(sArr4[i6], sArr2[s4 - i6]);
            }
            short sGf_reduce = this.gf.gf_reduce(iGf_mul_ext);
            short s11 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s2)) - s2);
            short s27 = (short) (((short) (((short) (((short) (((short) (s4 - (s6 * 2))) >> 15)) & s2)) - s2)) & s11);
            for (int i21 = 0; i21 <= this.SYS_T; i21++) {
                sArr3[i21] = sArr4[i21];
            }
            short sGf_frac = this.gf.gf_frac(s3, sGf_reduce);
            int i22 = 0;
            while (true) {
                i = this.SYS_T;
                if (i22 > i) {
                    break;
                }
                sArr4[i22] = (short) ((this.gf.gf_mul(sGf_frac, sArr5[i22]) & s11) ^ sArr4[i22]);
                i22++;
            }
            int i32 = ~s27;
            int i33 = s4 + 1;
            s6 = (short) (((i33 - s6) & s27) | (s6 & i32));
            for (int i43 = i - 1; i43 >= 0; i43--) {
                sArr5[i43 + 1] = (short) ((sArr5[i43] & i32) | (sArr3[i43] & s27));
            }
            sArr5[0] = 0;
            s3 = (short) ((i32 & s3) | (sGf_reduce & s27));
            s4 = (short) i33;
            s2 = 1;
        }
        while (true) {
            int i59 = this.SYS_T;
            if (i3 > i59) {
                return;
            }
            sArr[i3] = sArr4[i59 - i3];
            i3++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j2, long j3, short[] sArr, int i, long j5, long j16, int[] iArr) {
        long j22;
        int i2;
        int i3;
        int i5;
        char c2;
        long j42;
        long j46;
        long j47;
        long j57 = j16;
        long j58 = 1;
        long j65 = 7;
        char c3 = 3;
        if (j5 == 1) {
            int i6 = (int) (j2 >> 3);
            bArr[i6] = (byte) ((get_q_short(iArr, i) << ((int) (j2 & 7))) ^ bArr[i6]);
            return;
        }
        if (sArr != null) {
            long j69 = 0;
            while (j69 < j57) {
                int i21 = (int) j69;
                long j76 = j58;
                iArr[i21] = sArr[(int) (j69 ^ j76)] | ((sArr[i21] ^ 1) << 16);
                j69 += j76;
                j58 = j76;
            }
            j22 = j58;
        } else {
            j22 = 1;
            long j85 = 0;
            while (j85 < j57) {
                long j100 = i;
                iArr[(int) j85] = ((get_q_short(iArr, (int) (j100 + j85)) ^ 1) << 16) | get_q_short(iArr, (int) (j100 + (j85 ^ 1)));
                j85++;
                j65 = j65;
            }
        }
        long j101 = j65;
        int i22 = (int) j57;
        sort32(iArr, 0, i22);
        long j102 = 0;
        while (true) {
            i2 = Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (j102 >= j57) {
                break;
            }
            int i32 = (int) j102;
            int i33 = 65535 & iArr[i32];
            if (j102 >= i33) {
                i32 = i33;
            }
            iArr[(int) (j57 + j102)] = i32 | (i33 << 16);
            j102 += j22;
        }
        for (long j103 = 0; j103 < j57; j103 += j22) {
            int i43 = (int) j103;
            iArr[i43] = (int) (((long) (iArr[i43] << 16)) | j103);
        }
        sort32(iArr, 0, i22);
        long j104 = 0;
        while (j104 < j57) {
            int i59 = (int) j104;
            iArr[i59] = (iArr[i59] << 16) + (iArr[(int) (j57 + j104)] >> 16);
            j104 += j22;
            c3 = c3;
        }
        char c5 = c3;
        sort32(iArr, 0, i22);
        if (j5 <= 10) {
            for (long j105 = 0; j105 < j57; j105 += j22) {
                int i66 = (int) (j57 + j105);
                iArr[i66] = ((iArr[(int) j105] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 10) | (iArr[i66] & 1023);
            }
            long j106 = j22;
            while (j106 < j5 - j22) {
                long j107 = 0;
                while (j107 < j57) {
                    iArr[(int) j107] = (int) (((long) ((iArr[(int) (j57 + j107)] & (-1024)) << 6)) | j107);
                    j107 += j22;
                    j106 = j106;
                }
                long j108 = j106;
                sort32(iArr, 0, i22);
                for (long j109 = 0; j109 < j57; j109 += j22) {
                    int i74 = (int) j109;
                    iArr[i74] = (iArr[i74] << 20) | iArr[(int) (j57 + j109)];
                }
                sort32(iArr, 0, i22);
                for (long j110 = 0; j110 < j57; j110 += j22) {
                    int i92 = iArr[(int) j110];
                    int i96 = 1048575 & i92;
                    int i99 = (int) (j57 + j110);
                    int i100 = (i92 & ConnectionsClient.MAX_BYTES_DATA_SIZE) | (iArr[i99] & 1023);
                    if (i96 >= i100) {
                        i96 = i100;
                    }
                    iArr[i99] = i96;
                }
                j106 = j108 + j22;
            }
            for (long j111 = 0; j111 < j57; j111 += j22) {
                int i101 = (int) (j57 + j111);
                iArr[i101] = iArr[i101] & 1023;
            }
            i3 = 65535;
            i5 = -65536;
            c2 = c5;
            j42 = j22;
        } else {
            int i102 = -65536;
            for (long j112 = 0; j112 < j57; j112 += j22) {
                int i103 = (int) (j57 + j112);
                iArr[i103] = (iArr[(int) j112] << 16) | (iArr[i103] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            long j113 = j22;
            while (j113 < j5 - j22) {
                long j114 = 0;
                while (j114 < j57) {
                    int i104 = i102;
                    iArr[(int) j114] = (int) (((long) (iArr[(int) (j57 + j114)] & i104)) | j114);
                    j114 += j22;
                    i2 = i2;
                    i102 = i104;
                }
                int i105 = i2;
                int i106 = i102;
                sort32(iArr, 0, i22);
                long j115 = 0;
                while (j115 < j57) {
                    int i107 = (int) j115;
                    long j116 = j22;
                    iArr[i107] = (iArr[i107] << 16) | (iArr[(int) (j57 + j115)] & i105);
                    j115 += j116;
                    c5 = c5;
                    j22 = j116;
                }
                char c6 = c5;
                long j117 = j22;
                if (j113 < j5 - 2) {
                    for (long j118 = 0; j118 < j57; j118 += j117) {
                        int i108 = (int) (j57 + j118);
                        iArr[i108] = (iArr[(int) j118] & i106) | (iArr[i108] >> 16);
                    }
                    sort32(iArr, i22, (int) (j57 * 2));
                    for (long j119 = 0; j119 < j57; j119 += j117) {
                        int i109 = (int) (j57 + j119);
                        iArr[i109] = (iArr[i109] << 16) | (iArr[(int) j119] & i105);
                    }
                }
                sort32(iArr, 0, i22);
                for (long j120 = 0; j120 < j57; j120 += j117) {
                    int i110 = (int) (j57 + j120);
                    int i111 = iArr[i110];
                    int i112 = (i111 & i106) | (iArr[(int) j120] & i105);
                    if (i112 < i111) {
                        iArr[i110] = i112;
                    }
                }
                j113 += j117;
                i2 = i105;
                c5 = c6;
                i102 = i106;
                j22 = j117;
            }
            i3 = i2;
            i5 = i102;
            c2 = c5;
            j42 = j22;
            for (long j121 = 0; j121 < j57; j121 += j42) {
                int i113 = (int) (j57 + j121);
                iArr[i113] = iArr[i113] & i3;
            }
        }
        long j122 = 0;
        if (sArr != null) {
            while (j122 < j57) {
                int i114 = (int) j122;
                iArr[i114] = (int) (((long) (sArr[i114] << 16)) + j122);
                j122 += j42;
            }
        } else {
            while (j122 < j57) {
                iArr[(int) j122] = (int) (((long) (get_q_short(iArr, (int) (((long) i) + j122)) << 16)) + j122);
                j122 += j42;
            }
        }
        sort32(iArr, 0, i22);
        long j123 = j2;
        int i115 = i3;
        long j124 = 0;
        while (true) {
            j46 = j57 / 2;
            if (j124 >= j46) {
                break;
            }
            long j125 = j124 * 2;
            long j126 = j57 + j125;
            int i116 = (int) j126;
            int i117 = i115;
            int i118 = iArr[i116] & 1;
            char c7 = c2;
            int i119 = (int) (((long) i118) + j125);
            long j127 = j123;
            int i120 = (int) (j127 >> c7);
            bArr[i120] = (byte) ((i118 << ((int) (j127 & j101))) ^ bArr[i120]);
            j123 = j127 + j3;
            iArr[i116] = (iArr[(int) j125] << 16) | i119;
            iArr[(int) (j126 + j42)] = (iArr[(int) (j125 + j42)] << 16) | (i119 ^ 1);
            j124 += j42;
            i115 = i117;
            j57 = j16;
            c2 = c7;
        }
        int i121 = i115;
        char c16 = c2;
        long j128 = j16 * 2;
        sort32(iArr, i22, (int) j128);
        long j129 = j5 * 2;
        long j130 = ((j129 - 3) * j3 * j46) + j123;
        long j131 = 0;
        while (true) {
            j47 = j128;
            if (j131 >= j46) {
                break;
            }
            long j132 = j131 * 2;
            long j133 = j129;
            long j134 = j16 + j132;
            int i122 = iArr[(int) j134];
            int i123 = i122 & 1;
            int i124 = (int) (((long) i123) + j132);
            int i125 = i124 ^ 1;
            int i126 = (int) (j130 >> c16);
            bArr[i126] = (byte) (bArr[i126] ^ (i123 << ((int) (j130 & j101))));
            j130 += j3;
            iArr[(int) j132] = (i122 & i121) | (i124 << 16);
            iArr[(int) (j132 + j42)] = (i125 << 16) | (iArr[(int) (j134 + j42)] & i121);
            j131 += j42;
            j128 = j47;
            j129 = j133;
        }
        sort32(iArr, 0, i22);
        long j135 = j130 - (((j129 - 2) * j3) * j46);
        short[] sArr2 = new short[i22 * 4];
        for (long j136 = 0; j136 < j47; j136 += j42) {
            long j137 = j136 * 2;
            int i127 = iArr[(int) j136];
            sArr2[(int) j137] = (short) i127;
            sArr2[(int) (j137 + j42)] = (short) ((i127 & i5) >> 16);
        }
        for (long j138 = 0; j138 < j46; j138 += j42) {
            long j139 = j138 * 2;
            sArr2[(int) j138] = (short) ((iArr[(int) j139] & i121) >>> 1);
            sArr2[(int) (j138 + j46)] = (short) ((iArr[(int) (j139 + j42)] & i121) >>> 1);
        }
        for (long j140 = 0; j140 < j46; j140 += j42) {
            long j141 = j140 * 2;
            iArr[(int) ((j16 / 4) + j16 + j140)] = sArr2[(int) j141] | (sArr2[(int) (j141 + j42)] << 16);
        }
        long j142 = j3 * 2;
        long j143 = (j16 / 4) + j16;
        long j144 = j5 - j42;
        cbrecursion(bArr, j135, j142, null, ((int) j143) * 2, j144, j46, iArr);
        cbrecursion(bArr, j135 + j3, j142, null, (int) ((j143 * 2) + j46), j144, j46, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j2, long j3) {
        long j5 = j3;
        int[] iArr = new int[(int) (j5 * 2)];
        int i = (int) j5;
        short[] sArr2 = new short[i];
        while (true) {
            short s2 = 0;
            for (int i2 = 0; i2 < (((((j2 * 2) - 1) * j5) / 2) + 7) / 8; i2++) {
                bArr[i2] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j2, j5, iArr);
            for (int i3 = 0; i3 < j3; i3++) {
                sArr2[i3] = (short) i3;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < j2; i6++) {
                layer(sArr2, bArr, i5, i6, i);
                i5 = (int) (((long) i5) + (j3 >> 4));
            }
            for (int i21 = (int) (j2 - 2); i21 >= 0; i21--) {
                layer(sArr2, bArr, i5, i21, i);
                i5 = (int) (((long) i5) + (j3 >> 4));
            }
            int i22 = 0;
            while (i22 < j3) {
                short s3 = (short) (s2 | (sArr[i22] ^ sArr2[i22]));
                i22++;
                s2 = s3;
            }
            if (s2 == 0) {
                return;
            } else {
                j5 = j3;
            }
        }
    }

    private static int ctz(long j2) {
        long j3 = ~j2;
        long j5 = 72340172838076673L;
        long j16 = 0;
        for (int i = 0; i < 8; i++) {
            j5 &= j3 >>> i;
            j16 += j5;
        }
        long j22 = 578721382704613384L & j16;
        long j42 = j22 | (j22 >>> 1);
        long j46 = j42 | (j42 >>> 2);
        long j47 = j16 >>> 8;
        long j57 = j16 + (j47 & j46);
        for (int i2 = 2; i2 < 8; i2++) {
            j46 &= j46 >>> 8;
            j47 >>>= 8;
            j57 += j47 & j46;
        }
        return ((int) j57) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        int i3 = this.SYS_T;
        short[] sArr = new short[i3 + 1];
        int i5 = this.SYS_N;
        short[] sArr2 = new short[i5];
        short[] sArr3 = new short[i3 * 2];
        short[] sArr4 = new short[i3 * 2];
        short[] sArr5 = new short[i3 + 1];
        short[] sArr6 = new short[i5];
        byte[] bArr4 = new byte[i5 / 8];
        int i6 = 0;
        while (true) {
            i = this.SYND_BYTES;
            if (i6 >= i) {
                break;
            }
            bArr4[i6] = bArr3[i6];
            i6++;
        }
        while (i < this.SYS_N / 8) {
            bArr4[i] = 0;
            i++;
        }
        int i21 = 0;
        while (true) {
            i2 = this.SYS_T;
            if (i21 >= i2) {
                break;
            }
            sArr[i21] = Utils.load_gf(bArr2, (i21 * 2) + 40, this.GFMASK);
            i21++;
        }
        sArr[i2] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i22 = 0; i22 < this.SYS_N / 8; i22++) {
            bArr[i22] = 0;
        }
        int i32 = 0;
        for (int i33 = 0; i33 < this.SYS_N; i33++) {
            short sGf_iszero = (short) (this.gf.gf_iszero(sArr6[i33]) & 1);
            int i43 = i33 / 8;
            bArr[i43] = (byte) (bArr[i43] | (sGf_iszero << (i33 % 8)));
            i32 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i59 = this.SYS_T ^ i32;
        for (int i66 = 0; i66 < this.SYS_T * 2; i66++) {
            i59 |= sArr3[i66] ^ sArr4[i66];
        }
        return (((i59 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s2) {
        int i = this.SYS_T;
        short sGf_mul = sArr[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            sGf_mul = (short) (this.gf.gf_mul(sGf_mul, s2) ^ sArr[i2]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i;
        int i2 = this.SYS_T;
        short[] sArr = new short[i2 * 2];
        short[] sArr2 = new short[i2];
        byte[] bArr2 = new byte[i2];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i3 = 0; i3 < this.SYS_T * 2; i3++) {
                    sArr[i3] = Utils.load_gf(bArr3, i3 * 2, this.GFMASK);
                }
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    i = this.SYS_T;
                    if (i5 >= i * 2 || i6 >= i) {
                        break;
                    }
                    short s2 = sArr[i5];
                    if (s2 < this.SYS_N) {
                        sArr2[i6] = s2;
                        i6++;
                    }
                    i5++;
                }
                if (i6 < i) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i21 = 0; i21 < this.SYS_T; i21++) {
                    sArr2[i21] = Utils.load_gf(bArr4, i21 * 2, this.GFMASK);
                }
            }
            boolean z = false;
            for (int i22 = 1; i22 < this.SYS_T && !z; i22++) {
                int i32 = 0;
                while (true) {
                    if (i32 >= i22) {
                        break;
                    }
                    if (sArr2[i22] == sArr2[i32]) {
                        z = true;
                        break;
                    }
                    i32++;
                }
            }
            if (!z) {
                break;
            }
        }
        for (int i33 = 0; i33 < this.SYS_T; i33++) {
            bArr2[i33] = (byte) (1 << (sArr2[i33] & 7));
        }
        for (short s3 = 0; s3 < this.SYS_N / 8; s3 = (short) (s3 + 1)) {
            bArr[s3] = 0;
            for (int i43 = 0; i43 < this.SYS_T; i43++) {
                bArr[s3] = (byte) ((((short) (same_mask32(s3, (short) (sArr2[i43] >> 3)) & 255)) & bArr2[i43]) | bArr[s3]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i;
        int i2 = this.SYS_T;
        int i3 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2 + 1, i2);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i = this.SYS_T;
            if (i3 >= i) {
                break;
            }
            this.gf.gf_sqr_poly(i, this.poly, sArr2[i3], sArr2[i3 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i3 + 1], sArr2[i3], sArr, iArr2);
            iArr = iArr2;
            i3 += 2;
        }
        if (i3 == i) {
            this.gf.gf_sqr_poly(i, this.poly, sArr2[i3], sArr2[i3 >>> 1], iArr);
        }
        int i5 = 0;
        while (true) {
            int i6 = this.SYS_T;
            if (i5 >= i6) {
                System.arraycopy(sArr2[i6], 0, sArr, 0, i6);
                return 0;
            }
            int i21 = i5 + 1;
            for (int i22 = i21; i22 < this.SYS_T; i22++) {
                short sGf_iszero = this.gf.gf_iszero(sArr2[i5][i5]);
                for (int i32 = i5; i32 < this.SYS_T + 1; i32++) {
                    short[] sArr3 = sArr2[i32];
                    sArr3[i5] = (short) (sArr3[i5] ^ ((short) (sArr3[i22] & sGf_iszero)));
                }
            }
            short s2 = sArr2[i5][i5];
            if (s2 == 0) {
                return -1;
            }
            short sGf_inv = this.gf.gf_inv(s2);
            for (int i33 = i5; i33 < this.SYS_T + 1; i33++) {
                short[] sArr4 = sArr2[i33];
                sArr4[i5] = this.gf.gf_mul(sArr4[i5], sGf_inv);
            }
            for (int i43 = 0; i43 < this.SYS_T; i43++) {
                if (i43 != i5) {
                    short s3 = sArr2[i5][i43];
                    for (int i59 = i5; i59 <= this.SYS_T; i59++) {
                        short[] sArr5 = sArr2[i59];
                        sArr5[i43] = (short) (sArr5[i43] ^ this.gf.gf_mul(sArr5[i5], s3));
                    }
                }
            }
            i5 = i21;
        }
    }

    public static short get_q_short(int[] iArr, int i) {
        int i2 = i / 2;
        return (short) (i % 2 == 0 ? iArr[i2] : (iArr[i2] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i, int i2, int i3) {
        int i5 = 1 << i2;
        int i6 = 0;
        for (int i21 = 0; i21 < i3; i21 += i5 * 2) {
            for (int i22 = 0; i22 < i5; i22++) {
                int i32 = i21 + i22;
                short s2 = sArr[i32];
                int i33 = i32 + i5;
                int i43 = (sArr[i33] ^ s2) & (-((bArr[(i6 >> 3) + i] >> (i6 & 7)) & 1));
                sArr[i32] = (short) (s2 ^ i43);
                sArr[i33] = (short) (sArr[i33] ^ i43);
                i6++;
            }
        }
    }

    private static int min(short s2, int i) {
        return s2 < i ? s2 : i;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i = 64;
        long[] jArr2 = new long[64];
        int i2 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i3 = this.PK_NROWS - 32;
        int i5 = i3 / 8;
        int i6 = i3 % 8;
        char c2 = 0;
        if (this.usePadding) {
            for (int i21 = 0; i21 < 32; i21++) {
                for (int i22 = 0; i22 < 9; i22++) {
                    bArr2[i22] = bArr[i3 + i21][i5 + i22];
                }
                int i32 = 0;
                while (i32 < 8) {
                    int i33 = i32 + 1;
                    bArr2[i32] = (byte) (((bArr2[i32] & UnsignedBytes.MAX_VALUE) >> i6) | (bArr2[i33] << (8 - i6)));
                    i32 = i33;
                }
                jArr2[i21] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i43 = 0; i43 < 32; i43++) {
                jArr2[i43] = Utils.load8(bArr[i3 + i43], i5);
            }
        }
        long j2 = 0;
        jArr[0] = 0;
        int i59 = 0;
        while (true) {
            long j3 = 1;
            if (i59 >= 32) {
                int i66 = 0;
                while (i66 < i2) {
                    int i74 = i66 + 1;
                    int i92 = i74;
                    while (i92 < i) {
                        int i96 = i3 + i66;
                        int i99 = i3 + i92;
                        long jSame_mask64 = ((long) (sArr[i96] ^ sArr[i99])) & same_mask64((short) i92, (short) r19[i66]);
                        sArr[i96] = (short) (((long) sArr[i96]) ^ jSame_mask64);
                        sArr[i99] = (short) (jSame_mask64 ^ ((long) sArr[i99]));
                        i92++;
                        i74 = i74;
                        jArr3 = jArr3;
                        i = 64;
                        i2 = 32;
                    }
                    i66 = i74;
                }
                long[] jArr4 = jArr3;
                for (int i100 = 0; i100 < this.PK_NROWS; i100++) {
                    if (this.usePadding) {
                        for (int i101 = 0; i101 < 9; i101++) {
                            bArr2[i101] = bArr[i100][i5 + i101];
                        }
                        int i102 = 0;
                        while (i102 < 8) {
                            int i103 = i102 + 1;
                            bArr2[i102] = (byte) (((bArr2[i102] & UnsignedBytes.MAX_VALUE) >> i6) | (bArr2[i103] << (8 - i6)));
                            i102 = i103;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i100], i5);
                    }
                    for (int i104 = 0; i104 < 32; i104++) {
                        long j5 = jArr4[i104];
                        long j16 = ((jLoad8 >> i104) ^ (jLoad8 >> ((int) j5))) & 1;
                        jLoad8 = (jLoad8 ^ (j16 << ((int) j5))) ^ (j16 << i104);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i100];
                        int i105 = i5 + 8;
                        int i106 = 8 - i6;
                        bArr3[i105] = (byte) ((((bArr3[i105] & UnsignedBytes.MAX_VALUE) >>> i6) << i6) | ((bArr2[7] & UnsignedBytes.MAX_VALUE) >>> i106));
                        bArr3[i5] = (byte) (((bArr2[0] & UnsignedBytes.MAX_VALUE) << i6) | (((bArr3[i5] & UnsignedBytes.MAX_VALUE) << i106) >>> i106));
                        for (int i107 = 7; i107 >= 1; i107--) {
                            bArr[i100][i5 + i107] = (byte) (((bArr2[i107] & UnsignedBytes.MAX_VALUE) << i6) | ((bArr2[i107 - 1] & UnsignedBytes.MAX_VALUE) >>> i106));
                        }
                    } else {
                        Utils.store8(bArr[i100], i5, jLoad8);
                    }
                }
                return 0;
            }
            long j22 = jArr2[i59];
            int i108 = i59 + 1;
            long j42 = j2;
            for (int i109 = i108; i109 < 32; i109++) {
                j22 |= jArr2[i109];
            }
            if (j22 == j42) {
                return -1;
            }
            int iCtz = ctz(j22);
            char c3 = c2;
            long j46 = iCtz;
            jArr3[i59] = j46;
            jArr[c3] = jArr[c3] | (1 << ((int) j46));
            for (int i110 = i108; i110 < 32; i110++) {
                long j47 = jArr2[i59];
                jArr2[i59] = j47 ^ (jArr2[i110] & (((j47 >> iCtz) & 1) - 1));
            }
            int i111 = i108;
            while (i111 < 32) {
                long j57 = jArr2[i111];
                long j58 = j3;
                jArr2[i111] = j57 ^ (jArr2[i59] & (-((j57 >> iCtz) & j58)));
                i111++;
                j3 = j58;
                c3 = 0;
            }
            c2 = c3;
            i59 = i108;
            j2 = j42;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i;
        int i2;
        int i3 = this.SYS_T;
        short[] sArr2 = new short[i3 + 1];
        byte b4 = 1;
        sArr2[i3] = 1;
        for (int i5 = 0; i5 < this.SYS_T; i5++) {
            sArr2[i5] = Utils.load_gf(bArr2, (i5 * 2) + 40, this.GFMASK);
        }
        int i6 = 1 << this.GFBITS;
        long[] jArr2 = new long[i6];
        for (int i21 = 0; i21 < (1 << this.GFBITS); i21++) {
            long j2 = iArr[i21];
            jArr2[i21] = j2;
            long j3 = j2 << 31;
            jArr2[i21] = j3;
            long j5 = j3 | ((long) i21);
            jArr2[i21] = j5;
            jArr2[i21] = j5 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i6);
        for (int i22 = 1; i22 < (1 << this.GFBITS); i22++) {
            if ((jArr2[i22 - 1] >> 31) == (jArr2[i22] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i32 = 0; i32 < (1 << this.GFBITS); i32++) {
            sArr[i32] = (short) (jArr2[i32] & ((long) this.GFMASK));
        }
        int i33 = 0;
        while (true) {
            i = this.SYS_N;
            if (i33 >= i) {
                break;
            }
            sArr3[i33] = Utils.bitrev(sArr[i33], this.GFBITS);
            i33++;
        }
        short[] sArr4 = new short[i];
        root(sArr4, sArr2, sArr3);
        int i43 = 0;
        while (true) {
            i2 = this.SYS_N;
            if (i43 >= i2) {
                break;
            }
            sArr4[i43] = this.gf.gf_inv(sArr4[i43]);
            i43++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i2 / 8);
        for (int i59 = 0; i59 < this.PK_NROWS; i59++) {
            for (int i66 = 0; i66 < this.SYS_N / 8; i66++) {
                bArr3[i59][i66] = 0;
            }
        }
        int i74 = 0;
        while (i74 < this.SYS_T) {
            for (int i92 = 0; i92 < this.SYS_N; i92 += 8) {
                int i96 = 0;
                while (true) {
                    int i99 = this.GFBITS;
                    if (i96 < i99) {
                        bArr3[(i99 * i74) + i96][i92 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i92 + 7] >>> i96) & 1)) << 1)) | ((sArr4[i92 + 6] >>> i96) & 1))) << 1)) | ((sArr4[i92 + 5] >>> i96) & 1))) << 1)) | ((sArr4[i92 + 4] >>> i96) & 1))) << 1)) | ((sArr4[i92 + 3] >>> i96) & 1))) << 1)) | ((sArr4[i92 + 2] >>> i96) & 1))) << 1)) | ((sArr4[i92 + 1] >>> i96) & 1))) << 1)) | ((sArr4[i92] >>> i96) & 1));
                        i96++;
                    }
                }
            }
            for (int i100 = 0; i100 < this.SYS_N; i100++) {
                sArr4[i100] = this.gf.gf_mul(sArr4[i100], sArr3[i100]);
            }
            i74++;
        }
        int i101 = 0;
        while (true) {
            int i102 = this.PK_NROWS;
            if (i101 >= i102) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i103 = ((this.SYS_N - i102) + 7) / 8;
                        int i104 = 0;
                        while (true) {
                            int i105 = this.PK_NROWS;
                            if (i104 >= i105) {
                                break;
                            }
                            System.arraycopy(bArr3[i104], i105 / 8, bArr, i103 * i104, i103);
                            i104++;
                        }
                    } else {
                        int i106 = i102 % 8;
                        if (i106 != 0) {
                            int i107 = 0;
                            int i108 = 0;
                            while (true) {
                                int i109 = this.PK_NROWS;
                                if (i107 >= i109) {
                                    break;
                                }
                                int i110 = (i109 - 1) / 8;
                                while (i110 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i107];
                                    int i111 = (bArr4[i110] & UnsignedBytes.MAX_VALUE) >>> i106;
                                    i110++;
                                    bArr[i108] = (byte) ((bArr4[i110] << (8 - i106)) | i111);
                                    i108++;
                                }
                                bArr[i108] = (byte) ((bArr3[i107][i110] & UnsignedBytes.MAX_VALUE) >>> i106);
                                i107++;
                                i108++;
                            }
                        } else {
                            System.arraycopy(bArr3[i74], (i102 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i74 = i101 >>> 3;
            int i112 = i101 & 7;
            if (this.usePivots && i101 == i102 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i113 = i101 + 1;
            for (int i114 = i113; i114 < this.PK_NROWS; i114++) {
                byte b5 = (byte) (-((byte) (((byte) (((byte) (bArr3[i101][i74] ^ bArr3[i114][i74])) >> i112)) & b4)));
                int i115 = 0;
                while (i115 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i101];
                    bArr5[i115] = (byte) (bArr5[i115] ^ (bArr3[i114][i115] & b5));
                    i115++;
                    b4 = b4;
                }
            }
            byte b7 = b4;
            if (((bArr3[i101][i74] >> i112) & 1) == 0) {
                return -1;
            }
            for (int i116 = 0; i116 < this.PK_NROWS; i116++) {
                if (i116 != i101) {
                    byte b13 = (byte) (-((byte) (((byte) (bArr3[i116][i74] >> i112)) & 1)));
                    for (int i117 = 0; i117 < this.SYS_N / 8; i117++) {
                        byte[] bArr6 = bArr3[i116];
                        bArr6[i117] = (byte) (bArr6[i117] ^ (bArr3[i101][i117] & b13));
                    }
                }
            }
            i101 = i113;
            b4 = b7;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SYS_N; i++) {
            sArr[i] = eval(sArr2, sArr3[i]);
        }
    }

    private static byte same_mask32(short s2, short s3) {
        return (byte) ((-(((s2 ^ s3) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s2, short s3) {
        return -((((long) (s2 ^ s3)) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        int i5 = 1;
        while (i5 < i3 - i5) {
            i5 += i5;
        }
        for (int i6 = i5; i6 > 0; i6 >>>= 1) {
            int i21 = 0;
            for (int i22 = 0; i22 < i3 - i6; i22++) {
                if ((i22 & i6) == 0) {
                    int i32 = i + i22;
                    int i33 = i32 + i6;
                    int i43 = iArr[i33];
                    int i59 = iArr[i32];
                    int i66 = i43 ^ i59;
                    int i74 = i43 - i59;
                    int i92 = ((((i43 ^ i74) & i66) ^ i74) >> 31) & i66;
                    iArr[i32] = i59 ^ i92;
                    iArr[i33] = iArr[i33] ^ i92;
                }
            }
            for (int i96 = i5; i96 > i6; i96 >>>= 1) {
                while (i21 < i3 - i96) {
                    if ((i21 & i6) == 0) {
                        int i99 = i + i21;
                        int i100 = i99 + i6;
                        int i101 = iArr[i100];
                        for (int i102 = i96; i102 > i6; i102 >>>= 1) {
                            int i103 = i99 + i102;
                            int i104 = iArr[i103];
                            int i105 = i104 ^ i101;
                            int i106 = i104 - i101;
                            int i107 = i105 & ((i106 ^ ((i106 ^ i104) & i105)) >> 31);
                            i101 ^= i107;
                            iArr[i103] = i104 ^ i107;
                        }
                        iArr[i100] = i101;
                    }
                    i21++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        int i5 = 1;
        while (i5 < i3 - i5) {
            i5 += i5;
        }
        for (int i6 = i5; i6 > 0; i6 >>>= 1) {
            int i21 = 0;
            for (int i22 = 0; i22 < i3 - i6; i22++) {
                if ((i22 & i6) == 0) {
                    int i32 = i + i22;
                    int i33 = i32 + i6;
                    long j2 = jArr[i33];
                    long j3 = jArr[i32];
                    long j5 = (j2 ^ j3) & (-((j2 - j3) >>> 63));
                    jArr[i32] = j3 ^ j5;
                    jArr[i33] = jArr[i33] ^ j5;
                }
            }
            for (int i43 = i5; i43 > i6; i43 >>>= 1) {
                while (i21 < i3 - i43) {
                    if ((i21 & i6) == 0) {
                        int i59 = i + i21;
                        int i66 = i59 + i6;
                        long j16 = jArr[i66];
                        for (int i74 = i43; i74 > i6; i74 >>>= 1) {
                            int i92 = i59 + i74;
                            long j22 = jArr[i92];
                            long j42 = (-((j22 - j16) >>> 63)) & (j16 ^ j22);
                            j16 ^= j42;
                            jArr[i92] = j22 ^ j42;
                        }
                        jArr[i66] = j16;
                    }
                    i21++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s2 = (short) (bArr[0] & 1);
        short s3 = sArr3[0];
        short sEval = eval(sArr2, s3);
        GF gf = this.gf;
        short sGf_inv = (short) ((-s2) & gf.gf_inv(gf.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i = 1; i < this.SYS_T * 2; i++) {
            sGf_inv = this.gf.gf_mul(sGf_inv, s3);
            sArr[i] = sGf_inv;
        }
        for (int i2 = 1; i2 < this.SYS_N; i2++) {
            short s4 = (short) ((bArr[i2 / 8] >> (i2 % 8)) & 1);
            short s6 = sArr3[i2];
            short sEval2 = eval(sArr2, s6);
            GF gf6 = this.gf;
            short sGf_mul = this.gf.gf_mul(gf6.gf_inv(gf6.gf_sq(sEval2)), s4);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i3 = 1; i3 < this.SYS_T * 2; i3++) {
                sGf_mul = this.gf.gf_mul(sGf_mul, s6);
                sArr[i3] = (short) (sArr[i3] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i = this.PK_NROWS % 8;
        for (int i2 = 0; i2 < this.SYND_BYTES; i2++) {
            bArr[i2] = 0;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.PK_NROWS; i5++) {
            for (int i6 = 0; i6 < this.SYS_N / 8; i6++) {
                sArr[i6] = 0;
            }
            int i21 = 0;
            while (true) {
                int i22 = this.PK_ROW_BYTES;
                if (i21 >= i22) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i22) + i21] = bArr2[i3 + i21];
                i21++;
            }
            if (this.usePadding) {
                for (int i32 = (this.SYS_N / 8) - 1; i32 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i32--) {
                    sArr[i32] = (short) ((((sArr[i32] & 255) << i) | ((sArr[i32 - 1] & 255) >>> (8 - i))) & 255);
                }
            }
            int i33 = i5 / 8;
            int i43 = i5 % 8;
            sArr[i33] = (short) (sArr[i33] | (1 << i43));
            byte b4 = 0;
            for (int i59 = 0; i59 < this.SYS_N / 8; i59++) {
                b4 = (byte) (b4 ^ (sArr[i59] & bArr3[i59]));
            }
            byte b5 = (byte) ((b4 >>> 4) ^ b4);
            byte b7 = (byte) (b5 ^ (b5 >>> 2));
            bArr[i33] = (byte) ((((byte) (1 & ((byte) (b7 ^ (b7 >>> 1))))) << i43) | bArr[i33]);
            i3 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & UnsignedBytes.MAX_VALUE) >>> (this.PK_NROWS % 8))) - 1)) & UnsignedBytes.MAX_VALUE) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b4 = 0;
        for (int i = 0; i < this.PK_NROWS; i++) {
            int i2 = this.PK_ROW_BYTES;
            b4 = (byte) (b4 | bArr[((i * i2) + i2) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b4 & UnsignedBytes.MAX_VALUE) >>> (this.PK_NCOLS % 8))) - 1)) & UnsignedBytes.MAX_VALUE) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i;
        short[] sArr;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i2 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i3 = i2 + 32;
        byte[] bArr3 = new byte[i3];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(SignedBytes.MAX_POWER_OF_TWO);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i3);
        if (bArr.length <= 40) {
            short[] sArr2 = new short[this.SYS_T];
            int i5 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i5];
            int i6 = i2 - i5;
            for (int i21 = 0; i21 < this.SYS_T; i21++) {
                sArr2[i21] = Utils.load_gf(bArr3, (i21 * 2) + i6, this.GFMASK);
            }
            generate_irr_poly(sArr2);
            for (int i22 = 0; i22 < this.SYS_T; i22++) {
                Utils.store_gf(bArr4, i22 * 2, sArr2[i22]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i32 = this.IRR_BYTES;
        if (length <= i32 + 40) {
            int i33 = this.GFBITS;
            int[] iArr = new int[1 << i33];
            short[] sArr3 = new short[1 << i33];
            int i43 = (i2 - i32) - ((1 << i33) * 4);
            int i59 = 0;
            while (true) {
                i = this.GFBITS;
                if (i59 >= (1 << i)) {
                    break;
                }
                iArr[i59] = Utils.load4(bArr3, (i59 * 4) + i43);
                i59++;
            }
            if (this.usePivots) {
                sArr = sArr3;
                pk_gen(null, bArr2, iArr, sArr, new long[]{0});
            } else {
                sArr = sArr3;
                int i66 = 1 << i;
                long[] jArr = new long[i66];
                for (int i74 = 0; i74 < (1 << this.GFBITS); i74++) {
                    long j2 = iArr[i74];
                    jArr[i74] = j2;
                    long j3 = j2 << 31;
                    jArr[i74] = j3;
                    long j5 = j3 | ((long) i74);
                    jArr[i74] = j5;
                    jArr[i74] = j5 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i66);
                for (int i92 = 0; i92 < (1 << this.GFBITS); i92++) {
                    sArr[i92] = (short) (jArr[i92] & ((long) this.GFMASK));
                }
            }
            int i96 = this.COND_BYTES;
            byte[] bArr5 = new byte[i96];
            controlbitsfrompermutation(bArr5, sArr, this.GFBITS, 1 << r3);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i96);
        }
        int privateKeySize = getPrivateKeySize();
        int i99 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i99 / 8), i99 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i = this.GFBITS;
        short[] sArr = new short[1 << i];
        long[] jArr = {0};
        int[] iArr = new int[1 << i];
        int i2 = ((1 << i) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i2];
        int i3 = ((i2 - 32) - this.IRR_BYTES) - ((1 << i) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(SignedBytes.MAX_POWER_OF_TWO);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i2);
        for (int i5 = 0; i5 < (1 << this.GFBITS); i5++) {
            iArr[i5] = Utils.load4(bArr3, (i5 * 4) + i3);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i - 1) / 8)) * i;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.SYS_N;
        byte[] bArr4 = new byte[i / 8];
        int i2 = (i / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i2];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i3 = 0;
        while (i3 < this.SYS_N / 8) {
            int i5 = i3 + 1;
            bArr5[i5] = (byte) ((bArr4[i3] & sDecrypt) | ((~sDecrypt) & bArr3[i3 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i3 = i5;
        }
        for (int i6 = 0; i6 < this.SYND_BYTES; i6++) {
            bArr5[(this.SYS_N / 8) + 1 + i6] = bArr2[i6];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i2);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b4 = (byte) iCheck_c_padding;
        for (int i21 = 0; i21 < bArr.length; i21++) {
            bArr[i21] = (byte) (bArr[i21] | b4);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i = this.SYS_N / 8;
        byte[] bArr4 = new byte[i];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b4 = (byte) (((byte) iCheck_pk_padding) ^ UnsignedBytes.MAX_VALUE);
        for (int i2 = 0; i2 < this.SYND_BYTES; i2++) {
            bArr[i2] = (byte) (bArr[i2] & b4);
        }
        for (int i3 = 0; i3 < 32; i3++) {
            bArr2[i3] = (byte) (bArr2[i3] & b4);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i;
        int i2;
        int i3;
        short[] sArr;
        int i5;
        long j2;
        int i6 = 32;
        byte[] bArr3 = new byte[32];
        int i21 = 1;
        int i22 = 0;
        byte[] bArr4 = {SignedBytes.MAX_POWER_OF_TWO};
        secureRandom.nextBytes(bArr3);
        int i32 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i33 = i32 + 32;
        byte[] bArr5 = new byte[i33];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i22, i21);
            sHAKEDigest.update(bArr3, i22, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i22, i33);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i32, i32 + 32);
            System.arraycopy(bArr6, i22, bArr2, i22, i6);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i22, i6);
            int i43 = this.SYS_T;
            short[] sArr2 = new short[i43];
            int i59 = i32 - (i43 * 2);
            i = i21;
            for (int i66 = i22; i66 < this.SYS_T; i66++) {
                sArr2[i66] = Utils.load_gf(bArr5, (i66 * 2) + i59, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i74 = i22; i74 < this.SYS_T; i74++) {
                    Utils.store_gf(bArr2, (i74 * 2) + 40, sArr2[i74]);
                }
                int i92 = this.GFBITS;
                int[] iArr = new int[i << i92];
                i2 = i59 - ((i << i92) * 4);
                int i96 = 0;
                while (true) {
                    i3 = this.GFBITS;
                    if (i96 >= (i << i3)) {
                        break;
                    }
                    iArr[i96] = Utils.load4(bArr5, (i96 * 4) + i2);
                    i96++;
                }
                sArr = new short[i << i3];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i21 = i;
            i6 = 32;
            i22 = 0;
        }
        int i99 = this.COND_BYTES;
        byte[] bArr7 = new byte[i99];
        controlbitsfrompermutation(bArr7, sArr, this.GFBITS, i << r6);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i99);
        int i100 = this.SYS_N;
        System.arraycopy(bArr5, i2 - (i100 / 8), bArr2, bArr2.length - (i100 / 8), i100 / 8);
        if (this.usePivots) {
            i5 = 32;
            j2 = jArr[0];
        } else {
            j2 = BodyPartID.bodyIdMax;
            i5 = 32;
        }
        Utils.store8(bArr2, i5, j2);
    }
}

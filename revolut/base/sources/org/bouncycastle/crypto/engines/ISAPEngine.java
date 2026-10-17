package org.bouncycastle.crypto.engines;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes14.dex */
public class ISAPEngine extends AEADBaseEngine {
    private static final int ISAP_STATE_SZ = 40;
    private final ISAP_AEAD ISAPAEAD;
    private int ISAP_rH;
    private byte[] k;
    private byte[] npub;

    public abstract class ISAPAEAD_A implements ISAP_AEAD {
        protected long ISAP_IV1_64;
        protected long ISAP_IV2_64;
        protected long ISAP_IV3_64;

        /* JADX INFO: renamed from: k64, reason: collision with root package name */
        protected long[] f228370k64;
        AsconPermutationFriend.AsconPermutation mac;
        protected long[] npub64;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        AsconPermutationFriend.AsconPermutation f228371p;

        public ISAPAEAD_A() {
            ISAPEngine.this.ISAP_rH = 64;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
            this.f228371p = new AsconPermutationFriend.AsconPermutation();
            this.mac = new AsconPermutationFriend.AsconPermutation();
        }

        private int getLongSize(int i) {
            return (i + 7) >>> 3;
        }

        private void isap_rk(AsconPermutationFriend.AsconPermutation asconPermutation, long j2, byte[] bArr, int i) {
            long[] jArr = this.f228370k64;
            asconPermutation.set(jArr[0], jArr[1], j2, 0L, 0L);
            asconPermutation.p(12);
            for (int i2 = 0; i2 < (i << 3) - 1; i2++) {
                asconPermutation.f228341x0 ^= (((long) (((bArr[i2 >>> 3] >>> (7 - (i2 & 7))) & 1) << 7)) & 255) << 56;
                PX2(asconPermutation);
            }
            asconPermutation.f228341x0 ^= (((long) bArr[i - 1]) & 1) << 63;
            asconPermutation.p(12);
        }

        public abstract void PX1(AsconPermutationFriend.AsconPermutation asconPermutation);

        public abstract void PX2(AsconPermutationFriend.AsconPermutation asconPermutation);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i2 = iSAPEngine.m_aadPos;
                if (i >= i2) {
                    AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
                    asconPermutation.f228341x0 = (128 << ((7 - i2) << 3)) ^ asconPermutation.f228341x0;
                    asconPermutation.p(12);
                    this.mac.f228344x4 ^= 1;
                    return;
                }
                this.mac.f228341x0 ^= (((long) iSAPEngine.m_aad[i]) & 255) << ((7 - i) << 3);
                i++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
            asconPermutation.f228341x0 = Pack.bigEndianToLong(bArr, i) ^ asconPermutation.f228341x0;
            this.mac.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.npub64 = new long[getLongSize(ISAPEngine.this.npub.length)];
            this.f228370k64 = new long[getLongSize(ISAPEngine.this.k.length)];
            Pack.bigEndianToLong(ISAPEngine.this.npub, 0, this.npub64);
            Pack.bigEndianToLong(ISAPEngine.this.k, 0, this.f228370k64);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
            Pack.longToBigEndian(Pack.bigEndianToLong(bArr, i) ^ this.f228371p.f228341x0, bArr2, i2);
            PX1(this.f228371p);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i) {
            byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(this.f228371p.f228341x0);
            ISAPEngine iSAPEngine = ISAPEngine.this;
            int i2 = iSAPEngine.m_bufPos;
            Bytes.xor(i2, bArrLongToLittleEndian, iSAPEngine.BlockSize - i2, iSAPEngine.m_buf, 0, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = i;
            int i5 = 0;
            while (i5 < i2) {
                this.mac.f228341x0 ^= (((long) bArr[i3]) & 255) << ((7 - i5) << 3);
                i5++;
                i3++;
            }
            AsconPermutationFriend.AsconPermutation asconPermutation = this.mac;
            asconPermutation.f228341x0 ^= 128 << ((7 - i2) << 3);
            asconPermutation.p(12);
            Pack.longToBigEndian(this.mac.f228341x0, bArr2, 0);
            Pack.longToBigEndian(this.mac.f228342x1, bArr2, 8);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
            long j2 = asconPermutation2.f228343x2;
            long j3 = asconPermutation2.x3;
            long j5 = asconPermutation2.f228344x4;
            isap_rk(asconPermutation2, this.ISAP_IV2_64, bArr2, ISAPEngine.this.KEY_SIZE);
            AsconPermutationFriend.AsconPermutation asconPermutation3 = this.mac;
            asconPermutation3.f228343x2 = j2;
            asconPermutation3.x3 = j3;
            asconPermutation3.f228344x4 = j5;
            asconPermutation3.p(12);
            Pack.longToBigEndian(this.mac.f228341x0, bArr2, 0);
            Pack.longToBigEndian(this.mac.f228342x1, bArr2, 8);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            isap_rk(this.f228371p, this.ISAP_IV3_64, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228371p;
            long[] jArr = this.npub64;
            asconPermutation.x3 = jArr[0];
            asconPermutation.f228344x4 = jArr[1];
            PX1(asconPermutation);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.mac;
            long[] jArr2 = this.npub64;
            asconPermutation2.set(jArr2[0], jArr2[1], this.ISAP_IV1_64, 0L, 0L);
            this.mac.p(12);
        }
    }

    public class ISAPAEAD_A_128 extends ISAPAEAD_A {
        public ISAPAEAD_A_128() {
            super();
            this.ISAP_IV1_64 = 108156764298152972L;
            this.ISAP_IV2_64 = 180214358336080908L;
            this.ISAP_IV3_64 = 252271952374008844L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(12);
        }
    }

    public class ISAPAEAD_A_128A extends ISAPAEAD_A {
        public ISAPAEAD_A_128A() {
            super();
            this.ISAP_IV1_64 = 108156764297430540L;
            this.ISAP_IV2_64 = 180214358335358476L;
            this.ISAP_IV3_64 = 252271952373286412L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX1(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.p(6);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        public void PX2(AsconPermutationFriend.AsconPermutation asconPermutation) {
            asconPermutation.round(75L);
        }
    }

    public abstract class ISAPAEAD_K implements ISAP_AEAD {
        protected short[] ISAP_IV1_16;
        protected short[] ISAP_IV2_16;
        protected short[] ISAP_IV3_16;
        final int ISAP_STATE_SZ_CRYPTO_NPUBBYTES;
        protected short[] iv16;

        /* JADX INFO: renamed from: k16, reason: collision with root package name */
        protected short[] f228372k16;
        private final int[] KeccakF400RoundConstants = {1, 32898, 32906, 32768, 32907, 1, 32897, 32777, 138, 136, 32777, 10, 32907, 139, 32905, 32771, 32770, 128, 32778, 10};
        protected short[] SX = new short[25];
        protected short[] macSX = new short[25];
        protected short[] E = new short[25];
        protected short[] C = new short[5];
        protected short[] macE = new short[25];
        protected short[] macC = new short[5];

        public ISAPAEAD_K() {
            this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES = 40 - ISAPEngine.this.IV_SIZE;
            ISAPEngine.this.ISAP_rH = SyslogConstants.LOG_LOCAL2;
            ISAPEngine.this.BlockSize = (ISAPEngine.this.ISAP_rH + 7) >> 3;
        }

        private short ROL16(short s2, int i) {
            int i2 = s2 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            return (short) ((i2 >>> (16 - i)) ^ (i2 << i));
        }

        private void byteToShortXor(byte[] bArr, int i, short[] sArr, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                sArr[i3] = (short) (sArr[i3] ^ Pack.littleEndianToShort(bArr, (i3 << 1) + i));
            }
        }

        public abstract void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3);

        public abstract void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3);

        public abstract void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbFinalAADBlock() {
            int i = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                int i2 = iSAPEngine.m_aadPos;
                if (i >= i2) {
                    short[] sArr = this.macSX;
                    int i3 = i2 >> 1;
                    sArr[i3] = (short) ((128 << ((i2 & 1) << 3)) ^ sArr[i3]);
                    PermuteRoundsHX(sArr, this.macE, this.macC);
                    short[] sArr2 = this.macSX;
                    sArr2[24] = (short) (sArr2[24] ^ 256);
                    return;
                }
                short[] sArr3 = this.macSX;
                int i5 = i >> 1;
                sArr3[i5] = (short) (((iSAPEngine.m_aad[i] & UnsignedBytes.MAX_VALUE) << ((i & 1) << 3)) ^ sArr3[i5]);
                i++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void absorbMacBlock(byte[] bArr, int i) {
            byteToShortXor(bArr, i, this.macSX, ISAPEngine.this.BlockSize >> 1);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.f228372k16 = new short[ISAPEngine.this.k.length >> 1];
            byte[] bArr = ISAPEngine.this.k;
            short[] sArr = this.f228372k16;
            Pack.littleEndianToShort(bArr, 0, sArr, 0, sArr.length);
            this.iv16 = new short[ISAPEngine.this.npub.length >> 1];
            byte[] bArr2 = ISAPEngine.this.npub;
            short[] sArr2 = this.iv16;
            Pack.littleEndianToShort(bArr2, 0, sArr2, 0, sArr2.length);
        }

        public void isap_rk(short[] sArr, byte[] bArr, int i, short[] sArr2, int i2, short[] sArr3) {
            short[] sArr4 = new short[25];
            short[] sArr5 = new short[25];
            System.arraycopy(this.f228372k16, 0, sArr4, 0, 8);
            System.arraycopy(sArr, 0, sArr4, 8, 4);
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            for (int i3 = 0; i3 < (i << 3) - 1; i3++) {
                sArr4[0] = (short) (sArr4[0] ^ (((bArr[i3 >> 3] >>> (7 - (i3 & 7))) & 1) << 7));
                PermuteRoundsBX(sArr4, sArr5, sArr3);
            }
            sArr4[0] = (short) (sArr4[0] ^ ((bArr[i - 1] & 1) << 7));
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            System.arraycopy(sArr4, 0, sArr2, 0, i2 == this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES ? 17 : 8);
        }

        public void prepareThetaX(short[] sArr, short[] sArr2) {
            sArr2[0] = (short) ((((sArr[0] ^ sArr[5]) ^ sArr[10]) ^ sArr[15]) ^ sArr[20]);
            sArr2[1] = (short) ((((sArr[1] ^ sArr[6]) ^ sArr[11]) ^ sArr[16]) ^ sArr[21]);
            sArr2[2] = (short) ((((sArr[2] ^ sArr[7]) ^ sArr[12]) ^ sArr[17]) ^ sArr[22]);
            sArr2[3] = (short) ((((sArr[3] ^ sArr[8]) ^ sArr[13]) ^ sArr[18]) ^ sArr[23]);
            sArr2[4] = (short) (sArr[24] ^ (((sArr[4] ^ sArr[9]) ^ sArr[14]) ^ sArr[19]));
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
            int i3 = 0;
            while (i3 < ISAPEngine.this.BlockSize) {
                bArr2[i2] = (byte) (bArr[i] ^ (this.SX[i3 >> 1] >>> ((i3 & 1) << 3)));
                i3++;
                i2++;
                i++;
            }
            PermuteRoundsKX(this.SX, this.E, this.C);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processEncFinalBlock(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                ISAPEngine iSAPEngine = ISAPEngine.this;
                if (i2 >= iSAPEngine.m_bufPos) {
                    return;
                }
                bArr[i] = (byte) (iSAPEngine.m_buf[i2] ^ (this.SX[i2 >> 1] >>> ((i2 & 1) << 3)));
                i2++;
                i++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void processMACFinal(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = 0;
            while (i3 < i2) {
                short[] sArr = this.macSX;
                int i5 = i3 >> 1;
                sArr[i5] = (short) (((bArr[i] & 255) << ((i3 & 1) << 3)) ^ sArr[i5]);
                i3++;
                i++;
            }
            short[] sArr2 = this.macSX;
            int i6 = i2 >> 1;
            sArr2[i6] = (short) ((128 << ((i2 & 1) << 3)) ^ sArr2[i6]);
            PermuteRoundsHX(sArr2, this.macE, this.macC);
            Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
            short[] sArr3 = this.ISAP_IV2_16;
            int i21 = ISAPEngine.this.KEY_SIZE;
            isap_rk(sArr3, bArr2, i21, this.macSX, i21, this.macC);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
            Pack.shortToLittleEndian(this.macSX, 0, 8, bArr2, 0);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            Arrays.fill(this.SX, (short) 0);
            isap_rk(this.ISAP_IV3_16, ISAPEngine.this.npub, ISAPEngine.this.IV_SIZE, this.SX, this.ISAP_STATE_SZ_CRYPTO_NPUBBYTES, this.C);
            System.arraycopy(this.iv16, 0, this.SX, 17, 8);
            PermuteRoundsKX(this.SX, this.E, this.C);
            Arrays.fill(this.macSX, 12, 25, (short) 0);
            System.arraycopy(this.iv16, 0, this.macSX, 0, 8);
            System.arraycopy(this.ISAP_IV1_16, 0, this.macSX, 8, 4);
            PermuteRoundsHX(this.macSX, this.macE, this.macC);
        }

        public void rounds12X(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        public void rounds_12_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(12, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(13, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(14, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(15, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(16, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(17, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(18, sArr, sArr2, sArr3);
            thetaRhoPiChiIota(sArr2, sArr, sArr3);
        }

        public void rounds_4_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(4, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(5, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(6, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(7, sArr2, sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        public void rounds_8_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(8, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(9, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(10, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(11, sArr2, sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }

        public void thetaRhoPiChiIota(short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL162 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL163 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL164 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL165 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s2 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s2;
            short s3 = (short) (sArr[6] ^ sROL162);
            sArr[6] = s3;
            short sROL166 = ROL16(s3, 12);
            short s4 = (short) (sArr[12] ^ sROL163);
            sArr[12] = s4;
            short sROL167 = ROL16(s4, 11);
            short s6 = (short) (sArr[18] ^ sROL164);
            sArr[18] = s6;
            short sROL168 = ROL16(s6, 5);
            short s11 = (short) (sArr[24] ^ sROL165);
            sArr[24] = s11;
            short sROL169 = ROL16(s11, 14);
            sArr2[0] = (short) (this.KeccakF400RoundConstants[19] ^ (((~sROL166) & sROL167) ^ s2));
            sArr2[1] = (short) (((~sROL167) & sROL168) ^ sROL166);
            sArr2[2] = (short) (((~sROL168) & sROL169) ^ sROL167);
            sArr2[3] = (short) (((~sROL169) & s2) ^ sROL168);
            sArr2[4] = (short) (((~s2) & sROL166) ^ sROL169);
            short s27 = (short) (sArr[3] ^ sROL164);
            sArr[3] = s27;
            short sROL1610 = ROL16(s27, 12);
            short s37 = (short) (sArr[9] ^ sROL165);
            sArr[9] = s37;
            short sROL1611 = ROL16(s37, 4);
            short s51 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s51;
            short sROL1612 = ROL16(s51, 3);
            short s60 = (short) (sArr[16] ^ sROL162);
            sArr[16] = s60;
            short sROL1613 = ROL16(s60, 13);
            short s61 = (short) (sArr[22] ^ sROL163);
            sArr[22] = s61;
            short sROL1614 = ROL16(s61, 13);
            sArr2[5] = (short) (((~sROL1611) & sROL1612) ^ sROL1610);
            sArr2[6] = (short) (((~sROL1612) & sROL1613) ^ sROL1611);
            sArr2[7] = (short) (sROL1612 ^ ((~sROL1613) & sROL1614));
            sArr2[8] = (short) (((~sROL1614) & sROL1610) ^ sROL1613);
            sArr2[9] = (short) (((~sROL1610) & sROL1611) ^ sROL1614);
            short s67 = (short) (sArr[1] ^ sROL162);
            sArr[1] = s67;
            short sROL1615 = ROL16(s67, 1);
            short s73 = (short) (sArr[7] ^ sROL163);
            sArr[7] = s73;
            short sROL1616 = ROL16(s73, 6);
            short s100 = (short) (sArr[13] ^ sROL164);
            sArr[13] = s100;
            short sROL1617 = ROL16(s100, 9);
            short s101 = (short) (sArr[19] ^ sROL165);
            sArr[19] = s101;
            short sROL1618 = ROL16(s101, 8);
            short s102 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s102;
            short sROL1619 = ROL16(s102, 2);
            sArr2[10] = (short) (((~sROL1616) & sROL1617) ^ sROL1615);
            sArr2[11] = (short) (((~sROL1617) & sROL1618) ^ sROL1616);
            sArr2[12] = (short) (((~sROL1618) & sROL1619) ^ sROL1617);
            sArr2[13] = (short) (((~sROL1619) & sROL1615) ^ sROL1618);
            sArr2[14] = (short) (((~sROL1615) & sROL1616) ^ sROL1619);
            short s103 = (short) (sArr[4] ^ sROL165);
            sArr[4] = s103;
            short sROL1620 = ROL16(s103, 11);
            short s104 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s104;
            short sROL1621 = ROL16(s104, 4);
            short s105 = (short) (sArr[11] ^ sROL162);
            sArr[11] = s105;
            short sROL1622 = ROL16(s105, 10);
            short s106 = (short) (sArr[17] ^ sROL163);
            sArr[17] = s106;
            short sROL1623 = ROL16(s106, 15);
            short s107 = (short) (sArr[23] ^ sROL164);
            sArr[23] = s107;
            short sROL1624 = ROL16(s107, 8);
            sArr2[15] = (short) (((~sROL1621) & sROL1622) ^ sROL1620);
            sArr2[16] = (short) (((~sROL1622) & sROL1623) ^ sROL1621);
            sArr2[17] = (short) (sROL1622 ^ ((~sROL1623) & sROL1624));
            sArr2[18] = (short) (((~sROL1624) & sROL1620) ^ sROL1623);
            sArr2[19] = (short) ((sROL1621 & (~sROL1620)) ^ sROL1624);
            short s108 = (short) (sArr[2] ^ sROL163);
            sArr[2] = s108;
            short sROL1625 = ROL16(s108, 14);
            short s109 = (short) (sArr[8] ^ sROL164);
            sArr[8] = s109;
            short sROL1626 = ROL16(s109, 7);
            short s110 = (short) (sArr[14] ^ sROL165);
            sArr[14] = s110;
            short sROL1627 = ROL16(s110, 7);
            short s111 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s111;
            short sROL1628 = ROL16(s111, 9);
            short s112 = (short) (sROL162 ^ sArr[21]);
            sArr[21] = s112;
            short sROL1629 = ROL16(s112, 2);
            sArr2[20] = (short) (((~sROL1626) & sROL1627) ^ sROL1625);
            sArr2[21] = (short) (((~sROL1627) & sROL1628) ^ sROL1626);
            sArr2[22] = (short) (sROL1627 ^ ((~sROL1628) & sROL1629));
            sArr2[23] = (short) (sROL1628 ^ ((~sROL1629) & sROL1625));
            sArr2[24] = (short) (((~sROL1625) & sROL1626) ^ sROL1629);
        }

        public void thetaRhoPiChiIotaPrepareTheta(int i, short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL162 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL163 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL164 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL165 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s2 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s2;
            short s3 = (short) (sArr[6] ^ sROL162);
            sArr[6] = s3;
            short sROL166 = ROL16(s3, 12);
            short s4 = (short) (sArr[12] ^ sROL163);
            sArr[12] = s4;
            short sROL167 = ROL16(s4, 11);
            short s6 = (short) (sArr[18] ^ sROL164);
            sArr[18] = s6;
            short sROL168 = ROL16(s6, 5);
            short s11 = (short) (sArr[24] ^ sROL165);
            sArr[24] = s11;
            short sROL169 = ROL16(s11, 14);
            short s27 = (short) (this.KeccakF400RoundConstants[i] ^ (((~sROL166) & sROL167) ^ s2));
            sArr2[0] = s27;
            sArr3[0] = s27;
            short s37 = (short) (((~sROL167) & sROL168) ^ sROL166);
            sArr2[1] = s37;
            sArr3[1] = s37;
            short s51 = (short) (((~sROL168) & sROL169) ^ sROL167);
            sArr2[2] = s51;
            sArr3[2] = s51;
            short s60 = (short) (((~sROL169) & s2) ^ sROL168);
            sArr2[3] = s60;
            sArr3[3] = s60;
            short s61 = (short) (((~s2) & sROL166) ^ sROL169);
            sArr2[4] = s61;
            sArr3[4] = s61;
            short s67 = (short) (sArr[3] ^ sROL164);
            sArr[3] = s67;
            short sROL1610 = ROL16(s67, 12);
            short s73 = (short) (sArr[9] ^ sROL165);
            sArr[9] = s73;
            short sROL1611 = ROL16(s73, 4);
            short s100 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s100;
            short sROL1612 = ROL16(s100, 3);
            short s101 = (short) (sArr[16] ^ sROL162);
            sArr[16] = s101;
            short sROL1613 = ROL16(s101, 13);
            short s102 = (short) (sArr[22] ^ sROL163);
            sArr[22] = s102;
            short sROL1614 = ROL16(s102, 13);
            short s103 = (short) (((~sROL1611) & sROL1612) ^ sROL1610);
            sArr2[5] = s103;
            sArr3[0] = (short) (sArr3[0] ^ s103);
            short s104 = (short) (((~sROL1612) & sROL1613) ^ sROL1611);
            sArr2[6] = s104;
            sArr3[1] = (short) (sArr3[1] ^ s104);
            short s105 = (short) (((~sROL1613) & sROL1614) ^ sROL1612);
            sArr2[7] = s105;
            sArr3[2] = (short) (sArr3[2] ^ s105);
            short s106 = (short) (((~sROL1614) & sROL1610) ^ sROL1613);
            sArr2[8] = s106;
            sArr3[3] = (short) (sArr3[3] ^ s106);
            short s107 = (short) (((~sROL1610) & sROL1611) ^ sROL1614);
            sArr2[9] = s107;
            sArr3[4] = (short) (s107 ^ sArr3[4]);
            short s108 = (short) (sArr[1] ^ sROL162);
            sArr[1] = s108;
            short sROL1615 = ROL16(s108, 1);
            short s109 = (short) (sArr[7] ^ sROL163);
            sArr[7] = s109;
            short sROL1616 = ROL16(s109, 6);
            short s110 = (short) (sArr[13] ^ sROL164);
            sArr[13] = s110;
            short sROL1617 = ROL16(s110, 9);
            short s111 = (short) (sArr[19] ^ sROL165);
            sArr[19] = s111;
            short sROL1618 = ROL16(s111, 8);
            short s112 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s112;
            short sROL1619 = ROL16(s112, 2);
            short s113 = (short) (((~sROL1616) & sROL1617) ^ sROL1615);
            sArr2[10] = s113;
            sArr3[0] = (short) (sArr3[0] ^ s113);
            short s114 = (short) (((~sROL1617) & sROL1618) ^ sROL1616);
            sArr2[11] = s114;
            sArr3[1] = (short) (sArr3[1] ^ s114);
            short s115 = (short) (((~sROL1618) & sROL1619) ^ sROL1617);
            sArr2[12] = s115;
            sArr3[2] = (short) (s115 ^ sArr3[2]);
            short s116 = (short) (((~sROL1619) & sROL1615) ^ sROL1618);
            sArr2[13] = s116;
            sArr3[3] = (short) (s116 ^ sArr3[3]);
            short s117 = (short) (((~sROL1615) & sROL1616) ^ sROL1619);
            sArr2[14] = s117;
            sArr3[4] = (short) (s117 ^ sArr3[4]);
            short s118 = (short) (sArr[4] ^ sROL165);
            sArr[4] = s118;
            short sROL1620 = ROL16(s118, 11);
            short s119 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s119;
            short sROL1621 = ROL16(s119, 4);
            short s120 = (short) (sArr[11] ^ sROL162);
            sArr[11] = s120;
            short sROL1622 = ROL16(s120, 10);
            short s121 = (short) (sArr[17] ^ sROL163);
            sArr[17] = s121;
            short sROL1623 = ROL16(s121, 15);
            short s122 = (short) (sArr[23] ^ sROL164);
            sArr[23] = s122;
            short sROL1624 = ROL16(s122, 8);
            short s123 = (short) (((~sROL1621) & sROL1622) ^ sROL1620);
            sArr2[15] = s123;
            sArr3[0] = (short) (sArr3[0] ^ s123);
            short s124 = (short) (((~sROL1622) & sROL1623) ^ sROL1621);
            sArr2[16] = s124;
            sArr3[1] = (short) (sArr3[1] ^ s124);
            short s125 = (short) (sROL1622 ^ ((~sROL1623) & sROL1624));
            sArr2[17] = s125;
            sArr3[2] = (short) (s125 ^ sArr3[2]);
            short s126 = (short) (((~sROL1624) & sROL1620) ^ sROL1623);
            sArr2[18] = s126;
            sArr3[3] = (short) (s126 ^ sArr3[3]);
            short s127 = (short) (((~sROL1620) & sROL1621) ^ sROL1624);
            sArr2[19] = s127;
            sArr3[4] = (short) (s127 ^ sArr3[4]);
            short s128 = (short) (sArr[2] ^ sROL163);
            sArr[2] = s128;
            short sROL1625 = ROL16(s128, 14);
            short s129 = (short) (sArr[8] ^ sROL164);
            sArr[8] = s129;
            short sROL1626 = ROL16(s129, 7);
            short s130 = (short) (sArr[14] ^ sROL165);
            sArr[14] = s130;
            short sROL1627 = ROL16(s130, 7);
            short s131 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s131;
            short sROL1628 = ROL16(s131, 9);
            short s132 = (short) (sROL162 ^ sArr[21]);
            sArr[21] = s132;
            short sROL1629 = ROL16(s132, 2);
            short s133 = (short) (((~sROL1626) & sROL1627) ^ sROL1625);
            sArr2[20] = s133;
            sArr3[0] = (short) (s133 ^ sArr3[0]);
            short s134 = (short) (((~sROL1627) & sROL1628) ^ sROL1626);
            sArr2[21] = s134;
            sArr3[1] = (short) (s134 ^ sArr3[1]);
            short s135 = (short) (sROL1627 ^ ((~sROL1628) & sROL1629));
            sArr2[22] = s135;
            sArr3[2] = (short) (s135 ^ sArr3[2]);
            short s136 = (short) (sROL1628 ^ ((~sROL1629) & sROL1625));
            sArr2[23] = s136;
            sArr3[3] = (short) (s136 ^ sArr3[3]);
            short s137 = (short) (((~sROL1625) & sROL1626) ^ sROL1629);
            sArr2[24] = s137;
            sArr3[4] = (short) (s137 ^ sArr3[4]);
        }
    }

    public class ISAPAEAD_K_128 extends ISAPAEAD_K {
        public ISAPAEAD_K_128() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 3092, 3084};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 3092, 3084};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 3092, 3084};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(0, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(1, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(2, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(3, sArr2, sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }
    }

    public class ISAPAEAD_K_128A extends ISAPAEAD_K {
        public ISAPAEAD_K_128A() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, PassportService.EF_DG16, 2056};
            this.ISAP_IV2_16 = new short[]{-32766, 400, PassportService.EF_DG16, 2056};
            this.ISAP_IV3_16 = new short[]{-32765, 400, PassportService.EF_DG16, 2056};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(19, sArr, sArr2, sArr3);
            System.arraycopy(sArr2, 0, sArr, 0, sArr2.length);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        public void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }
    }

    public interface ISAP_AEAD {
        void absorbFinalAADBlock();

        void absorbMacBlock(byte[] bArr, int i);

        void init();

        void processEncBlock(byte[] bArr, int i, byte[] bArr2, int i2);

        void processEncFinalBlock(byte[] bArr, int i);

        void processMACFinal(byte[] bArr, int i, int i2, byte[] bArr2);

        void reset();
    }

    public enum IsapType {
        ISAP_A_128A,
        ISAP_K_128A,
        ISAP_A_128,
        ISAP_K_128
    }

    public ISAPEngine(IsapType isapType) {
        String str;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int iOrdinal = isapType.ordinal();
        if (iOrdinal == 0) {
            this.ISAPAEAD = new ISAPAEAD_A_128A();
            str = "ISAP-A-128A AEAD";
        } else if (iOrdinal == 1) {
            this.ISAPAEAD = new ISAPAEAD_K_128A();
            str = "ISAP-K-128A AEAD";
        } else if (iOrdinal == 2) {
            this.ISAPAEAD = new ISAPAEAD_A_128();
            str = "ISAP-A-128 AEAD";
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Incorrect ISAP parameter");
            }
            this.ISAPAEAD = new ISAPAEAD_K_128();
            str = "ISAP-K-128 AEAD";
        }
        this.algorithmName = str;
        this.AADBufferSize = this.BlockSize;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD3(state, z);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b4) {
        super.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        this.ISAPAEAD.absorbMacBlock(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.ISAPAEAD.processEncBlock(bArr, i, bArr2, i2);
        this.ISAPAEAD.absorbMacBlock(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.ISAPAEAD.processEncBlock(bArr, i, bArr2, i2);
        this.ISAPAEAD.absorbMacBlock(bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b4, byte[] bArr, int i) throws DataLengthException {
        return super.processByte(b4, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        this.ISAPAEAD.absorbFinalAADBlock();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        this.ISAPAEAD.processEncFinalBlock(bArr, i);
        if (this.forEncryption) {
            this.ISAPAEAD.processMACFinal(bArr, i, this.m_bufPos, this.mac);
        } else {
            this.ISAPAEAD.processMACFinal(this.m_buf, 0, this.m_bufPos, this.mac);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        this.k = bArr;
        this.ISAPAEAD.init();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        this.ISAPAEAD.reset();
    }
}

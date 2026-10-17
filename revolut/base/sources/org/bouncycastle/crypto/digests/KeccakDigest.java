package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class KeccakDigest implements ExtendedDigest {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected CryptoServicePurpose purpose;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    public KeccakDigest() {
        this(288, CryptoServicePurpose.ANY);
    }

    private void KeccakAbsorb(byte[] bArr, int i) {
        int i2 = this.rate >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.state;
            jArr[i3] = jArr[i3] ^ Pack.littleEndianToLong(bArr, i);
            i += 8;
        }
        KeccakPermutation();
    }

    private void KeccakExtract() {
        KeccakPermutation();
        Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
        this.bitsInQueue = this.rate;
    }

    private void KeccakPermutation() {
        long[] jArr = this.state;
        long j2 = jArr[0];
        long j3 = jArr[1];
        char c2 = 2;
        long j5 = jArr[2];
        char c3 = 3;
        long j16 = jArr[3];
        char c5 = 4;
        long j22 = jArr[4];
        long j42 = jArr[5];
        long j46 = jArr[6];
        long j47 = jArr[7];
        long j57 = jArr[8];
        long j58 = jArr[9];
        long j65 = jArr[10];
        long j69 = jArr[11];
        long j76 = jArr[12];
        long j85 = jArr[13];
        long j100 = jArr[14];
        long j101 = jArr[15];
        long j102 = jArr[16];
        long j103 = jArr[17];
        long j104 = jArr[18];
        long j105 = jArr[19];
        long j106 = jArr[20];
        long j107 = jArr[21];
        long j108 = jArr[22];
        long j109 = jArr[23];
        int i = 24;
        long j110 = jArr[24];
        int i2 = 0;
        while (i2 < i) {
            long j111 = (((j2 ^ j42) ^ j65) ^ j101) ^ j106;
            long j112 = (((j3 ^ j46) ^ j69) ^ j102) ^ j107;
            long j113 = (((j5 ^ j47) ^ j76) ^ j103) ^ j108;
            long j114 = (((j16 ^ j57) ^ j85) ^ j104) ^ j109;
            long j115 = (((j22 ^ j58) ^ j100) ^ j105) ^ j110;
            long j116 = ((j112 << 1) | (j112 >>> (-1))) ^ j115;
            long j117 = ((j113 << 1) | (j113 >>> (-1))) ^ j111;
            long j118 = ((j114 << 1) | (j114 >>> (-1))) ^ j112;
            long j119 = ((j115 << 1) | (j115 >>> (-1))) ^ j113;
            long j120 = ((j111 << 1) | (j111 >>> (-1))) ^ j114;
            long j121 = j2 ^ j116;
            long j122 = j42 ^ j116;
            long j123 = j65 ^ j116;
            long j124 = j101 ^ j116;
            long j125 = j106 ^ j116;
            long j126 = j3 ^ j117;
            long j127 = j46 ^ j117;
            long j128 = j69 ^ j117;
            long j129 = j102 ^ j117;
            long j130 = j107 ^ j117;
            long j131 = j5 ^ j118;
            long j132 = j47 ^ j118;
            long j133 = j76 ^ j118;
            long j134 = j103 ^ j118;
            long j135 = j108 ^ j118;
            long j136 = j16 ^ j119;
            long j137 = j57 ^ j119;
            long j138 = j85 ^ j119;
            long j139 = j104 ^ j119;
            long j140 = j109 ^ j119;
            long j141 = j22 ^ j120;
            long j142 = j58 ^ j120;
            long j143 = j100 ^ j120;
            long j144 = j105 ^ j120;
            long j145 = j110 ^ j120;
            long j146 = (j126 << 1) | (j126 >>> 63);
            char c6 = c2;
            long j147 = (j127 << 44) | (j127 >>> 20);
            char c7 = c3;
            long j148 = (j142 << 20) | (j142 >>> 44);
            char c16 = c5;
            long j149 = (j135 << 61) | (j135 >>> c7);
            int i3 = i;
            long j150 = (j143 << 39) | (j143 >>> 25);
            long j151 = (j125 << 18) | (j125 >>> 46);
            int i5 = i2;
            long j152 = (j131 << 62) | (j131 >>> c6);
            long j153 = (j133 << 43) | (j133 >>> 21);
            long j154 = (j138 << 25) | (j138 >>> 39);
            long j155 = (j144 << 8) | (j144 >>> 56);
            long j156 = (j140 << 56) | (j140 >>> 8);
            long j157 = (j124 << 41) | (j124 >>> 23);
            long j158 = (j141 << 27) | (j141 >>> 37);
            long j159 = (j145 << 14) | (j145 >>> 50);
            long j160 = (j130 << c6) | (j130 >>> 62);
            long j161 = (j137 << 55) | (j137 >>> 9);
            long j162 = (j129 << 45) | (j129 >>> 19);
            long j163 = (j122 << 36) | (j122 >>> 28);
            long j164 = (j136 << 28) | (j136 >>> 36);
            long j165 = (j139 << 21) | (j139 >>> 43);
            long j166 = (j134 << 15) | (j134 >>> 49);
            long j167 = (j128 << 10) | (j128 >>> 54);
            long j168 = (j132 << 6) | (j132 >>> 58);
            long j169 = (j123 << c7) | (j123 >>> 61);
            long j170 = j121 ^ ((~j147) & j153);
            j3 = ((~j153) & j165) ^ j147;
            long j171 = j153 ^ ((~j165) & j159);
            long j172 = j165 ^ ((~j159) & j121);
            long j173 = j159 ^ ((~j121) & j147);
            long j174 = j164 ^ ((~j148) & j169);
            long j175 = ((~j169) & j162) ^ j148;
            long j176 = ((~j162) & j149) ^ j169;
            long j177 = j162 ^ ((~j149) & j164);
            long j178 = ((~j164) & j148) ^ j149;
            j65 = j146 ^ ((~j168) & j154);
            long j179 = ((~j154) & j155) ^ j168;
            long j180 = ((~j155) & j151) ^ j154;
            long j181 = j155 ^ ((~j151) & j146);
            j100 = j151 ^ ((~j146) & j168);
            long j182 = j158 ^ ((~j163) & j167);
            long j183 = j163 ^ ((~j167) & j166);
            long j184 = ((~j166) & j156) ^ j167;
            long j185 = j166 ^ ((~j156) & j158);
            long j186 = ((~j158) & j163) ^ j156;
            long j187 = j152 ^ ((~j161) & j150);
            long j188 = ((~j150) & j157) ^ j161;
            long j189 = j150 ^ ((~j157) & j160);
            j109 = j157 ^ ((~j160) & j152);
            j102 = j183;
            j47 = j176;
            j107 = j188;
            j106 = j187;
            j108 = j189;
            j58 = j178;
            j57 = j177;
            j103 = j184;
            j85 = j181;
            j105 = j186;
            j42 = j174;
            j76 = j180;
            j46 = j175;
            c5 = c16;
            c2 = c6;
            j110 = j160 ^ ((~j152) & j161);
            jArr = jArr;
            i2 = i5 + 1;
            j2 = j170 ^ KeccakRoundConstants[i5];
            j16 = j172;
            j22 = j173;
            j69 = j179;
            i = i3;
            j104 = j185;
            j101 = j182;
            c3 = c7;
            j5 = j171;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j2;
        jArr2[1] = j3;
        jArr2[c2] = j5;
        jArr2[c3] = j16;
        jArr2[c5] = j22;
        jArr2[5] = j42;
        jArr2[6] = j46;
        jArr2[7] = j47;
        jArr2[8] = j57;
        jArr2[9] = j58;
        jArr2[10] = j65;
        jArr2[11] = j69;
        jArr2[12] = j76;
        jArr2[13] = j85;
        jArr2[14] = j100;
        jArr2[15] = j101;
        jArr2[16] = j102;
        jArr2[17] = j103;
        jArr2[18] = j104;
        jArr2[19] = j105;
        jArr2[20] = j106;
        jArr2[21] = j107;
        jArr2[22] = j108;
        jArr2[23] = j109;
        jArr2[i] = j110;
    }

    private static CryptoServicePurpose getCryptoServicePurpose(byte b4) {
        return CryptoServicePurpose.values()[b4];
    }

    private void init(int i) {
        if (i != 128 && i != 224 && i != 256 && i != 288 && i != 384 && i != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        initSponge(1600 - (i << 1));
    }

    private void initSponge(int i) {
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.rate = i;
        int i2 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i2 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i) / 2;
                return;
            }
            jArr[i2] = 0;
            i2++;
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        byte[] bArr = this.dataQueue;
        int i = this.bitsInQueue;
        int i2 = i >>> 3;
        bArr[i2] = (byte) (bArr[i2] | ((byte) (1 << (i & 7))));
        int i3 = i + 1;
        this.bitsInQueue = i3;
        if (i3 == this.rate) {
            KeccakAbsorb(bArr, 0);
        } else {
            int i5 = i3 >>> 6;
            int i6 = i3 & 63;
            int i21 = 0;
            for (int i22 = 0; i22 < i5; i22++) {
                long[] jArr = this.state;
                jArr[i22] = jArr[i22] ^ Pack.littleEndianToLong(this.dataQueue, i21);
                i21 += 8;
            }
            if (i6 > 0) {
                long[] jArr2 = this.state;
                jArr2[i5] = (((1 << i6) - 1) & Pack.littleEndianToLong(this.dataQueue, i21)) ^ jArr2[i5];
            }
        }
        long[] jArr3 = this.state;
        int i32 = (this.rate - 1) >>> 6;
        jArr3[i32] = jArr3[i32] ^ Long.MIN_VALUE;
        this.bitsInQueue = 0;
        this.squeezing = true;
    }

    public void absorb(byte b4) {
        int i = this.bitsInQueue;
        if (i % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.dataQueue;
        bArr[i >>> 3] = b4;
        int i2 = i + 8;
        this.bitsInQueue = i2;
        if (i2 == this.rate) {
            KeccakAbsorb(bArr, 0);
            this.bitsInQueue = 0;
        }
    }

    public void absorbBits(int i, int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i3 = this.bitsInQueue;
        if (i3 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.dataQueue[i3 >>> 3] = (byte) (i & ((1 << i2) - 1));
        this.bitsInQueue = i3 + i2;
    }

    public void copyIn(KeccakDigest keccakDigest) {
        if (this.purpose != keccakDigest.purpose) {
            throw new IllegalArgumentException("attempt to copy digest of different purpose");
        }
        long[] jArr = keccakDigest.state;
        System.arraycopy(jArr, 0, this.state, 0, jArr.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, getDigestSize() * 8, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    public byte[] getEncodedState(byte[] bArr) {
        bArr[0] = (byte) this.purpose.ordinal();
        int i = 1;
        int i2 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i2 == jArr.length) {
                byte[] bArr2 = this.dataQueue;
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                int length = i + this.dataQueue.length;
                Pack.intToBigEndian(this.rate, bArr, length);
                Pack.intToBigEndian(this.bitsInQueue, bArr, length + 4);
                Pack.intToBigEndian(this.fixedOutputLength, bArr, length + 8);
                bArr[length + 12] = this.squeezing;
                return bArr;
            }
            Pack.longToBigEndian(jArr[i2], bArr, i);
            i += 8;
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    public void squeeze(byte[] bArr, int i, long j2) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j3 = 0;
        if (j2 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j3 < j2) {
            if (this.bitsInQueue == 0) {
                KeccakExtract();
            }
            int iMin = (int) Math.min(this.bitsInQueue, j2 - j3);
            System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j3 / 8)) + i, iMin / 8);
            this.bitsInQueue -= iMin;
            j3 += (long) iMin;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        absorb(b4);
    }

    public KeccakDigest(int i) {
        this(i, CryptoServicePurpose.ANY);
    }

    public void absorb(byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        int i6 = this.bitsInQueue;
        if (i6 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i21 = i6 >>> 3;
        int i22 = this.rate >>> 3;
        int i32 = i22 - i21;
        if (i2 < i32) {
            System.arraycopy(bArr, i, this.dataQueue, i21, i2);
            i5 = this.bitsInQueue + (i2 << 3);
        } else {
            if (i21 > 0) {
                System.arraycopy(bArr, i, this.dataQueue, i21, i32);
                KeccakAbsorb(this.dataQueue, 0);
            } else {
                i32 = 0;
            }
            while (true) {
                i3 = i2 - i32;
                if (i3 < i22) {
                    break;
                }
                KeccakAbsorb(bArr, i + i32);
                i32 += i22;
            }
            System.arraycopy(bArr, i + i32, this.dataQueue, 0, i3);
            i5 = i3 << 3;
        }
        this.bitsInQueue = i5;
    }

    public int doFinal(byte[] bArr, int i, byte b4, int i2) {
        if (i2 > 0) {
            absorbBits(b4, i2);
        }
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        absorb(bArr, i, i2);
    }

    public KeccakDigest(int i, CryptoServicePurpose cryptoServicePurpose) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        this.purpose = cryptoServicePurpose;
        init(i);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(288, cryptoServicePurpose);
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[192];
        this.purpose = keccakDigest.purpose;
        long[] jArr2 = keccakDigest.state;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(byte[] bArr) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        this.purpose = getCryptoServicePurpose(bArr[0]);
        long[] jArr = this.state;
        Pack.bigEndianToLong(bArr, 1, jArr, 0, jArr.length);
        int length = (this.state.length * 8) + 1;
        byte[] bArr2 = this.dataQueue;
        System.arraycopy(bArr, length, bArr2, 0, bArr2.length);
        int length2 = length + this.dataQueue.length;
        this.rate = Pack.bigEndianToInt(bArr, length2);
        this.bitsInQueue = Pack.bigEndianToInt(bArr, length2 + 4);
        this.fixedOutputLength = Pack.bigEndianToInt(bArr, length2 + 8);
        this.squeezing = bArr[length2 + 12] != 0;
    }

    public KeccakDigest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this(bArr);
        if (!this.purpose.equals(cryptoServicePurpose)) {
            throw new IllegalStateException("digest encoded for a different purpose");
        }
    }
}

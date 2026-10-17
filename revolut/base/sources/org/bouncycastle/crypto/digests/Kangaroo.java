package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public final class Kangaroo {
    private static final int DIGESTLEN = 32;

    public static abstract class KangarooBase implements ExtendedDigest, Xof {
        private static final int BLKSIZE = 8192;
        private final byte[] singleByte = new byte[1];
        private boolean squeezing;
        private final int theChainLen;
        private int theCurrNode;
        private final KangarooSponge theLeaf;
        private byte[] thePersonal;
        private int theProcessed;
        private final KangarooSponge theTree;
        private static final byte[] SINGLE = {7};
        private static final byte[] INTERMEDIATE = {11};
        private static final byte[] FINAL = {-1, -1, 6};
        private static final byte[] FIRST = {3, 0, 0, 0, 0, 0, 0, 0};

        public KangarooBase(int i, int i2, int i3, CryptoServicePurpose cryptoServicePurpose) {
            this.theTree = new KangarooSponge(i, i2);
            this.theLeaf = new KangarooSponge(i, i2);
            this.theChainLen = i >> 2;
            buildPersonal(null);
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i, cryptoServicePurpose));
        }

        private void buildPersonal(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] bArrLengthEncode = lengthEncode(length);
            byte[] bArrCopyOf = bArr == null ? new byte[bArrLengthEncode.length + length] : Arrays.copyOf(bArr, bArrLengthEncode.length + length);
            this.thePersonal = bArrCopyOf;
            System.arraycopy(bArrLengthEncode, 0, bArrCopyOf, length, bArrLengthEncode.length);
        }

        private static byte[] lengthEncode(long j2) {
            byte b4;
            if (j2 != 0) {
                long j3 = j2;
                b4 = 1;
                while (true) {
                    j3 >>= 8;
                    if (j3 == 0) {
                        break;
                    }
                    b4 = (byte) (b4 + 1);
                }
            } else {
                b4 = 0;
            }
            byte[] bArr = new byte[b4 + 1];
            bArr[b4] = b4;
            for (int i = 0; i < b4; i++) {
                bArr[i] = (byte) (j2 >> (((b4 - i) - 1) * 8));
            }
            return bArr;
        }

        private void processData(byte[] bArr, int i, int i2) {
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            KangarooSponge kangarooSponge = this.theCurrNode == 0 ? this.theTree : this.theLeaf;
            int i3 = 8192 - this.theProcessed;
            if (i3 >= i2) {
                kangarooSponge.absorb(bArr, i, i2);
                this.theProcessed += i2;
                return;
            }
            if (i3 > 0) {
                kangarooSponge.absorb(bArr, i, i3);
                this.theProcessed += i3;
            }
            while (i3 < i2) {
                if (this.theProcessed == 8192) {
                    switchLeaf(true);
                }
                int iMin = Math.min(i2 - i3, 8192);
                this.theLeaf.absorb(bArr, i + i3, iMin);
                this.theProcessed += iMin;
                i3 += iMin;
            }
        }

        private void switchFinal() {
            switchLeaf(false);
            byte[] bArrLengthEncode = lengthEncode(this.theCurrNode);
            this.theTree.absorb(bArrLengthEncode, 0, bArrLengthEncode.length);
            KangarooSponge kangarooSponge = this.theTree;
            byte[] bArr = FINAL;
            kangarooSponge.absorb(bArr, 0, bArr.length);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchLeaf(boolean z) {
            if (this.theCurrNode == 0) {
                KangarooSponge kangarooSponge = this.theTree;
                byte[] bArr = FIRST;
                kangarooSponge.absorb(bArr, 0, bArr.length);
            } else {
                KangarooSponge kangarooSponge2 = this.theLeaf;
                byte[] bArr2 = INTERMEDIATE;
                kangarooSponge2.absorb(bArr2, 0, bArr2.length);
                int i = this.theChainLen;
                byte[] bArr3 = new byte[i];
                this.theLeaf.squeeze(bArr3, 0, i);
                this.theTree.absorb(bArr3, 0, this.theChainLen);
                this.theLeaf.initSponge();
            }
            if (z) {
                this.theCurrNode++;
            }
            this.theProcessed = 0;
        }

        private void switchSingle() {
            this.theTree.absorb(SINGLE, 0, 1);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchToSqueezing() {
            byte[] bArr = this.thePersonal;
            processData(bArr, 0, bArr.length);
            if (this.theCurrNode == 0) {
                switchSingle();
            } else {
                switchFinal();
            }
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            return doFinal(bArr, i, getDigestSize());
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i, int i2) {
            if (!this.squeezing) {
                switchToSqueezing();
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Invalid output length");
            }
            this.theTree.squeeze(bArr, i, i2);
            return i2;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.theTree.theRateBytes;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.theChainLen >> 1;
        }

        public void init(KangarooParameters kangarooParameters) {
            buildPersonal(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.theTree.initSponge();
            this.theLeaf.initSponge();
            this.theCurrNode = 0;
            this.theProcessed = 0;
            this.squeezing = false;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b4) {
            byte[] bArr = this.singleByte;
            bArr[0] = b4;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i, int i2) {
            if (this.squeezing) {
                throw new IllegalStateException("Already outputting");
            }
            int iDoOutput = doOutput(bArr, i, i2);
            reset();
            return iDoOutput;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            processData(bArr, i, i2);
        }
    }

    public static class KangarooParameters implements CipherParameters {
        private byte[] thePersonal;

        public static class Builder {
            private byte[] thePersonal;

            public KangarooParameters build() {
                KangarooParameters kangarooParameters = new KangarooParameters();
                byte[] bArr = this.thePersonal;
                if (bArr != null) {
                    kangarooParameters.thePersonal = bArr;
                }
                return kangarooParameters;
            }

            public Builder setPersonalisation(byte[] bArr) {
                this.thePersonal = Arrays.clone(bArr);
                return this;
            }
        }

        public byte[] getPersonalisation() {
            return Arrays.clone(this.thePersonal);
        }
    }

    public static class KangarooSponge {
        private static final long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private int bytesInQueue;
        private boolean squeezing;
        private final byte[] theQueue;
        private final int theRateBytes;
        private final int theRounds;
        private final long[] theState = new long[25];

        public KangarooSponge(int i, int i2) {
            int i3 = (1600 - (i << 1)) >> 3;
            this.theRateBytes = i3;
            this.theRounds = i2;
            this.theQueue = new byte[i3];
            initSponge();
        }

        private void KangarooAbsorb(byte[] bArr, int i) {
            int i2 = this.theRateBytes >> 3;
            for (int i3 = 0; i3 < i2; i3++) {
                long[] jArr = this.theState;
                jArr[i3] = jArr[i3] ^ Pack.littleEndianToLong(bArr, i);
                i += 8;
            }
            KangarooPermutation();
        }

        private void KangarooExtract() {
            Pack.longToLittleEndian(this.theState, 0, this.theRateBytes >> 3, this.theQueue, 0);
        }

        private void KangarooPermutation() {
            KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.theState;
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j5 = jArr[2];
            char c2 = 3;
            long j16 = jArr[3];
            char c3 = 4;
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
            long j110 = jArr[24];
            int length = KeccakRoundConstants.length - kangarooSponge.theRounds;
            int i = 0;
            while (i < kangarooSponge.theRounds) {
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
                char c5 = c2;
                long j147 = (j127 << 44) | (j127 >>> 20);
                char c6 = c3;
                long j148 = (j142 << 20) | (j142 >>> 44);
                long j149 = (j135 << 61) | (j135 >>> c5);
                long j150 = (j143 << 39) | (j143 >>> 25);
                long j151 = (j125 << 18) | (j125 >>> 46);
                int i2 = i;
                long j152 = (j131 << 62) | (j131 >>> 2);
                long j153 = (j133 << 43) | (j133 >>> 21);
                long j154 = (j138 << 25) | (j138 >>> 39);
                long j155 = (j144 << 8) | (j144 >>> 56);
                long j156 = (j140 << 56) | (j140 >>> 8);
                long j157 = (j124 << 41) | (j124 >>> 23);
                long j158 = (j141 << 27) | (j141 >>> 37);
                long j159 = (j145 << 14) | (j145 >>> 50);
                long j160 = (j130 << 2) | (j130 >>> 62);
                long j161 = (j137 << 55) | (j137 >>> 9);
                long j162 = (j129 << 45) | (j129 >>> 19);
                long j163 = (j122 << 36) | (j122 >>> 28);
                long j164 = (j136 << 28) | (j136 >>> 36);
                long j165 = (j139 << 21) | (j139 >>> 43);
                long j166 = (j134 << 15) | (j134 >>> 49);
                long j167 = (j128 << 10) | (j128 >>> 54);
                long j168 = (j132 << 6) | (j132 >>> 58);
                long j169 = (j123 << c5) | (j123 >>> 61);
                long j170 = ((~j147) & j153) ^ j121;
                long j171 = ((~j153) & j165) ^ j147;
                long j172 = j153 ^ ((~j165) & j159);
                long j173 = j165 ^ ((~j159) & j121);
                long j174 = ((~j121) & j147) ^ j159;
                long j175 = j164 ^ ((~j148) & j169);
                long j176 = ((~j169) & j162) ^ j148;
                int i3 = length;
                long j177 = ((~j162) & j149) ^ j169;
                j57 = j162 ^ ((~j149) & j164);
                long j178 = ((~j164) & j148) ^ j149;
                j65 = j146 ^ ((~j168) & j154);
                long j179 = ((~j154) & j155) ^ j168;
                long j180 = ((~j155) & j151) ^ j154;
                j85 = j155 ^ ((~j151) & j146);
                long j181 = ((~j146) & j168) ^ j151;
                long j182 = j158 ^ ((~j163) & j167);
                long j183 = ((~j167) & j166) ^ j163;
                long j184 = j167 ^ ((~j166) & j156);
                long j185 = j166 ^ ((~j156) & j158);
                long j186 = j156 ^ ((~j158) & j163);
                long j187 = j152 ^ ((~j161) & j150);
                long j188 = ((~j150) & j157) ^ j161;
                long j189 = j150 ^ ((~j157) & j160);
                j109 = j157 ^ ((~j160) & j152);
                j110 = j160 ^ ((~j152) & j161);
                j2 = j170 ^ KeccakRoundConstants[i3 + i2];
                j76 = j180;
                j47 = j177;
                jArr = jArr;
                c2 = c5;
                j46 = j176;
                length = i3;
                j105 = j186;
                j102 = j183;
                j69 = j179;
                j104 = j185;
                j100 = j181;
                j106 = j187;
                j107 = j188;
                j108 = j189;
                j58 = j178;
                j22 = j174;
                j103 = j184;
                j101 = j182;
                j16 = j173;
                c3 = c6;
                j42 = j175;
                j5 = j172;
                j3 = j171;
                i = i2 + 1;
                kangarooSponge = this;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j2;
            jArr2[1] = j3;
            jArr2[2] = j5;
            jArr2[c2] = j16;
            jArr2[c3] = j22;
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
            jArr2[24] = j110;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void absorb(byte[] bArr, int i, int i2) {
            int i3;
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            int i5 = 0;
            while (i5 < i2) {
                if (this.bytesInQueue == this.theRateBytes) {
                    KangarooAbsorb(this.theQueue, 0);
                    this.bytesInQueue = 0;
                }
                int i6 = this.bytesInQueue;
                if (i6 != 0 || i5 > i2 - this.theRateBytes) {
                    int iMin = Math.min(this.theRateBytes - i6, i2 - i5);
                    System.arraycopy(bArr, i + i5, this.theQueue, this.bytesInQueue, iMin);
                    this.bytesInQueue += iMin;
                    i5 += iMin;
                } else {
                    do {
                        KangarooAbsorb(bArr, i + i5);
                        i3 = this.theRateBytes;
                        i5 += i3;
                    } while (i5 <= i2 - i3);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initSponge() {
            Arrays.fill(this.theState, 0L);
            Arrays.fill(this.theQueue, (byte) 0);
            this.bytesInQueue = 0;
            this.squeezing = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void padAndSwitchToSqueezingPhase() {
            int i = this.bytesInQueue;
            while (true) {
                int i2 = this.theRateBytes;
                if (i >= i2) {
                    byte[] bArr = this.theQueue;
                    int i3 = i2 - 1;
                    bArr[i3] = (byte) (bArr[i3] ^ 128);
                    KangarooAbsorb(bArr, 0);
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                    this.squeezing = true;
                    return;
                }
                this.theQueue[i] = 0;
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void squeeze(byte[] bArr, int i, int i2) {
            if (!this.squeezing) {
                padAndSwitchToSqueezingPhase();
            }
            int i3 = 0;
            while (i3 < i2) {
                if (this.bytesInQueue == 0) {
                    KangarooPermutation();
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                }
                int iMin = Math.min(this.bytesInQueue, i2 - i3);
                System.arraycopy(this.theQueue, this.theRateBytes - this.bytesInQueue, bArr, i + i3, iMin);
                this.bytesInQueue -= iMin;
                i3 += iMin;
            }
        }
    }

    public static class KangarooTwelve extends KangarooBase {
        public KangarooTwelve() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
            return super.doFinal(bArr, i);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i, int i2) {
            return super.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "KangarooTwelve";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b4) {
            super.update(b4);
        }

        public KangarooTwelve(int i, CryptoServicePurpose cryptoServicePurpose) {
            super(128, 12, i, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i, int i2) {
            return super.doFinal(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
            super.update(bArr, i, i2);
        }

        public KangarooTwelve(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static class MarsupilamiFourteen extends KangarooBase {
        public MarsupilamiFourteen() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
            return super.doFinal(bArr, i);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i, int i2) {
            return super.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "MarsupilamiFourteen";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b4) {
            super.update(b4);
        }

        public MarsupilamiFourteen(int i, CryptoServicePurpose cryptoServicePurpose) {
            super(256, 14, i, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i, int i2) {
            return super.doFinal(bArr, i, i2);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
            super.update(bArr, i, i2);
        }

        public MarsupilamiFourteen(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }
}

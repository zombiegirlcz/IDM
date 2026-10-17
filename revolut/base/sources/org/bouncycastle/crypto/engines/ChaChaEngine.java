package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i, int[] iArr, int[] iArr2) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i3 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        char c2 = 3;
        int i21 = iArr[3];
        char c3 = 4;
        int i22 = iArr[4];
        char c5 = 5;
        int i32 = iArr[5];
        char c6 = 6;
        int i33 = iArr[6];
        int i43 = 7;
        int i59 = iArr[7];
        int i66 = 8;
        int i74 = iArr[8];
        int i92 = iArr[9];
        int i96 = iArr[10];
        int i99 = iArr[11];
        int i100 = 12;
        int i101 = iArr[12];
        int i102 = iArr[13];
        int i103 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i103;
        int iRotateLeft3 = i102;
        int iRotateLeft4 = i101;
        int i104 = i99;
        int i105 = i96;
        int i106 = i92;
        int i107 = i74;
        int iRotateLeft5 = i59;
        int iRotateLeft6 = i33;
        int iRotateLeft7 = i32;
        int iRotateLeft8 = i22;
        int i108 = i21;
        int i109 = i6;
        int i110 = i5;
        int i111 = i3;
        int i112 = i;
        while (i112 > 0) {
            int i113 = i111 + iRotateLeft8;
            char c7 = c2;
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft4 ^ i113, i2);
            int i114 = i107 + iRotateLeft9;
            int iRotateLeft10 = Integers.rotateLeft(iRotateLeft8 ^ i114, i100);
            int i115 = i113 + iRotateLeft10;
            int iRotateLeft11 = Integers.rotateLeft(iRotateLeft9 ^ i115, i66);
            int i116 = i114 + iRotateLeft11;
            int iRotateLeft12 = Integers.rotateLeft(iRotateLeft10 ^ i116, i43);
            int i117 = i110 + iRotateLeft7;
            char c16 = c3;
            int iRotateLeft13 = Integers.rotateLeft(iRotateLeft3 ^ i117, i2);
            int i118 = i106 + iRotateLeft13;
            char c26 = c5;
            int iRotateLeft14 = Integers.rotateLeft(iRotateLeft7 ^ i118, i100);
            int i119 = i117 + iRotateLeft14;
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft13 ^ i119, i66);
            int i120 = i118 + iRotateLeft15;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft14 ^ i120, i43);
            int i121 = i109 + iRotateLeft6;
            char c28 = c6;
            int iRotateLeft17 = Integers.rotateLeft(iRotateLeft2 ^ i121, i2);
            int i122 = i105 + iRotateLeft17;
            int iRotateLeft18 = Integers.rotateLeft(iRotateLeft6 ^ i122, i100);
            int i123 = i121 + iRotateLeft18;
            int iRotateLeft19 = Integers.rotateLeft(iRotateLeft17 ^ i123, i66);
            int i124 = i122 + iRotateLeft19;
            int iRotateLeft20 = Integers.rotateLeft(iRotateLeft18 ^ i124, i43);
            int i125 = i108 + iRotateLeft5;
            int iRotateLeft21 = Integers.rotateLeft(iRotateLeft ^ i125, 16);
            int i126 = i104 + iRotateLeft21;
            int iRotateLeft22 = Integers.rotateLeft(iRotateLeft5 ^ i126, i100);
            int i127 = i125 + iRotateLeft22;
            int iRotateLeft23 = Integers.rotateLeft(iRotateLeft21 ^ i127, 8);
            int i128 = i126 + iRotateLeft23;
            int iRotateLeft24 = Integers.rotateLeft(iRotateLeft22 ^ i128, 7);
            int i129 = i115 + iRotateLeft16;
            int iRotateLeft25 = Integers.rotateLeft(iRotateLeft23 ^ i129, 16);
            int i130 = i124 + iRotateLeft25;
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft16 ^ i130, 12);
            i111 = i129 + iRotateLeft26;
            iRotateLeft = Integers.rotateLeft(iRotateLeft25 ^ i111, 8);
            i105 = i130 + iRotateLeft;
            iRotateLeft7 = Integers.rotateLeft(iRotateLeft26 ^ i105, 7);
            int i131 = i119 + iRotateLeft20;
            int iRotateLeft27 = Integers.rotateLeft(iRotateLeft11 ^ i131, 16);
            int i132 = i128 + iRotateLeft27;
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft20 ^ i132, 12);
            i110 = i131 + iRotateLeft28;
            iRotateLeft4 = Integers.rotateLeft(iRotateLeft27 ^ i110, 8);
            i104 = i132 + iRotateLeft4;
            iRotateLeft6 = Integers.rotateLeft(iRotateLeft28 ^ i104, 7);
            int i133 = i123 + iRotateLeft24;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft15 ^ i133, 16);
            int i134 = i116 + iRotateLeft29;
            int iRotateLeft30 = Integers.rotateLeft(iRotateLeft24 ^ i134, 12);
            i109 = i133 + iRotateLeft30;
            iRotateLeft3 = Integers.rotateLeft(iRotateLeft29 ^ i109, 8);
            i107 = i134 + iRotateLeft3;
            iRotateLeft5 = Integers.rotateLeft(iRotateLeft30 ^ i107, 7);
            int i135 = i127 + iRotateLeft12;
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft19 ^ i135, 16);
            int i136 = i120 + iRotateLeft31;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft12 ^ i136, 12);
            i108 = i135 + iRotateLeft32;
            iRotateLeft2 = Integers.rotateLeft(iRotateLeft31 ^ i108, 8);
            i106 = i136 + iRotateLeft2;
            iRotateLeft8 = Integers.rotateLeft(iRotateLeft32 ^ i106, 7);
            i112 -= 2;
            i2 = 16;
            c2 = c7;
            c3 = c16;
            c5 = c26;
            c6 = c28;
            i43 = 7;
            i66 = 8;
            i100 = 12;
        }
        char c29 = c2;
        char c33 = c3;
        char c39 = c5;
        char c47 = c6;
        iArr2[0] = i111 + iArr[0];
        iArr2[1] = i110 + iArr[1];
        iArr2[2] = i109 + iArr[2];
        iArr2[c29] = i108 + iArr[c29];
        iArr2[c33] = iRotateLeft8 + iArr[c33];
        iArr2[c39] = iRotateLeft7 + iArr[c39];
        iArr2[c47] = iRotateLeft6 + iArr[c47];
        iArr2[7] = iRotateLeft5 + iArr[7];
        iArr2[8] = i107 + iArr[8];
        iArr2[9] = i106 + iArr[9];
        iArr2[10] = i105 + iArr[10];
        iArr2[11] = i104 + iArr[11];
        iArr2[12] = iRotateLeft4 + iArr[12];
        iArr2[13] = iRotateLeft3 + iArr[13];
        iArr2[14] = iRotateLeft2 + iArr[14];
        iArr2[15] = iRotateLeft + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f228383x);
        Pack.intToLittleEndian(this.f228383x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12];
        if (i == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i2 = i - 1;
        iArr[12] = i2;
        if (i2 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i) {
        super(i);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j2) {
        int i = (int) (j2 >>> 32);
        int i2 = (int) j2;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i;
        }
        int[] iArr2 = this.engineState;
        int i3 = iArr2[12];
        int i5 = i2 + i3;
        iArr2[12] = i5;
        if (i3 == 0 || i5 >= i3) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j2) {
        int i = (int) (j2 >>> 32);
        int i2 = (int) j2;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i3 = iArr[13];
            if ((((long) i3) & BodyPartID.bodyIdMax) < (((long) i) & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i3 - i;
        }
        int[] iArr2 = this.engineState;
        int i5 = iArr2[12];
        if ((((long) i5) & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & ((long) i2))) {
            iArr2[12] = i5 - i2;
            return;
        }
        int i6 = iArr2[13];
        if (i6 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i6 - 1;
        iArr2[12] = i5 - i2;
    }
}

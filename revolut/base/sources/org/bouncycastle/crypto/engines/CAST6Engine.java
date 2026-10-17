package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes14.dex */
public final class CAST6Engine extends CAST5Engine {
    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int[] _Kr = new int[48];
    protected int[] _Km = new int[48];
    protected int[] _Tr = new int[192];
    protected int[] _Tm = new int[192];
    private int[] _workingKey = new int[8];

    public final void CAST_Decipher(int i, int i2, int i3, int i5, int[] iArr) {
        int i6;
        int i21 = 0;
        while (true) {
            if (i21 >= 6) {
                break;
            }
            int i22 = (11 - i21) * 4;
            i3 ^= F1(i5, this._Km[i22], this._Kr[i22]);
            int i32 = i22 + 1;
            i2 ^= F2(i3, this._Km[i32], this._Kr[i32]);
            int i33 = i22 + 2;
            i ^= F3(i2, this._Km[i33], this._Kr[i33]);
            int i43 = i22 + 3;
            i5 ^= F1(i, this._Km[i43], this._Kr[i43]);
            i21++;
        }
        for (i6 = 6; i6 < 12; i6++) {
            int i59 = (11 - i6) * 4;
            int i66 = i59 + 3;
            i5 ^= F1(i, this._Km[i66], this._Kr[i66]);
            int i74 = i59 + 2;
            i ^= F3(i2, this._Km[i74], this._Kr[i74]);
            int i92 = i59 + 1;
            i2 ^= F2(i3, this._Km[i92], this._Kr[i92]);
            i3 ^= F1(i5, this._Km[i59], this._Kr[i59]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i5;
    }

    public final void CAST_Encipher(int i, int i2, int i3, int i5, int[] iArr) {
        int i6;
        int i21 = 0;
        while (true) {
            if (i21 >= 6) {
                break;
            }
            int i22 = i21 * 4;
            i3 ^= F1(i5, this._Km[i22], this._Kr[i22]);
            int i32 = i22 + 1;
            i2 ^= F2(i3, this._Km[i32], this._Kr[i32]);
            int i33 = i22 + 2;
            i ^= F3(i2, this._Km[i33], this._Kr[i33]);
            int i43 = i22 + 3;
            i5 ^= F1(i, this._Km[i43], this._Kr[i43]);
            i21++;
        }
        for (i6 = 6; i6 < 12; i6++) {
            int i59 = i6 * 4;
            int i66 = i59 + 3;
            i5 ^= F1(i, this._Km[i66], this._Kr[i66]);
            int i74 = i59 + 2;
            i ^= F3(i2, this._Km[i74], this._Kr[i74]);
            int i92 = i59 + 1;
            i2 ^= F2(i3, this._Km[i92], this._Kr[i92]);
            i3 ^= F1(i5, this._Km[i59], this._Kr[i59]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i5;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        CAST_Decipher(BytesTo32bits(bArr, i), BytesTo32bits(bArr, i + 4), BytesTo32bits(bArr, i + 8), BytesTo32bits(bArr, i + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i2);
        Bits32ToBytes(iArr[1], bArr2, i2 + 4);
        Bits32ToBytes(iArr[2], bArr2, i2 + 8);
        Bits32ToBytes(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        CAST_Encipher(BytesTo32bits(bArr, i), BytesTo32bits(bArr, i + 4), BytesTo32bits(bArr, i + 8), BytesTo32bits(bArr, i + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i2);
        Bits32ToBytes(iArr[1], bArr2, i2 + 4);
        Bits32ToBytes(iArr[2], bArr2, i2 + 8);
        Bits32ToBytes(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public void setKey(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        char c2 = 0;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = (i3 * 8) + i5;
                this._Tm[i6] = i;
                i += 1859775393;
                this._Tr[i6] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i21 = 0; i21 < 8; i21++) {
            this._workingKey[i21] = BytesTo32bits(bArr2, i21 * 4);
        }
        int i22 = 0;
        while (i22 < 12) {
            int i32 = i22 * 16;
            int[] iArr = this._workingKey;
            iArr[6] = iArr[6] ^ F1(iArr[7], this._Tm[i32], this._Tr[i32]);
            int[] iArr2 = this._workingKey;
            int i33 = i32 + 1;
            iArr2[5] = iArr2[5] ^ F2(iArr2[6], this._Tm[i33], this._Tr[i33]);
            int[] iArr3 = this._workingKey;
            int i43 = i32 + 2;
            iArr3[4] = iArr3[4] ^ F3(iArr3[5], this._Tm[i43], this._Tr[i43]);
            int[] iArr4 = this._workingKey;
            int i59 = i32 + 3;
            char c3 = c2;
            iArr4[3] = F1(iArr4[4], this._Tm[i59], this._Tr[i59]) ^ iArr4[3];
            int[] iArr5 = this._workingKey;
            int i66 = i32 + 4;
            iArr5[2] = F2(iArr5[3], this._Tm[i66], this._Tr[i66]) ^ iArr5[2];
            int[] iArr6 = this._workingKey;
            int i74 = i32 + 5;
            iArr6[1] = F3(iArr6[2], this._Tm[i74], this._Tr[i74]) ^ iArr6[1];
            int[] iArr7 = this._workingKey;
            int i92 = i32 + 6;
            iArr7[c3] = iArr7[c3] ^ F1(iArr7[1], this._Tm[i92], this._Tr[i92]);
            int[] iArr8 = this._workingKey;
            int i96 = i32 + 7;
            iArr8[7] = F2(iArr8[c3], this._Tm[i96], this._Tr[i96]) ^ iArr8[7];
            int i99 = ((i22 * 2) + 1) * 8;
            int[] iArr9 = this._workingKey;
            iArr9[6] = iArr9[6] ^ F1(iArr9[7], this._Tm[i99], this._Tr[i99]);
            int[] iArr10 = this._workingKey;
            int i100 = i99 + 1;
            iArr10[5] = iArr10[5] ^ F2(iArr10[6], this._Tm[i100], this._Tr[i100]);
            int[] iArr11 = this._workingKey;
            int i101 = i99 + 2;
            iArr11[4] = iArr11[4] ^ F3(iArr11[5], this._Tm[i101], this._Tr[i101]);
            int[] iArr12 = this._workingKey;
            int i102 = i99 + 3;
            iArr12[3] = iArr12[3] ^ F1(iArr12[4], this._Tm[i102], this._Tr[i102]);
            int[] iArr13 = this._workingKey;
            int i103 = i99 + 4;
            iArr13[2] = iArr13[2] ^ F2(iArr13[3], this._Tm[i103], this._Tr[i103]);
            int[] iArr14 = this._workingKey;
            int i104 = i99 + 5;
            iArr14[1] = iArr14[1] ^ F3(iArr14[2], this._Tm[i104], this._Tr[i104]);
            int[] iArr15 = this._workingKey;
            int i105 = i99 + 6;
            iArr15[c3] = iArr15[c3] ^ F1(iArr15[1], this._Tm[i105], this._Tr[i105]);
            int[] iArr16 = this._workingKey;
            int i106 = i99 + 7;
            iArr16[7] = F2(iArr16[c3], this._Tm[i106], this._Tr[i106]) ^ iArr16[7];
            int[] iArr17 = this._Kr;
            int i107 = i22 * 4;
            int[] iArr18 = this._workingKey;
            iArr17[i107] = iArr18[c3] & 31;
            int i108 = i107 + 1;
            iArr17[i108] = iArr18[2] & 31;
            int i109 = i107 + 2;
            iArr17[i109] = iArr18[4] & 31;
            int i110 = i107 + 3;
            iArr17[i110] = iArr18[6] & 31;
            int[] iArr19 = this._Km;
            iArr19[i107] = iArr18[7];
            iArr19[i108] = iArr18[5];
            iArr19[i109] = iArr18[3];
            iArr19[i110] = iArr18[1];
            i22++;
            c2 = c3;
        }
    }
}

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class CramerShoupCiphertext {
    BigInteger e;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    BigInteger f228349u1;
    BigInteger u2;
    BigInteger v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.e;
    }

    public BigInteger getU1() {
        return this.f228349u1;
    }

    public BigInteger getU2() {
        return this.u2;
    }

    public BigInteger getV() {
        return this.v;
    }

    public void setE(BigInteger bigInteger) {
        this.e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f228349u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f228349u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i, length2);
        int i2 = i + length2;
        Pack.intToBigEndian(length3, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(byteArray3, 0, bArr, i3, length3);
        int i5 = i3 + length3;
        Pack.intToBigEndian(length4, bArr, i5);
        System.arraycopy(byteArray4, 0, bArr, i5 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("u1: " + this.f228349u1.toString());
        sb6.append("\nu2: " + this.u2.toString());
        sb6.append("\ne: " + this.e.toString());
        sb6.append("\nv: " + this.v.toString());
        return sb6.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f228349u1 = bigInteger;
        this.u2 = bigInteger2;
        this.e = bigInteger3;
        this.v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i = 4 + iBigEndianToInt;
        this.f228349u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i));
        int i2 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i) + i2;
        this.u2 = new BigInteger(Arrays.copyOfRange(bArr, i2, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i3 = iBigEndianToInt2 + 4;
        int i5 = iBigEndianToInt3 + i3;
        this.e = new BigInteger(Arrays.copyOfRange(bArr, i3, i5));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i5);
        int i6 = i5 + 4;
        this.v = new BigInteger(Arrays.copyOfRange(bArr, i6, iBigEndianToInt4 + i6));
    }
}

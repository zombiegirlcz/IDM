package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes14.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i) {
        boolean z = false;
        for (int i2 = i; i2 != i + 8; i2++) {
            if (bArr[i2] != bArr[i2 + 8]) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isReal3Key(byte[] bArr, int i) {
        int i2 = i;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean z6 = true;
            if (i2 == i + 8) {
                break;
            }
            byte b4 = bArr[i2];
            byte b5 = bArr[i2 + 8];
            z |= b4 != b5;
            byte b7 = bArr[i2 + 16];
            z3 |= b4 != b7;
            if (b5 == b7) {
                z6 = false;
            }
            z4 |= z6;
            i2++;
        }
        return z && z3 && z4;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i) {
        return bArr.length == 16 ? isReal2Key(bArr, i) : isReal3Key(bArr, i);
    }

    public static boolean isWeakKey(byte[] bArr, int i) {
        return isWeakKey(bArr, i, bArr.length - i);
    }

    public static boolean isWeakKey(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (DESParameters.isWeakKey(bArr, i)) {
                return true;
            }
            i += 8;
        }
        return false;
    }
}

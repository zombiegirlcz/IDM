package org.bouncycastle.crypto.params;

import com.google.common.base.Ascii;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, Ascii.US, Ascii.US, Ascii.US, Ascii.US, 14, 14, 14, 14, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, ISO7816.INS_CREATE_FILE, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, Ascii.US, ISO7816.INS_CREATE_FILE, Ascii.US, ISO7816.INS_CREATE_FILE, 14, -15, 14, -15, 1, ISO7816.INS_CREATE_FILE, 1, ISO7816.INS_CREATE_FILE, 1, -15, 1, -15, Ascii.US, -2, Ascii.US, -2, 14, -2, 14, -2, 1, Ascii.US, 1, Ascii.US, 1, 14, 1, 14, ISO7816.INS_CREATE_FILE, -2, ISO7816.INS_CREATE_FILE, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, ISO7816.INS_CREATE_FILE, Ascii.US, ISO7816.INS_CREATE_FILE, Ascii.US, -15, 14, -15, 14, ISO7816.INS_CREATE_FILE, 1, ISO7816.INS_CREATE_FILE, 1, -15, 1, -15, 1, -2, Ascii.US, -2, Ascii.US, -2, 14, -2, 14, Ascii.US, 1, Ascii.US, 1, 14, 1, 14, 1, -2, ISO7816.INS_CREATE_FILE, -2, ISO7816.INS_CREATE_FILE, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    public static boolean isWeakKey(byte[] bArr, int i) {
        if (i > bArr.length - 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        for (int i2 = 0; i2 < 16; i2++) {
            if (Arrays.constantTimeAreEqual(8, bArr, i, DES_weak_keys, i2 * 8)) {
                return true;
            }
        }
        return false;
    }

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b4 = bArr[i];
            bArr[i] = (byte) (((((b4 >> 7) ^ ((((((b4 >> 1) ^ (b4 >> 2)) ^ (b4 >> 3)) ^ (b4 >> 4)) ^ (b4 >> 5)) ^ (b4 >> 6))) ^ 1) & 1) | (b4 & 254));
        }
    }
}

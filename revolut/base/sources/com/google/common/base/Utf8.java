package com.google.common.base;

import a0.d;
import com.google.common.annotations.GwtCompatible;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes16.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) == cCharAt) {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(i));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i, int i2) {
        byte b4;
        while (i < i2) {
            int i3 = i + 1;
            byte b5 = bArr[i];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i3 != i2 && b5 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b5 < -16) {
                    int i5 = i + 2;
                    if (i5 < i2 && (b4 = bArr[i3]) <= -65 && ((b5 != -32 || b4 >= -96) && (b5 != -19 || -96 > b4))) {
                        i += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return false;
                }
                if (i + 3 >= i2) {
                    return false;
                }
                int i6 = i + 2;
                byte b7 = bArr[i3];
                if (b7 <= -65) {
                    if ((((b7 + ISO7816.INS_MANAGE_CHANNEL) + (b5 << 28)) >> 30) == 0) {
                        int i21 = i + 3;
                        if (bArr[i6] <= -65) {
                            i += 4;
                            if (bArr[i21] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i) {
        return d.n("Unpaired surrogate at index ", i);
    }

    public static boolean isWellFormed(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        Preconditions.checkPositionIndexes(i, i3, bArr.length);
        while (i < i3) {
            if (bArr[i] < 0) {
                return isWellFormedSlowPath(bArr, i, i3);
            }
            i++;
        }
        return true;
    }
}

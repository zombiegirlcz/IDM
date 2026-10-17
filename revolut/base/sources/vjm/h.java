package vjm;

import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f289835a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f289836b = new g();

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int b(byte[] bArr, int i, int i2) {
        byte b4 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b4 > -12) {
                return -1;
            }
            return b4;
        }
        if (i3 == 1) {
            return a(b4, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i];
        byte b7 = bArr[i + 1];
        if (b4 > -12 || b5 > -65 || b7 > -65) {
            return -1;
        }
        return (b7 << 16) ^ ((b5 << 8) ^ b4);
    }

    public static int c(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                i = i3;
            } else if (b4 < -32) {
                if (i3 >= i2) {
                    return b4;
                }
                if (b4 < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b4 < -16) {
                if (i3 >= i2 - 1) {
                    return b(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b5 = bArr[i3];
                if (b5 > -65) {
                    return -1;
                }
                if (b4 == -32 && b5 < -96) {
                    return -1;
                }
                if (b4 == -19 && b5 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return b(bArr, i3, i2);
                }
                int i6 = i + 2;
                byte b7 = bArr[i3];
                if (b7 > -65) {
                    return -1;
                }
                if ((((b7 + ISO7816.INS_MANAGE_CHANNEL) + (b4 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i21 = i + 3;
                if (bArr[i6] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i21] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}

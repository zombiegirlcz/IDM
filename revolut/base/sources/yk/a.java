package yk;

import a0.d;
import com.google.common.base.Ascii;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f314560b = {13, 10};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f314561c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, 63, -1, Ascii.SUB, Ascii.ESC, 28, 29, 30, Ascii.US, 32, Constants.NFC_READER, ISO7816.INS_MSE, 35, ISO7816.INS_CHANGE_CHV, 37, 38, 39, 40, 41, ISO7816.INS_PSO, 43, ISO7816.INS_UNBLOCK_CHV, 45, 46, 47, ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f314562a;

    public a() {
        for (int i = 0; i < 2; i++) {
            byte[] bArr = f314560b;
            byte b4 = bArr[i];
            if (61 == b4 || (b4 >= 0 && b4 < 123 && f314561c[b4] != -1)) {
                throw new IllegalArgumentException(p.a.p("lineSeparator must not contain base64 characters: [", new String(bArr, xk.a.f306591a), "]"));
            }
        }
        this.f314562a = 3;
    }

    public static String b(String str) {
        a aVar = new a();
        byte[] bytes = str == null ? null : str.getBytes(xk.a.f306591a);
        if (bytes != null && bytes.length != 0) {
            b bVar = new b();
            aVar.a(bytes, bytes.length, bVar);
            aVar.a(bytes, -1, bVar);
            int i = bVar.f314565c;
            byte[] bArr = new byte[i];
            if (bVar.f314564b != null) {
                int iMin = Math.min(i - bVar.d, i);
                System.arraycopy(bVar.f314564b, bVar.d, bArr, 0, iMin);
                int i2 = bVar.d + iMin;
                bVar.d = i2;
                if (i2 >= bVar.f314565c) {
                    bVar.f314564b = null;
                }
            }
            bytes = bArr;
        }
        return new String(bytes);
    }

    public static byte[] c(int i, b bVar) {
        byte[] bArr = bVar.f314564b;
        if (bArr != null && bArr.length >= bVar.f314565c + i) {
            return bArr;
        }
        if (bArr == null) {
            bVar.f314564b = new byte[8192];
            bVar.f314565c = 0;
            bVar.d = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bVar.f314564b = bArr2;
        }
        return bVar.f314564b;
    }

    public final void a(byte[] bArr, int i, b bVar) {
        int i2;
        byte b4;
        if (bVar.e) {
            return;
        }
        if (i < 0) {
            bVar.e = true;
        }
        int i3 = 0;
        int i5 = 0;
        while (true) {
            i2 = this.f314562a;
            if (i3 >= i) {
                break;
            }
            byte[] bArrC = c(i2, bVar);
            int i6 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 == 61) {
                bVar.e = true;
                break;
            }
            if (b5 >= 0 && b5 < 123 && (b4 = f314561c[b5]) >= 0) {
                int i21 = (bVar.f + 1) % 4;
                bVar.f = i21;
                int i22 = (bVar.f314563a << 6) + b4;
                bVar.f314563a = i22;
                if (i21 == 0) {
                    int i32 = bVar.f314565c;
                    int i33 = i32 + 1;
                    bVar.f314565c = i33;
                    bArrC[i32] = (byte) ((i22 >> 16) & 255);
                    int i43 = i32 + 2;
                    bVar.f314565c = i43;
                    bArrC[i33] = (byte) ((i22 >> 8) & 255);
                    bVar.f314565c = i32 + 3;
                    bArrC[i43] = (byte) (i22 & 255);
                }
            }
            i3++;
            i5 = i6;
        }
        if (!bVar.e || bVar.f == 0) {
            return;
        }
        byte[] bArrC2 = c(i2, bVar);
        int i59 = bVar.f;
        if (i59 != 1) {
            if (i59 == 2) {
                int i66 = bVar.f314563a;
                if ((i66 & 4) != 0) {
                    throw new IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value");
                }
                int i74 = i66 >> 4;
                bVar.f314563a = i74;
                int i92 = bVar.f314565c;
                bVar.f314565c = i92 + 1;
                bArrC2[i92] = (byte) (i74 & 255);
                return;
            }
            if (i59 != 3) {
                throw new IllegalStateException(d.n("Impossible modulus ", bVar.f));
            }
            int i96 = bVar.f314563a;
            if ((i96 & 2) != 0) {
                throw new IllegalArgumentException("Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible value");
            }
            int i99 = i96 >> 2;
            bVar.f314563a = i99;
            int i100 = bVar.f314565c;
            int i101 = i100 + 1;
            bVar.f314565c = i101;
            bArrC2[i100] = (byte) ((i96 >> 10) & 255);
            bVar.f314565c = i100 + 2;
            bArrC2[i101] = (byte) (i99 & 255);
        }
    }
}

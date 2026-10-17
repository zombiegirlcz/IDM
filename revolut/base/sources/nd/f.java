package nd;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes17.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f214255a = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f214254b;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i5 = -1;
        while (true) {
            int i6 = i2 + 3;
            if (i6 > length) {
                break;
            }
            int i21 = (bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8);
            bArr3[i3] = bArr2[(i21 >> 18) & 63];
            bArr3[i3 + 1] = bArr2[(i21 >> 12) & 63];
            bArr3[i3 + 2] = bArr2[(i21 >> 6) & 63];
            bArr3[i3 + 3] = bArr2[i21 & 63];
            int i22 = i3 + 4;
            i5--;
            if (i5 == 0) {
                i3 += 5;
                bArr3[i22] = 10;
                i5 = 19;
            } else {
                i3 = i22;
            }
            i2 = i6;
        }
        if (i2 == length - 1) {
            int i32 = (bArr[i2] & UnsignedBytes.MAX_VALUE) << 4;
            bArr3[i3] = bArr2[(i32 >> 6) & 63];
            bArr3[i3 + 1] = bArr2[i32 & 63];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
            return bArr3;
        }
        if (i2 == length - 2) {
            int i33 = ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 2) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 10);
            bArr3[i3] = bArr2[(i33 >> 12) & 63];
            bArr3[i3 + 1] = bArr2[(i33 >> 6) & 63];
            bArr3[i3 + 2] = bArr2[i33 & 63];
            bArr3[i3 + 3] = 61;
        }
        return bArr3;
    }
}

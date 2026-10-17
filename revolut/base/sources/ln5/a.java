package ln5;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.List;
import java.util.Locale;
import kn5.e;
import kn5.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.p;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    @NotNull
    public static final C1119a Companion = new C1119a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f197107a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, 10, 17, Ascii.NAK, Ascii.DC4, Ascii.SUB, 30, 7, 5, -1, -1, -1, -1, -1, -1, -1, 29, -1, Ascii.CAN, 13, Ascii.EM, 9, 8, Ascii.ETB, -1, 18, Ascii.SYN, Ascii.US, Ascii.ESC, 19, -1, 1, 0, 3, 16, 11, 28, 12, 14, 6, 4, 2, -1, -1, -1, -1, -1, -1, 29, -1, Ascii.CAN, 13, Ascii.EM, 9, 8, Ascii.ETB, -1, 18, Ascii.SYN, Ascii.US, Ascii.ESC, 19, -1, 1, 0, 3, 16, 11, 28, 12, 14, 6, 4, 2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f197108b = v.k(996825010, 642813549, 513874426, 1027748829, 705979059);

    /* JADX INFO: renamed from: ln5.a$a, reason: collision with other inner class name */
    public static final class C1119a {
        private C1119a() {
        }
    }

    public abstract boolean a(String str);

    public final f b(String address) {
        int iX;
        int length;
        Intrinsics.checkNotNullParameter(address, "address");
        if (!a(address)) {
            return new e(null);
        }
        int length2 = address.length();
        for (int i = 0; i < length2; i++) {
            char cCharAt = address.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                return new e(null);
            }
        }
        if (!d.a(address) && (iX = d0.X(address, '1', 0, 6)) >= 1 && (length = (address.length() - 1) - iX) >= 6) {
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte b4 = f197107a[address.charAt(i2 + iX + 1)];
                if (b4 == -1) {
                    return new e(null);
                }
                bArr[i2] = b4;
            }
            String strSubstring = address.substring(0, iX);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Locale locale = Locale.ROOT;
            String strR = p.a.r(locale, "ROOT", strSubstring, locale, "toLowerCase(...)");
            int length3 = strR.length();
            byte[] bArr2 = new byte[length3];
            byte[] bArr3 = new byte[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                char cCharAt2 = strR.charAt(i3);
                bArr2[i3] = (byte) (((cCharAt2 & Ascii.MAX) >>> 5) & 7);
                bArr3[i3] = (byte) (cCharAt2 & 31);
            }
            byte[] bArrV = p.v(p.v(p.v(bArr2, new byte[]{0}), bArr3), bArr);
            int iIntValue = 1;
            for (byte b5 : bArrV) {
                int i5 = (iIntValue >>> 25) & 255;
                iIntValue = ((iIntValue & 33554431) << 5) ^ (b5 & UnsignedBytes.MAX_VALUE);
                for (int i6 = 0; i6 < 5; i6++) {
                    iIntValue ^= ((i5 >> i6) & 1) != 0 ? ((Number) f197108b.get(i6)).intValue() : 0;
                }
            }
            return (iIntValue == 1 || iIntValue == 734539939) ? kn5.c.f186000a : new e(null);
        }
        return new e(null);
    }
}

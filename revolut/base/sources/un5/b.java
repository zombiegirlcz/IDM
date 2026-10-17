package un5;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kn5.e;
import kn5.f;
import kn5.h;
import kn5.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.p;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f281350a = v.k('1', 'n', 'm');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f281351b = v.k('3', '2');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f281352c = v.k("bchtest", "bchreg");
    public static final List d = v.k("bitcoincash", "bchtest", "bchreg");

    public b(c cashAddrValidator) {
        Intrinsics.checkNotNullParameter(cashAddrValidator, "cashAddrValidator");
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        boolean z;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z3 = params.f185998c;
        String address = params.f185996a;
        if (address.length() == 0) {
            return new e(h.f186003a);
        }
        if (f281350a.contains(Character.valueOf(f0.P0(address))) || f281351b.contains(Character.valueOf(f0.P0(address)))) {
            return new e(m.f186008a);
        }
        List list = f281352c;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (a0.H(address, (String) it8.next(), false)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!(z3 && z) && z) {
            return new e(null);
        }
        Intrinsics.checkNotNullParameter(address, "address");
        int length = address.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = address.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                return new e(null);
            }
        }
        String lowerCase = address.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.f(lowerCase, address)) {
            return new e(null);
        }
        int iX = d0.X(address, CoreConstants.COLON_CHAR, 0, 6);
        String strU0 = iX == -1 ? null : f0.U0(iX, address);
        Companion.getClass();
        if (!zhm.d0.T(d, strU0)) {
            address = "bitcoincash:".concat(address);
        }
        int iX2 = d0.X(address, CoreConstants.COLON_CHAR, 0, 6);
        int length2 = (address.length() - 1) - iX2;
        if (length2 != 42) {
            return new e(null);
        }
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            byte b4 = c.f281353a[address.charAt(i2 + iX2 + 1)];
            if (b4 == -1) {
                return new e(null);
            }
            bArr[i2] = b4;
        }
        String strSubstring = address.substring(0, iX2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int length3 = strSubstring.length();
        byte[] bArr2 = new byte[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            bArr2[i3] = (byte) (strSubstring.charAt(i3) & 31);
        }
        byte[] bArrV = p.v(p.v(bArr2, new byte[]{0}), bArr);
        long j2 = 1;
        for (byte b5 : bArrV) {
            long j3 = (j2 >>> 35) & 255;
            j2 = (((long) b5) & 255) ^ ((j2 & 34359738367L) << 5);
            for (int i5 = 0; i5 < 5; i5++) {
                long jLongValue = 0;
                if (((j3 >> i5) & 1) != 0) {
                    jLongValue = ((Number) c.f281354b.get(i5)).longValue();
                }
                j2 ^= jLongValue;
            }
        }
        return j2 == 1 ? kn5.c.f186000a : new e(null);
    }
}

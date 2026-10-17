package ci;

import com.google.zxing.FormatException;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24334a;

    public /* synthetic */ g(int i) {
        this.f24334a = i;
    }

    @Override // kotlin.jvm.internal.s, vh.d
    public final yh.b b(String str, vh.a aVar, int i, int i2, aim.f fVar) {
        switch (this.f24334a) {
            case 0:
                if (aVar == vh.a.EAN_13) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == vh.a.EAN_8) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == vh.a.UPC_E) {
                    return super.b(str, aVar, i, i2, fVar);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
        }
    }

    @Override // kotlin.jvm.internal.s
    public final boolean[] d(String str) {
        switch (this.f24334a) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = p.a.o(str, i.U(str));
                    } catch (FormatException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    if (length != 13) {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    try {
                        if (!i.T(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int i = f.f[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int iA = s.a(zArr, 0, i.f24338a, true);
                for (int i2 = 1; i2 <= 6; i2++) {
                    int iDigit = Character.digit(str.charAt(i2), 10);
                    if (((i >> (6 - i2)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iA += s.a(zArr, iA, i.e[iDigit], false);
                }
                int iA2 = s.a(zArr, iA, i.f24339b, false) + iA;
                for (int i3 = 7; i3 <= 12; i3++) {
                    iA2 += s.a(zArr, iA2, i.d[Character.digit(str.charAt(i3), 10)], true);
                }
                s.a(zArr, iA2, i.f24338a, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = p.a.o(str, i.U(str));
                    } catch (FormatException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    if (length2 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    try {
                        if (!i.T(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused2) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int iA3 = s.a(zArr2, 0, i.f24338a, true);
                for (int i5 = 0; i5 <= 3; i5++) {
                    iA3 += s.a(zArr2, iA3, i.d[Character.digit(str.charAt(i5), 10)], false);
                }
                int iA4 = s.a(zArr2, iA3, i.f24339b, false) + iA3;
                for (int i6 = 4; i6 <= 7; i6++) {
                    iA4 += s.a(zArr2, iA4, i.d[Character.digit(str.charAt(i6), 10)], true);
                }
                s.a(zArr2, iA4, i.f24338a, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = p.a.o(str, i.U(f.V(str)));
                    } catch (FormatException e4) {
                        throw new IllegalArgumentException(e4);
                    }
                } else {
                    if (length3 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    try {
                        if (!i.T(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (FormatException unused3) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 != 0 && iDigit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i21 = f.f24333g[iDigit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int iA5 = s.a(zArr3, 0, i.f24338a, true);
                for (int i22 = 1; i22 <= 6; i22++) {
                    int iDigit3 = Character.digit(str.charAt(i22), 10);
                    if (((i21 >> (6 - i22)) & 1) == 1) {
                        iDigit3 += 10;
                    }
                    iA5 += s.a(zArr3, iA5, i.e[iDigit3], false);
                }
                s.a(zArr3, iA5, i.f24340c, false);
                return zArr3;
        }
    }

    @Override // kotlin.jvm.internal.s
    public final int m() {
        return 9;
    }
}

package kem;

import io.ktor.http.BadContentTypeFormatException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f {
    public static i a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (kotlin.text.d0.W(value)) {
            return i.e;
        }
        l lVar = (l) zhm.d0.m0(a1m.e.C(value));
        String str = lVar.f183211a;
        List list = lVar.f183212b;
        int iS = kotlin.text.d0.S(str, '/', 0, 6);
        if (iS == -1) {
            if (!Intrinsics.f(kotlin.text.d0.F0(str).toString(), "*")) {
                throw new BadContentTypeFormatException(value);
            }
            i.Companion.getClass();
            return i.e;
        }
        String strSubstring = str.substring(0, iS);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = kotlin.text.d0.F0(strSubstring).toString();
        if (string.length() == 0) {
            throw new BadContentTypeFormatException(value);
        }
        String strSubstring2 = str.substring(iS + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String string2 = kotlin.text.d0.F0(strSubstring2).toString();
        if (kotlin.text.d0.K(string, zsc.p.SPACE_CHAR) || kotlin.text.d0.K(string2, zsc.p.SPACE_CHAR)) {
            throw new BadContentTypeFormatException(value);
        }
        if (string2.length() == 0 || kotlin.text.d0.K(string2, '/')) {
            throw new BadContentTypeFormatException(value);
        }
        return new i(string, string2, list);
    }
}

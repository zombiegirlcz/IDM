package fz0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[PHI: r2
      0x0032: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v21 java.lang.String) binds: [B:6:0x001b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fz0.f.a(com.revolut.core.ui_kit_core.displayers.image.models.UrlImage):java.lang.String");
    }

    public static String b(String url2) {
        int i;
        Intrinsics.checkNotNullParameter(url2, "url");
        int length = url2.length();
        int iP = d0.P(url2);
        while (true) {
            if (-1 >= iP) {
                i = 0;
                break;
            }
            char cCharAt = url2.charAt(iP);
            if (cCharAt != '%' && cCharAt != '@' && cCharAt != '.') {
                if (cCharAt == '/') {
                    i = iP + 1;
                    break;
                }
            } else {
                length = iP;
            }
            iP--;
        }
        if (i >= url2.length() || length <= i) {
            return null;
        }
        String strSubstring = url2.substring(i, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}

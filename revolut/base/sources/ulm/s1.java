package ulm;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 {
    public static r1 a(String string, b1 b1Var) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Pair pairB = vlm.b.b(b1Var);
        Charset charset = (Charset) pairB.f186385a;
        b1 b1Var2 = (b1) pairB.f186386b;
        mmm.h hVar = new mmm.h();
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        int length = string.length();
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (length < 0) {
            throw new IllegalArgumentException(a0.d.g(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > string.length()) {
            StringBuilder sbW = a0.d.w(length, "endIndex > string.length: ", " > ");
            sbW.append(string.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        if (Intrinsics.f(charset, Charsets.UTF_8)) {
            hVar.C(0, length, string);
        } else {
            String strSubstring = string.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            hVar.write(bytes, 0, bytes.length);
        }
        return b(hVar, b1Var2, hVar.f207266b);
    }

    public static r1 b(mmm.k kVar, b1 b1Var, long j2) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new r1(kVar, b1Var, j2);
    }

    public static r1 c(mmm.m mVar, b1 b1Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        mmm.h hVar = new mmm.h();
        hVar.v(mVar);
        return b(hVar, b1Var, mVar.d());
    }
}

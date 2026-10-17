package n30;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 {
    private q0() {
    }

    public static Long a(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            String str2 = (String) zhm.d0.e0(1, kotlin.text.d0.n0(str, new String[]{"."}, 0, 6));
            if (str2 == null) {
                return null;
            }
            byte[] bArrDecode = Base64.getUrlDecoder().decode(str2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            kg.u uVarI = c6d.b.v(new String(bArrDecode, UTF_8)).c().i("exp");
            if (uVarI == null) {
                return null;
            }
            long jE = uVarI.e();
            b.Companion companion = kotlin.time.b.INSTANCE;
            return Long.valueOf(kotlin.time.b.f(kotlin.time.c.h(jE, pkm.e.SECONDS)));
        } catch (Exception unused) {
            return null;
        }
    }
}

package rm0;

import android.util.Base64;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    static u a(v vVar, hn0.c alias, String value) {
        SecurityException securityException;
        u uVar;
        r cipherVersion = r.V2_OAEP;
        y yVar = (y) vVar;
        synchronized (yVar) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(cipherVersion, "cipherVersion");
            try {
                hn0.k kVar = new hn0.k(alias, cipherVersion);
                Cipher cipherG = ((b) yVar.f255173a).g(kVar);
                byte[] bytes = value.getBytes(y.f255172c);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String strEncodeToString = Base64.encodeToString(cipherG.doFinal(bytes), 2);
                Intrinsics.h(strEncodeToString);
                uVar = new u(strEncodeToString, kVar.b());
            } finally {
            }
        }
        return uVar;
    }
}

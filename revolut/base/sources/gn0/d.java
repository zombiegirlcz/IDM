package gn0;

import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private d() {
    }

    public static String a(String str) {
        Locale locale;
        String strR;
        String strD = null;
        if (str != null && str.length() != 0) {
            String string = d0.F0(str).toString();
            if (string != null && (strR = p.a.r((locale = Locale.ENGLISH), "ENGLISH", string, locale, "toLowerCase(...)")) != null) {
                strD = a0.D(strR, ":", "", false);
            }
            if (strD == null) {
                return "";
            }
        }
        return strD;
    }

    @NotNull
    public final KSerializer serializer() {
        return e.f144898a;
    }
}

package e93;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 {
    private c0() {
    }

    public static d0 a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = d0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String strName = ((d0) next).name();
            String upperCase = value.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.f(strName, upperCase)) {
                break;
            }
        }
        d0 d0Var = (d0) next;
        return d0Var == null ? d0.FRONT : d0Var;
    }
}

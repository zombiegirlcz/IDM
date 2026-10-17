package o5l;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static b a(String text) {
        Object next;
        Intrinsics.checkNotNullParameter(text, "text");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String strB = ((b) next).b();
            Locale locale = Locale.ROOT;
            if (Intrinsics.f(strB, v0.a.j(locale, "ROOT", text, locale, "toUpperCase(...)"))) {
                break;
            }
        }
        b bVar = (b) next;
        return bVar == null ? b.NONE : bVar;
    }
}

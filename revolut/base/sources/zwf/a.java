package zwf;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private a() {
    }

    public static b a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((b) next).b(), value)) {
                break;
            }
        }
        b bVar = (b) next;
        return bVar == null ? b.URL : bVar;
    }
}

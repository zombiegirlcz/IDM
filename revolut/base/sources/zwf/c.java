package zwf;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private c() {
    }

    public static d a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = d.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((d) next).b(), value)) {
                break;
            }
        }
        d dVar = (d) next;
        return dVar == null ? d.TEXT : dVar;
    }
}

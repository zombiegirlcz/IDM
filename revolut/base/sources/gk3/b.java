package gk3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private b() {
    }

    public static c a(String type) {
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<E> it8 = c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((c) next).name(), type)) {
                break;
            }
        }
        c cVar = (c) next;
        return cVar == null ? c.UNKNOWN : cVar;
    }
}

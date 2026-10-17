package bxf;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private g() {
    }

    public static h a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = h.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h) next).b(), value)) {
                break;
            }
        }
        h hVar = (h) next;
        return hVar == null ? h.DEFAULT : hVar;
    }
}

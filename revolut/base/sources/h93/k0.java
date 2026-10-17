package h93;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 {
    private k0() {
    }

    public static l0 a(String str) {
        Object next;
        Iterator<E> it8 = l0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((l0) next).name(), str)) {
                break;
            }
        }
        return (l0) next;
    }
}

package h93;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 {
    private i0() {
    }

    public static j0 a(String str) {
        Object next;
        Iterator<E> it8 = j0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((j0) next).name(), str)) {
                break;
            }
        }
        return (j0) next;
    }
}

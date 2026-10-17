package wk5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private j() {
    }

    public static k a(String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<E> it8 = k.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((k) next).name(), name)) {
                break;
            }
        }
        return (k) next;
    }
}

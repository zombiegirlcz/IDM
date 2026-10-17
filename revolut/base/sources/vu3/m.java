package vu3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {
    private m() {
    }

    public static n a(String rawValue) {
        Object next;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Iterator<E> it8 = n.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n) next).name(), rawValue)) {
                break;
            }
        }
        n nVar = (n) next;
        return nVar == null ? n.IMAGE : nVar;
    }
}

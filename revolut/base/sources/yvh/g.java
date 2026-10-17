package yvh;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private g() {
    }

    public static h a(String str) {
        Object next;
        Iterator<E> it8 = h.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h) next).b(), str)) {
                break;
            }
        }
        return (h) next;
    }
}

package mha;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {
    private q() {
    }

    public static r a(String str) {
        Object next;
        Iterator<E> it8 = r.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((r) next).b(), str)) {
                break;
            }
        }
        return (r) next;
    }
}

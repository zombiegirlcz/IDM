package it3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {
    private j() {
    }

    public static k a(String str) {
        Object next;
        Iterator<E> it8 = k.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((k) next).name(), str)) {
                break;
            }
        }
        return (k) next;
    }
}

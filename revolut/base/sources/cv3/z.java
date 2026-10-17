package cv3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {
    private z() {
    }

    public static y a(String str) {
        Object next;
        Iterator<E> it8 = y.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((y) next).b(), str)) {
                break;
            }
        }
        return (y) next;
    }
}

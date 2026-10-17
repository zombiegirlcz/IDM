package t89;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private f() {
    }

    public static g a(String id10) {
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator<E> it8 = g.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            g gVar = (g) next;
            if (Intrinsics.f(gVar.c(), id10) || Intrinsics.f(gVar.a(), id10)) {
                break;
            }
        }
        return (g) next;
    }
}

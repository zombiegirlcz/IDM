package pt5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private a() {
    }

    public static b a(String id10) {
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(id10, ((b) next).getId())) {
                break;
            }
        }
        b bVar = (b) next;
        return bVar == null ? b.TRANSACTIONS : bVar;
    }
}

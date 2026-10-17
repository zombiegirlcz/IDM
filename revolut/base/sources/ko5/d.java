package ko5;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private d() {
    }

    public static e a(String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<E> it8 = e.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((e) next).name(), name)) {
                break;
            }
        }
        return (e) next;
    }
}

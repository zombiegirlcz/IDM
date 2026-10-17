package lid;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private k() {
    }

    public static l a(String key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<E> it8 = l.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((l) next).b(), key)) {
                break;
            }
        }
        l lVar = (l) next;
        return lVar == null ? l.UNKNOWN_TILE : lVar;
    }
}

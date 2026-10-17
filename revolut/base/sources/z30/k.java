package z30;

import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private k() {
    }

    public static l a(String str) {
        Object next;
        Iterator<E> it8 = l.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((l) next).b(), str, true)) {
                break;
            }
        }
        l lVar = (l) next;
        return lVar == null ? l.NONE : lVar;
    }
}

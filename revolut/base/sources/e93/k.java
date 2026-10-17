package e93;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
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
            if (kotlin.text.a0.z(((l) next).name(), str, true)) {
                break;
            }
        }
        l lVar = (l) next;
        return lVar == null ? l.UNLOCKED : lVar;
    }
}

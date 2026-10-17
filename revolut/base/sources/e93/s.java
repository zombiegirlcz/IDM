package e93;

import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class s {
    private s() {
    }

    public static t a(String str) {
        Object next;
        Iterator<E> it8 = t.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.z(((t) next).name(), str, true)) {
                break;
            }
        }
        return (t) next;
    }
}

package t1e;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class w {
    private w() {
    }

    public static x a(String str) {
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        Iterator<E> it8 = x.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (kotlin.text.a0.z(((x) next).name(), str, true)) {
                obj2 = next;
                break;
            }
        }
        return (x) obj2;
    }
}

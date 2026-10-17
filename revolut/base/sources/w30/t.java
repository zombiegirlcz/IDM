package w30;

import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public final class t {
    private t() {
    }

    public static u a(String str) {
        Object next;
        Iterator<E> it8 = u.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.z(((u) next).b(), str, true)) {
                break;
            }
        }
        u uVar = (u) next;
        return uVar == null ? u.UNKNOWN : uVar;
    }
}

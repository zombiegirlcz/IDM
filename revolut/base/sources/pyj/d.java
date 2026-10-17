package pyj;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    private d() {
    }

    public static e a(String value) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = e.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((e) next).b(), value, true)) {
                break;
            }
        }
        return (e) next;
    }
}

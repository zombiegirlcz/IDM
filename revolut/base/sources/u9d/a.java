package u9d;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private a() {
    }

    public static b a(String code) {
        Object next;
        Intrinsics.checkNotNullParameter(code, "code");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((b) next).getCode(), code)) {
                break;
            }
        }
        b bVar = (b) next;
        return bVar == null ? b.ENGLISH_UK : bVar;
    }
}

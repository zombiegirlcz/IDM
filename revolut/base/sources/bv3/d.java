package bv3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private d() {
    }

    public static e a(String rawImage) {
        Object next;
        Intrinsics.checkNotNullParameter(rawImage, "rawImage");
        Iterator<E> it8 = e.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((e) next).name(), rawImage)) {
                break;
            }
        }
        e eVar = (e) next;
        return eVar == null ? e.UNKNOWN : eVar;
    }
}

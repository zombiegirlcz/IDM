package u00;

import e4m.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {
    public static Set a() {
        b.Companion.getClass();
        x00.a[] elements = {new z00.c(), new z00.d(), new y00.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}

package qt5;

import dv5.l;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import pt5.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements e4m.e {
    public static l a(ev5.d factory, Optional transactionsFilterProvider) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        return factory.a((t) gj7.b.m(transactionsFilterProvider));
    }
}

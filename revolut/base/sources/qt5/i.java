package qt5;

import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import pt5.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i implements e4m.e {
    public static fv5.d a(ev5.d factory, Optional transactionsFilterProvider, Optional source) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        Intrinsics.checkNotNullParameter(source, "source");
        t tVar = (t) gj7.b.m(transactionsFilterProvider);
        lt5.a source2 = (lt5.a) gj7.b.l(source, lt5.a.CRYPTO);
        Intrinsics.checkNotNullParameter(source2, "source");
        return new fv5.d(factory.a(tVar), factory.f129742c, factory.d, factory.e, factory.f, source2);
    }
}

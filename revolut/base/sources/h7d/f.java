package h7d;

import b8d.l0;
import i7d.m;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f implements e4m.e {
    public static com.revolut.feature.shared.help_centre.impl.extension.b a(jpc.e factory, Optional navigationStrategy) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigationStrategy, "navigationStrategy");
        m navigationStrategy2 = (m) gj7.b.l(navigationStrategy, i7d.a.f159263a);
        Intrinsics.checkNotNullParameter(navigationStrategy2, "navigationStrategy");
        return new com.revolut.feature.shared.help_centre.impl.extension.b((k18.c) factory.f177256b, (x) factory.f177257c, (l0) factory.d, navigationStrategy2);
    }
}

package oxd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ox5.d0;
import ox5.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xte.a f230781a;

    public p(xte.a topUpMethodsItemsMapper) {
        Intrinsics.checkNotNullParameter(topUpMethodsItemsMapper, "topUpMethodsItemsMapper");
        this.f230781a = topUpMethodsItemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f230773a, new t0(5), new d0(8), new nrd.i(this, 25)));
    }
}

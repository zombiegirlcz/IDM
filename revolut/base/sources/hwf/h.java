package hwf;

import cli.j;
import cli.n;
import cli.o;
import ht1.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvf.c f156173a;

    public h(nvf.c purchasedTransitTicketMapper) {
        Intrinsics.checkNotNullParameter(purchasedTransitTicketMapper, "purchasedTransitTicketMapper");
        this.f156173a = purchasedTransitTicketMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e((List) iii.c.f(domainState.f156170a, new b(2), new l(23), new hnc.a(this, 5)));
    }
}

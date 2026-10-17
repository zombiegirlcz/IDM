package nv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr6.g f219537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jv6.b f219538b;

    public t(jr6.g cashbackDetailsItemMapper, jv6.b cashbackTransactionMapper) {
        Intrinsics.checkNotNullParameter(cashbackDetailsItemMapper, "cashbackDetailsItemMapper");
        Intrinsics.checkNotNullParameter(cashbackTransactionMapper, "cashbackTransactionMapper");
        this.f219537a = cashbackDetailsItemMapper;
        this.f219538b = cashbackTransactionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new r((q) iii.c.f(domainState.f219521a, new nuc.n(6), new nsl.d(11), new ngh.i(8)), (List) iii.c.f(domainState.f219521a, new nuc.n(5), new nsl.d(10), new nrd.i(this, 4)));
    }
}

package jta;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g80.c f178468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lta.b f178469b;

    public w(g80.c urlHelper, lta.b raffleContentItemsMapper) {
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(raffleContentItemsMapper, "raffleContentItemsMapper");
        this.f178468a = urlHelper;
        this.f178469b = raffleContentItemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f178441b, new jlh.g(this, 25), new jnf.d(this, 11), new j75.i(this, 15));
    }
}

package u7k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7k.i f277969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usc.a f277970b;

    public p(v7k.i paymentLinkDetailsOwnerMapper, usc.a paymentLinkDetailsNotOwnerMapper) {
        Intrinsics.checkNotNullParameter(paymentLinkDetailsOwnerMapper, "paymentLinkDetailsOwnerMapper");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsNotOwnerMapper, "paymentLinkDetailsNotOwnerMapper");
        this.f277969a = paymentLinkDetailsOwnerMapper;
        this.f277970b = paymentLinkDetailsNotOwnerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f277943a, new u4e.i(23), new u4i.u(5), new tch.c(this, 24));
    }
}

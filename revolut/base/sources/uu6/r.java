package uu6;

import kotlin.jvm.internal.Intrinsics;
import urd.y;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv6.b f283158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iv6.c f283159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iv6.f f283160c;
    public final iv6.h d;
    public final iv6.o e;

    public r(hv6.b acquiringPaymentMapper, iv6.c cardMapper, iv6.d equivalentAmountMapper, iv6.f orderMapper, iv6.h settledMapper, iv6.j settlesOnMapper, iv6.l statusMapper, iv6.o timelineMapper, iv6.p totalMapper, iv6.q transactionIdMapper) {
        Intrinsics.checkNotNullParameter(acquiringPaymentMapper, "acquiringPaymentMapper");
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(equivalentAmountMapper, "equivalentAmountMapper");
        Intrinsics.checkNotNullParameter(orderMapper, "orderMapper");
        Intrinsics.checkNotNullParameter(settledMapper, "settledMapper");
        Intrinsics.checkNotNullParameter(settlesOnMapper, "settlesOnMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(timelineMapper, "timelineMapper");
        Intrinsics.checkNotNullParameter(totalMapper, "totalMapper");
        Intrinsics.checkNotNullParameter(transactionIdMapper, "transactionIdMapper");
        this.f283158a = acquiringPaymentMapper;
        this.f283159b = cardMapper;
        this.f283160c = orderMapper;
        this.d = settledMapper;
        this.e = timelineMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f283142a, new y(28), new utk.b(2), new tvh.e(this, domainState, 14));
    }
}

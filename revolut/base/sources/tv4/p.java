package tv4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv4.k f274714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv4.m f274715b;

    public p(sv4.k creditCardStatementTransactionsItemMapper, sv4.m upcomingPaymentsMapper) {
        Intrinsics.checkNotNullParameter(creditCardStatementTransactionsItemMapper, "creditCardStatementTransactionsItemMapper");
        Intrinsics.checkNotNullParameter(upcomingPaymentsMapper, "upcomingPaymentsMapper");
        this.f274714a = creditCardStatementTransactionsItemMapper;
        this.f274715b = upcomingPaymentsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f274698a, new tsk.j(this, 12), new tq0.j(this, 22), new si5.c(this, domainState, 28));
    }
}

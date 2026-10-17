package i85;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k85.c f159471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k85.d f159472b;

    public y(k85.c loanPartialRepaymentBreakdownMapper, k85.a loanFullRepaymentBreakdownMapper, k85.f hintMapper, k85.d accountSectionMapper) {
        Intrinsics.checkNotNullParameter(loanPartialRepaymentBreakdownMapper, "loanPartialRepaymentBreakdownMapper");
        Intrinsics.checkNotNullParameter(loanFullRepaymentBreakdownMapper, "loanFullRepaymentBreakdownMapper");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        Intrinsics.checkNotNullParameter(accountSectionMapper, "accountSectionMapper");
        this.f159471a = loanPartialRepaymentBreakdownMapper;
        this.f159472b = accountSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(domainState.f159460a, new i30.a(this, 28), new i83.m(this, 1), new hb4.n(this, domainState, 28));
    }
}

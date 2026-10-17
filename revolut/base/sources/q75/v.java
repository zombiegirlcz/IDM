package q75;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f242763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f242764b;

    public v(w80.b amountFormatter, s75.a loanPartialRepaymentHintMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(loanPartialRepaymentHintMapper, "loanPartialRepaymentHintMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f242763a = amountFormatter;
        this.f242764b = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f242745a, new n(this, 2), new q34.a(this, 18), new ox2.d(this, domainState, 28));
    }
}

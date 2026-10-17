package z75;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a85.d f319907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f319908b;

    public a0(a85.d loanPartialRepaymentBreakdownMapper, a85.b loanFullRepaymentBreakdownMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(loanPartialRepaymentBreakdownMapper, "loanPartialRepaymentBreakdownMapper");
        Intrinsics.checkNotNullParameter(loanFullRepaymentBreakdownMapper, "loanFullRepaymentBreakdownMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f319907a = loanPartialRepaymentBreakdownMapper;
        this.f319908b = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(domainState.d, new z2.a(this, 16), new z0f.a0(this, 25), new y66.q(domainState, this, 25));
    }
}

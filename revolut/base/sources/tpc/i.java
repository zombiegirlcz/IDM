package tpc;

import akg.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f273339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final toh.d f273340b;

    public i(qmc.h portfolioInfoProvider, toh.d recurringDepositProvider) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(recurringDepositProvider, "recurringDepositProvider");
        this.f273339a = portfolioInfoProvider;
        this.f273340b = recurringDepositProvider;
    }

    public final n a(String str) {
        n nVarV = nim.a.v(glc.a.c(this.f273339a), new tlf.n(25));
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        toh.d dVar = this.f273340b;
        return nim.a.v(u0.m(nVarV, xam.a.h(new u29.c(dVar, loadingStrategy, (Continuation) null, 3), glc.a.c((qmc.h) dVar.f273215b))), new te8.a(str, 14));
    }
}

package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jzi.a f307384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eqj.f f307385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rnd.j f307386c;
    public final gmd.b d;

    public d(jzi.a budgetInteractor, eqj.f analyticsCycleInteractor, rnd.j analyticsAccountProvider, gmd.b accountWalletIdProvider) {
        Intrinsics.checkNotNullParameter(budgetInteractor, "budgetInteractor");
        Intrinsics.checkNotNullParameter(analyticsCycleInteractor, "analyticsCycleInteractor");
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(accountWalletIdProvider, "accountWalletIdProvider");
        this.f307384a = budgetInteractor;
        this.f307385b = analyticsCycleInteractor;
        this.f307386c = analyticsAccountProvider;
        this.d = accountWalletIdProvider;
    }
}

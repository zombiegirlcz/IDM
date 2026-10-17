package o9f;

import akg.n;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f223256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f223257b;

    public a(k tradingAccountsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f223256a = tradingAccountsInteractor;
        this.f223257b = featureToggleInteractor;
    }

    public final n a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(v7.y("AccountsForTransferInteractorImpl", "observeAccountsEligibleForTransfer", k.k(this.f223256a, loadingStrategy, null, cfl.k.f23744a, 2)), new o3k.a(this, 29));
    }
}

package xnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.j f307369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f307370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.d f307371c;
    public final djb.n d;
    public final elb.b e;

    public a0(rnd.j analyticsAccountProvider, wsg.n walletInteractor, g6e.d subaccountInteractor, djb.n savingsAccountsDetailsInteractor, elb.b savingsFeatureConfigInteractor) {
        Intrinsics.checkNotNullParameter(analyticsAccountProvider, "analyticsAccountProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        this.f307369a = analyticsAccountProvider;
        this.f307370b = walletInteractor;
        this.f307371c = subaccountInteractor;
        this.d = savingsAccountsDetailsInteractor;
        this.e = savingsFeatureConfigInteractor;
    }

    public final akg.n a(AnalyticsAccount analyticsAccount, AccountId accountId, String str) {
        return nim.a.v(rd0.e.b(this.f307370b.L(str, accountId, w4l.h.f294642c)), new le3.c(analyticsAccount, 1));
    }

    public final akg.n b(AnalyticsAccount.Savings savings, String str) {
        return nim.a.v(rd0.e.b(((rnb.i) this.d).b(str, w4l.h.f294642c)), new xe7.a(savings, 22));
    }
}

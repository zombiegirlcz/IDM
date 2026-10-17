package vha;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f289447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f289448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mce.a f289449c;

    public v0(s proAccountsInteractor, wsg.b newWalletsInteractor, mce.a recurringPaymentFilterProvider) {
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        this.f289447a = proAccountsInteractor;
        this.f289448b = newWalletsInteractor;
        this.f289449c = recurringPaymentFilterProvider;
    }

    public final efm.r a() {
        return kli.a.h(this.f289447a.b(sfe.a.FULL), rd0.e.c(nim.a.v(this.f289448b.e(w4l.h.f294642c), new vgk.g(7)), kotlin.coroutines.g.f186406a));
    }

    public final efm.r b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String str = accountId.f89729a;
        t0.Companion.getClass();
        return Intrinsics.f(str, t0.d) ? nim.a.w(a(), new u0(this, accountId)) : nim.a.w(a(), new u0(accountId, this));
    }
}

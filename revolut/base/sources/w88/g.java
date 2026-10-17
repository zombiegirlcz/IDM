package w88;

import ael.t;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import ybl.k;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f295611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f295612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f295613c;
    public final n d;
    public final hj8.a e;
    public final kbb.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o7.d f295614g;

    public g(h productCatalogueInteractor, k tradingAccountsInteractor, t portfolioBalanceInteractor, n walletInteractor, hj8.a juniorProfileInteractor, kbb.c juniorConfigInteractor, o7.d jisaDateOfBirthValidator) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        this.f295611a = productCatalogueInteractor;
        this.f295612b = tradingAccountsInteractor;
        this.f295613c = portfolioBalanceInteractor;
        this.d = walletInteractor;
        this.e = juniorProfileInteractor;
        this.f = juniorConfigInteractor;
        this.f295614g = jisaDateOfBirthValidator;
    }
}

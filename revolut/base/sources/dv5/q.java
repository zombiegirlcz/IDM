package dv5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lu5.r;
import org.jmrtd.lds.LDSFile;
import pt5.t;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f118056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f118057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f118058c;
    public final Lazy d;

    public q(wsg.n walletInteractor, r transactionsFiltersProvider, lu5.l revXFiatTransactionsFiltersProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsFiltersProvider, "transactionsFiltersProvider");
        Intrinsics.checkNotNullParameter(revXFiatTransactionsFiltersProvider, "revXFiatTransactionsFiltersProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f118056a = walletInteractor;
        this.f118057b = transactionsFiltersProvider;
        this.f118058c = featureToggleInteractor;
        this.d = yhm.j.b(new d8e.a(this, 18));
    }

    @Override // pt5.t
    public final efm.r a(CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode, ft5.a params) {
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency)) {
            return rd0.e.c(ft5.b.a(this.f118057b, null, new ft5.a(params.f137935a, params.f137936b, true), 1), kotlin.coroutines.g.f186406a);
        }
        xi0.b bVar = ((CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode).f71405a;
        boolean zA = cp5.d.A(bVar);
        wsg.n nVar = this.f118056a;
        w4l.h hVar = w4l.h.f294642c;
        return zA ? nim.a.w(nim.a.w(osg.b.g(nVar, hVar, null, null, io3.i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new a94.q(29, bVar)), new ds4.b(this, 18)) : nim.a.w(nim.a.w(osg.b.g(nVar, hVar, null, null, io3.i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new a94.q(28, bVar)), new doe.c(this, bVar, 17));
    }
}

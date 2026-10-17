package fif;

import d9.e1;
import fg8.e0;
import fg8.i0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import mlk.b0;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;
import tif.r;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements b {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tif.d f135410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f135411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final atg.l f135412c;
    public final qsg.b d;
    public final g31.h e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sjf.e f135413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lfm.c f135414h;
    public final fl3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fy1.r f135415j;
    public final wif.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f135416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fbj.a f135417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jla.h f135418n;
    public final AtomicReference o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gpk.c f135419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e0m.b f135420q;

    public m(tif.d transactionsDaoWrapper, r transactionMapperWrapper, atg.l unitedWalletRepository, qsg.b walletsRepository, g31.h transactionCategoriesRepository, b0 suspiciousTransactionInteractorAccessor, sjf.e transactionsPerformanceTracker, lfm.c dataCompositeDisposable, fl3.a contactsRepository, fy1.r apmRecipientsInteractor, wif.a userFeaturesChecker, gte.a featureToggleInteractor, fbj.a cryptoDepositsInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionMapperWrapper, "transactionMapperWrapper");
        Intrinsics.checkNotNullParameter(unitedWalletRepository, "unitedWalletRepository");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        Intrinsics.checkNotNullParameter(transactionCategoriesRepository, "transactionCategoriesRepository");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractorAccessor, "suspiciousTransactionInteractorAccessor");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(dataCompositeDisposable, "dataCompositeDisposable");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(apmRecipientsInteractor, "apmRecipientsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f135410a = transactionsDaoWrapper;
        this.f135411b = transactionMapperWrapper;
        this.f135412c = unitedWalletRepository;
        this.d = walletsRepository;
        this.e = transactionCategoriesRepository;
        this.f = suspiciousTransactionInteractorAccessor;
        this.f135413g = transactionsPerformanceTracker;
        this.f135414h = dataCompositeDisposable;
        this.i = contactsRepository;
        this.f135415j = apmRecipientsInteractor;
        this.k = userFeaturesChecker;
        this.f135416l = featureToggleInteractor;
        this.f135417m = cryptoDepositsInteractor;
        this.f135418n = productCatalogueInteractor;
        this.o = new AtomicReference();
        c load = new c(this, 7);
        Intrinsics.checkNotNullParameter(load, "load");
        gpk.c cVar = new gpk.c();
        cVar.f145463a = load;
        cVar.f145464b = new HashMap();
        cVar.f145465c = new ne0.h(cVar);
        this.f135419p = cVar;
        this.f135420q = new e0m.b(new es.e(this, 23));
    }

    public final efm.r a(efm.r rVar) {
        atg.l lVar = this.f135412c;
        efm.r rVarDistinctUntilChanged = nim.a.w(lVar.b(true), new arf.h(9)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarE = ue0.e.E(m70.a.e(rVarDistinctUntilChanged, new i0(13), new i0(14)), r0.g());
        efm.r rVarDistinctUntilChanged2 = nim.a.w(lVar.b(true), new arf.h(10)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarE2 = ue0.e.E(m70.a.e(rVarDistinctUntilChanged2, new i0(23), new i0(24)), r0.g());
        wog.a aVar = wog.a.TRANSACTION_CATEGORIES;
        wif.a aVar2 = this.k;
        efm.r rVarFlatMap = aVar2.d(aVar).flatMap(new e0(13, new c(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        z zVarD = ((sl3.k) this.i).d();
        fg8.g gVar = new fg8.g(20);
        h0 h0Var = h0.f322473a;
        efm.r rVarX = ue0.e.I(zVarD, h0Var, gVar).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        exe.j jVar = new exe.j(this.f135415j.a(), 3);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
        efm.r rVarH = ue0.e.H(rd0.e.c(jVar, gVar2), h0Var, new fg8.g(19));
        efm.r rVarFlatMap2 = aVar2.d(wog.a.CRYPTO_WITHDRAWALS).flatMap(new e0(11, new c(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        efm.r rVarSwitchMap = rd0.e.c(bla.b.b(this.f135418n, "CRYPTO_DEPOSIT"), gVar2).switchMap(new e0(12, new c(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r map = w.o(rVarFlatMap, rVarX, rVarH, rVarFlatMap2, rVarSwitchMap).map(new e0(10, new fg8.g(18)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarDistinctUntilChanged3 = e1.P(map, new g(r0.g(), r0.g(), r0.g(), r0.g(), r0.g()), this.o).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        efm.r map2 = w.n(rVar, rVarE, rVarE2, rVarDistinctUntilChanged3).map(new e0(25, new fg8.g(23))).map(new e0(26, new c(this, 8)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }
}

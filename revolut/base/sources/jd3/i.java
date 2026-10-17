package jd3;

import kotlin.jvm.internal.Intrinsics;
import od3.t0;
import rp0.k1;
import rp0.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements pfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f172965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd3.d f172966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6e.d f172967c;
    public final com.revolut.feature.rev_points.api.navigation.a d;
    public final id3.c e;
    public final bd3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f172968g;

    public i(t0 changeCurrencyBottomDialogProvider, nd3.d cashbackTransactionsFilterProvider, x6e.d subaccountEventProvider, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, id3.c cashbackCurrencyEventHandlerImpl, bd3.a cashbackInteractor, fk3.a configInteractor) {
        Intrinsics.checkNotNullParameter(changeCurrencyBottomDialogProvider, "changeCurrencyBottomDialogProvider");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(cashbackCurrencyEventHandlerImpl, "cashbackCurrencyEventHandlerImpl");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f172965a = changeCurrencyBottomDialogProvider;
        this.f172966b = cashbackTransactionsFilterProvider;
        this.f172967c = subaccountEventProvider;
        this.d = revPointsNavigationFactory;
        this.e = cashbackCurrencyEventHandlerImpl;
        this.f = cashbackInteractor;
        this.f172968g = configInteractor;
    }

    @Override // pfe.d
    public final pfe.c a(j60.a bottomDialogExtension, l0 popupMenuDialogDisplayer, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        return new h(bottomDialogExtension, this.f172965a, this.f172966b, this.f172967c, this.e, this.d, this.f, this.f172968g);
    }
}

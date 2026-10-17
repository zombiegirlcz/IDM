package vx5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllActivity;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllContract$Configuration;
import com.revolut.retail.wealth.resources.R$string;
import cu8.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import vrl.v0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends pri.b implements f {

    @NotNull
    public static final n Companion = new n();
    public static final List u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CryptoCommodityDiscoverAllContract$Configuration f292833h;
    public final xx5.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f292834j;
    public final ny5.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ny5.i f292835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f292836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f292837n;
    public final sy5.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tri.c f292838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f292839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oy5.b f292840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ny5.u f292841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final my5.b f292842t;

    static {
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.S;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.T;
        aVar.getClass();
        xi0.b bVar3 = xi0.b.V;
        aVar.getClass();
        u = zhm.v.k(bVar, bVar2, bVar3, xi0.b.U);
    }

    public x(CryptoCommodityDiscoverAllContract$Configuration configuration, xx5.c presentationModel, g router, ny5.c cryptoCommodityPartiallyPredefinedOrderSorter, ny5.i cryptoCommodityRateTilesPresenterDelegate, xpi.g navBarWithToolbarView, d mapper, sy5.c searchDelegate, tri.c backButtonView, r0 kycRequiredActionTransformer, oy5.b rateTilesRouter, ny5.u cryptoSorter, my5.b cryptoSortingPresenterDelegate) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(cryptoCommodityPartiallyPredefinedOrderSorter, "cryptoCommodityPartiallyPredefinedOrderSorter");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateTilesPresenterDelegate, "cryptoCommodityRateTilesPresenterDelegate");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(rateTilesRouter, "rateTilesRouter");
        Intrinsics.checkNotNullParameter(cryptoSorter, "cryptoSorter");
        Intrinsics.checkNotNullParameter(cryptoSortingPresenterDelegate, "cryptoSortingPresenterDelegate");
        this.f292833h = configuration;
        this.i = presentationModel;
        this.f292834j = router;
        this.k = cryptoCommodityPartiallyPredefinedOrderSorter;
        this.f292835l = cryptoCommodityRateTilesPresenterDelegate;
        this.f292836m = navBarWithToolbarView;
        this.f292837n = mapper;
        this.o = searchDelegate;
        this.f292838p = backButtonView;
        this.f292839q = kycRequiredActionTransformer;
        this.f292840r = rateTilesRouter;
        this.f292841s = cryptoSorter;
        this.f292842t = cryptoSortingPresenterDelegate;
    }

    public final efm.r N() {
        efm.r rVarSwitchMap = this.i.a(this.f292833h.f71586b).switchMap(new v0(25, new l(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r O(List list, boolean z) {
        List list2;
        if (this.f292833h.f71586b == zx5.a.CRYPTO) {
            efm.r rVarSwitchMap = ((my5.i) this.f292842t).f210348h.c().switchMap(new v0(28, new pud.b(this, list, z, 25)));
            Intrinsics.h(rVarSwitchMap);
            return rVarSwitchMap;
        }
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            list2 = null;
        } else {
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                if (cp5.d.y((xi0.b) it8.next())) {
                    list2 = u;
                    break;
                }
            }
            list2 = null;
        }
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return ny5.d.e(this.f292835l, this.k.a(list, list2), gw5.a.ROWS, null, 56);
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        int[] iArr;
        int i;
        int i2;
        efm.r rVarSwitchMap;
        efm.r rVarEmpty;
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f292836m;
        cVar.e0(numValueOf);
        CryptoCommodityDiscoverAllContract$Configuration cryptoCommodityDiscoverAllContract$Configuration = this.f292833h;
        cVar.n0(new TextLocalisedClause(cryptoCommodityDiscoverAllContract$Configuration.f71587c, null, null, 14));
        cVar.p0(new TextLocalisedClause(cryptoCommodityDiscoverAllContract$Configuration.f71587c, null, null, 14));
        zx5.a aVar2 = cryptoCommodityDiscoverAllContract$Configuration.f71586b;
        int[] iArr2 = o.f292823a;
        int i3 = iArr2[aVar2.ordinal()];
        int i5 = 7;
        final int i6 = 0;
        ifm.b bVar = this.f239031a;
        if (i3 == 1) {
            final sy5.c delegate = this.o;
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            NavBarWithToolbar bar = ((CryptoCommodityDiscoverAllActivity) view).f154555r0.b();
            sy5.b bVar2 = sy5.c.Companion;
            f0 menuItems = f0.f322471a;
            ifm.b bVar3 = delegate.f137706c;
            Intrinsics.checkNotNullParameter(bar, "bar");
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            delegate.i = bar;
            bar.j0(false);
            bar.setHint(new TextLocalisedClause(R$string.wealth_stocks_search_hint, null, null, 14));
            bar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            bar.setMenuItems(menuItems);
            bar.H0(false);
            bar.setSearchButtonActive(true);
            bVar3.d();
            NavBarWithToolbar navBarWithToolbar = delegate.i;
            if (navBarWithToolbar == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            ihm.f fVar = navBarWithToolbar.f59409p.f57336l;
            Function1 function1 = new Function1() { // from class: sy5.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.N();
                            break;
                        case 1:
                            String it8 = (String) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            delegate.k.onNext(it8);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.f266625j.onNext(Boolean.TRUE);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1M = delegate.M();
            Function0 function0L = delegate.L();
            iArr = iArr2;
            efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new n1i.b(17, new ry7.j(new BreadcrumbException(), 18)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(16, function1), new o0(16, function1M), new z(29, function0L));
            te0.w.j0(bVar3, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
            NavBarWithToolbar navBarWithToolbar2 = delegate.i;
            if (navBarWithToolbar2 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            ihm.f fVar2 = navBarWithToolbar2.o.f57403b;
            final int i21 = 1;
            Function1 function12 = new Function1() { // from class: sy5.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i21) {
                        case 0:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.N();
                            break;
                        case 1:
                            String it8 = (String) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            delegate.k.onNext(it8);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.f266625j.onNext(Boolean.TRUE);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1M2 = delegate.M();
            Function0 function0L2 = delegate.L();
            efm.r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new n1i.b(17, new ry7.j(new BreadcrumbException(), 19)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(16, function12), new o0(16, function1M2), new z(29, function0L2));
            te0.w.j0(bVar3, cVarSubscribe2);
            Intrinsics.h(cVarSubscribe2);
            NavBarWithToolbar navBarWithToolbar3 = delegate.i;
            if (navBarWithToolbar3 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            efm.r rVarV0 = navBarWithToolbar3.v0();
            final int i22 = 2;
            Function1 function13 = new Function1() { // from class: sy5.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i22) {
                        case 0:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.N();
                            break;
                        case 1:
                            String it8 = (String) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            delegate.k.onNext(it8);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                            delegate.f266625j.onNext(Boolean.TRUE);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1M3 = delegate.M();
            Function0 function0L3 = delegate.L();
            efm.r rVarOnErrorResumeNext3 = rVarV0.onErrorResumeNext(new n1i.b(17, new ry7.j(new BreadcrumbException(), 20)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(16, function13), new o0(16, function1M3), new z(29, function0L3));
            te0.w.j0(bVar3, cVarSubscribe3);
            Intrinsics.h(cVarSubscribe3);
            TextLocalisedClause hint = new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_discovery_search_placeholder, null, null, 14);
            Intrinsics.checkNotNullParameter(hint, "hint");
            NavBarWithToolbar navBarWithToolbar4 = delegate.i;
            if (navBarWithToolbar4 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            navBarWithToolbar4.setHint(hint);
            NavBarWithToolbar navBarWithToolbar5 = delegate.i;
            if (navBarWithToolbar5 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            pfm.h hVarB = te0.w.b(navBarWithToolbar5.f59410q, new l(this, 5));
            Function1 function1K = K();
            pfm.a aVar3 = new pfm.a(hVarB, new nw8.d(15, new r(new BreadcrumbException(), 3)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar3.w(new ly7.g(24, function1K), new t1i.n(11, u.f292830a));
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            te0.w.j0(bVar, hVarW);
            v60.i searchActiveSubject = delegate.f266625j;
            Intrinsics.checkNotNullExpressionValue(searchActiveSubject, "searchActiveSubject");
            qfm.r0 r0VarD = te0.w.D(searchActiveSubject, new vsl.f(1, this.i, e.class, "onSearchActiveChange", "onSearchActiveChange(Z)Lio/reactivex/Completable;", 0, 5));
            Function1 function1K2 = K();
            pfm.a aVar4 = new pfm.a(r0VarD, new nw8.d(15, new r(new BreadcrumbException(), 4)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
            ofm.h hVarW2 = aVar4.w(new ly7.g(24, function1K2), new t1i.n(11, v.f292831a));
            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
            te0.w.j0(bVar, hVarW2);
            NavBarWithToolbar navBarWithToolbar6 = delegate.i;
            if (navBarWithToolbar6 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            qfm.r0 r0VarD2 = te0.w.D(navBarWithToolbar6.f59409p.f57337m, new vsl.f(1, this.i, e.class, "onSearchTextChange", "onSearchTextChange(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 6));
            Function1 function1K3 = K();
            pfm.a aVar5 = new pfm.a(r0VarD2, new nw8.d(15, new r(new BreadcrumbException(), 5)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
            ofm.h hVarW3 = aVar5.w(new ly7.g(24, function1K3), new t1i.n(11, w.f292832a));
            Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
            te0.w.j0(bVar, hVarW3);
            pfm.h hVarB2 = te0.w.b(this.f292838p.f273801b, new l(this, 6));
            Function1 function1K4 = K();
            pfm.a aVar6 = new pfm.a(hVarB2, new nw8.d(15, new r(new BreadcrumbException(), 1)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
            ofm.h hVarW4 = aVar6.w(new ly7.g(24, function1K4), new t1i.n(11, s.f292828a));
            Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
            te0.w.j0(bVar, hVarW4);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qfm.r0 r0VarD3 = te0.w.D(cVar.Q(), new l(this, i5));
            Function1 function1K5 = K();
            pfm.a aVar7 = new pfm.a(r0VarD3, new nw8.d(15, new r(new BreadcrumbException(), 2)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
            ofm.h hVarW5 = aVar7.w(new ly7.g(24, function1K5), new t1i.n(11, t.f292829a));
            Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
            te0.w.j0(bVar, hVarW5);
            iArr = iArr2;
        }
        CryptoCommodityDiscoverAllActivity cryptoCommodityDiscoverAllActivity = (CryptoCommodityDiscoverAllActivity) view;
        efm.r rVarFilter = cryptoCommodityDiscoverAllActivity.f71582v0.f53218h.filter(new v0(29, new vw4.j(6)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        qfm.r0 r0VarD4 = te0.w.D(rVarFilter, new l(this, 4));
        Function1 function1K6 = K();
        pfm.a aVar8 = new pfm.a(r0VarD4, new nw8.d(15, new r(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new ly7.g(24, function1K6), new t1i.n(11, q.f292825a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        int i32 = iArr[aVar2.ordinal()];
        xx5.c cVar2 = this.i;
        if (i32 != 1) {
            i = 2;
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVarSwitchMap = N();
            i2 = 0;
        } else {
            i = 2;
            xx5.a aVar9 = cVar2.f309402a;
            te0.e value = aVar9.f309399b.getValue(aVar9, xx5.a.f309398g[0]);
            te0.s sVar = te0.s.f270018a;
            efm.r map = te0.w.l(value.c(sVar), aVar9.w0().c(sVar)).map(new xt1.a(26, new xub.e(23)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            i2 = 0;
            rVarSwitchMap = map.switchMap(new v0(24, new l(this, i2)));
        }
        Intrinsics.h(rVarSwitchMap);
        efm.r rVarF = o70.a.f(rVarSwitchMap);
        vsl.f fVar3 = new vsl.f(1, view, i.class, "setItems", "setItems(Ljava/util/List;)V", 0, 4);
        Function1 function1K7 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext4 = rVarF.onErrorResumeNext(new nw8.d(15, new up5.s(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new ly7.g(24, fVar3), new ly7.g(24, function1K7), new t1i.n(11, function0J));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        qfm.r0 r0VarD5 = te0.w.D(cryptoCommodityDiscoverAllActivity.f154555r0.a().o, new l(this, 8));
        Function1 function1K8 = K();
        pfm.a aVar10 = new pfm.a(r0VarD5, new nw8.d(15, new up5.s(new BreadcrumbException(), 28)), i);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar10.w(new ly7.g(24, function1K8), new t1i.n(11, p.f292824a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        if (aVar2 == zx5.a.COMMODITIES) {
            rVarEmpty = zi0.c.q(nim.a.w(((zj3.a) cVar2.d).b(), new xub.e(24)), Boolean.FALSE).map(new m(new vw4.j(7), 0));
            Intrinsics.h(rVarEmpty);
        } else {
            rVarEmpty = efm.r.empty();
            Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        }
        efm.r rVarF2 = o70.a.f(rVarEmpty);
        vq5.x xVar = new vq5.x(view, 29);
        Function1 function1K9 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF2.onErrorResumeNext(new nw8.d(15, new r(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new ly7.g(24, xVar), new ly7.g(24, function1K9), new t1i.n(11, function0J2));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        ((pri.c) this.f292842t).C(view);
    }
}

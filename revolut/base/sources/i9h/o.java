package i9h;

import au6.k0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsActivity;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import com.revolut.retail.wealth.resources.R$string;
import i2i.d0;
import i9g.e0;
import i9g.f0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends pri.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f159862s = zhm.v.k(u.MOST_TRADED, u.MOST_BOUGHT, u.MOST_SOLD);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f159863t = zhm.v.k(v.ONE_DAY, v.ONE_WEEK, v.ONE_MONTH, v.ONE_YEAR);
    public final MostTradedAssetsScreenContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f159864j;
    public final r10.q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qah.c f159865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f159866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f159867n;
    public final dqi.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o9h.e f159868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f159869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f159870r;

    public o(MostTradedAssetsScreenContract$Configuration configuration, d mapper, r10.q presentationModel, qah.c router, xpi.g navBarWithToolbarView, opi.d expandableDialogView, dqi.k recyclerViewScrollView, o9h.e footerDisclosurePresenterDelegate) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(recyclerViewScrollView, "recyclerViewScrollView");
        Intrinsics.checkNotNullParameter(footerDisclosurePresenterDelegate, "footerDisclosurePresenterDelegate");
        this.i = configuration;
        this.f159864j = mapper;
        this.k = presentationModel;
        this.f159865l = router;
        this.f159866m = navBarWithToolbarView;
        this.f159867n = expandableDialogView;
        this.o = recyclerViewScrollView;
        this.f159868p = footerDisclosurePresenterDelegate;
        P(zhm.u.c(footerDisclosurePresenterDelegate));
        yhm.k kVar = yhm.k.NONE;
        final int i = 0;
        this.f159869q = yhm.j.c(kVar, new Function0(this) { // from class: i9h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f159856b;

            {
                this.f159856b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((qah.d) ((q) this.f159856b.k.f250849b)).w0().c(te0.s.f270018a);
                    default:
                        return ((qah.d) ((q) this.f159856b.k.f250849b)).x0().c(te0.s.f270018a);
                }
            }
        });
        final int i2 = 1;
        this.f159870r = yhm.j.c(kVar, new Function0(this) { // from class: i9h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f159856b;

            {
                this.f159856b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((qah.d) ((q) this.f159856b.k.f250849b)).w0().c(te0.s.f270018a);
                    default:
                        return ((qah.d) ((q) this.f159856b.k.f250849b)).x0().c(te0.s.f270018a);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        efm.r rVarN;
        r view = (r) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        MostTradedAssetsScreenContract$Configuration configuration = this.i;
        boolean z = configuration instanceof MostTradedAssetsScreenContract$Configuration.Cfd;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_most_traded_title, null, null, 14);
        } else {
            if (!(configuration instanceof MostTradedAssetsScreenContract$Configuration.Crypto) && !(configuration instanceof MostTradedAssetsScreenContract$Configuration.Stock)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_most_traded_title, null, null, 14);
        }
        xpi.c cVar = (xpi.c) this.f159866m;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        boolean z3 = configuration instanceof MostTradedAssetsScreenContract$Configuration.Stock;
        if (z3) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_most_traded_stocks_description_v2, null, null, 14);
        } else if (z) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_margin_most_traded_description, null, null, 14);
        } else {
            if (!(configuration instanceof MostTradedAssetsScreenContract$Configuration.Crypto)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_most_traded_crypto_description, null, null, 14);
        }
        cVar.f0(textLocalisedClause2);
        cVar.l0(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        r0 r0VarD = w.D(cVar.Q(), new f(this, 5));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new a08.r(24, new d0(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a0d.g(18, function1K), new ea9.c(25, k.f159858a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.r rVarSwitchMap = w.a0(navBarWithToolbar.s0(), new e0(6)).switchMap(new f0(8, new f(this, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r0 r0VarD2 = w.D(rVarSwitchMap, new i4g.g(1, this.f159867n, opi.d.class, "showOrUpdateIfVisible", "showOrUpdateIfVisible(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)Lio/reactivex/Completable;", 0, 4));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new a08.r(24, new d0(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(18, function1K2), new ea9.c(25, l.f159859a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        MostTradedAssetsActivity mostTradedAssetsActivity = (MostTradedAssetsActivity) view;
        pfm.r rVarG = o70.a.g(w.D(((SingleChoiceDelegate) mostTradedAssetsActivity.A0.getValue()).p(), new f(this, 1)));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(rVarG, new a08.r(24, new d0(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(18, function1K3), new ea9.c(25, m.f159860a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.r rVarMerge = efm.r.merge(w.a0(mostTradedAssetsActivity.f95526w0.f53218h, new e0(7)), w.a0(mostTradedAssetsActivity.f95527x0.d, new e0(8)), w.a0(mostTradedAssetsActivity.y0.d.f121375b, new e0(9)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        r0 r0VarD3 = w.D(rVarMerge, new f(this, 2));
        Function1 function1K4 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new a08.r(24, new d0(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a0d.g(18, function1K4), new ea9.c(25, n.f159861a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.r map = w.l((efm.r) this.f159869q.getValue(), (efm.r) this.f159870r.getValue()).map(new f0(9, new f(this, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        j jVar = new j(1, 0, xpi.g.class, this.f159866m, "setActions", "setActions(Ljava/util/List;)V");
        Function1 function1K5 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.r(24, new d0(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(18, jVar), new a0d.g(18, function1K5), new ea9.c(25, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r10.q qVar = this.k;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        qah.d dVar = (qah.d) ((q) qVar.f250849b);
        te0.e eVarX0 = dVar.x0();
        te0.s sVar = te0.s.f270018a;
        efm.r rVarSwitchMap2 = w.l(eVarX0.c(sVar), dVar.w0().c(sVar)).switchMap(new f0(13, new i25.e(qVar, configuration, 12)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarH = m70.a.h(zi0.c.o(rVarSwitchMap2), new hnc.a(this, 23), null, new k0(this, 4), 2);
        if (configuration instanceof MostTradedAssetsScreenContract$Configuration.Crypto) {
            rVarN = null;
        } else {
            o9h.e eVar = this.f159868p;
            if (z) {
                rVarN = eVar.N(new p0h.e(z.CFD, 2));
            } else {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarN = eVar.N(new p0h.e(null, 3));
            }
        }
        efm.r[] elements = {rVarH, rVarN};
        Intrinsics.checkNotNullParameter(elements, "elements");
        efm.r map2 = w.w(kotlin.collections.d.L(elements)).map(new f0(12, new e0(5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarF2 = o70.a.f(map2);
        Intrinsics.checkNotNullParameter(rVarF2, "<this>");
        dqi.k recyclerViewScrollView = this.o;
        Intrinsics.checkNotNullParameter(recyclerViewScrollView, "recyclerViewScrollView");
        efm.r rVarScan = rVarF2.scan(new a9j.j(new a2g.a(recyclerViewScrollView, 10), 13));
        Intrinsics.checkNotNullExpressionValue(rVarScan, "scan(...)");
        i4g.g gVar = new i4g.g(1, view, r.class, "setItems", "setItems(Ljava/util/List;)V", 0, 5);
        Function1 function1K6 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarScan.onErrorResumeNext(new a08.r(24, new d0(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(18, gVar), new a0d.g(18, function1K6), new ea9.c(25, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}

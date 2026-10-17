package nae;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.R$dimen;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsActivity;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsContract$Configuration;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import ip0.pb0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n33.p1;
import n8i.q0;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends pri.b implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pae.a f213878h;
    public final xpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qae.b f213879j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tpi.j f213880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pae.e f213881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f213882n;
    public final ypi.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dqi.k f213883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rpi.c f213884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c90.c f213885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MarkRecurringTransactionsContract$Configuration f213886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qae.a f213887t;
    public final gte.a u;
    public final k3l.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final IconNavBarMenuItem f213888w;

    public q(pae.a router, xpi.g navBarView, qae.b mapper, f9b.f errorView, tpi.j progressView, pae.e presentationModel, opi.d expandableDialogView, ypi.i nextButtonView, dqi.k recyclerViewScrollView, rpi.c keyboardView, c90.c uiResouces, MarkRecurringTransactionsContract$Configuration configuration, qae.a bottomDialogProvider, gte.a featureToggleInteractor, k3l.b statusDialogView) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(recyclerViewScrollView, "recyclerViewScrollView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(uiResouces, "uiResouces");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(bottomDialogProvider, "bottomDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        this.f213878h = router;
        this.i = navBarView;
        this.f213879j = mapper;
        this.k = errorView;
        this.f213880l = progressView;
        this.f213881m = presentationModel;
        this.f213882n = expandableDialogView;
        this.o = nextButtonView;
        this.f213883p = recyclerViewScrollView;
        this.f213884q = keyboardView;
        this.f213885r = uiResouces;
        this.f213886s = configuration;
        this.f213887t = bottomDialogProvider;
        this.u = featureToggleInteractor;
        this.v = statusDialogView;
        this.f213888w = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
    }

    @Override // pri.b
    public final void M(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f213879j.getClass();
        pb0[] pb0VarArr = new pb0[5];
        for (int i = 0; i < 5; i++) {
            pb0VarArr[i] = new pb0(a0.d.n("LIST_ID_LOADING_", i));
        }
        List listV0 = kotlin.collections.d.v0(pb0VarArr);
        yp0.b.k(listV0, 0, 0, 0, 0, 31);
        ((MarkRecurringTransactionsActivity) view).setItems(listV0);
        this.o.setVisible(false);
        N(false);
    }

    public final void N(boolean z) {
        int iW;
        c90.c cVar = this.f213885r;
        if (z) {
            iW = kli.a.w(R$attr.uikit_dp16, cVar.f22265a) + cVar.f22265a.getResources().getDimensionPixelSize(R$dimen.next_button_padding);
        } else {
            iW = kli.a.w(R$attr.uikit_dp16, cVar.f22265a);
        }
        i iVar = (i) L();
        if (iVar != null) {
            MarkRecurringTransactionsActivity markRecurringTransactionsActivity = (MarkRecurringTransactionsActivity) iVar;
            RecyclerView recyclerViewZ0 = markRecurringTransactionsActivity.Z0();
            recyclerViewZ0.setPadding(recyclerViewZ0.getPaddingLeft(), recyclerViewZ0.getPaddingTop(), recyclerViewZ0.getPaddingRight(), iW);
            markRecurringTransactionsActivity.Z0().setClipToPadding(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        int i = R$string.subscriptions_mark_as_subscription_title;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        xpi.c cVar = (xpi.c) this.i;
        cVar.n0(textLocalisedClause);
        cVar.p0(new TextLocalisedClause(i, null, null, 14));
        cVar.Y(new TextLocalisedClause(R$string.subscriptions_mark_as_subscription_subtitle, null, null, 14));
        cVar.Z(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        r rVarDistinctUntilChanged = ((dqi.g) this.f213883p).f117002m.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF = o70.a.f(rVarDistinctUntilChanged);
        k kVar = new k(this, 10);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(4, kVar), new m3l.d(4, function1K), new j7a.j(18, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        MarkRecurringTransactionsContract$Configuration markRecurringTransactionsContract$Configuration = this.f213886s;
        AccountId accountId = markRecurringTransactionsContract$Configuration.f89215a;
        String str = markRecurringTransactionsContract$Configuration.f89216b;
        pae.e eVar = this.f213881m;
        r map = w.v0(eVar.a(accountId, str)).map(new a(new k(this, 4), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF2 = o70.a.f(map);
        v9 v9Var = new v9(1, view, i.class, "setItems", "setItems(Ljava/util/List;)V", 0, 25);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new m3l.d(4, v9Var), new m3l.d(4, function1K2), new j7a.j(18, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        r rVarF3 = o70.a.f(eVar.a(markRecurringTransactionsContract$Configuration.f89215a, str));
        k kVar2 = new k(this, 5);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new m3l.d(4, kVar2), new m3l.d(4, function1K3), new j7a.j(18, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        MarkRecurringTransactionsActivity markRecurringTransactionsActivity = (MarkRecurringTransactionsActivity) view;
        r rVarF4 = o70.a.f(((SelectableDelegate) markRecurringTransactionsActivity.f89212v0.getValue()).r());
        k kVar3 = new k(this, 6);
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = rVarF4.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new m3l.d(4, kVar3), new m3l.d(4, function1K4), new j7a.j(18, function0J4));
        w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r rVarFilter = ((opi.b) this.f213882n).R().filter(new a(new q0(9), 9));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new k(this, 7));
        Function1 function1K5 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new lhi.b(8, new p1(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new m3l.d(4, function1K5), new j7a.j(18, l.f213873a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r0 r0VarD2 = w.D(((LargeActionButtonDelegate) markRecurringTransactionsActivity.f89213w0.getValue()).d.f121375b, new k(this, 8));
        Function1 function1K6 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new lhi.b(8, new p1(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new m3l.d(4, function1K6), new j7a.j(18, m.f213874a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r0 r0VarD3 = w.D(this.o.s(), new k(this, 9));
        Function1 function1K7 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new lhi.b(8, new p1(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new m3l.d(4, function1K7), new j7a.j(18, n.f213875a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r map2 = ((pae.h) eVar.f234543c).x0().c(te0.q.f270015a).map(new p8k.b(11, new p5a.m(25)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarF5 = o70.a.f(map2);
        k kVar4 = new k(this, 11);
        Function1 function1K8 = K();
        Function0 function0J5 = J();
        r rVarOnErrorResumeNext5 = rVarF5.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new m3l.d(4, kVar4), new m3l.d(4, function1K8), new j7a.j(18, function0J5));
        w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        r rVarF6 = o70.a.f(cVar.b());
        k kVar5 = new k(this, 12);
        Function1 function1K9 = K();
        Function0 function0J6 = J();
        r rVarOnErrorResumeNext6 = rVarF6.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new m3l.d(4, kVar5), new m3l.d(4, function1K9), new j7a.j(18, function0J6));
        w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        r rVarF7 = o70.a.f(navBarWithToolbar.f59409p.f57336l);
        k kVar6 = new k(this, 13);
        Function1 function1K10 = K();
        Function0 function0J7 = J();
        r rVarOnErrorResumeNext7 = rVarF7.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new m3l.d(4, kVar6), new m3l.d(4, function1K10), new j7a.j(18, function0J7));
        w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        pfm.h hVarB = w.b(cVar.Q(), new k(this, 14));
        Function1 function1K11 = K();
        pfm.a aVar5 = new pfm.a(hVarB, new lhi.b(8, new p1(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new m3l.d(4, function1K11), new j7a.j(18, o.f213876a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        NavBarWithToolbar navBarWithToolbar2 = cVar.f307974j;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        r rVarDebounce = navBarWithToolbar2.f59409p.f57337m.debounce(250L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        r rVarF8 = o70.a.f(rVarDebounce);
        k kVar7 = new k(this, 1);
        Function1 function1K12 = K();
        Function0 function0J8 = J();
        r rVarOnErrorResumeNext8 = rVarF8.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new m3l.d(4, kVar7), new m3l.d(4, function1K12), new j7a.j(18, function0J8));
        w.j0(bVar, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        r rVarF9 = o70.a.f(cVar.f307975l);
        k kVar8 = new k(this, 2);
        Function1 function1K13 = K();
        Function0 function0J9 = J();
        r rVarOnErrorResumeNext9 = rVarF9.onErrorResumeNext(new lhi.b(8, new p1(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new m3l.d(4, kVar8), new m3l.d(4, function1K13), new j7a.j(18, function0J9));
        w.j0(bVar, cVarSubscribe9);
        Intrinsics.h(cVarSubscribe9);
        efm.b bVarFlatMapCompletable = ((k3l.d) this.v).f180813j.filter(new a(new q0(8), 5)).flatMapCompletable(new a(new k(this, 3), 6));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K14 = K();
        lhi.b bVar2 = new lhi.b(8, new p1(new BreadcrumbException(), 25));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable, bVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new m3l.d(4, function1K14), new j7a.j(18, p.f213877a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
    }
}

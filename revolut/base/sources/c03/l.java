package c03;

import a08.f0;
import a08.g0;
import bs9.i0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementActivity;
import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementContract$Configuration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import tx0.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xpi.g f20130h;
    public final ypi.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final opi.d f20131j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f20132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f20133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExpectationManagementContract$Configuration f20134n;
    public final w o;

    public l(xpi.g navBarWithToolbarView, ypi.i nextButtonView, opi.d bottomDialogView, m router, q expectationsContentProvider, o bottomDialogMapper, ExpectationManagementContract$Configuration config, w presentationModel) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expectationsContentProvider, "expectationsContentProvider");
        Intrinsics.checkNotNullParameter(bottomDialogMapper, "bottomDialogMapper");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f20130h = navBarWithToolbarView;
        this.i = nextButtonView;
        this.f20131j = bottomDialogView;
        this.k = router;
        this.f20132l = expectationsContentProvider;
        this.f20133m = bottomDialogMapper;
        this.f20134n = config;
        this.o = presentationModel;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        w wVar = this.o;
        wVar.getClass();
        ExpectationManagementContract$Configuration configuration = this.f20134n;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        n nVar = (n) wVar.f20149c;
        if (!nVar.w0().isInitialized()) {
            nVar.w0().set(configuration.f64853b);
        }
        ExpectationManagementActivity expectationManagementActivity = (ExpectationManagementActivity) view;
        efm.r map = ((LargeActionButtonDelegate) expectationManagementActivity.f64850t0.getValue()).d.f121375b.map(new i0(25, new bxg.t(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarDoOnNext = map.doOnNext(new i0(28, new e(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r0 r0VarD = te0.w.D(rVarDoOnNext, new e(this, 3));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new g0(5, new b9i.h(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new f0(3, function1K), new a08.q(14, g.f20125a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        p pVarA = ((r) this.f20132l).a(configuration.f64852a);
        TextLocalisedClause textLocalisedClause = pVarA.f20138a;
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f20130h;
        cVar.e0(numValueOf);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.Z(true);
        cVar.Y(pVarA.f20139b);
        TextLocalisedClause textLocalisedClause2 = pVarA.f20140c;
        ypi.i iVar = this.i;
        iVar.f(textLocalisedClause2);
        r0 r0VarD2 = te0.w.D(iVar.s(), new e(this, 4));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new g0(5, new b9i.h(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new f0(3, function1K2), new a08.q(14, k.f20129a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        expectationManagementActivity.setItems(pVarA.d);
        efm.r rVarFilter = o70.a.f(wVar.d.f).filter(new i0(29, new bxg.t(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD3 = te0.w.D(rVarFilter, new e(this, 5));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new g0(5, new b9i.h(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new f0(3, function1K3), new a08.q(14, h.f20126a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r rVarFilter2 = o70.a.f(wVar.e.f).filter(new i0(26, new bxg.t(27)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        r0 r0VarD4 = te0.w.D(rVarFilter2, new e(this, 1));
        Function1 function1K4 = K();
        pfm.a aVar5 = new pfm.a(r0VarD4, new g0(5, new b9i.h(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new f0(3, function1K4), new a08.q(14, i.f20127a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.r rVarFilter3 = o70.a.f(wVar.f.f).filter(new i0(27, new bxg.t(28)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        r0 r0VarD5 = te0.w.D(rVarFilter3, new e(this, 2));
        Function1 function1K5 = K();
        pfm.a aVar6 = new pfm.a(r0VarD5, new g0(5, new b9i.h(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new f0(3, function1K5), new a08.q(14, j.f20128a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
    }
}

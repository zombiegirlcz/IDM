package nz7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.hub.screen.PetHubFragment;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kx7.y0;
import nii.o0;
import ny7.t;
import nya.b0;
import nyb.h0;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f220986j;
    public final vy7.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vy7.b f220987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oz7.d f220988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f220989n;
    public final mm.d o;

    public p(xpi.g navBarWithToolbarView, vy7.g presentationModel, vy7.b router, oz7.d uiBuilder, f9b.f errorView, mm.d actionDispatcher) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f220986j = navBarWithToolbarView;
        this.k = presentationModel;
        this.f220987l = router;
        this.f220988m = uiBuilder;
        this.f220989n = errorView;
        this.o = actionDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        xpi.c cVar = (xpi.c) this.f220986j;
        cVar.e0(numValueOf);
        vy7.g gVar = this.k;
        w4l.f fVar = (w4l.f) ((kx7.f) gVar.f293250c.f138765a).d.getValue();
        Unit unit = Unit.f186387a;
        r map = w.m(m70.a.e(ue0.e.E(nim.a.w(fVar.f(unit, true), new fwf.n(6)), zi0.c.P(f0.f322471a, false, null, 3)), new nsl.d(29), new g(0)), m70.a.e(((y0) gVar.f293249b.f138760a).a().f(unit, true), new g(1), new nsl.d(26)), m70.a.e(nim.a.w(((w4l.f) gVar.d.f138767a.d.getValue()).f(unit, false), new vw4.j(24)), new nsl.d(27), new nsl.d(28))).map(new h0(6, new nyb.m(18))).map(new h0(7, new f(this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarN = hx7.a.N(o70.a.f(map), this.f220989n, false, false);
        b0 b0Var = new b0(view, 12);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new o0(2, new t(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        lhi.b bVar = new lhi.b(12, b0Var);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(bVar, new lhi.b(12, sVar), new j7a.j(23, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar2 = new pfm.a(w.D(cVar.b(), new f(this, 5)), new o0(2, new t(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(12, sVar), new j7a.j(23, l.f220982a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
        PetHubFragment petHubFragment = (PetHubFragment) view;
        r rVarP = ((ProductSelectionDelegate) petHubFragment.l0.getValue()).p();
        m function = m.f220983a;
        Intrinsics.checkNotNullParameter(function, "function");
        r rVarFilter = rVarP.filter(new nd.n(2));
        n function2 = n.f220984a;
        Intrinsics.checkNotNullParameter(function2, "function");
        r map2 = rVarFilter.map(new nd.m(2));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        pfm.a aVar3 = new pfm.a(w.D(map2, new f(this, 0)), new o0(2, new t(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new lhi.b(12, sVar), new j7a.j(23, o.f220985a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        pfm.a aVar4 = new pfm.a(w.D(((BannerDelegate) petHubFragment.f76340h0.getValue()).f51699c, new f(this, 2)), new o0(2, new t(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new lhi.b(12, sVar), new j7a.j(23, h.f220978a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(((BigTileDelegate) petHubFragment.i0.getValue()).f, new f(this, 6)), new o0(2, new t(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new lhi.b(12, sVar), new j7a.j(23, i.f220979a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        pfm.a aVar6 = new pfm.a(w.D(((DatePickerDelegate) petHubFragment.f76341k0.getValue()).f52176c.f121375b, new f(this, 3)), new o0(2, new t(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new lhi.b(12, sVar), new j7a.j(23, j.f220980a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        r rVarFilter2 = ((LargeActionButtonDelegate) petHubFragment.j0.getValue()).d.f121375b.filter(new h0(5, new nyb.m(17)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        pfm.a aVar7 = new pfm.a(w.D(rVarFilter2, new f(this, 4)), new o0(2, new t(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new lhi.b(12, sVar), new j7a.j(23, k.f220981a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
    }
}

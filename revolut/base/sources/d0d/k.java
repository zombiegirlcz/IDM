package d0d;

import a08.g0;
import a08.o0;
import a08.q;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.selfserve.sow.impl.ui.home.SowHomeActivity;
import com.revolut.feature.selfserve.sow.impl.ui.stories.SowRemoteStoriesKey;
import cu8.u;
import cu8.u0;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ox5.t0;
import ozc.t;
import pfm.z;
import sri.m;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f110349j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mxc.b f110350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wpi.e f110351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f110352n;
    public final tri.c o;

    public k(ozc.d presentationModel, a mapper, mxc.b errorItemsFactory, wpi.e navBarWithBigTileView, m navigator, tri.c backButtonView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
        Intrinsics.checkNotNullParameter(navBarWithBigTileView, "navBarWithBigTileView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        this.f110349j = presentationModel;
        this.k = mapper;
        this.f110350l = errorItemsFactory;
        this.f110351m = navBarWithBigTileView;
        this.f110352n = navigator;
        this.o = backButtonView;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        kza.a aVar2 = ((t) this.f110349j).d;
        d0 d0VarFirstOrError = aVar2.a(SowRemoteStoriesKey.SOW_HARD_LOCK).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarFirstOrError2 = aVar2.a(SowRemoteStoriesKey.SOW_SOFT_LOCK).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        d0 d0VarFirstOrError3 = aVar2.a(SowRemoteStoriesKey.SOW_NON_LOCK).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
        z zVarO = new ufm.i(w.I0(d0VarFirstOrError, d0VarFirstOrError2, d0VarFirstOrError3), new oy9.b(new t0(28), 26), 1).o(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        r map = new sfm.b(new rfm.j(zVarO, new u0(24, new cw7.j(28)), 0), new u0(25, new g(this, 6)), 1).map(new u0(26, new cw7.j(this, 29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        g gVar = new g(this, 1);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new o0(8, new u(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        g0 g0Var = new g0(8, gVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(g0Var, new g0(8, sVar), new q(23, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        NavBarWithBigTile navBarWithBigTile = ((wpi.b) this.f110351m).f299341j;
        if (navBarWithBigTile == null) {
            Intrinsics.r("navBarWithBigTileView");
            throw null;
        }
        r rVarMergeWith = navBarWithBigTile.f59357t.mergeWith(this.o.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        g gVar2 = new g(this, 2);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarMergeWith.onErrorResumeNext(new o0(8, new u(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new g0(8, gVar2), new g0(8, sVar), new q(23, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        SowHomeActivity sowHomeActivity = (SowHomeActivity) view;
        efm.b bVarSwitchMapCompletable = ((ErrorDelegate) sowHomeActivity.f85965w0.getValue()).f52226c.switchMapCompletable(new u0(21, new g(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        o0 o0Var = new o0(8, new u(new BreadcrumbException(), 21));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new g0(8, sVar), new q(23, i.f110347a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        efm.b bVarQ = Q();
        o0 o0Var2 = new o0(8, new u(new BreadcrumbException(), 22));
        bVarQ.getClass();
        pfm.a aVar4 = new pfm.a(bVarQ, o0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new g0(8, sVar), new q(23, j.f110348a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ihm.f fVar = ((RowDelegate) sowHomeActivity.f85966x0.getValue()).f53218h;
        g gVar3 = new g(this, 4);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = fVar.onErrorResumeNext(new o0(8, new u(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new g0(8, gVar3), new g0(8, sVar), new q(23, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }

    public final efm.b Q() {
        t tVar = (t) this.f110349j;
        r rVarU3 = tVar.u3();
        nzc.d dVar = (nzc.d) tVar.f231330c.f185148b;
        r map = w.m(rVarU3, nim.a.w(dVar.f221021h.f(Unit.f186387a, true), new nzc.b(dVar, 7)), tVar.f231330c.i()).map(new u0(22, new g(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarIgnoreElements = o70.a.f(map).doOnNext(new u0(23, new g(this, 5))).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}

package t1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.R$string;
import g1i.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends pri.b implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ypi.i f267373h;
    public final xpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f267374j;
    public final g1i.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f267375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f267376m;

    public o(ypi.i nextButtonView, xpi.g navBarWithToolbarView, g router, g1i.a presentationModel, b chartMapper, d historicalPoints) {
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(historicalPoints, "historicalPoints");
        this.f267373h = nextButtonView;
        this.i = navBarWithToolbarView;
        this.f267374j = router;
        this.k = presentationModel;
        this.f267375l = chartMapper;
        this.f267376m = historicalPoints;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.i;
        cVar.e0(numValueOf);
        cVar.Z(true);
        d0 d0Var = (d0) this.k;
        ufm.n nVarI = o70.a.i(d0Var.y3());
        gu8.g gVar = new gu8.g(cVar, 1);
        Function1 function1K = K();
        ufm.i iVar = new ufm.i(nVarI, new ly7.g(18, new ry7.j(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new n1i.b(18, gVar), new n1i.b(18, function1K), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar2);
        r0 r0VarD = w.D(cVar.Q(), new j(this, 1));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new ly7.g(18, new ry7.j(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new n1i.b(18, function1K2), new n(0, m.f267370a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_continue, null, null, 14);
        ypi.i iVar3 = this.f267373h;
        iVar3.f(textLocalisedClause);
        r0 r0VarD2 = w.D(iVar3.s(), new j(this, 0));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new ly7.g(18, new ry7.j(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(18, function1K3), new n(0, l.f267369a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ufm.n nVarI2 = o70.a.i(d0Var.y3());
        sx2.h hVar = new sx2.h(this, view, 14);
        Function1 function1K4 = K();
        ufm.i iVar4 = new ufm.i(nVarI2, new ly7.g(18, new ry7.j(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
        ofm.i iVar5 = new ofm.i(new n1i.b(18, hVar), new n1i.b(18, function1K4), 0);
        iVar4.q(iVar5);
        Intrinsics.checkNotNullExpressionValue(iVar5, "subscribe(...)");
        w.j0(bVar, iVar5);
    }
}

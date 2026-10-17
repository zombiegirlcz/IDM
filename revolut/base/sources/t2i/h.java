package t2i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import t1i.n;
import te0.w;
import u2i.t;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xpi.g f267581h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f267582j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f267583l;

    public h(xpi.g navBarView, b presentationModel, c router, j orderDetailsUiMapper, t cryptoCommodityMapper) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(cryptoCommodityMapper, "cryptoCommodityMapper");
        this.f267581h = navBarView;
        this.i = presentationModel;
        this.f267582j = router;
        this.k = orderDetailsUiMapper;
        this.f267583l = cryptoCommodityMapper;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f267581h;
        cVar.e0(numValueOf);
        r0 r0VarD = w.D(cVar.Q(), new sx8.a(this, 16));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new m3l.d(23, new ry7.j(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o9h.d(18, function1K), new n(1, g.f267580a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        cVar.Z(true);
        cVar.l0(false);
        r rVarF = o70.a.f(this.i.c());
        sx2.h hVar = new sx2.h(cVar, this, 16);
        Function1 function1K2 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new m3l.d(23, new ry7.j(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(18, hVar), new o9h.d(18, function1K2), new n(1, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}

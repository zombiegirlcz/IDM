package o9h;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kl.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o3l.m;
import ofm.h;
import qfm.r0;
import te0.w;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f223282h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f223283j;

    public e(b0 presentationModel, a mapper, g router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f223282h = presentationModel;
        this.i = mapper;
        this.f223283j = router;
    }

    public final r N(p0h.f disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        i iVar = new i(this.f223282h.h(), new o5i.a(21, new o54.a(this, disclaimer, 11)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarX = ue0.e.F(iVar, f0.f322471a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        n0h.a view = (n0h.a) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r0 r0VarD = w.D(view.m0(), new b(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new kpj.f(new m(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        c function = c.f223279a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new d(0, function1K), new a1l.c(13));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}

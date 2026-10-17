package u0k;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import om4.d0;
import qfm.r0;
import sgm.e3;
import t33.r;
import te0.w;
import tx0.p4;
import tyg.g;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final toh.d f276206h;

    public d(e3 presentationModel, y0k.a mapper, toh.d router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f276206h = router;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        a view = (a) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r0 r0VarD = w.D(w.a0(((WealthAssetTypeNewsScreen) view).V.f53560c, new g(18)), new p4(this, 10));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new d0(new r(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        c function = c.f276205a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new nw8.d(12, function1K), new a1l.c(20));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}

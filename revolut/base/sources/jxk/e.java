package jxk;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import efm.r;
import jxb.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f6j.a f179246h;
    public final wwk.c i;

    public e(f6j.a presentationModel, wwk.c router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f179246h = presentationModel;
        this.i = router;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        wwk.e view = (wwk.e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = ((CommodityAssetDetailsScreen) view).d3().f277457c.A0().filter(new ju0.f(29, new g(20)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new jud.d(this, 12));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new f4h.a(new j2i.c(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        d function = d.f179245a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new s(20, function1K), new a1l.c(9));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}

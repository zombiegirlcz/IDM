package q2i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks0.n;
import pzc.g;
import q03.h;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends pri.c implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f241660h;
    public final d i;

    public f(b router, d mapper) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f241660h = router;
        this.i = mapper;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = ((CellDetailsActionDelegate) ((MarketOrderActivityV2) view).A0.getValue()).d.filter(new q09.c(11, new q2a.a(17)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new h(this, 13));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new n(new g(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        e function = e.f241659a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new m3l.d(19, function1K), new a1l.c(15));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}

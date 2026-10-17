package o2i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import efm.r;
import kl.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ny7.t;
import nya.b0;
import o28.g;
import o2g.f;
import ofm.h;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends pri.c implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2i.c f221625h;

    public e(e2i.c router) {
        Intrinsics.checkNotNullParameter(router, "router");
        this.f221625h = router;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = ((CellDetailsActionDelegate) ((MarketOrderActivityV2) view).A0.getValue()).d.filter(new g(new f(1), 14));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new b0(this, 26));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new c0(new t(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        d function = d.f221624a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new nw8.d(2, function1K), new a1l.c(12));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}

package e2i;

import a08.f0;
import a08.q;
import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import efm.r;
import g1i.l0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends pri.c implements a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f122109h;
    public final opi.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rpi.c f122110j;

    public k(c router, opi.d expandableDialogView, rpi.c keyboardView) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f122109h = router;
        this.i = expandableDialogView;
        this.f122110j = keyboardView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        MarketOrderActivity marketOrderActivity = (MarketOrderActivity) view;
        r rVarFilter = ((CellDetailsActionDelegate) marketOrderActivity.A0.getValue()).d.filter(new e0f.k(new e1d.h(4), 22));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 0;
        r0 r0VarD = w.D(rVarFilter, new Function1(this) { // from class: e2i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f122103b;

            {
                this.f122103b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return ((l0) this.f122103b.f122109h).o();
                    default:
                        return ((opi.b) this.f122103b.i).O();
                }
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new f0(6, new e05.h(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new s(10, function1K), new q(29, i.f122107a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        r rVarFilter2 = marketOrderActivity.S().filter(new e0f.k(new e1d.h(5), 23));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        final int i2 = 1;
        r0 r0VarD2 = w.D(rVarFilter2, new Function1(this) { // from class: e2i.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f122103b;

            {
                this.f122103b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return ((l0) this.f122103b.f122109h).o();
                    default:
                        return ((opi.b) this.f122103b.i).O();
                }
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new f0(6, new e05.h(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new s(10, function1K2), new q(29, j.f122108a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}

package zul;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e3h.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InvestmentProjectionsScreen f325523a;

    public d(InvestmentProjectionsScreen investmentProjectionsScreen) {
        this.f325523a = investmentProjectionsScreen;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // e3h.i
    public final ihm.f B1() {
        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
        return ((HeaderDelegate) this.f325523a.P.getValue()).f52396l.f121375b;
    }

    @Override // e3h.i
    public final ihm.f C() {
        return this.f325523a.T.d.f121375b;
    }

    @Override // e3h.i
    public final efm.r I() {
        return this.f325523a.X.r();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // e3h.i
    public final efm.r U1() {
        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
        return ((HeaderDelegate) this.f325523a.P.getValue()).k.f121375b;
    }

    @Override // e3h.i
    public final ihm.f Z0() {
        return this.f325523a.T.f52339c.f121375b;
    }

    @Override // e3h.i
    public final efm.r h1() {
        efm.r map = this.f325523a.Y.d.map(new zmg.c(new zr2.o(25), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

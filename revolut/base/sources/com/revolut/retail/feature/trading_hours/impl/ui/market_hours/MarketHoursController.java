package com.revolut.retail.feature.trading_hours.impl.ui.market_hours;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_hours.impl.R$layout;
import com.revolut.retail.feature.trading_hours.impl.ui.market_hours.MarketHoursController;
import exk.a;
import gxk.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import kxk.b;
import kxk.d;
import kxk.e;
import kxk.i;
import kxk.k;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_hours/impl/ui/market_hours/MarketHoursController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lkxk/k;", "feature_trading_hours_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarketHoursController extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(MarketHoursController.class, "binding", "getBinding()Lcom/revolut/retail/feature/trading_hours/impl/databinding/ScreenMarketHoursBinding;", 0))};
    public final g K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final TextDelegate Q;
    public final List R;
    public final j S;
    public final e T;

    public MarketHoursController(g mainAsset) {
        Intrinsics.checkNotNullParameter(mainAsset, "mainAsset");
        this.K = mainAsset;
        this.L = R$layout.screen_market_hours;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: kxk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketHoursController f190596b;

            {
                this.f190596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MarketHoursController marketHoursController = this.f190596b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MarketHoursController.U;
                        phm.a aVar = (phm.a) ue0.e.j(marketHoursController.m2()).a().get(exk.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new exk.a(((exk.c) aVar2.b()).f, new g(marketHoursController.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", exk.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = MarketHoursController.U;
                        return (i) ((exk.a) marketHoursController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketHoursController.U;
                        return n14.e.a(marketHoursController, marketHoursController.R2());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: kxk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketHoursController f190596b;

            {
                this.f190596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MarketHoursController marketHoursController = this.f190596b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarketHoursController.U;
                        phm.a aVar = (phm.a) ue0.e.j(marketHoursController.m2()).a().get(exk.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new exk.a(((exk.c) aVar2.b()).f, new g(marketHoursController.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", exk.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = MarketHoursController.U;
                        return (i) ((exk.a) marketHoursController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketHoursController.U;
                        return n14.e.a(marketHoursController, marketHoursController.R2());
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: kxk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarketHoursController f190596b;

            {
                this.f190596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MarketHoursController marketHoursController = this.f190596b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MarketHoursController.U;
                        phm.a aVar = (phm.a) ue0.e.j(marketHoursController.m2()).a().get(exk.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new exk.a(((exk.c) aVar2.b()).f, new g(marketHoursController.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", exk.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = MarketHoursController.U;
                        return (i) ((exk.a) marketHoursController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = MarketHoursController.U;
                        return n14.e.a(marketHoursController, marketHoursController.R2());
                }
            }
        });
        TextDelegate textDelegate = new TextDelegate();
        this.Q = textDelegate;
        List listC = u.c(new ContainerDelegate(v.k(new ProgressStepVerticalDelegate(), new ProgressStepVerticalLoadingDelegate(), new FullScreenStateDelegate(), textDelegate), null, 6));
        this.R = listC;
        this.S = new j(7, listC, false);
        this.T = new e(this);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f120953b;
        navBarWithToolbar.setTitle(uiState.f190603a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f190603a);
        navBarWithToolbar.setSecondDescriptionText(uiState.f190604b);
        Tabs tabs = d3().f120954c;
        List list = uiState.f190605c;
        Tabs.setItems$default(tabs, list, null, 2, null);
        kxk.j jVar = uiState.d;
        Tabs.u(tabs, jVar.c(), false, false, false, 14);
        tabs.setVisibility(list.isEmpty() ? 8 : 0);
        this.S.c(uiState.e);
        d3().d.setCurrentItem(jVar.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f120953b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().d.setAdapter(this.S);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().d.unregisterOnPageChangeCallback(this.T);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f120953b.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f120954c.f58882b), new krc.h(this, null, 17), 3);
        d3().d.registerOnPageChangeCallback(this.T);
        ViewController.P2(this, new f0(rd0.e.b(this.Q.d), 5), new d(this, null, 1), 3);
    }

    public final dxk.a d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dxk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}

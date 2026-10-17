package com.revolut.trading.orders.ui.invest.placement.target_price;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$InputData;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oqj.d;
import or4.i;
import oul.f;
import oul.j;
import oul.m;
import oul.p;
import te0.w;
import tki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/target_price/TargetPriceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhdf/b;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TargetPriceScreen extends ViewController<hdf.b> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(TargetPriceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TargetPriceScreenContract$InputData K;
    public final j L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final CenteredAmountDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public TargetPriceScreen(TargetPriceScreenContract$InputData inputData, j configuration) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.K = inputData;
        this.L = configuration;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, oul.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        this.R = new CenteredAmountDelegate(new i(this, 6));
        this.S = w.y0(new d(20));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.V = w.y0(new Function0(this) { // from class: oul.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetPriceScreen f229887b;

            {
                this.f229887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TargetPriceScreen targetPriceScreen = this.f229887b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetPriceScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(targetPriceScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        TargetPriceScreenContract$InputData targetPriceScreenContract$InputData = targetPriceScreen.K;
                        targetPriceScreenContract$InputData.getClass();
                        j jVar = targetPriceScreen.L;
                        jVar.getClass();
                        return new xsl.o(pVar, targetPriceScreen, targetPriceScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetPriceScreen.W;
                        return (m) ((xsl.o) targetPriceScreen.O.getValue()).f308691n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = TargetPriceScreen.W;
                        qd0.b bVarN = ((xsl.o) targetPriceScreen.O.getValue()).f308685c.f308697j.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.u.c(targetPriceScreen.R);
                    case 4:
                        KProperty[] kPropertyArr4 = TargetPriceScreen.W;
                        return zhm.u.c((LargeActionButtonDelegate) targetPriceScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = TargetPriceScreen.W;
                        TargetPriceScreen targetPriceScreen2 = this.f229887b;
                        m mVarD = targetPriceScreen2.d();
                        List list = (List) targetPriceScreen2.T.getValue();
                        ScreenContentRecyclerView recyclerView = targetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(targetPriceScreen2, mVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        oul.q uiState = (oul.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        p pVar = uiState.f229916a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, pVar.f229913a, pVar.f229914b, null, 4, null);
        navBarWithToolbar.setMenuItems(pVar.f229915c);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        oul.o oVar2 = uiState.f229918c;
        goToButton.setText(oVar2.f229910a);
        goToButton.setEnabled(oVar2.f229911b);
        goToButton.setAnalyticsContext(oVar2.f229912c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xsl.o) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((xsl.o) this.O.getValue()).f.get()).d((List) this.U.getValue());
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new oul.d(this, null, 0), 3);
        ViewController.P2(this, new o9a.e(rd0.e.b(navBarWithToolbar.o.f57403b), 23), new oul.d(this, null, 1), 3);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        ViewController.P2(this, rd0.e.b(goToButton.o), new oul.d(this, null, 2), 3);
        ViewController.P2(this, new o9a.e(rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), 22), new f(this, continuation, 0), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.R;
        ViewController.P2(this, new o9a.e(rd0.e.b(centeredAmountDelegate.f.f121375b), 24), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(centeredAmountDelegate.f51967l.f121375b), new f(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}

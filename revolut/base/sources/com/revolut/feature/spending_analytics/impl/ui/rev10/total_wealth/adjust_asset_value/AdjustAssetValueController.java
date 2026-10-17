package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.i;
import ppd.n;
import ppd.u0;
import pqc.k;
import prd.e;
import prd.f;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/adjust_asset_value/AdjustAssetValueController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lprd/b;", "Ldli/a;", "Lprd/c;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdjustAssetValueController extends ViewController<prd.b> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AdjustAssetValueController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final AdjustAssetValueContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final TextDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public AdjustAssetValueController(AdjustAssetValueContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, e.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: prd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAssetValueController f238984b;

            {
                this.f238984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdjustAssetValueController adjustAssetValueController = this.f238984b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAssetValueController.T;
                        qd0.b bVarN = ((ppd.i) adjustAssetValueController.Q.getValue()).f238432b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AdjustAssetValueController.T;
                        return new CenteredAmountDelegate(new plb.g(adjustAssetValueController, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                        qji.b bVarU2 = adjustAssetValueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.di.AdjustAssetValueInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = adjustAssetValueController.K;
                        adjustAssetValueContract$InputData.getClass();
                        return new ppd.i(nVar, u0Var2, adjustAssetValueContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = AdjustAssetValueController.T;
                        return (i) ((ppd.i) adjustAssetValueController.Q.getValue()).f238433c.get();
                    default:
                        KProperty[] kPropertyArr5 = AdjustAssetValueController.T;
                        AdjustAssetValueController adjustAssetValueController2 = this.f238984b;
                        return dli.f.a(adjustAssetValueController2, adjustAssetValueController2.d(), v.k((CenteredAmountDelegate) adjustAssetValueController2.O.getValue(), adjustAssetValueController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: prd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAssetValueController f238984b;

            {
                this.f238984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdjustAssetValueController adjustAssetValueController = this.f238984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAssetValueController.T;
                        qd0.b bVarN = ((ppd.i) adjustAssetValueController.Q.getValue()).f238432b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AdjustAssetValueController.T;
                        return new CenteredAmountDelegate(new plb.g(adjustAssetValueController, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                        qji.b bVarU2 = adjustAssetValueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.di.AdjustAssetValueInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = adjustAssetValueController.K;
                        adjustAssetValueContract$InputData.getClass();
                        return new ppd.i(nVar, u0Var2, adjustAssetValueContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = AdjustAssetValueController.T;
                        return (i) ((ppd.i) adjustAssetValueController.Q.getValue()).f238433c.get();
                    default:
                        KProperty[] kPropertyArr5 = AdjustAssetValueController.T;
                        AdjustAssetValueController adjustAssetValueController2 = this.f238984b;
                        return dli.f.a(adjustAssetValueController2, adjustAssetValueController2.d(), v.k((CenteredAmountDelegate) adjustAssetValueController2.O.getValue(), adjustAssetValueController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new TextDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: prd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAssetValueController f238984b;

            {
                this.f238984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdjustAssetValueController adjustAssetValueController = this.f238984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAssetValueController.T;
                        qd0.b bVarN = ((ppd.i) adjustAssetValueController.Q.getValue()).f238432b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AdjustAssetValueController.T;
                        return new CenteredAmountDelegate(new plb.g(adjustAssetValueController, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                        qji.b bVarU2 = adjustAssetValueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.di.AdjustAssetValueInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = adjustAssetValueController.K;
                        adjustAssetValueContract$InputData.getClass();
                        return new ppd.i(nVar, u0Var2, adjustAssetValueContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = AdjustAssetValueController.T;
                        return (i) ((ppd.i) adjustAssetValueController.Q.getValue()).f238433c.get();
                    default:
                        KProperty[] kPropertyArr5 = AdjustAssetValueController.T;
                        AdjustAssetValueController adjustAssetValueController2 = this.f238984b;
                        return dli.f.a(adjustAssetValueController2, adjustAssetValueController2.d(), v.k((CenteredAmountDelegate) adjustAssetValueController2.O.getValue(), adjustAssetValueController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: prd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAssetValueController f238984b;

            {
                this.f238984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AdjustAssetValueController adjustAssetValueController = this.f238984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAssetValueController.T;
                        qd0.b bVarN = ((ppd.i) adjustAssetValueController.Q.getValue()).f238432b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AdjustAssetValueController.T;
                        return new CenteredAmountDelegate(new plb.g(adjustAssetValueController, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                        qji.b bVarU2 = adjustAssetValueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.di.AdjustAssetValueInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = adjustAssetValueController.K;
                        adjustAssetValueContract$InputData.getClass();
                        return new ppd.i(nVar, u0Var2, adjustAssetValueContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = AdjustAssetValueController.T;
                        return (i) ((ppd.i) adjustAssetValueController.Q.getValue()).f238433c.get();
                    default:
                        KProperty[] kPropertyArr5 = AdjustAssetValueController.T;
                        AdjustAssetValueController adjustAssetValueController2 = this.f238984b;
                        return dli.f.a(adjustAssetValueController2, adjustAssetValueController2.d(), v.k((CenteredAmountDelegate) adjustAssetValueController2.O.getValue(), adjustAssetValueController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: prd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAssetValueController f238984b;

            {
                this.f238984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AdjustAssetValueController adjustAssetValueController = this.f238984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAssetValueController.T;
                        qd0.b bVarN = ((ppd.i) adjustAssetValueController.Q.getValue()).f238432b.d.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = AdjustAssetValueController.T;
                        return new CenteredAmountDelegate(new plb.g(adjustAssetValueController, 19));
                    case 2:
                        KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                        qji.b bVarU2 = adjustAssetValueController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.di.AdjustAssetValueInjector");
                        u0 u0Var = (u0) bVarU2;
                        n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = adjustAssetValueController.K;
                        adjustAssetValueContract$InputData.getClass();
                        return new ppd.i(nVar, u0Var2, adjustAssetValueContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = AdjustAssetValueController.T;
                        return (i) ((ppd.i) adjustAssetValueController.Q.getValue()).f238433c.get();
                    default:
                        KProperty[] kPropertyArr5 = AdjustAssetValueController.T;
                        AdjustAssetValueController adjustAssetValueController2 = this.f238984b;
                        return dli.f.a(adjustAssetValueController2, adjustAssetValueController2.d(), v.k((CenteredAmountDelegate) adjustAssetValueController2.O.getValue(), adjustAssetValueController2.P), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        prd.c uiState = (prd.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f238981b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setMenuItems(uiState.f238982c);
        d3().f174533b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new f(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.O.getValue()).d.f121375b), null, new k(this, null, 3), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final prd.i d() {
        return (prd.i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}

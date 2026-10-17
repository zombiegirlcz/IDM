package com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations;

import aii.q;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r3b.c;
import r8f.b;
import r8f.e;
import r8f.f;
import te0.w;
import vc.s;
import w5f.c0;
import w5f.m;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/target_allocations/TargetAllocationsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lr8f/e;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TargetAllocationsController extends ViewController<q> implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91492a0 = {o0.f186429a.j(new h0(TargetAllocationsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TargetAllocationsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final RowLoadingDelegate Q;
    public final FullScreenStateDelegate R;
    public final FixedTabsDelegate S;
    public final TextDelegate T;
    public final ListSubheaderDelegate U;
    public final SegmentedBarDelegate V;
    public final FooterTextDelegate W;
    public final Object X;
    public final b Y;
    public final c Z;

    public TargetAllocationsController(TargetAllocationsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, r8f.c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: r8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetAllocationsController f252421b;

            {
                this.f252421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TargetAllocationsController targetAllocationsController = this.f252421b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TargetAllocationsController.f91492a0;
                        Activity activityM2 = targetAllocationsController.m2();
                        TargetAllocationsControllerContract$InputData targetAllocationsControllerContract$InputData = targetAllocationsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        targetAllocationsControllerContract$InputData.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(targetAllocationsControllerContract$InputData.f91493a, a6f.a.FORCE_TEMPLATE, false);
                        b bVar = targetAllocationsController.Y;
                        bVar.getClass();
                        r3b.c cVar = targetAllocationsController.Z;
                        cVar.getClass();
                        return new c0(mVar, managedPortfolioDetailsAllocationContract$InputData, bVar, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetAllocationsController.f91492a0;
                        return (f) ((c0) targetAllocationsController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = TargetAllocationsController.f91492a0;
                        TargetAllocationsController targetAllocationsController2 = this.f252421b;
                        return dli.f.a(targetAllocationsController2, (f) targetAllocationsController2.O.getValue(), v.k(targetAllocationsController2.P, targetAllocationsController2.Q, targetAllocationsController2.R, targetAllocationsController2.S, targetAllocationsController2.T, targetAllocationsController2.U, targetAllocationsController2.V, targetAllocationsController2.W), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: r8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetAllocationsController f252421b;

            {
                this.f252421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TargetAllocationsController targetAllocationsController = this.f252421b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetAllocationsController.f91492a0;
                        Activity activityM2 = targetAllocationsController.m2();
                        TargetAllocationsControllerContract$InputData targetAllocationsControllerContract$InputData = targetAllocationsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        targetAllocationsControllerContract$InputData.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(targetAllocationsControllerContract$InputData.f91493a, a6f.a.FORCE_TEMPLATE, false);
                        b bVar = targetAllocationsController.Y;
                        bVar.getClass();
                        r3b.c cVar = targetAllocationsController.Z;
                        cVar.getClass();
                        return new c0(mVar, managedPortfolioDetailsAllocationContract$InputData, bVar, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetAllocationsController.f91492a0;
                        return (f) ((c0) targetAllocationsController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = TargetAllocationsController.f91492a0;
                        TargetAllocationsController targetAllocationsController2 = this.f252421b;
                        return dli.f.a(targetAllocationsController2, (f) targetAllocationsController2.O.getValue(), v.k(targetAllocationsController2.P, targetAllocationsController2.Q, targetAllocationsController2.R, targetAllocationsController2.S, targetAllocationsController2.T, targetAllocationsController2.U, targetAllocationsController2.V, targetAllocationsController2.W), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new RowLoadingDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new FixedTabsDelegate();
        this.T = new TextDelegate();
        this.U = new ListSubheaderDelegate();
        this.V = new SegmentedBarDelegate();
        this.W = new FooterTextDelegate();
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: r8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TargetAllocationsController f252421b;

            {
                this.f252421b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TargetAllocationsController targetAllocationsController = this.f252421b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TargetAllocationsController.f91492a0;
                        Activity activityM2 = targetAllocationsController.m2();
                        TargetAllocationsControllerContract$InputData targetAllocationsControllerContract$InputData = targetAllocationsController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).f295201s;
                        targetAllocationsControllerContract$InputData.getClass();
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(targetAllocationsControllerContract$InputData.f91493a, a6f.a.FORCE_TEMPLATE, false);
                        b bVar = targetAllocationsController.Y;
                        bVar.getClass();
                        r3b.c cVar = targetAllocationsController.Z;
                        cVar.getClass();
                        return new c0(mVar, managedPortfolioDetailsAllocationContract$InputData, bVar, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = TargetAllocationsController.f91492a0;
                        return (f) ((c0) targetAllocationsController.N.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr3 = TargetAllocationsController.f91492a0;
                        TargetAllocationsController targetAllocationsController2 = this.f252421b;
                        return dli.f.a(targetAllocationsController2, (f) targetAllocationsController2.O.getValue(), v.k(targetAllocationsController2.P, targetAllocationsController2.Q, targetAllocationsController2.R, targetAllocationsController2.S, targetAllocationsController2.T, targetAllocationsController2.U, targetAllocationsController2.V, targetAllocationsController2.W), 0, null, null, null, 60);
                }
            }
        });
        this.Y = new b(this);
        this.Z = new c(this);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, f91492a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_robo_template_details_target_allocation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_template_details_target_allocation_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.wealth_robo_template_details_target_allocation_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, f91492a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new r0e.c(this, null, 14), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}

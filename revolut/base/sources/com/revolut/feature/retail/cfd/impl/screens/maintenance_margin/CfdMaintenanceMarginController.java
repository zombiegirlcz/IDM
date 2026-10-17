package com.revolut.feature.retail.cfd.impl.screens.maintenance_margin;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GaugeSteppedHorizontalDelegate;
import com.revolut.core.ui_kit.delegates.GaugeSteppedHorizontalLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.k;
import te0.w;
import u1.g;
import u3b.b;
import u3b.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/maintenance_margin/CfdMaintenanceMarginController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lu3b/f;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdMaintenanceMarginController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(CfdMaintenanceMarginController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CfdMaintenanceMarginController(CfdMaintenanceMarginControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = s.t(this, b.f);
        this.M = w.y0(new g(this, inputData, 10));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: u3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdMaintenanceMarginController f276883b;

            {
                this.f276883b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdMaintenanceMarginController.P;
                        return (e) ((k) this.f276883b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = CfdMaintenanceMarginController.P;
                        CfdMaintenanceMarginController cfdMaintenanceMarginController = this.f276883b;
                        return dli.f.a(cfdMaintenanceMarginController, (e) cfdMaintenanceMarginController.N.getValue(), v.k(new GaugeSteppedHorizontalDelegate(), new GaugeSteppedHorizontalLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: u3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdMaintenanceMarginController f276883b;

            {
                this.f276883b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdMaintenanceMarginController.P;
                        return (e) ((k) this.f276883b.M.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = CfdMaintenanceMarginController.P;
                        CfdMaintenanceMarginController cfdMaintenanceMarginController = this.f276883b;
                        return dli.f.a(cfdMaintenanceMarginController, (e) cfdMaintenanceMarginController.N.getValue(), v.k(new GaugeSteppedHorizontalDelegate(), new GaugeSteppedHorizontalLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(uiState.f276886a, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.f276887b);
        d3().f174533b.setModel(uiState.f276888c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (u3b.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new u07.b(this, null, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new tz6.e(this, (Continuation) null, 16), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}

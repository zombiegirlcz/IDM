package com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ewg.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yxg.b;
import yxg.d;
import yxg.f;
import yy0.i;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/ui/complex_analytics/v2/screen/totalvalue/sector/ComplexAnalyticsSectorAllocationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyxg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComplexAnalyticsSectorAllocationController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ComplexAnalyticsSectorAllocationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ComplexAnalyticsSectorAllocationController(ComplexAnalyticsSectorAllocationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yxg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComplexAnalyticsSectorAllocationController f317683b;

            {
                this.f317683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ComplexAnalyticsSectorAllocationController.Q;
                        ComplexAnalyticsSectorAllocationController complexAnalyticsSectorAllocationController = this.f317683b;
                        return dli.f.a(complexAnalyticsSectorAllocationController, (d) complexAnalyticsSectorAllocationController.P.getValue(), v.k(complexAnalyticsSectorAllocationController.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = ComplexAnalyticsSectorAllocationController.Q;
                        return (d) ((ewg.c) this.f317683b.O.getValue()).d.get();
                }
            }
        });
        this.O = w.y0(new ywi.b(this, inputData, 1));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yxg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComplexAnalyticsSectorAllocationController f317683b;

            {
                this.f317683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ComplexAnalyticsSectorAllocationController.Q;
                        ComplexAnalyticsSectorAllocationController complexAnalyticsSectorAllocationController = this.f317683b;
                        return dli.f.a(complexAnalyticsSectorAllocationController, (d) complexAnalyticsSectorAllocationController.P.getValue(), v.k(complexAnalyticsSectorAllocationController.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = ComplexAnalyticsSectorAllocationController.Q;
                        return (d) ((ewg.c) this.f317683b.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f317687a, null);
        Clause clause = uiState.f317688b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        i iVar = l.Companion;
        LayeredImage layeredImage = uiState.f317689c;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(layeredImage));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new yl6.b(this, null, 19), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new yxg.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}

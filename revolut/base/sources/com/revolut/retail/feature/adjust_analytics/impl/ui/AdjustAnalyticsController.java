package com.revolut.retail.feature.adjust_analytics.impl.ui;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.adjust_analytics.api.R$string;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vsi.d;
import xng.l;
import xo8.a0;
import xo8.u;
import xsi.e;
import xsi.g;
import xsi.j;
import xsi.k;
import xsi.m;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/adjust_analytics/impl/ui/AdjustAnalyticsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxsi/e;", "feature_retail_adjust_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdjustAnalyticsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AdjustAnalyticsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final CellDetailsActionDelegate R;
    public final CellDetailsSwitcherDelegate S;
    public final FullScreenStateDelegate T;
    public final LargeActionButtonDelegate U;

    public AdjustAnalyticsController(AdjustAnalyticsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = true;
        this.M = s.t(this, xsi.h.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xsi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAnalyticsController f308531b;

            {
                this.f308531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAnalyticsController.V;
                        return (d) ((vsi.d) this.f308531b.P.getValue()).f291816h.get();
                    default:
                        KProperty[] kPropertyArr2 = AdjustAnalyticsController.V;
                        AdjustAnalyticsController adjustAnalyticsController = this.f308531b;
                        return dli.f.a(adjustAnalyticsController, adjustAnalyticsController.d(), v.k((CenteredAmountDelegate) adjustAnalyticsController.Q.getValue(), adjustAnalyticsController.R, adjustAnalyticsController.S, new CellDetailsLoadingDelegate(), adjustAnalyticsController.T), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xsi.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdjustAnalyticsController f308531b;

            {
                this.f308531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdjustAnalyticsController.V;
                        return (d) ((vsi.d) this.f308531b.P.getValue()).f291816h.get();
                    default:
                        KProperty[] kPropertyArr2 = AdjustAnalyticsController.V;
                        AdjustAnalyticsController adjustAnalyticsController = this.f308531b;
                        return dli.f.a(adjustAnalyticsController, adjustAnalyticsController.d(), v.k((CenteredAmountDelegate) adjustAnalyticsController.Q.getValue(), adjustAnalyticsController.R, adjustAnalyticsController.S, new CellDetailsLoadingDelegate(), adjustAnalyticsController.T), 0, null, null, null, 60);
                }
            }
        });
        this.P = w.y0(new g(this, inputData));
        this.Q = w.y0(new g(inputData, this));
        this.R = new CellDetailsActionDelegate();
        this.S = new CellDetailsSwitcherDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new LargeActionButtonDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f308529b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_adjust_amount_header_title, null, null, 14), null);
        d3().f174564b.setText(new TextLocalisedClause(R$string.adjust_analytics_screen_cta, null, null, 14));
        ((j60.a) ((d) this.P.getValue()).e.get()).d(v.k(new RowDelegate(null, null, 7), this.U));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.f59410q.subscribe(new u(29, new l(this, 18)));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new a0(rd0.e.b(this.T.f52371h.f121375b), 8), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f51912c), null, new xsi.l(view, this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new xni.h(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.d.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.Q.getValue()).d.f121375b), null, new xjl.g(this, continuation, 23), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final xsi.d d() {
        return (xsi.d) this.N.getValue();
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

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}

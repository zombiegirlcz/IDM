package com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTotalDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.impl.R$id;
import com.revolut.feature.pay_later.impl.R$layout;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oi9.x;
import re3.d;
import rk9.b;
import rk9.f;
import rk9.g;
import rk9.m;
import rk9.n;
import rk9.p;
import rk9.r;
import te0.w;
import tki.c;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/right_to_cancel/summary/SummaryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrk9/m;", "Ltki/c;", "Lrk9/r;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryController extends ViewController<m> implements c, no.m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SummaryController.class, "binding", "getBinding()Lcom/revolut/feature/pay_later/impl/databinding/ScreenRightToCancelSummaryBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final AnalyticsProduct.Retail O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public SummaryController(SummaryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new d(21));
        this.M = w.y0(new d(22));
        this.N = w.y0(new d(23));
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.P = R$layout.screen_right_to_cancel_summary;
        this.Q = w.y0(new rgf.b(this, inputData, 6));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: rk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryController f254770b;

            {
                this.f254770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryController.T;
                        return (h) ((x) this.f254770b.Q.getValue()).f225583c.get();
                    default:
                        KProperty[] kPropertyArr2 = SummaryController.T;
                        SummaryController summaryController = this.f254770b;
                        return tki.g.a(summaryController, summaryController.d(), v.k((CellDetailsDelegate) summaryController.L.getValue(), new CellDetailsTotalDelegate(), (InputChecklistDelegate) summaryController.M.getValue(), (FullScreenStateDelegate) summaryController.N.getValue(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.rightToCancelSummary_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: rk9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryController f254770b;

            {
                this.f254770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryController.T;
                        return (h) ((x) this.f254770b.Q.getValue()).f225583c.get();
                    default:
                        KProperty[] kPropertyArr2 = SummaryController.T;
                        SummaryController summaryController = this.f254770b;
                        return tki.g.a(summaryController, summaryController.d(), v.k((CellDetailsDelegate) summaryController.L.getValue(), new CellDetailsTotalDelegate(), (InputChecklistDelegate) summaryController.M.getValue(), (FullScreenStateDelegate) summaryController.N.getValue(), new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.rightToCancelSummary_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        rk9.q qVar2 = uiState.f254784b;
        NavBarWithToolbar navBarWithToolbar = d3().f205628b;
        if (qVar2 instanceof p) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            p pVar = (p) qVar2;
            TextLocalisedClause textLocalisedClause = pVar.f254781a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setSecondDescriptionText(pVar.f254782b);
        } else if (qVar2 instanceof rk9.o) {
            navBarWithToolbar.l0();
            rk9.o oVar2 = (rk9.o) qVar2;
            TextLocalisedClause textLocalisedClause2 = oVar2.f254779a;
            navBarWithToolbar.setTitle(textLocalisedClause2, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause2);
            navBarWithToolbar.setSecondDescriptionText(oVar2.f254780b);
        } else {
            if (!(qVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            n nVar = (n) qVar2;
            TextLocalisedClause textLocalisedClause3 = nVar.f254777a;
            navBarWithToolbar.setTitle(textLocalisedClause3, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause3);
            navBarWithToolbar.setSecondDescriptionText(nVar.f254778b);
        }
        aw0.h hVar = uiState.f254785c;
        TwinVerticalButton twinVerticalButton = d3().f205629c;
        twinVerticalButton.setVisibility(hVar == null ? 8 : 0);
        if (hVar != null) {
            n6 n6Var = hVar.f10331c;
            n6 n6Var2 = hVar.f10330b;
            twinVerticalButton.setMainButtonText(n6Var2.f10433a);
            twinVerticalButton.setMainButtonStyle(n6Var2.f10434b);
            twinVerticalButton.setMainButtonEnabled(n6Var2.f10436g);
            twinVerticalButton.setSecondaryButtonText(n6Var.f10433a);
            twinVerticalButton.setSecondaryButtonStyle(n6Var.f10434b);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((tki.b) ((tki.a) this.S.getValue())).f271959b.h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        NavBarWithToolbar navBarWithToolbar = d3().f205628b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().f205629c;
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setFabEnabled(true);
        twinVerticalButton.setSecondaryButtonVisible(false);
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f205628b.f59410q), new rk9.c(this, continuation, 0), 3);
        TwinVerticalButton twinVerticalButton = d3().f205629c;
        ViewController.P2(this, rd0.e.b(twinVerticalButton.o0()), new rk9.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.p0()), new rk9.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.m0()), new rk9.c(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.n0()), new rk9.d(twinVerticalButton, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.L.getValue()).d), new rk9.e(2, 4, rk9.h.class, d(), "onDetailRowClicked", "onDetailRowClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((InputChecklistDelegate) this.M.getValue()).f52518c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new g(this, null), 3);
    }

    public final mi9.c d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mi9.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rk9.h d() {
        return (rk9.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}

package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import dw3.c1;
import dw3.h6;
import dw3.j6;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import xo8.a0;
import y5g.d;
import yh4.b;
import yh4.f;
import yh4.n;
import yh4.q;
import yh4.t;
import yh4.u;
import yh4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/set_up/SepaDirectDebitSetUpController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lyh4/n;", "Ldli/a;", "Lyh4/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SepaDirectDebitSetUpController extends PluginScreenController<n> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(SepaDirectDebitSetUpController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final SepaDirectDebitSetUpContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final CellDetailsDelegate R;
    public final PlainTextDelegate S;
    public final TextDelegate T;
    public final FullScreenStateDelegate U;
    public final RowLoadingDelegate V;
    public final h W;

    public SepaDirectDebitSetUpController(SepaDirectDebitSetUpContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yh4.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitSetUpController f313766b;

            {
                this.f313766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SepaDirectDebitSetUpController sepaDirectDebitSetUpController = this.f313766b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitSetUpController.X;
                        qji.b bVarU2 = sepaDirectDebitSetUpController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.di.SepaDirectDebitSetUpScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitSetUpContract$InputData sepaDirectDebitSetUpContract$InputData = sepaDirectDebitSetUpController.L;
                        sepaDirectDebitSetUpContract$InputData.getClass();
                        return new j6(c1Var, h6Var2, sepaDirectDebitSetUpController, sepaDirectDebitSetUpContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitSetUpController.X;
                        return (b) ((j6) sepaDirectDebitSetUpController.N.getValue()).f119049g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitSetUpController.X;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitSetUpController sepaDirectDebitSetUpController2 = this.f313766b;
                        return dli.f.a(sepaDirectDebitSetUpController2, sepaDirectDebitSetUpController2.d(), zhm.v.k(sepaDirectDebitSetUpController2.Q, sepaDirectDebitSetUpController2.R, sepaDirectDebitSetUpController2.S, sepaDirectDebitSetUpController2.T, sepaDirectDebitSetUpController2.U, sepaDirectDebitSetUpController2.V), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yh4.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitSetUpController f313766b;

            {
                this.f313766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SepaDirectDebitSetUpController sepaDirectDebitSetUpController = this.f313766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitSetUpController.X;
                        qji.b bVarU2 = sepaDirectDebitSetUpController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.di.SepaDirectDebitSetUpScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitSetUpContract$InputData sepaDirectDebitSetUpContract$InputData = sepaDirectDebitSetUpController.L;
                        sepaDirectDebitSetUpContract$InputData.getClass();
                        return new j6(c1Var, h6Var2, sepaDirectDebitSetUpController, sepaDirectDebitSetUpContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitSetUpController.X;
                        return (b) ((j6) sepaDirectDebitSetUpController.N.getValue()).f119049g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitSetUpController.X;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitSetUpController sepaDirectDebitSetUpController2 = this.f313766b;
                        return dli.f.a(sepaDirectDebitSetUpController2, sepaDirectDebitSetUpController2.d(), zhm.v.k(sepaDirectDebitSetUpController2.Q, sepaDirectDebitSetUpController2.R, sepaDirectDebitSetUpController2.S, sepaDirectDebitSetUpController2.T, sepaDirectDebitSetUpController2.U, sepaDirectDebitSetUpController2.V), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yh4.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitSetUpController f313766b;

            {
                this.f313766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SepaDirectDebitSetUpController sepaDirectDebitSetUpController = this.f313766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitSetUpController.X;
                        qji.b bVarU2 = sepaDirectDebitSetUpController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.di.SepaDirectDebitSetUpScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitSetUpContract$InputData sepaDirectDebitSetUpContract$InputData = sepaDirectDebitSetUpController.L;
                        sepaDirectDebitSetUpContract$InputData.getClass();
                        return new j6(c1Var, h6Var2, sepaDirectDebitSetUpController, sepaDirectDebitSetUpContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitSetUpController.X;
                        return (b) ((j6) sepaDirectDebitSetUpController.N.getValue()).f119049g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitSetUpController.X;
                        int i32 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitSetUpController sepaDirectDebitSetUpController2 = this.f313766b;
                        return dli.f.a(sepaDirectDebitSetUpController2, sepaDirectDebitSetUpController2.d(), zhm.v.k(sepaDirectDebitSetUpController2.Q, sepaDirectDebitSetUpController2.R, sepaDirectDebitSetUpController2.S, sepaDirectDebitSetUpController2.T, sepaDirectDebitSetUpController2.U, sepaDirectDebitSetUpController2.V), i32, null, null, null, 56);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new CellDetailsDelegate();
        this.S = new PlainTextDelegate();
        this.T = new TextDelegate();
        this.U = new FullScreenStateDelegate();
        this.V = new RowLoadingDelegate();
        this.W = s.t(this, q.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        yh4.o uiState = (yh4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f313763b;
        i iVar = uiState.e;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f313764c;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setEndImage(uiState.d);
        ActionFooterView actionFooterView = d3().f174533b;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).J2(f.f313754a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j6) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, null, 22), 3);
        ViewController.P2(this, new a0(rd0.e.b(d3().f174533b.f), 23), new t(this, null, 0), 3);
        ViewController.P2(this, new a0(rd0.e.b(d3().f174533b.f58955g), 24), new t(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53220l), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new v(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.W.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}

package com.revolut.feature.credit.application.plugins.impl.ui.esign.documents;

import a15.d;
import ab4.b;
import ab4.f;
import ab4.g;
import ab4.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dw3.c1;
import dw3.r2;
import dw3.s2;
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
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/esign/documents/ESignDocumentsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lab4/n;", "Ldli/a;", "Lab4/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ESignDocumentsScreen extends PluginScreenController<n> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ESignDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final ESignDocumentsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final InputChecklistDelegate S;
    public final Object T;
    public final List U;

    public ESignDocumentsScreen(ESignDocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ab4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignDocumentsScreen f2869b;

            {
                this.f2869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ESignDocumentsScreen eSignDocumentsScreen = this.f2869b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ESignDocumentsScreen.V;
                        qji.b bVarU2 = eSignDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.di.ESignDocumentsScreenInjector");
                        s2 s2Var = (s2) bVarU2;
                        c1 c1Var = s2Var.f119733c;
                        s2 s2Var2 = s2Var.d;
                        ESignDocumentsScreenContract$InputData eSignDocumentsScreenContract$InputData = eSignDocumentsScreen.L;
                        eSignDocumentsScreenContract$InputData.getClass();
                        return new r2(c1Var, s2Var2, eSignDocumentsScreen, eSignDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ESignDocumentsScreen.V;
                        return (s) ((r2) eSignDocumentsScreen.N.getValue()).f119644h.get();
                    default:
                        KProperty[] kPropertyArr3 = ESignDocumentsScreen.V;
                        ESignDocumentsScreen eSignDocumentsScreen2 = this.f2869b;
                        return dli.f.a(eSignDocumentsScreen2, eSignDocumentsScreen2.R2(), eSignDocumentsScreen2.U, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ab4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignDocumentsScreen f2869b;

            {
                this.f2869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ESignDocumentsScreen eSignDocumentsScreen = this.f2869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ESignDocumentsScreen.V;
                        qji.b bVarU2 = eSignDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.di.ESignDocumentsScreenInjector");
                        s2 s2Var = (s2) bVarU2;
                        c1 c1Var = s2Var.f119733c;
                        s2 s2Var2 = s2Var.d;
                        ESignDocumentsScreenContract$InputData eSignDocumentsScreenContract$InputData = eSignDocumentsScreen.L;
                        eSignDocumentsScreenContract$InputData.getClass();
                        return new r2(c1Var, s2Var2, eSignDocumentsScreen, eSignDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ESignDocumentsScreen.V;
                        return (s) ((r2) eSignDocumentsScreen.N.getValue()).f119644h.get();
                    default:
                        KProperty[] kPropertyArr3 = ESignDocumentsScreen.V;
                        ESignDocumentsScreen eSignDocumentsScreen2 = this.f2869b;
                        return dli.f.a(eSignDocumentsScreen2, eSignDocumentsScreen2.R2(), eSignDocumentsScreen2.U, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.S = inputChecklistDelegate;
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: ab4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignDocumentsScreen f2869b;

            {
                this.f2869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ESignDocumentsScreen eSignDocumentsScreen = this.f2869b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ESignDocumentsScreen.V;
                        qji.b bVarU2 = eSignDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.di.ESignDocumentsScreenInjector");
                        s2 s2Var = (s2) bVarU2;
                        c1 c1Var = s2Var.f119733c;
                        s2 s2Var2 = s2Var.d;
                        ESignDocumentsScreenContract$InputData eSignDocumentsScreenContract$InputData = eSignDocumentsScreen.L;
                        eSignDocumentsScreenContract$InputData.getClass();
                        return new r2(c1Var, s2Var2, eSignDocumentsScreen, eSignDocumentsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ESignDocumentsScreen.V;
                        return (s) ((r2) eSignDocumentsScreen.N.getValue()).f119644h.get();
                    default:
                        KProperty[] kPropertyArr3 = ESignDocumentsScreen.V;
                        ESignDocumentsScreen eSignDocumentsScreen2 = this.f2869b;
                        return dli.f.a(eSignDocumentsScreen2, eSignDocumentsScreen2.R2(), eSignDocumentsScreen2.U, R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = v.k(rowDelegate, inputChecklistDelegate, new ListSubheaderDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), fullScreenStateDelegate);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ab4.o uiState = (ab4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = uiState.f2880b;
        i iVar = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(uiState.f2880b);
        Clause clause = uiState.f2881c;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        ActionFooterView actionFooterView = d3().f174533b;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        R2().C2(ab4.i.f2874a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r2) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new ab4.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new ab4.e(this, null, 1), 3);
        ViewController.P2(this, new d(rd0.e.b(this.R.f53218h), 16), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new g(this, null), 3);
        InputChecklistDelegate inputChecklistDelegate = this.S;
        ViewController.P2(this, new d(rd0.e.b(inputChecklistDelegate.f52518c), 17), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.p()), new f(this, null, 2), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ab4.s R2() {
        return (ab4.s) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}

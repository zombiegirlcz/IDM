package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.c1;
import dw3.k8;
import dw3.l2;
import ea4.b;
import ea4.c;
import ea4.d;
import ea4.g;
import ea4.q;
import ea4.r;
import ea4.u;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/summary/SummaryScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lea4/q;", "Ldli/a;", "Lea4/s;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryScreen extends PluginScreenController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final SummaryScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final Object R;

    public SummaryScreen(SummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ea4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f124128b;

            {
                this.f124128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SummaryScreen summaryScreen = this.f124128b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.S;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.di.SummaryScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new k8(c1Var, l2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.S;
                        return (r) ((k8) summaryScreen.N.getValue()).f119140h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.S;
                        SummaryScreen summaryScreen2 = this.f124128b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ea4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f124128b;

            {
                this.f124128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SummaryScreen summaryScreen = this.f124128b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.S;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.di.SummaryScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new k8(c1Var, l2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.S;
                        return (r) ((k8) summaryScreen.N.getValue()).f119140h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.S;
                        SummaryScreen summaryScreen2 = this.f124128b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ea4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f124128b;

            {
                this.f124128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SummaryScreen summaryScreen = this.f124128b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.S;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.di.SummaryScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new k8(c1Var, l2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.S;
                        return (r) ((k8) summaryScreen.N.getValue()).f119140h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.S;
                        SummaryScreen summaryScreen2 = this.f124128b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ea4.s uiState = (ea4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        ResourceImage resourceImage = uiState.f124141b;
        Clause clause = uiState.e;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f124142c;
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(textLocalisedClause, null);
        d3().e.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar2 = d3().e;
        Clause clause2 = uiState.d;
        navBarWithToolbar2.setSecondDescriptionText(clause2);
        d3().e.setSecondDescriptionVisible(clause2 != null);
        d3().f174558c.setTextClause(clause);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(clause == null ? 8 : 0);
        d3().f174557b.setText(uiState.f);
        d3().f174557b.setEnabled(uiState.f124143g);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) R2()).I2(g.f124131a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k8) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setHeaderTitleMode(j0.MULTILINE);
        d3().e.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.x0()), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new ea4.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}

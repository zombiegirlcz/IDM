package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dw3.c1;
import dw3.j2;
import h74.f;
import h74.g;
import h74.j;
import h74.k;
import h74.l;
import java.util.LinkedHashMap;
import java.util.Map;
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
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consents_v2/content/DocumentsContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lh74/f;", "Ldli/a;", "Lh74/h;", "Lbx4/c;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsContentScreen extends PluginScreenController<f> implements dli.a, c, a84.b {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DocumentsContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final DocumentsContentContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final FullScreenStateDelegate S;

    public DocumentsContentScreen(DocumentsContentContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: h74.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsContentScreen f149854b;

            {
                this.f149854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentsContentScreen documentsContentScreen = this.f149854b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsContentScreen.T;
                        qji.b bVarU2 = documentsContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.di.DocumentsContentScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        DocumentsContentContract$InputData documentsContentContract$InputData = documentsContentScreen.L;
                        documentsContentContract$InputData.getClass();
                        return new j2(c1Var, o0Var2, documentsContentScreen, documentsContentContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsContentScreen.T;
                        return (g) ((j2) documentsContentScreen.N.getValue()).f119024n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DocumentsContentScreen.T;
                        return ((j2) documentsContentScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = DocumentsContentScreen.T;
                        DocumentsContentScreen documentsContentScreen2 = this.f149854b;
                        return dli.f.a(documentsContentScreen2, documentsContentScreen2.R2(), d0.E0(u.c(documentsContentScreen2.S), ((j2) documentsContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: h74.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsContentScreen f149854b;

            {
                this.f149854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentsContentScreen documentsContentScreen = this.f149854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsContentScreen.T;
                        qji.b bVarU2 = documentsContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.di.DocumentsContentScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        DocumentsContentContract$InputData documentsContentContract$InputData = documentsContentScreen.L;
                        documentsContentContract$InputData.getClass();
                        return new j2(c1Var, o0Var2, documentsContentScreen, documentsContentContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsContentScreen.T;
                        return (g) ((j2) documentsContentScreen.N.getValue()).f119024n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DocumentsContentScreen.T;
                        return ((j2) documentsContentScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = DocumentsContentScreen.T;
                        DocumentsContentScreen documentsContentScreen2 = this.f149854b;
                        return dli.f.a(documentsContentScreen2, documentsContentScreen2.R2(), d0.E0(u.c(documentsContentScreen2.S), ((j2) documentsContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: h74.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsContentScreen f149854b;

            {
                this.f149854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentsContentScreen documentsContentScreen = this.f149854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsContentScreen.T;
                        qji.b bVarU2 = documentsContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.di.DocumentsContentScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        DocumentsContentContract$InputData documentsContentContract$InputData = documentsContentScreen.L;
                        documentsContentContract$InputData.getClass();
                        return new j2(c1Var, o0Var2, documentsContentScreen, documentsContentContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsContentScreen.T;
                        return (g) ((j2) documentsContentScreen.N.getValue()).f119024n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DocumentsContentScreen.T;
                        return ((j2) documentsContentScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = DocumentsContentScreen.T;
                        DocumentsContentScreen documentsContentScreen2 = this.f149854b;
                        return dli.f.a(documentsContentScreen2, documentsContentScreen2.R2(), d0.E0(u.c(documentsContentScreen2.S), ((j2) documentsContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, j.f);
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: h74.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsContentScreen f149854b;

            {
                this.f149854b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DocumentsContentScreen documentsContentScreen = this.f149854b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsContentScreen.T;
                        qji.b bVarU2 = documentsContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.di.DocumentsContentScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        DocumentsContentContract$InputData documentsContentContract$InputData = documentsContentScreen.L;
                        documentsContentContract$InputData.getClass();
                        return new j2(c1Var, o0Var2, documentsContentScreen, documentsContentContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsContentScreen.T;
                        return (g) ((j2) documentsContentScreen.N.getValue()).f119024n.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DocumentsContentScreen.T;
                        return ((j2) documentsContentScreen.N.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = DocumentsContentScreen.T;
                        DocumentsContentScreen documentsContentScreen2 = this.f149854b;
                        return dli.f.a(documentsContentScreen2, documentsContentScreen2.R2(), d0.E0(u.c(documentsContentScreen2.S), ((j2) documentsContentScreen2.N.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        h74.h uiState = (h74.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.P.getValue();
        boolean z = uiState.f;
        Clause clause = uiState.d;
        aVar.Q(z, z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        TextLocalisedClause textLocalisedClause = uiState.f149850b;
        navBarWithToolbarF3.setTitle(textLocalisedClause, null);
        navBarWithToolbarF3.setToolbarTitle(textLocalisedClause);
        Clause clause2 = uiState.f149851c;
        navBarWithToolbarF3.setSecondDescriptionText(clause2);
        navBarWithToolbarF3.setMenuItems(uiState.e);
        navBarWithToolbarF3.setSecondDescriptionVisible(clause2 != null);
        TwinVerticalButton twinVerticalButtonE = E();
        twinVerticalButtonE.setMainButtonText(clause);
        twinVerticalButtonE.setFabEnabled(clause != null);
        twinVerticalButtonE.setMainButtonEnabled(uiState.f149852g);
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton creditApplicationTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        return creditApplicationTwinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) R2()).C2(h74.c.f149844a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j2) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        f3().setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new l(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().o.f57403b), null, new l(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new k(this, null), 3);
        E().setMainButtonLoadingTag("ACCEPT_BUTTON");
    }

    public final aw3.k d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        b bVar = (b) R2();
        Map map = ((h74.a) ((vkm.j2) bVar.f67312t.f22677a).getValue()).f149841a.f10858c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ax4.a) entry.getValue()).f10854a && !((ax4.a) entry.getValue()).f10855b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        bVar.C2(new h74.b(d0.d1(linkedHashMap.keySet())));
    }

    public final NavBarWithToolbar f3() {
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        return creditApplicationNavBarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView creditApplicationRecyclerView = d3().f10699c;
        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
        return creditApplicationRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // a84.b
    public final void o1() {
        f3().setExpanded(false, true);
    }
}

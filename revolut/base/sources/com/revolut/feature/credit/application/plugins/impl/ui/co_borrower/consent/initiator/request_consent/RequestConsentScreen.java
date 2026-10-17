package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.a8;
import dw3.c1;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m64.b;
import m64.c;
import m64.f;
import m64.g;
import m64.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/initiator/request_consent/RequestConsentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lm64/f;", "Ldli/a;", "Lm64/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RequestConsentScreen extends PluginScreenController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RequestConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RequestConsentScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public RequestConsentScreen(RequestConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: m64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestConsentScreen f202998b;

            {
                this.f202998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RequestConsentScreen requestConsentScreen = this.f202998b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RequestConsentScreen.R;
                        qji.b bVarU2 = requestConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.di.RequestConsentScreenComponentInjector");
                        dw3.h0 h0Var = (dw3.h0) bVarU2;
                        c1 c1Var = h0Var.f118839c;
                        dw3.h0 h0Var2 = h0Var.d;
                        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = requestConsentScreen.L;
                        requestConsentScreenContract$InputData.getClass();
                        return new a8(c1Var, h0Var2, requestConsentScreen, requestConsentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestConsentScreen.R;
                        return (k) ((a8) requestConsentScreen.N.getValue()).f118297g.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestConsentScreen.R;
                        RequestConsentScreen requestConsentScreen2 = this.f202998b;
                        return dli.f.a(requestConsentScreen2, (k) requestConsentScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: m64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestConsentScreen f202998b;

            {
                this.f202998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RequestConsentScreen requestConsentScreen = this.f202998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestConsentScreen.R;
                        qji.b bVarU2 = requestConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.di.RequestConsentScreenComponentInjector");
                        dw3.h0 h0Var = (dw3.h0) bVarU2;
                        c1 c1Var = h0Var.f118839c;
                        dw3.h0 h0Var2 = h0Var.d;
                        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = requestConsentScreen.L;
                        requestConsentScreenContract$InputData.getClass();
                        return new a8(c1Var, h0Var2, requestConsentScreen, requestConsentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestConsentScreen.R;
                        return (k) ((a8) requestConsentScreen.N.getValue()).f118297g.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestConsentScreen.R;
                        RequestConsentScreen requestConsentScreen2 = this.f202998b;
                        return dli.f.a(requestConsentScreen2, (k) requestConsentScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: m64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestConsentScreen f202998b;

            {
                this.f202998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RequestConsentScreen requestConsentScreen = this.f202998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestConsentScreen.R;
                        qji.b bVarU2 = requestConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.di.RequestConsentScreenComponentInjector");
                        dw3.h0 h0Var = (dw3.h0) bVarU2;
                        c1 c1Var = h0Var.f118839c;
                        dw3.h0 h0Var2 = h0Var.d;
                        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = requestConsentScreen.L;
                        requestConsentScreenContract$InputData.getClass();
                        return new a8(c1Var, h0Var2, requestConsentScreen, requestConsentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestConsentScreen.R;
                        return (k) ((a8) requestConsentScreen.N.getValue()).f118297g.get();
                    default:
                        KProperty[] kPropertyArr3 = RequestConsentScreen.R;
                        RequestConsentScreen requestConsentScreen2 = this.f202998b;
                        return dli.f.a(requestConsentScreen2, (k) requestConsentScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f203002b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(uiState.f203001a);
        d3().f174564b.setText(uiState.f203003c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a8) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        u uVarD3 = d3();
        ViewController.P2(this, rd0.e.b(uVarD3.f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(uVarD3.f174564b.o), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}

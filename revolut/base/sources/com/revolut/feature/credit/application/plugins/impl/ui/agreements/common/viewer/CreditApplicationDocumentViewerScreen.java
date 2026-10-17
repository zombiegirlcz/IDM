package com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer;

import a84.b;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dw3.t7;
import dw3.u7;
import dx4.t0;
import hs3.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.time.b;
import rr0.f;
import te0.w;
import uxe.l;
import v44.d;
import v44.g;
import v44.i;
import v44.j;
import v44.k;
import v44.n;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.v;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/common/viewer/CreditApplicationDocumentViewerScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lv44/j;", "Ldli/a;", "Lv44/k;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationDocumentViewerScreen extends PluginScreenController<j> implements a, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CreditApplicationDocumentViewerScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditApplicationDocumentViewerBinding;", 0))};
    public final CreditApplicationDocumentViewerScreenContract$InputData L;
    public AnalyticsContext M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final WebViewDelegate T;
    public final InputChecklistDelegate U;
    public f V;

    public CreditApplicationDocumentViewerScreen(CreditApplicationDocumentViewerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = inputData.f;
        this.N = R$layout.screen_credit_application_document_viewer;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: v44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerScreen f285938b;

            {
                this.f285938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = this.f285938b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentViewerScreen.W;
                        qji.b bVarU2 = creditApplicationDocumentViewerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.di.CreditApplicationDocumentViewerScreenInjector");
                        t7 t7Var = (t7) ((w44.a) bVarU2).s().mo3808a(creditApplicationDocumentViewerScreen);
                        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = creditApplicationDocumentViewerScreen.L;
                        switch (t7Var.f119864a) {
                            case 0:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 2:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 3:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 4:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 5:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                        }
                        return (u7) t7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentViewerScreen.W;
                        u7 u7Var = (u7) creditApplicationDocumentViewerScreen.O.getValue();
                        switch (u7Var.f119937a) {
                            case 0:
                                return (n) u7Var.f119941h.get();
                            case 1:
                                return (n) u7Var.f119941h.get();
                            case 2:
                                return (n) u7Var.f119941h.get();
                            case 3:
                                return (n) u7Var.f119941h.get();
                            case 4:
                                return (n) u7Var.f119941h.get();
                            case 5:
                                return (n) u7Var.f119941h.get();
                            default:
                                return (n) u7Var.f119941h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentViewerScreen.W;
                        return ((u7) creditApplicationDocumentViewerScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = CreditApplicationDocumentViewerScreen.W;
                        CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen2 = this.f285938b;
                        return dli.f.a(creditApplicationDocumentViewerScreen2, creditApplicationDocumentViewerScreen2.d(), v.k(creditApplicationDocumentViewerScreen2.T, creditApplicationDocumentViewerScreen2.U, new TextDelegate()), R$id.creditApplicationDocumentViewerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: v44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerScreen f285938b;

            {
                this.f285938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = this.f285938b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentViewerScreen.W;
                        qji.b bVarU2 = creditApplicationDocumentViewerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.di.CreditApplicationDocumentViewerScreenInjector");
                        t7 t7Var = (t7) ((w44.a) bVarU2).s().mo3808a(creditApplicationDocumentViewerScreen);
                        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = creditApplicationDocumentViewerScreen.L;
                        switch (t7Var.f119864a) {
                            case 0:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 2:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 3:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 4:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 5:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                        }
                        return (u7) t7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentViewerScreen.W;
                        u7 u7Var = (u7) creditApplicationDocumentViewerScreen.O.getValue();
                        switch (u7Var.f119937a) {
                            case 0:
                                return (n) u7Var.f119941h.get();
                            case 1:
                                return (n) u7Var.f119941h.get();
                            case 2:
                                return (n) u7Var.f119941h.get();
                            case 3:
                                return (n) u7Var.f119941h.get();
                            case 4:
                                return (n) u7Var.f119941h.get();
                            case 5:
                                return (n) u7Var.f119941h.get();
                            default:
                                return (n) u7Var.f119941h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentViewerScreen.W;
                        return ((u7) creditApplicationDocumentViewerScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = CreditApplicationDocumentViewerScreen.W;
                        CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen2 = this.f285938b;
                        return dli.f.a(creditApplicationDocumentViewerScreen2, creditApplicationDocumentViewerScreen2.d(), v.k(creditApplicationDocumentViewerScreen2.T, creditApplicationDocumentViewerScreen2.U, new TextDelegate()), R$id.creditApplicationDocumentViewerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: v44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerScreen f285938b;

            {
                this.f285938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = this.f285938b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentViewerScreen.W;
                        qji.b bVarU2 = creditApplicationDocumentViewerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.di.CreditApplicationDocumentViewerScreenInjector");
                        t7 t7Var = (t7) ((w44.a) bVarU2).s().mo3808a(creditApplicationDocumentViewerScreen);
                        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = creditApplicationDocumentViewerScreen.L;
                        switch (t7Var.f119864a) {
                            case 0:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 2:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 3:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 4:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 5:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                        }
                        return (u7) t7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentViewerScreen.W;
                        u7 u7Var = (u7) creditApplicationDocumentViewerScreen.O.getValue();
                        switch (u7Var.f119937a) {
                            case 0:
                                return (n) u7Var.f119941h.get();
                            case 1:
                                return (n) u7Var.f119941h.get();
                            case 2:
                                return (n) u7Var.f119941h.get();
                            case 3:
                                return (n) u7Var.f119941h.get();
                            case 4:
                                return (n) u7Var.f119941h.get();
                            case 5:
                                return (n) u7Var.f119941h.get();
                            default:
                                return (n) u7Var.f119941h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentViewerScreen.W;
                        return ((u7) creditApplicationDocumentViewerScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = CreditApplicationDocumentViewerScreen.W;
                        CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen2 = this.f285938b;
                        return dli.f.a(creditApplicationDocumentViewerScreen2, creditApplicationDocumentViewerScreen2.d(), v.k(creditApplicationDocumentViewerScreen2.T, creditApplicationDocumentViewerScreen2.U, new TextDelegate()), R$id.creditApplicationDocumentViewerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, v44.b.f);
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: v44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerScreen f285938b;

            {
                this.f285938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = this.f285938b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentViewerScreen.W;
                        qji.b bVarU2 = creditApplicationDocumentViewerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.di.CreditApplicationDocumentViewerScreenInjector");
                        t7 t7Var = (t7) ((w44.a) bVarU2).s().mo3808a(creditApplicationDocumentViewerScreen);
                        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = creditApplicationDocumentViewerScreen.L;
                        switch (t7Var.f119864a) {
                            case 0:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 2:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 3:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 4:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            case 5:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentViewerScreenContract$InputData.getClass();
                                t7Var.d = creditApplicationDocumentViewerScreenContract$InputData;
                                break;
                        }
                        return (u7) t7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentViewerScreen.W;
                        u7 u7Var = (u7) creditApplicationDocumentViewerScreen.O.getValue();
                        switch (u7Var.f119937a) {
                            case 0:
                                return (n) u7Var.f119941h.get();
                            case 1:
                                return (n) u7Var.f119941h.get();
                            case 2:
                                return (n) u7Var.f119941h.get();
                            case 3:
                                return (n) u7Var.f119941h.get();
                            case 4:
                                return (n) u7Var.f119941h.get();
                            case 5:
                                return (n) u7Var.f119941h.get();
                            default:
                                return (n) u7Var.f119941h.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentViewerScreen.W;
                        return ((u7) creditApplicationDocumentViewerScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr4 = CreditApplicationDocumentViewerScreen.W;
                        CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen2 = this.f285938b;
                        return dli.f.a(creditApplicationDocumentViewerScreen2, creditApplicationDocumentViewerScreen2.d(), v.k(creditApplicationDocumentViewerScreen2.T, creditApplicationDocumentViewerScreen2.U, new TextDelegate()), R$id.creditApplicationDocumentViewerScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = new WebViewDelegate();
        this.U = new InputChecklistDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.Q.getValue();
        boolean z = uiState.f285954g;
        aVar.Q(z, z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        navBarWithToolbarF3.setToolbarTitle(uiState.f285952b);
        navBarWithToolbarF3.setMenuItems(uiState.e);
        Integer num = uiState.f;
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView recyclerViewH = h();
            Context context = h().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerViewH.setBackgroundColor(kli.a.s(iIntValue, context));
        }
        TwinVerticalButton twinVerticalButtonE = E();
        twinVerticalButtonE.setMainButtonText(uiState.f285953c);
        twinVerticalButtonE.setMainButtonEnabled(uiState.f285955h);
        f fVar = this.V;
        if (fVar != null) {
            fVar.b(uiState.i);
        } else {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton twinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(twinVerticalButton, "creditApplicationDocumen…rScreenTwinVerticalButton");
        return twinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d().C2(i.f285950a);
        return true;
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    @Override // a84.b
    public final q1 O0() {
        return this.L.d.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u7) this.O.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        navBarWithToolbarF3.setExpanded(false, false);
        navBarWithToolbarF3.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbarF3.j0(false);
        this.V = E().l0();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().o.f57403b), null, new d(this, null, 1), 3);
        WebViewDelegate webViewDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(webViewDelegate.f), null, new v44.e(this, null, 0), 3);
        vkm.d dVarB = rd0.e.b(webViewDelegate.q());
        Unit unit = Unit.f186387a;
        b.Companion companion = kotlin.time.b.INSTANCE;
        com.revolut.kompot.navigable.a.g2(this, c.M(dVarB, unit, kotlin.time.c.g(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, pkm.e.MILLISECONDS), "CreditApplicationDocumentViewerScreen PageDisplayed timeout"), null, new l(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f52518c), null, new v44.c(this, null), 3);
    }

    public final aw3.d d3() {
        ViewBinding value = this.R.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    @Override // a84.b
    public final void f1() {
        n nVarD = d();
        String str = nVarD.o.f66988b;
        List list = ((g) ((j2) nVarD.f285961s.f22677a).getValue()).f285946h;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((t0) obj2).d) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((t0) it8.next()).f120770a);
        }
        nVarD.C2(new v44.h(str, arrayList2));
    }

    public final NavBarWithToolbar f3() {
        NavBarWithToolbar navBarWithToolbar = d3().f10677b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "creditApplicationDocumen…erScreenNavBarWithToolbar");
        return navBarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView creditApplicationDocumentViewerScreenRecyclerView = d3().f10678c;
        Intrinsics.checkNotNullExpressionValue(creditApplicationDocumentViewerScreenRecyclerView, "creditApplicationDocumentViewerScreenRecyclerView");
        return creditApplicationDocumentViewerScreenRecyclerView;
    }

    @Override // a84.b
    public final boolean i() {
        ju3.b bVar = this.L.d.f66360c;
        bVar.getClass();
        return bVar == ju3.b.QUICK_READ_ACTION_SUPPORT;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // a84.b
    public final void o1() {
        f3().setExpanded(false, true);
    }
}

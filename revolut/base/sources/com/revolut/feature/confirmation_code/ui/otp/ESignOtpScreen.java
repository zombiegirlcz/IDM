package com.revolut.feature.confirmation_code.ui.otp;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.confirmation_code.R$layout;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import r0e.c;
import re3.d;
import rk3.b;
import rk3.e;
import rk3.i;
import rk3.j;
import te0.w;
import vc.s;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/confirmation_code/ui/otp/ESignOtpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrk3/i;", "Ldli/a;", "Lrk3/k;", "Lno/m;", "Lno/k;", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ESignOtpScreen extends ViewController<i> implements dli.a, m, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ESignOtpScreen.class, "binding", "getBinding()Lcom/revolut/feature/confirmation_code/databinding/ScreenOtpBinding;", 0))};
    public final ESignOtpScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final AnalyticsProduct N;
    public AnalyticsContext O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public ESignOtpScreen(ESignOtpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_otp;
        this.M = true;
        AnalyticsProduct analyticsProductG = inputData.i;
        if (analyticsProductG == null) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.k;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        }
        this.N = analyticsProductG;
        this.O = inputData.f65956j;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rk3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignOtpScreen f254727b;

            {
                this.f254727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ESignOtpScreen eSignOtpScreen = this.f254727b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ESignOtpScreen.V;
                        qji.b bVarU2 = eSignOtpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.confirmation_code.ui.otp.di.ESignOtpScreenInjector");
                        dd9.a aVar = (dd9.a) ((sk3.b) bVarU2).c().mo3808a(eSignOtpScreen);
                        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = eSignOtpScreen.K;
                        switch (aVar.f113118a) {
                            case 0:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            case 1:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            default:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                        }
                        return (sk3.a) aVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ESignOtpScreen.V;
                        return ((sk3.a) eSignOtpScreen.P.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = ESignOtpScreen.V;
                        ESignOtpScreen eSignOtpScreen2 = this.f254727b;
                        return dli.f.a(eSignOtpScreen2, eSignOtpScreen2.R2(), v.k((TextDelegate) eSignOtpScreen2.U.getValue(), (CodeEditorDelegate) eSignOtpScreen2.T.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rk3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignOtpScreen f254727b;

            {
                this.f254727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ESignOtpScreen eSignOtpScreen = this.f254727b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ESignOtpScreen.V;
                        qji.b bVarU2 = eSignOtpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.confirmation_code.ui.otp.di.ESignOtpScreenInjector");
                        dd9.a aVar = (dd9.a) ((sk3.b) bVarU2).c().mo3808a(eSignOtpScreen);
                        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = eSignOtpScreen.K;
                        switch (aVar.f113118a) {
                            case 0:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            case 1:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            default:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                        }
                        return (sk3.a) aVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ESignOtpScreen.V;
                        return ((sk3.a) eSignOtpScreen.P.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = ESignOtpScreen.V;
                        ESignOtpScreen eSignOtpScreen2 = this.f254727b;
                        return dli.f.a(eSignOtpScreen2, eSignOtpScreen2.R2(), v.k((TextDelegate) eSignOtpScreen2.U.getValue(), (CodeEditorDelegate) eSignOtpScreen2.T.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rk3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ESignOtpScreen f254727b;

            {
                this.f254727b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ESignOtpScreen eSignOtpScreen = this.f254727b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ESignOtpScreen.V;
                        qji.b bVarU2 = eSignOtpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.confirmation_code.ui.otp.di.ESignOtpScreenInjector");
                        dd9.a aVar = (dd9.a) ((sk3.b) bVarU2).c().mo3808a(eSignOtpScreen);
                        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = eSignOtpScreen.K;
                        switch (aVar.f113118a) {
                            case 0:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            case 1:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                            default:
                                eSignOtpScreenContract$InputData.getClass();
                                aVar.f113120c = eSignOtpScreenContract$InputData;
                                break;
                        }
                        return (sk3.a) aVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ESignOtpScreen.V;
                        return ((sk3.a) eSignOtpScreen.P.getValue()).d();
                    default:
                        KProperty[] kPropertyArr3 = ESignOtpScreen.V;
                        ESignOtpScreen eSignOtpScreen2 = this.f254727b;
                        return dli.f.a(eSignOtpScreen2, eSignOtpScreen2.R2(), v.k((TextDelegate) eSignOtpScreen2.U.getValue(), (CodeEditorDelegate) eSignOtpScreen2.T.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.S = s.t(this, b.f);
        this.T = w.y0(new d(15));
        this.U = w.y0(new d(16));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        rk3.k uiState = (rk3.k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ok3.a aVarD3 = d3();
        aVarD3.f225896b.setNavigationButtonImage(uiState.f254737b);
        NavBarWithToolbar navBarWithToolbar = aVarD3.f225896b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        Clause clause = uiState.d;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f254738c);
        aVarD3.f225897c.setItems(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) R2();
        return (aVar.o.d || ((e) ((j2) aVar.v.f22677a).getValue()).d) ? false : true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (sk3.a) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f225896b.setSecondDescriptionVisible(true);
        d3().f225896b.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f225896b.f59410q), new c(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.U.getValue()).f53530c), new rk3.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) this.T.getValue()).d.f121375b), new rk3.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f225897c.d), new rk3.d(this, null, 1), 3);
    }

    public final ok3.a d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ok3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}

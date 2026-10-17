package com.revolut.feature.kyc.impl.screens.documentid_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bu7.y;
import bx8.i;
import bx8.j;
import bx8.k;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import com.revolut.feature.kyc.impl.screens.documentid_input.a;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zu8.a0;
import zu8.b0;
import zu8.c0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/screens/documentid_input/KYCDocumentIdInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/kyc/impl/screens/documentid_input/a;", "Ltki/c;", "Lbx8/o;", "Lno/m;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KYCDocumentIdInputScreen extends ViewController<a> implements c, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(KYCDocumentIdInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final KYCDocumentIdInputScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final Object N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public KYCDocumentIdInputScreen(KYCDocumentIdInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = s.t(this, bx8.h.f);
        this.N = w.y0(new y(13));
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bx8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KYCDocumentIdInputScreen f19518b;

            {
                this.f19518b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KYCDocumentIdInputScreen kYCDocumentIdInputScreen = this.f19518b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = KYCDocumentIdInputScreen.T;
                        qji.b bVarU2 = kYCDocumentIdInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.documentid_input.di.KYCDocumentIdInputScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        c0 c0Var = a0Var.f325227b;
                        a0 a0Var2 = a0Var.f325228c;
                        KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = kYCDocumentIdInputScreen.K;
                        kYCDocumentIdInputScreenContract$InputData.getClass();
                        return new b0(c0Var, a0Var2, kYCDocumentIdInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = KYCDocumentIdInputScreen.T;
                        return (q) ((b0) kYCDocumentIdInputScreen.Q.getValue()).f325233c.get();
                    default:
                        KProperty[] kPropertyArr3 = KYCDocumentIdInputScreen.T;
                        KYCDocumentIdInputScreen kYCDocumentIdInputScreen2 = this.f19518b;
                        return tki.g.a(kYCDocumentIdInputScreen2, kYCDocumentIdInputScreen2.R2(), u.c((InputTextDelegate) kYCDocumentIdInputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bx8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KYCDocumentIdInputScreen f19518b;

            {
                this.f19518b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KYCDocumentIdInputScreen kYCDocumentIdInputScreen = this.f19518b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KYCDocumentIdInputScreen.T;
                        qji.b bVarU2 = kYCDocumentIdInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.documentid_input.di.KYCDocumentIdInputScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        c0 c0Var = a0Var.f325227b;
                        a0 a0Var2 = a0Var.f325228c;
                        KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = kYCDocumentIdInputScreen.K;
                        kYCDocumentIdInputScreenContract$InputData.getClass();
                        return new b0(c0Var, a0Var2, kYCDocumentIdInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = KYCDocumentIdInputScreen.T;
                        return (q) ((b0) kYCDocumentIdInputScreen.Q.getValue()).f325233c.get();
                    default:
                        KProperty[] kPropertyArr3 = KYCDocumentIdInputScreen.T;
                        KYCDocumentIdInputScreen kYCDocumentIdInputScreen2 = this.f19518b;
                        return tki.g.a(kYCDocumentIdInputScreen2, kYCDocumentIdInputScreen2.R2(), u.c((InputTextDelegate) kYCDocumentIdInputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bx8.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KYCDocumentIdInputScreen f19518b;

            {
                this.f19518b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                KYCDocumentIdInputScreen kYCDocumentIdInputScreen = this.f19518b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KYCDocumentIdInputScreen.T;
                        qji.b bVarU2 = kYCDocumentIdInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.documentid_input.di.KYCDocumentIdInputScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        c0 c0Var = a0Var.f325227b;
                        a0 a0Var2 = a0Var.f325228c;
                        KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = kYCDocumentIdInputScreen.K;
                        kYCDocumentIdInputScreenContract$InputData.getClass();
                        return new b0(c0Var, a0Var2, kYCDocumentIdInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = KYCDocumentIdInputScreen.T;
                        return (q) ((b0) kYCDocumentIdInputScreen.Q.getValue()).f325233c.get();
                    default:
                        KProperty[] kPropertyArr3 = KYCDocumentIdInputScreen.T;
                        KYCDocumentIdInputScreen kYCDocumentIdInputScreen2 = this.f19518b;
                        return tki.g.a(kYCDocumentIdInputScreen2, kYCDocumentIdInputScreen2.R2(), u.c((InputTextDelegate) kYCDocumentIdInputScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        bx8.o uiState = (bx8.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TextClause textClause = uiState.f19526b;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f19527c);
        d3().f174564b.setEnabled(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) R2()).C2(a.C0513a.f77867a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new j(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new j(this, null, 1), 3);
        ?? r87 = this.N;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((InputTextDelegate) r87.getValue()).f52575g.f121375b), rd0.e.b(((InputTextDelegate) r87.getValue()).i.f121375b)), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r87.getValue()).e.f121375b), new k(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bx8.q R2() {
        return (bx8.q) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

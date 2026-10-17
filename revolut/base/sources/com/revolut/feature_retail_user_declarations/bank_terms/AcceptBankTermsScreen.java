package com.revolut.feature_retail_user_declarations.bank_terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bai.b;
import bai.d;
import bai.j;
import bai.l;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_retail_user_declarations.R$id;
import com.revolut.feature_retail_user_declarations.R$layout;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.c;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbai/j;", "Ldli/a;", "Lbai/m;", "Lno/m;", "Lkji/f;", "Companion", "a", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AcceptBankTermsScreen extends ViewController<j> implements dli.a, m, f {
    public final AcceptBankTermsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Lazy O;
    public final int P;
    public final boolean Q;
    public final h R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(AcceptBankTermsScreen.class, "binding", "getBinding()Lcom/revolut/feature_retail_user_declarations/databinding/ScreenBankTermsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AcceptBankTermsScreen(AcceptBankTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptBankTermsScreen f14096b;

            {
                this.f14096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AcceptBankTermsScreen acceptBankTermsScreen = this.f14096b;
                switch (i2) {
                    case 0:
                        AcceptBankTermsScreen.Companion companion = AcceptBankTermsScreen.INSTANCE;
                        qji.b bVarU2 = acceptBankTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.bank_terms.di.AcceptBankTermsScreenInjector");
                        oai.b bVarC = ((cai.a) bVarU2).c();
                        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = acceptBankTermsScreen.K;
                        switch (bVarC.f223660a) {
                            case 0:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                            default:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                        }
                        return (oai.c) ((oai.b) bVarC.mo3808a(acceptBankTermsScreen)).mo3783build();
                    case 1:
                        AcceptBankTermsScreen.Companion companion2 = AcceptBankTermsScreen.INSTANCE;
                        oai.c cVar = (oai.c) acceptBankTermsScreen.L.getValue();
                        switch (cVar.f223665a) {
                            case 0:
                                return (l) cVar.f223667c.get();
                            default:
                                return (l) cVar.f223667c.get();
                        }
                    case 2:
                        AcceptBankTermsScreen.Companion companion3 = AcceptBankTermsScreen.INSTANCE;
                        AcceptBankTermsScreen acceptBankTermsScreen2 = this.f14096b;
                        return dli.f.a(acceptBankTermsScreen2, acceptBankTermsScreen2.R2(), v.k((ListCellDelegate) acceptBankTermsScreen2.V.getValue(), (RowDelegate) acceptBankTermsScreen2.S.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) acceptBankTermsScreen2.T.getValue(), (ListSubheaderDelegate) acceptBankTermsScreen2.U.getValue(), (TextDelegate) acceptBankTermsScreen2.W.getValue()), R$id.bankTerms_recyclerView, null, null, null, 56);
                    default:
                        AcceptBankTermsScreen.Companion companion4 = AcceptBankTermsScreen.INSTANCE;
                        qji.c cVarZ2 = acceptBankTermsScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: bai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptBankTermsScreen f14096b;

            {
                this.f14096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AcceptBankTermsScreen acceptBankTermsScreen = this.f14096b;
                switch (i22) {
                    case 0:
                        AcceptBankTermsScreen.Companion companion = AcceptBankTermsScreen.INSTANCE;
                        qji.b bVarU2 = acceptBankTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.bank_terms.di.AcceptBankTermsScreenInjector");
                        oai.b bVarC = ((cai.a) bVarU2).c();
                        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = acceptBankTermsScreen.K;
                        switch (bVarC.f223660a) {
                            case 0:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                            default:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                        }
                        return (oai.c) ((oai.b) bVarC.mo3808a(acceptBankTermsScreen)).mo3783build();
                    case 1:
                        AcceptBankTermsScreen.Companion companion2 = AcceptBankTermsScreen.INSTANCE;
                        oai.c cVar = (oai.c) acceptBankTermsScreen.L.getValue();
                        switch (cVar.f223665a) {
                            case 0:
                                return (l) cVar.f223667c.get();
                            default:
                                return (l) cVar.f223667c.get();
                        }
                    case 2:
                        AcceptBankTermsScreen.Companion companion3 = AcceptBankTermsScreen.INSTANCE;
                        AcceptBankTermsScreen acceptBankTermsScreen2 = this.f14096b;
                        return dli.f.a(acceptBankTermsScreen2, acceptBankTermsScreen2.R2(), v.k((ListCellDelegate) acceptBankTermsScreen2.V.getValue(), (RowDelegate) acceptBankTermsScreen2.S.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) acceptBankTermsScreen2.T.getValue(), (ListSubheaderDelegate) acceptBankTermsScreen2.U.getValue(), (TextDelegate) acceptBankTermsScreen2.W.getValue()), R$id.bankTerms_recyclerView, null, null, null, 56);
                    default:
                        AcceptBankTermsScreen.Companion companion4 = AcceptBankTermsScreen.INSTANCE;
                        qji.c cVarZ2 = acceptBankTermsScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: bai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptBankTermsScreen f14096b;

            {
                this.f14096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AcceptBankTermsScreen acceptBankTermsScreen = this.f14096b;
                switch (i22) {
                    case 0:
                        AcceptBankTermsScreen.Companion companion = AcceptBankTermsScreen.INSTANCE;
                        qji.b bVarU2 = acceptBankTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.bank_terms.di.AcceptBankTermsScreenInjector");
                        oai.b bVarC = ((cai.a) bVarU2).c();
                        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = acceptBankTermsScreen.K;
                        switch (bVarC.f223660a) {
                            case 0:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                            default:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                        }
                        return (oai.c) ((oai.b) bVarC.mo3808a(acceptBankTermsScreen)).mo3783build();
                    case 1:
                        AcceptBankTermsScreen.Companion companion2 = AcceptBankTermsScreen.INSTANCE;
                        oai.c cVar = (oai.c) acceptBankTermsScreen.L.getValue();
                        switch (cVar.f223665a) {
                            case 0:
                                return (l) cVar.f223667c.get();
                            default:
                                return (l) cVar.f223667c.get();
                        }
                    case 2:
                        AcceptBankTermsScreen.Companion companion3 = AcceptBankTermsScreen.INSTANCE;
                        AcceptBankTermsScreen acceptBankTermsScreen2 = this.f14096b;
                        return dli.f.a(acceptBankTermsScreen2, acceptBankTermsScreen2.R2(), v.k((ListCellDelegate) acceptBankTermsScreen2.V.getValue(), (RowDelegate) acceptBankTermsScreen2.S.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) acceptBankTermsScreen2.T.getValue(), (ListSubheaderDelegate) acceptBankTermsScreen2.U.getValue(), (TextDelegate) acceptBankTermsScreen2.W.getValue()), R$id.bankTerms_recyclerView, null, null, null, 56);
                    default:
                        AcceptBankTermsScreen.Companion companion4 = AcceptBankTermsScreen.INSTANCE;
                        qji.c cVarZ2 = acceptBankTermsScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                }
            }
        });
        final int i5 = 3;
        this.O = yhm.j.b(new Function0(this) { // from class: bai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptBankTermsScreen f14096b;

            {
                this.f14096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AcceptBankTermsScreen acceptBankTermsScreen = this.f14096b;
                switch (i22) {
                    case 0:
                        AcceptBankTermsScreen.Companion companion = AcceptBankTermsScreen.INSTANCE;
                        qji.b bVarU2 = acceptBankTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.bank_terms.di.AcceptBankTermsScreenInjector");
                        oai.b bVarC = ((cai.a) bVarU2).c();
                        AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = acceptBankTermsScreen.K;
                        switch (bVarC.f223660a) {
                            case 0:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                            default:
                                acceptBankTermsScreenContract$InputData.getClass();
                                bVarC.f223662c = acceptBankTermsScreenContract$InputData;
                                break;
                        }
                        return (oai.c) ((oai.b) bVarC.mo3808a(acceptBankTermsScreen)).mo3783build();
                    case 1:
                        AcceptBankTermsScreen.Companion companion2 = AcceptBankTermsScreen.INSTANCE;
                        oai.c cVar = (oai.c) acceptBankTermsScreen.L.getValue();
                        switch (cVar.f223665a) {
                            case 0:
                                return (l) cVar.f223667c.get();
                            default:
                                return (l) cVar.f223667c.get();
                        }
                    case 2:
                        AcceptBankTermsScreen.Companion companion3 = AcceptBankTermsScreen.INSTANCE;
                        AcceptBankTermsScreen acceptBankTermsScreen2 = this.f14096b;
                        return dli.f.a(acceptBankTermsScreen2, acceptBankTermsScreen2.R2(), v.k((ListCellDelegate) acceptBankTermsScreen2.V.getValue(), (RowDelegate) acceptBankTermsScreen2.S.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) acceptBankTermsScreen2.T.getValue(), (ListSubheaderDelegate) acceptBankTermsScreen2.U.getValue(), (TextDelegate) acceptBankTermsScreen2.W.getValue()), R$id.bankTerms_recyclerView, null, null, null, 56);
                    default:
                        AcceptBankTermsScreen.Companion companion4 = AcceptBankTermsScreen.INSTANCE;
                        qji.c cVarZ2 = acceptBankTermsScreen.z2();
                        no.m mVar = cVarZ2 instanceof no.m ? (no.m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                }
            }
        });
        this.P = R$layout.screen_bank_terms;
        this.Q = true;
        this.R = s.t(this, b.f);
        this.S = w.y0(new b8g.a(2));
        this.T = w.y0(new b8g.a(3));
        this.U = w.y0(new b8g.a(4));
        this.V = w.y0(new b8g.a(5));
        this.W = w.y0(new b8g.a(6));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        bai.m uiState = (bai.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        TwinVerticalButton twinVerticalButton = d3().f204041c;
        boolean z = uiState.f14107g;
        Clause clause = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f14106c;
        twinVerticalButton.setCollapsible(z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        boolean z3 = uiState.f14105b;
        TwinVerticalButton bankTermsTwinVerticalButton = d3().f204041c;
        Intrinsics.checkNotNullExpressionValue(bankTermsTwinVerticalButton, "bankTermsTwinVerticalButton");
        bankTermsTwinVerticalButton.setVisibility(z3 ? 0 : 8);
        d3().f204041c.setMainButtonText(uiState.f);
        NavBarWithToolbar navBarWithToolbar = d3().f204040b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        if (clause != null) {
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setDescriptionText(clause);
        }
        navBarWithToolbar.setEndIconImage(uiState.e);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return (AnalyticsProduct) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f204040b.setHeaderTitleMode(j0.MULTILINE);
        ((dli.c) this.N.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        TwinVerticalButton twinVerticalButton = d3().f204041c;
        twinVerticalButton.setCollapsed(false, false);
        twinVerticalButton.setCollapsible(false);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setFabEnabled(true);
        twinVerticalButton.setMainButtonEnabled(true);
        twinVerticalButton.setFabAbsoluteRotation(90.0f, true);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f204041c.m0()), new bai.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((ListCellDelegate) this.V.getValue()).d), new b74.e(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), new d(this, null), 3);
        ?? r56 = this.S;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), new bai.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53225r), new bai.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f204041c.o0()), new bai.c(this, continuation, 1), 3);
    }

    public final mai.a d3() {
        ViewBinding value = this.R.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mai.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}

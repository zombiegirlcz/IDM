package com.revolut.feature.kyc.impl.introduction;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.impl.R$id;
import com.revolut.feature.kyc.impl.R$layout;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pw8.b;
import pw8.c;
import pw8.d;
import pw8.i;
import pw8.j;
import pw8.k;
import pw8.l;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;
import zu8.n0;
import zu8.p0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpw8/i;", "Ldli/a;", "Lpw8/j;", "Lno/m;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntroductionScreen extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(IntroductionScreen.class, "binding", "getBinding()Lcom/revolut/feature/kyc/impl/databinding/IntroductionScreenBinding;", 0))};
    public final IntroductionScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final AnalyticsProduct O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public IntroductionScreen(IntroductionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.introduction_screen;
        this.M = w.y0(new pni.a(15));
        this.N = s.t(this, b.f);
        this.O = inputData.e;
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: pw8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroductionScreen f240344b;

            {
                this.f240344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IntroductionScreen introductionScreen = this.f240344b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IntroductionScreen.T;
                        qji.b bVarU2 = introductionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.introduction.di.IntroductionScreenInjector");
                        n0 n0Var = (n0) ((qw8.a) bVarU2).b().mo3808a(introductionScreen);
                        IntroductionScreenContract$InputData introductionScreenContract$InputData = introductionScreen.K;
                        switch (n0Var.f325324a) {
                            case 0:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                            default:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                        }
                        return (p0) n0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = IntroductionScreen.T;
                        p0 p0Var = (p0) introductionScreen.Q.getValue();
                        switch (p0Var.f325335a) {
                            case 0:
                                return (k) p0Var.f325337c.get();
                            default:
                                return (k) p0Var.f325337c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = IntroductionScreen.T;
                        IntroductionScreen introductionScreen2 = this.f240344b;
                        return dli.f.a(introductionScreen2, introductionScreen2.d(), v.k(new SimpleMediaDelegate(), new ListCellDelegate(), new TextDelegate(), (ProductSelectionDelegate) introductionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: pw8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroductionScreen f240344b;

            {
                this.f240344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IntroductionScreen introductionScreen = this.f240344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IntroductionScreen.T;
                        qji.b bVarU2 = introductionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.introduction.di.IntroductionScreenInjector");
                        n0 n0Var = (n0) ((qw8.a) bVarU2).b().mo3808a(introductionScreen);
                        IntroductionScreenContract$InputData introductionScreenContract$InputData = introductionScreen.K;
                        switch (n0Var.f325324a) {
                            case 0:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                            default:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                        }
                        return (p0) n0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = IntroductionScreen.T;
                        p0 p0Var = (p0) introductionScreen.Q.getValue();
                        switch (p0Var.f325335a) {
                            case 0:
                                return (k) p0Var.f325337c.get();
                            default:
                                return (k) p0Var.f325337c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = IntroductionScreen.T;
                        IntroductionScreen introductionScreen2 = this.f240344b;
                        return dli.f.a(introductionScreen2, introductionScreen2.d(), v.k(new SimpleMediaDelegate(), new ListCellDelegate(), new TextDelegate(), (ProductSelectionDelegate) introductionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: pw8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IntroductionScreen f240344b;

            {
                this.f240344b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IntroductionScreen introductionScreen = this.f240344b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IntroductionScreen.T;
                        qji.b bVarU2 = introductionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.introduction.di.IntroductionScreenInjector");
                        n0 n0Var = (n0) ((qw8.a) bVarU2).b().mo3808a(introductionScreen);
                        IntroductionScreenContract$InputData introductionScreenContract$InputData = introductionScreen.K;
                        switch (n0Var.f325324a) {
                            case 0:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                            default:
                                introductionScreenContract$InputData.getClass();
                                n0Var.d = introductionScreenContract$InputData;
                                break;
                        }
                        return (p0) n0Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = IntroductionScreen.T;
                        p0 p0Var = (p0) introductionScreen.Q.getValue();
                        switch (p0Var.f325335a) {
                            case 0:
                                return (k) p0Var.f325337c.get();
                            default:
                                return (k) p0Var.f325337c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = IntroductionScreen.T;
                        IntroductionScreen introductionScreen2 = this.f240344b;
                        return dli.f.a(introductionScreen2, introductionScreen2.d(), v.k(new SimpleMediaDelegate(), new ListCellDelegate(), new TextDelegate(), (ProductSelectionDelegate) introductionScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f300080c;
        Clause clause = uiState.f240351b;
        Continuation continuation = null;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Clause clause2 = uiState.f240352c;
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        IntroductionScreenContract$InputData introductionScreenContract$InputData = this.K;
        navBarWithToolbar.setNavigationButtonIcon(introductionScreenContract$InputData.f.a());
        if (introductionScreenContract$InputData.f != lx8.a.NONE) {
            ViewController.P2(this, e.b(navBarWithToolbar.f59410q), new c(this, continuation, 2), 3);
        }
        TwinVerticalButton twinVerticalButton = d3().f300079b;
        twinVerticalButton.setMainButtonVisible(uiState.e);
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setGradientBackgroundEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        l lVar = (l) d();
        if (!lVar.o.f77827g) {
            return false;
        }
        lVar.C2(pw8.e.f240345a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((dli.c) this.S.getValue()).h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinVerticalButton twinVerticalButton = d3().f300079b;
        Continuation continuation = null;
        ViewController.P2(this, e.b(twinVerticalButton.o0()), new c(this, continuation, 0), 3);
        ViewController.P2(this, e.b(twinVerticalButton.n0()), new pp4.h(2, d(), k.class, "onCtaCollapsed", "onCtaCollapsed(Z)V", 4, 8), 3);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ViewController.P2(this, e.b(twinVerticalButton.m0()), new c(this, continuation, 1), 3);
        ViewController.P2(this, e.b(((ProductSelectionDelegate) this.M.getValue()).p()), new d(this, null), 3);
        ViewController.P2(this, e.b(d3().f300080c.p0()), new pqc.k(this, continuation, 20), 3);
    }

    public final wu8.b d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wu8.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

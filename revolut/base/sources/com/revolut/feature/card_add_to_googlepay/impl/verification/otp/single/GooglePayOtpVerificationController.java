package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fw2.k;
import in0.g;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import ww2.b;
import ww2.c;
import ww2.j;
import ww2.l;
import ww2.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/otp/single/GooglePayOtpVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lww2/l;", "Ldli/a;", "Lww2/m;", "Lin0/g;", "Companion", "a", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayOtpVerificationController extends ViewController<l> implements a, g {
    public final GooglePayOtpVerificationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(GooglePayOtpVerificationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public GooglePayOtpVerificationController(GooglePayOtpVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = s.t(this, b.f);
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ww2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpVerificationController f300574b;

            {
                this.f300574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GooglePayOtpVerificationController googlePayOtpVerificationController = this.f300574b;
                switch (i2) {
                    case 0:
                        GooglePayOtpVerificationController.Companion companion = GooglePayOtpVerificationController.INSTANCE;
                        qji.b bVarU2 = googlePayOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.di.GooglePayOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData = googlePayOtpVerificationController.K;
                        googlePayOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.k(dVar, hVar2, googlePayOtpVerificationController, googlePayOtpVerificationScreenContract$InputData);
                    case 1:
                        GooglePayOtpVerificationController.Companion companion2 = GooglePayOtpVerificationController.INSTANCE;
                        return (j) ((fw2.k) googlePayOtpVerificationController.O.getValue()).e.get();
                    default:
                        GooglePayOtpVerificationController.Companion companion3 = GooglePayOtpVerificationController.INSTANCE;
                        GooglePayOtpVerificationController googlePayOtpVerificationController2 = this.f300574b;
                        return dli.f.a(googlePayOtpVerificationController2, (j) googlePayOtpVerificationController2.P.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((fw2.k) googlePayOtpVerificationController2.O.getValue()).d.get()).f22265a, 170.0f)), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ww2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpVerificationController f300574b;

            {
                this.f300574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GooglePayOtpVerificationController googlePayOtpVerificationController = this.f300574b;
                switch (i22) {
                    case 0:
                        GooglePayOtpVerificationController.Companion companion = GooglePayOtpVerificationController.INSTANCE;
                        qji.b bVarU2 = googlePayOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.di.GooglePayOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData = googlePayOtpVerificationController.K;
                        googlePayOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.k(dVar, hVar2, googlePayOtpVerificationController, googlePayOtpVerificationScreenContract$InputData);
                    case 1:
                        GooglePayOtpVerificationController.Companion companion2 = GooglePayOtpVerificationController.INSTANCE;
                        return (j) ((fw2.k) googlePayOtpVerificationController.O.getValue()).e.get();
                    default:
                        GooglePayOtpVerificationController.Companion companion3 = GooglePayOtpVerificationController.INSTANCE;
                        GooglePayOtpVerificationController googlePayOtpVerificationController2 = this.f300574b;
                        return dli.f.a(googlePayOtpVerificationController2, (j) googlePayOtpVerificationController2.P.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((fw2.k) googlePayOtpVerificationController2.O.getValue()).d.get()).f22265a, 170.0f)), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ww2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpVerificationController f300574b;

            {
                this.f300574b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GooglePayOtpVerificationController googlePayOtpVerificationController = this.f300574b;
                switch (i22) {
                    case 0:
                        GooglePayOtpVerificationController.Companion companion = GooglePayOtpVerificationController.INSTANCE;
                        qji.b bVarU2 = googlePayOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.di.GooglePayOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData = googlePayOtpVerificationController.K;
                        googlePayOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.k(dVar, hVar2, googlePayOtpVerificationController, googlePayOtpVerificationScreenContract$InputData);
                    case 1:
                        GooglePayOtpVerificationController.Companion companion2 = GooglePayOtpVerificationController.INSTANCE;
                        return (j) ((fw2.k) googlePayOtpVerificationController.O.getValue()).e.get();
                    default:
                        GooglePayOtpVerificationController.Companion companion3 = GooglePayOtpVerificationController.INSTANCE;
                        GooglePayOtpVerificationController googlePayOtpVerificationController2 = this.f300574b;
                        return dli.f.a(googlePayOtpVerificationController2, (j) googlePayOtpVerificationController2.P.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((fw2.k) googlePayOtpVerificationController2.O.getValue()).d.get()).f22265a, 170.0f)), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = d3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(uiState.f300588b, null);
        Clause clause = uiState.f300589c;
        if (clause != null) {
            d3().e.setVisibility(0);
            LargeActionButton largeActionButton = d3().f174573b;
            largeActionButton.setVisibility(0);
            largeActionButton.setText(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        largeActionButton.setVisibility(8);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.google_pay_verification_button_dont_add, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f);
        largeActionButton2.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF60605a0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}

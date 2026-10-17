package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fw2.i;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import uw2.b;
import uw2.c;
import uw2.k;
import uw2.l;
import uw2.m;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/otp/multiple/GooglePayMultipleOtpVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luw2/k;", "Ldli/a;", "Luw2/m;", "Lin0/g;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayMultipleOtpVerificationController extends ViewController<k> implements a, g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(GooglePayMultipleOtpVerificationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final GooglePayMultipleOtpVerificationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public GooglePayMultipleOtpVerificationController(GooglePayMultipleOtpVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f283523b;

            {
                this.f283523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f283523b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.i(dVar, hVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (i) ((fw2.i) googlePayMultipleOtpVerificationController.N.getValue()).f138548c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f283523b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (i) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f283523b;

            {
                this.f283523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f283523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.i(dVar, hVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (i) ((fw2.i) googlePayMultipleOtpVerificationController.N.getValue()).f138548c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f283523b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (i) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new us4.b(22));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uw2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f283523b;

            {
                this.f283523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f283523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        fw2.h hVar = (fw2.h) bVarU2;
                        fw2.d dVar = hVar.f138544b;
                        fw2.h hVar2 = hVar.f138545c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new fw2.i(dVar, hVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (i) ((fw2.i) googlePayMultipleOtpVerificationController.N.getValue()).f138548c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f283523b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (i) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = qVar instanceof l ? (l) qVar : null;
        a.z0(uiState);
        if (pd.b.k(lVar != null ? Boolean.valueOf(lVar.f283537a) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(uiState.f283539b, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uw2.i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new uea.e(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53220l), null, new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
}

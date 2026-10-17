package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple;

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
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ec8.c;
import egb.m0;
import eh1.b;
import eh1.k;
import eh1.m;
import eh1.n;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import og1.f;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/otp/multiple/GooglePayMultipleOtpVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leh1/m;", "Ldli/a;", "Leh1/o;", "Lin0/g;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayMultipleOtpVerificationController extends ViewController<m> implements a, g {
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
        this.N = w.y0(new Function0(this) { // from class: eh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f125678b;

            {
                this.f125678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f125678b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new og1.f(iVar, eVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (k) ((og1.f) googlePayMultipleOtpVerificationController.N.getValue()).f224971c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f125678b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (k) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f125678b;

            {
                this.f125678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f125678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new og1.f(iVar, eVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (k) ((og1.f) googlePayMultipleOtpVerificationController.N.getValue()).f224971c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f125678b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (k) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new m0(1));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: eh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayMultipleOtpVerificationController f125678b;

            {
                this.f125678b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = this.f125678b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayMultipleOtpVerificationController.R;
                        qji.b bVarU2 = googlePayMultipleOtpVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.di.GooglePayMultipleOtpVerificationControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = googlePayMultipleOtpVerificationController.K;
                        googlePayMultipleOtpVerificationScreenContract$InputData.getClass();
                        return new og1.f(iVar, eVar2, googlePayMultipleOtpVerificationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayMultipleOtpVerificationController.R;
                        return (k) ((og1.f) googlePayMultipleOtpVerificationController.N.getValue()).f224971c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayMultipleOtpVerificationController.R;
                        GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController2 = this.f125678b;
                        return dli.f.a(googlePayMultipleOtpVerificationController2, (k) googlePayMultipleOtpVerificationController2.O.getValue(), v.k(new PlainTextWarningDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) googlePayMultipleOtpVerificationController2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        eh1.o uiState = (eh1.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        n nVar = qVar instanceof n ? (n) qVar : null;
        a.z0(uiState);
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f125697a) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(uiState.f125699b, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
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
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53220l), null, new eh1.c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
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

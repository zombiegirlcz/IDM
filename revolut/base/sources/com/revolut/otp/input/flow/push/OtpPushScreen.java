package com.revolut.otp.input.flow.push;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.R$string;
import com.revolut.otp.input.flow.push.OtpPushScreen;
import com.revolut.otp.input.flow.push.OtpPushScreenContract$InputData;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.e0;
import ljl.q0;
import te0.w;
import uf0.d;
import ujb.v;
import uni.b;
import uni.c;
import uni.g;
import uni.i;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/otp/input/flow/push/OtpPushScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luni/g;", "Ldli/a;", "Luni/h;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpPushScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(OtpPushScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final OtpPushScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public OtpPushScreen(OtpPushScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new v(18));
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpPushScreen f281435b;

            {
                this.f281435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpPushScreen otpPushScreen = this.f281435b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OtpPushScreen.R;
                        qji.b bVarU2 = otpPushScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.push.di.OtpPushScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        OtpPushScreenContract$InputData otpPushScreenContract$InputData = otpPushScreen.K;
                        otpPushScreenContract$InputData.getClass();
                        return new e0(q0Var, cVar2, otpPushScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpPushScreen.R;
                        OtpPushScreen otpPushScreen2 = this.f281435b;
                        return dli.f.a(otpPushScreen2, (i) otpPushScreen2.Q.getValue(), u.c((CodeEditorDelegate) otpPushScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OtpPushScreen.R;
                        return (i) ((e0) otpPushScreen.O.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpPushScreen f281435b;

            {
                this.f281435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpPushScreen otpPushScreen = this.f281435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpPushScreen.R;
                        qji.b bVarU2 = otpPushScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.push.di.OtpPushScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        OtpPushScreenContract$InputData otpPushScreenContract$InputData = otpPushScreen.K;
                        otpPushScreenContract$InputData.getClass();
                        return new e0(q0Var, cVar2, otpPushScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpPushScreen.R;
                        OtpPushScreen otpPushScreen2 = this.f281435b;
                        return dli.f.a(otpPushScreen2, (i) otpPushScreen2.Q.getValue(), u.c((CodeEditorDelegate) otpPushScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OtpPushScreen.R;
                        return (i) ((e0) otpPushScreen.O.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpPushScreen f281435b;

            {
                this.f281435b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OtpPushScreen otpPushScreen = this.f281435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpPushScreen.R;
                        qji.b bVarU2 = otpPushScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.push.di.OtpPushScreenInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        OtpPushScreenContract$InputData otpPushScreenContract$InputData = otpPushScreen.K;
                        otpPushScreenContract$InputData.getClass();
                        return new e0(q0Var, cVar2, otpPushScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpPushScreen.R;
                        OtpPushScreen otpPushScreen2 = this.f281435b;
                        return dli.f.a(otpPushScreen2, (i) otpPushScreen2.Q.getValue(), u.c((CodeEditorDelegate) otpPushScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = OtpPushScreen.R;
                        return (i) ((e0) otpPushScreen.O.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        uni.h uiState = (uni.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f281442b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTag("OTP_PUSH_SCREEN_NAVBAR");
        navBarWithToolbar.setExpanded(true);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_primary_action, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) this.M.getValue()).d.f121375b), new d(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}

package com.revolut.otp.input.flow.code;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.R$id;
import com.revolut.otp.input.R$layout;
import com.revolut.otp.input.R$string;
import com.revolut.otp.input.flow.code.OtpCodeInputScreen;
import com.revolut.otp.input.flow.code.OtpCodeInputScreenContract$InputData;
import dli.a;
import ini.c;
import jkc.g;
import jni.d;
import jni.k;
import jni.l;
import jni.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wii.b;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/otp/input/flow/code/OtpCodeInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljni/k;", "Ldli/a;", "Ljni/m;", "Lwii/b;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpCodeInputScreen extends ViewController<k> implements a, b {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(OtpCodeInputScreen.class, "binding", "getBinding()Lcom/revolut/otp/input/databinding/ScreenOtpSmsInputBinding;", 0))};
    public final OtpCodeInputScreenContract$InputData K;
    public final Boolean L;
    public final int M;
    public final ModalTransitionAnimation.Style.POPUP N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public OtpCodeInputScreen(OtpCodeInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f98499h;
        this.M = R$layout.screen_otp_sms_input;
        this.N = ModalTransitionAnimation.Style.POPUP.f98391a;
        this.O = s.t(this, jni.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: jni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpCodeInputScreen f176783b;

            {
                this.f176783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtpCodeInputScreen otpCodeInputScreen = this.f176783b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OtpCodeInputScreen.V;
                        qji.b bVarU2 = otpCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.code.di.OtpCodeInputScreenInjector");
                        ini.b bVar = (ini.b) bVarU2;
                        ini.f fVar = bVar.f162956b;
                        ini.b bVar2 = bVar.f162957c;
                        OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = otpCodeInputScreen.K;
                        otpCodeInputScreenContract$InputData.getClass();
                        return new ini.c(fVar, bVar2, otpCodeInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpCodeInputScreen.V;
                        return (l) ((ini.c) otpCodeInputScreen.P.getValue()).f162959b.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpCodeInputScreen.V;
                        OtpCodeInputScreen otpCodeInputScreen2 = this.f176783b;
                        return dli.f.a(otpCodeInputScreen2, (l) otpCodeInputScreen2.Q.getValue(), zhm.v.k((PlainTextDelegate) otpCodeInputScreen2.R.getValue(), (CodeEditorDelegate) otpCodeInputScreen2.S.getValue(), (LabelButtonDelegate) otpCodeInputScreen2.T.getValue()), R$id.otpSmsInputScreen_navBar_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: jni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpCodeInputScreen f176783b;

            {
                this.f176783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtpCodeInputScreen otpCodeInputScreen = this.f176783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpCodeInputScreen.V;
                        qji.b bVarU2 = otpCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.code.di.OtpCodeInputScreenInjector");
                        ini.b bVar = (ini.b) bVarU2;
                        ini.f fVar = bVar.f162956b;
                        ini.b bVar2 = bVar.f162957c;
                        OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = otpCodeInputScreen.K;
                        otpCodeInputScreenContract$InputData.getClass();
                        return new ini.c(fVar, bVar2, otpCodeInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpCodeInputScreen.V;
                        return (l) ((ini.c) otpCodeInputScreen.P.getValue()).f162959b.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpCodeInputScreen.V;
                        OtpCodeInputScreen otpCodeInputScreen2 = this.f176783b;
                        return dli.f.a(otpCodeInputScreen2, (l) otpCodeInputScreen2.Q.getValue(), zhm.v.k((PlainTextDelegate) otpCodeInputScreen2.R.getValue(), (CodeEditorDelegate) otpCodeInputScreen2.S.getValue(), (LabelButtonDelegate) otpCodeInputScreen2.T.getValue()), R$id.otpSmsInputScreen_navBar_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new jj9.b(23));
        this.S = w.y0(new jj9.b(24));
        this.T = w.y0(new jj9.b(25));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: jni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpCodeInputScreen f176783b;

            {
                this.f176783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OtpCodeInputScreen otpCodeInputScreen = this.f176783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtpCodeInputScreen.V;
                        qji.b bVarU2 = otpCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.code.di.OtpCodeInputScreenInjector");
                        ini.b bVar = (ini.b) bVarU2;
                        ini.f fVar = bVar.f162956b;
                        ini.b bVar2 = bVar.f162957c;
                        OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = otpCodeInputScreen.K;
                        otpCodeInputScreenContract$InputData.getClass();
                        return new ini.c(fVar, bVar2, otpCodeInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = OtpCodeInputScreen.V;
                        return (l) ((ini.c) otpCodeInputScreen.P.getValue()).f162959b.get();
                    default:
                        KProperty[] kPropertyArr3 = OtpCodeInputScreen.V;
                        OtpCodeInputScreen otpCodeInputScreen2 = this.f176783b;
                        return dli.f.a(otpCodeInputScreen2, (l) otpCodeInputScreen2.Q.getValue(), zhm.v.k((PlainTextDelegate) otpCodeInputScreen2.R.getValue(), (CodeEditorDelegate) otpCodeInputScreen2.S.getValue(), (LabelButtonDelegate) otpCodeInputScreen2.T.getValue()), R$id.otpSmsInputScreen_navBar_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f154121b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f176796b);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f154121b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.otp_code_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.otp_code_screen_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f154121b.f59410q), new g(this, null, 4), 3);
        ?? r62 = this.S;
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r62.getValue()).d.f121375b), new jni.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r62.getValue()).f52100c.f121375b), new jni.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((LabelButtonDelegate) this.T.getValue()).d.f121375b), new d(this, null), 3);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getK() {
        return this.N;
    }

    public final hni.a d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hni.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}

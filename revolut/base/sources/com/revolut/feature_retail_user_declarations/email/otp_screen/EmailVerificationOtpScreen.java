package com.revolut.feature_retail_user_declarations.email.otp_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreen;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oai.l0;
import oai.m0;
import sai.b;
import sai.c;
import sai.d;
import sai.g;
import sai.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/otp_screen/EmailVerificationOtpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsai/g;", "Ldli/a;", "Lsai/i;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationOtpScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EmailVerificationOtpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EmailVerificationOtpScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;

    public EmailVerificationOtpScreen(EmailVerificationOtpScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpScreen f261408b;

            {
                this.f261408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmailVerificationOtpScreen emailVerificationOtpScreen = this.f261408b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EmailVerificationOtpScreen.T;
                        qji.b bVarU2 = emailVerificationOtpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.otp_screen.di.EmailVerificationOtpScreenInjector");
                        }
                        l0 l0VarJ = ((tai.a) bVarU2).j();
                        EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData = emailVerificationOtpScreen.K;
                        switch (l0VarJ.f223732a) {
                            case 0:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                            default:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                        }
                        return (m0) ((l0) l0VarJ.mo3808a(emailVerificationOtpScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EmailVerificationOtpScreen.T;
                        m0 m0Var = (m0) emailVerificationOtpScreen.L.getValue();
                        switch (m0Var.f223738a) {
                            case 0:
                                return (h) m0Var.f223740c.get();
                            default:
                                return (h) m0Var.f223740c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EmailVerificationOtpScreen.T;
                        EmailVerificationOtpScreen emailVerificationOtpScreen2 = this.f261408b;
                        return dli.f.a(emailVerificationOtpScreen2, emailVerificationOtpScreen2.R2(), v.k((CodeEditorDelegate) emailVerificationOtpScreen2.O.getValue(), (LabelButtonDelegate) emailVerificationOtpScreen2.P.getValue(), (PlainTextDelegate) emailVerificationOtpScreen2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpScreen f261408b;

            {
                this.f261408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmailVerificationOtpScreen emailVerificationOtpScreen = this.f261408b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailVerificationOtpScreen.T;
                        qji.b bVarU2 = emailVerificationOtpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.otp_screen.di.EmailVerificationOtpScreenInjector");
                        }
                        l0 l0VarJ = ((tai.a) bVarU2).j();
                        EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData = emailVerificationOtpScreen.K;
                        switch (l0VarJ.f223732a) {
                            case 0:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                            default:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                        }
                        return (m0) ((l0) l0VarJ.mo3808a(emailVerificationOtpScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EmailVerificationOtpScreen.T;
                        m0 m0Var = (m0) emailVerificationOtpScreen.L.getValue();
                        switch (m0Var.f223738a) {
                            case 0:
                                return (h) m0Var.f223740c.get();
                            default:
                                return (h) m0Var.f223740c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EmailVerificationOtpScreen.T;
                        EmailVerificationOtpScreen emailVerificationOtpScreen2 = this.f261408b;
                        return dli.f.a(emailVerificationOtpScreen2, emailVerificationOtpScreen2.R2(), v.k((CodeEditorDelegate) emailVerificationOtpScreen2.O.getValue(), (LabelButtonDelegate) emailVerificationOtpScreen2.P.getValue(), (PlainTextDelegate) emailVerificationOtpScreen2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new s8f.h(5));
        this.P = w.y0(new s8f.h(6));
        this.Q = w.y0(new s8f.h(7));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpScreen f261408b;

            {
                this.f261408b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmailVerificationOtpScreen emailVerificationOtpScreen = this.f261408b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EmailVerificationOtpScreen.T;
                        qji.b bVarU2 = emailVerificationOtpScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.otp_screen.di.EmailVerificationOtpScreenInjector");
                        }
                        l0 l0VarJ = ((tai.a) bVarU2).j();
                        EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData = emailVerificationOtpScreen.K;
                        switch (l0VarJ.f223732a) {
                            case 0:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                            default:
                                emailVerificationOtpScreenContract$InputData.getClass();
                                l0VarJ.d = emailVerificationOtpScreenContract$InputData;
                                break;
                        }
                        return (m0) ((l0) l0VarJ.mo3808a(emailVerificationOtpScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EmailVerificationOtpScreen.T;
                        m0 m0Var = (m0) emailVerificationOtpScreen.L.getValue();
                        switch (m0Var.f223738a) {
                            case 0:
                                return (h) m0Var.f223740c.get();
                            default:
                                return (h) m0Var.f223740c.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EmailVerificationOtpScreen.T;
                        EmailVerificationOtpScreen emailVerificationOtpScreen2 = this.f261408b;
                        return dli.f.a(emailVerificationOtpScreen2, emailVerificationOtpScreen2.R2(), v.k((CodeEditorDelegate) emailVerificationOtpScreen2.O.getValue(), (LabelButtonDelegate) emailVerificationOtpScreen2.P.getValue(), (PlainTextDelegate) emailVerificationOtpScreen2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar_nextbutton;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_inbox_button, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.signup_main_form_email_verify_otp_title, null, null, 14), null);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_main_form_email_verify_otp_subtitle, u.c(this.K.f97576a), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().d.setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r56.getValue()).d.f121375b), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r56.getValue()).f52100c.f121375b), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((LabelButtonDelegate) this.P.getValue()).d.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new sai.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new sai.e(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sai.h R2() {
        return (sai.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}

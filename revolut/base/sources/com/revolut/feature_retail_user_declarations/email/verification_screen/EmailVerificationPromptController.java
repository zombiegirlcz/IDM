package com.revolut.feature_retail_user_declarations.email.verification_screen;

import abi.d;
import abi.f;
import abi.h;
import abi.i;
import abi.j;
import abi.k;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptController;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.p0;
import oai.q0;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/verification_screen/EmailVerificationPromptController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Labi/d;", "Ldli/a;", "Labi/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationPromptController extends ViewController<d> implements dli.a {
    public final EmailVerificationPromptContract$InputData K;
    public final PromptMarketingContentDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;

    public EmailVerificationPromptController(EmailVerificationPromptContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: abi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationPromptController f2970b;

            {
                this.f2970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EmailVerificationPromptController emailVerificationPromptController = this.f2970b;
                        qji.b bVarU2 = emailVerificationPromptController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.verification_screen.di.EmailVerificationPromptInjector");
                        }
                        p0 p0VarB = ((bbi.a) bVarU2).b();
                        EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = emailVerificationPromptController.K;
                        switch (p0VarB.f223755a) {
                            case 0:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                            default:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                        }
                        return (q0) ((p0) p0VarB.mo3808a(emailVerificationPromptController)).mo3783build();
                    case 1:
                        q0 q0Var = (q0) this.f2970b.M.getValue();
                        switch (q0Var.f223761a) {
                            case 0:
                                return (e) q0Var.d.get();
                            default:
                                return (e) q0Var.d.get();
                        }
                    default:
                        EmailVerificationPromptController emailVerificationPromptController2 = this.f2970b;
                        return dli.f.a(emailVerificationPromptController2, emailVerificationPromptController2.d(), u.c(emailVerificationPromptController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: abi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationPromptController f2970b;

            {
                this.f2970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EmailVerificationPromptController emailVerificationPromptController = this.f2970b;
                        qji.b bVarU2 = emailVerificationPromptController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.verification_screen.di.EmailVerificationPromptInjector");
                        }
                        p0 p0VarB = ((bbi.a) bVarU2).b();
                        EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = emailVerificationPromptController.K;
                        switch (p0VarB.f223755a) {
                            case 0:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                            default:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                        }
                        return (q0) ((p0) p0VarB.mo3808a(emailVerificationPromptController)).mo3783build();
                    case 1:
                        q0 q0Var = (q0) this.f2970b.M.getValue();
                        switch (q0Var.f223761a) {
                            case 0:
                                return (e) q0Var.d.get();
                            default:
                                return (e) q0Var.d.get();
                        }
                    default:
                        EmailVerificationPromptController emailVerificationPromptController2 = this.f2970b;
                        return dli.f.a(emailVerificationPromptController2, emailVerificationPromptController2.d(), u.c(emailVerificationPromptController2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: abi.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationPromptController f2970b;

            {
                this.f2970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EmailVerificationPromptController emailVerificationPromptController = this.f2970b;
                        qji.b bVarU2 = emailVerificationPromptController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.verification_screen.di.EmailVerificationPromptInjector");
                        }
                        p0 p0VarB = ((bbi.a) bVarU2).b();
                        EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = emailVerificationPromptController.K;
                        switch (p0VarB.f223755a) {
                            case 0:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                            default:
                                emailVerificationPromptContract$InputData.getClass();
                                p0VarB.d = emailVerificationPromptContract$InputData;
                                break;
                        }
                        return (q0) ((p0) p0VarB.mo3808a(emailVerificationPromptController)).mo3783build();
                    case 1:
                        q0 q0Var = (q0) this.f2970b.M.getValue();
                        switch (q0Var.f223761a) {
                            case 0:
                                return (e) q0Var.d.get();
                            default:
                                return (e) q0Var.d.get();
                        }
                    default:
                        EmailVerificationPromptController emailVerificationPromptController2 = this.f2970b;
                        return dli.f.a(emailVerificationPromptController2, emailVerificationPromptController2.d(), u.c(emailVerificationPromptController2.L), 0, null, null, null, 60);
                }
            }
        });
        this.P = R$layout.screen_recycler_view;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new h(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final abi.e d() {
        return (abi.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}

package com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import oai.n0;
import oai.o0;
import pki.a;
import pki.b;
import u7k.f0;
import uai.d;
import uai.e;
import uai.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Luai/d;", "Lcli/w;", "Luai/e;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationCooldownBottomSheetController extends BaseBottomSheetController<d> implements w {
    public static final /* synthetic */ int R = 0;
    public final EmailVerificationCooldownBottomSheetContract$InputData N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EmailVerificationCooldownBottomSheetController(EmailVerificationCooldownBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: uai.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationCooldownBottomSheetController f278668b;

            {
                this.f278668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmailVerificationCooldownBottomSheetController emailVerificationCooldownBottomSheetController = this.f278668b;
                switch (i2) {
                    case 0:
                        int i3 = EmailVerificationCooldownBottomSheetController.R;
                        qji.b bVarU2 = emailVerificationCooldownBottomSheetController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.di.EmailVerificationCooldownBottomSheetComponentInjector");
                        }
                        n0 n0VarC = ((wai.a) bVarU2).c();
                        EmailVerificationCooldownBottomSheetContract$InputData emailVerificationCooldownBottomSheetContract$InputData = emailVerificationCooldownBottomSheetController.N;
                        switch (n0VarC.f223744a) {
                            case 0:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 1:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 2:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 3:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            default:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                        }
                        return (o0) ((n0) n0VarC.mo3808a(emailVerificationCooldownBottomSheetController)).mo3783build();
                    case 1:
                        int i5 = EmailVerificationCooldownBottomSheetController.R;
                        return n14.e.a(emailVerificationCooldownBottomSheetController, (i) emailVerificationCooldownBottomSheetController.Q.getValue());
                    default:
                        int i6 = EmailVerificationCooldownBottomSheetController.R;
                        o0 o0Var = (o0) emailVerificationCooldownBottomSheetController.O.getValue();
                        switch (o0Var.f223750a) {
                            case 0:
                                g gVar = new g(o0Var.f223751b);
                                i0 i0Var = o0Var.f223752c;
                                return new i(gVar, (vai.c) i0Var.A.get(), (xai.a) i0Var.f223715y.get(), o0Var.f223751b, (pai.a) i0Var.B.get());
                            case 1:
                                g gVar2 = new g(o0Var.f223751b);
                                i0 i0Var2 = o0Var.f223752c;
                                return new i(gVar2, (vai.c) i0Var2.A.get(), (xai.a) i0Var2.f223715y.get(), o0Var.f223751b, (pai.a) i0Var2.B.get());
                            case 2:
                                g gVar3 = new g(o0Var.f223751b);
                                i0 i0Var3 = o0Var.f223752c;
                                return new i(gVar3, (vai.c) i0Var3.A.get(), (xai.a) i0Var3.f223715y.get(), o0Var.f223751b, (pai.a) i0Var3.B.get());
                            case 3:
                                g gVar4 = new g(o0Var.f223751b);
                                i0 i0Var4 = o0Var.f223752c;
                                return new i(gVar4, (vai.c) i0Var4.A.get(), (xai.a) i0Var4.f223715y.get(), o0Var.f223751b, (pai.a) i0Var4.B.get());
                            default:
                                g gVar5 = new g(o0Var.f223751b);
                                i0 i0Var5 = o0Var.f223752c;
                                return new i(gVar5, (vai.c) i0Var5.A.get(), (xai.a) i0Var5.f223715y.get(), o0Var.f223751b, (pai.a) i0Var5.B.get());
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: uai.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationCooldownBottomSheetController f278668b;

            {
                this.f278668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmailVerificationCooldownBottomSheetController emailVerificationCooldownBottomSheetController = this.f278668b;
                switch (i22) {
                    case 0:
                        int i3 = EmailVerificationCooldownBottomSheetController.R;
                        qji.b bVarU2 = emailVerificationCooldownBottomSheetController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.di.EmailVerificationCooldownBottomSheetComponentInjector");
                        }
                        n0 n0VarC = ((wai.a) bVarU2).c();
                        EmailVerificationCooldownBottomSheetContract$InputData emailVerificationCooldownBottomSheetContract$InputData = emailVerificationCooldownBottomSheetController.N;
                        switch (n0VarC.f223744a) {
                            case 0:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 1:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 2:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 3:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            default:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                        }
                        return (o0) ((n0) n0VarC.mo3808a(emailVerificationCooldownBottomSheetController)).mo3783build();
                    case 1:
                        int i5 = EmailVerificationCooldownBottomSheetController.R;
                        return n14.e.a(emailVerificationCooldownBottomSheetController, (i) emailVerificationCooldownBottomSheetController.Q.getValue());
                    default:
                        int i6 = EmailVerificationCooldownBottomSheetController.R;
                        o0 o0Var = (o0) emailVerificationCooldownBottomSheetController.O.getValue();
                        switch (o0Var.f223750a) {
                            case 0:
                                g gVar = new g(o0Var.f223751b);
                                i0 i0Var = o0Var.f223752c;
                                return new i(gVar, (vai.c) i0Var.A.get(), (xai.a) i0Var.f223715y.get(), o0Var.f223751b, (pai.a) i0Var.B.get());
                            case 1:
                                g gVar2 = new g(o0Var.f223751b);
                                i0 i0Var2 = o0Var.f223752c;
                                return new i(gVar2, (vai.c) i0Var2.A.get(), (xai.a) i0Var2.f223715y.get(), o0Var.f223751b, (pai.a) i0Var2.B.get());
                            case 2:
                                g gVar3 = new g(o0Var.f223751b);
                                i0 i0Var3 = o0Var.f223752c;
                                return new i(gVar3, (vai.c) i0Var3.A.get(), (xai.a) i0Var3.f223715y.get(), o0Var.f223751b, (pai.a) i0Var3.B.get());
                            case 3:
                                g gVar4 = new g(o0Var.f223751b);
                                i0 i0Var4 = o0Var.f223752c;
                                return new i(gVar4, (vai.c) i0Var4.A.get(), (xai.a) i0Var4.f223715y.get(), o0Var.f223751b, (pai.a) i0Var4.B.get());
                            default:
                                g gVar5 = new g(o0Var.f223751b);
                                i0 i0Var5 = o0Var.f223752c;
                                return new i(gVar5, (vai.c) i0Var5.A.get(), (xai.a) i0Var5.f223715y.get(), o0Var.f223751b, (pai.a) i0Var5.B.get());
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: uai.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationCooldownBottomSheetController f278668b;

            {
                this.f278668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EmailVerificationCooldownBottomSheetController emailVerificationCooldownBottomSheetController = this.f278668b;
                switch (i22) {
                    case 0:
                        int i32 = EmailVerificationCooldownBottomSheetController.R;
                        qji.b bVarU2 = emailVerificationCooldownBottomSheetController.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.di.EmailVerificationCooldownBottomSheetComponentInjector");
                        }
                        n0 n0VarC = ((wai.a) bVarU2).c();
                        EmailVerificationCooldownBottomSheetContract$InputData emailVerificationCooldownBottomSheetContract$InputData = emailVerificationCooldownBottomSheetController.N;
                        switch (n0VarC.f223744a) {
                            case 0:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 1:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 2:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            case 3:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                            default:
                                emailVerificationCooldownBottomSheetContract$InputData.getClass();
                                n0VarC.d = emailVerificationCooldownBottomSheetContract$InputData;
                                break;
                        }
                        return (o0) ((n0) n0VarC.mo3808a(emailVerificationCooldownBottomSheetController)).mo3783build();
                    case 1:
                        int i5 = EmailVerificationCooldownBottomSheetController.R;
                        return n14.e.a(emailVerificationCooldownBottomSheetController, (i) emailVerificationCooldownBottomSheetController.Q.getValue());
                    default:
                        int i6 = EmailVerificationCooldownBottomSheetController.R;
                        o0 o0Var = (o0) emailVerificationCooldownBottomSheetController.O.getValue();
                        switch (o0Var.f223750a) {
                            case 0:
                                g gVar = new g(o0Var.f223751b);
                                i0 i0Var = o0Var.f223752c;
                                return new i(gVar, (vai.c) i0Var.A.get(), (xai.a) i0Var.f223715y.get(), o0Var.f223751b, (pai.a) i0Var.B.get());
                            case 1:
                                g gVar2 = new g(o0Var.f223751b);
                                i0 i0Var2 = o0Var.f223752c;
                                return new i(gVar2, (vai.c) i0Var2.A.get(), (xai.a) i0Var2.f223715y.get(), o0Var.f223751b, (pai.a) i0Var2.B.get());
                            case 2:
                                g gVar3 = new g(o0Var.f223751b);
                                i0 i0Var3 = o0Var.f223752c;
                                return new i(gVar3, (vai.c) i0Var3.A.get(), (xai.a) i0Var3.f223715y.get(), o0Var.f223751b, (pai.a) i0Var3.B.get());
                            case 3:
                                g gVar4 = new g(o0Var.f223751b);
                                i0 i0Var4 = o0Var.f223752c;
                                return new i(gVar4, (vai.c) i0Var4.A.get(), (xai.a) i0Var4.f223715y.get(), o0Var.f223751b, (pai.a) i0Var4.B.get());
                            default:
                                g gVar5 = new g(o0Var.f223751b);
                                i0 i0Var5 = o0Var.f223752c;
                                return new i(gVar5, (vai.c) i0Var5.A.get(), (xai.a) i0Var5.f223715y.get(), o0Var.f223751b, (pai.a) i0Var5.B.get());
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f278666a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new f0(this, null, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.P.getValue();
    }
}

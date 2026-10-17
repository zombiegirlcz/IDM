package com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheet;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheetContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import cyc.c;
import dze.n;
import e18.i;
import ebi.a;
import ebi.d;
import ebi.g;
import ebi.h;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import oai.j0;
import oai.k0;
import pd.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_bottomsheet/EmailVerificationOtpBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lebi/g;", "Lebi/d;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationOtpBottomSheet extends BaseBottomSheetRecyclerController<g, d> {
    public static final /* synthetic */ int V = 0;
    public final EmailVerificationOtpBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public EmailVerificationOtpBottomSheet(EmailVerificationOtpBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        Lazy lazyY0 = w.y0(new i(29));
        this.R = lazyY0;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: ebi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpBottomSheet f124364b;

            {
                this.f124364b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EmailVerificationOtpBottomSheet emailVerificationOtpBottomSheet = this.f124364b;
                switch (i2) {
                    case 0:
                        int i3 = EmailVerificationOtpBottomSheet.V;
                        k0 k0Var = (k0) emailVerificationOtpBottomSheet.T.getValue();
                        switch (k0Var.f223726a) {
                            case 0:
                                EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData = k0Var.f223727b;
                                i0 i0Var = k0Var.f223728c;
                                return new j(emailVerificationOtpBottomSheetContract$InputData, (pai.a) i0Var.B.get(), new rai.a(), (xai.a) i0Var.f223715y.get(), new pai.f(), new l(k0Var.f223727b));
                            default:
                                EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData2 = k0Var.f223727b;
                                i0 i0Var2 = k0Var.f223728c;
                                return new j(emailVerificationOtpBottomSheetContract$InputData2, (pai.a) i0Var2.B.get(), new rai.a(), (xai.a) i0Var2.f223715y.get(), new pai.f(), new l(k0Var.f223727b));
                        }
                    default:
                        int i5 = EmailVerificationOtpBottomSheet.V;
                        qji.b bVarU2 = emailVerificationOtpBottomSheet.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.di.EmailVerificationOtpBottomSheetComponentInjector");
                        }
                        j0 j0VarQ = ((fbi.a) bVarU2).q();
                        EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData3 = emailVerificationOtpBottomSheet.Q;
                        switch (j0VarQ.f223720a) {
                            case 0:
                                emailVerificationOtpBottomSheetContract$InputData3.getClass();
                                j0VarQ.d = emailVerificationOtpBottomSheetContract$InputData3;
                                break;
                            default:
                                emailVerificationOtpBottomSheetContract$InputData3.getClass();
                                j0VarQ.d = emailVerificationOtpBottomSheetContract$InputData3;
                                break;
                        }
                        return (k0) ((j0) j0VarQ.mo3808a(emailVerificationOtpBottomSheet)).mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ebi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpBottomSheet f124364b;

            {
                this.f124364b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EmailVerificationOtpBottomSheet emailVerificationOtpBottomSheet = this.f124364b;
                switch (i22) {
                    case 0:
                        int i3 = EmailVerificationOtpBottomSheet.V;
                        k0 k0Var = (k0) emailVerificationOtpBottomSheet.T.getValue();
                        switch (k0Var.f223726a) {
                            case 0:
                                EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData = k0Var.f223727b;
                                i0 i0Var = k0Var.f223728c;
                                return new j(emailVerificationOtpBottomSheetContract$InputData, (pai.a) i0Var.B.get(), new rai.a(), (xai.a) i0Var.f223715y.get(), new pai.f(), new l(k0Var.f223727b));
                            default:
                                EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData2 = k0Var.f223727b;
                                i0 i0Var2 = k0Var.f223728c;
                                return new j(emailVerificationOtpBottomSheetContract$InputData2, (pai.a) i0Var2.B.get(), new rai.a(), (xai.a) i0Var2.f223715y.get(), new pai.f(), new l(k0Var.f223727b));
                        }
                    default:
                        int i5 = EmailVerificationOtpBottomSheet.V;
                        qji.b bVarU2 = emailVerificationOtpBottomSheet.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.di.EmailVerificationOtpBottomSheetComponentInjector");
                        }
                        j0 j0VarQ = ((fbi.a) bVarU2).q();
                        EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData3 = emailVerificationOtpBottomSheet.Q;
                        switch (j0VarQ.f223720a) {
                            case 0:
                                emailVerificationOtpBottomSheetContract$InputData3.getClass();
                                j0VarQ.d = emailVerificationOtpBottomSheetContract$InputData3;
                                break;
                            default:
                                emailVerificationOtpBottomSheetContract$InputData3.getClass();
                                j0VarQ.d = emailVerificationOtpBottomSheetContract$InputData3;
                                break;
                        }
                        return (k0) ((j0) j0VarQ.mo3808a(emailVerificationOtpBottomSheet)).mo3783build();
                }
            }
        });
        this.U = u.c((CodeEditorDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        b.b(this, new a(this, view, 0));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r102 = this.R;
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r102.getValue()).d.f121375b), new c(2, d(), h.class, "onCodeChanged", "onCodeChanged(Ljava/lang/String;)V", 4, 12), 3);
        ViewController.P2(this, rd0.e.b(((CodeEditorDelegate) r102.getValue()).f52100c.f121375b), new ebi.c(this, null, 0), 3);
        ViewController.P2(this, e3(), new n(this, null, 28), 3);
        ViewController.P2(this, h3(), new ebi.c(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        View viewFindFocus;
        super.i1(z);
        if (z || (viewFindFocus = D2().findFocus()) == null) {
            return;
        }
        kli.c.c(viewFindFocus, true);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h R2() {
        return (h) this.S.getValue();
    }
}

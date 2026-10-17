package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import android.view.View;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlow;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import oai.l;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowOutputData;", "Lyki/f;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationOtpFlow extends ViewController<EmailVerificationOtpFlowOutputData> implements f, kji.f {
    public final EmailVerificationOtpFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EmailVerificationOtpFlow(EmailVerificationOtpFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpFlow f142263b;

            {
                this.f142263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EmailVerificationOtpFlow emailVerificationOtpFlow = this.f142263b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationOtpFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmailVerificationOtpFlowInputData emailVerificationOtpFlowInputData = emailVerificationOtpFlow.K;
                        emailVerificationOtpFlowInputData.getClass();
                        return new l(i0Var, emailVerificationOtpFlowInputData);
                    case 1:
                        return (b) ((l) this.f142263b.L.getValue()).d.get();
                    default:
                        EmailVerificationOtpFlow emailVerificationOtpFlow2 = this.f142263b;
                        return czi.c.d(0, 6, null, emailVerificationOtpFlow2, (b) emailVerificationOtpFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpFlow f142263b;

            {
                this.f142263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EmailVerificationOtpFlow emailVerificationOtpFlow = this.f142263b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationOtpFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmailVerificationOtpFlowInputData emailVerificationOtpFlowInputData = emailVerificationOtpFlow.K;
                        emailVerificationOtpFlowInputData.getClass();
                        return new l(i0Var, emailVerificationOtpFlowInputData);
                    case 1:
                        return (b) ((l) this.f142263b.L.getValue()).d.get();
                    default:
                        EmailVerificationOtpFlow emailVerificationOtpFlow2 = this.f142263b;
                        return czi.c.d(0, 6, null, emailVerificationOtpFlow2, (b) emailVerificationOtpFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: gbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmailVerificationOtpFlow f142263b;

            {
                this.f142263b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EmailVerificationOtpFlow emailVerificationOtpFlow = this.f142263b;
                        phm.a aVar = (phm.a) ue0.e.j(emailVerificationOtpFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmailVerificationOtpFlowInputData emailVerificationOtpFlowInputData = emailVerificationOtpFlow.K;
                        emailVerificationOtpFlowInputData.getClass();
                        return new l(i0Var, emailVerificationOtpFlowInputData);
                    case 1:
                        return (b) ((l) this.f142263b.L.getValue()).d.get();
                    default:
                        EmailVerificationOtpFlow emailVerificationOtpFlow2 = this.f142263b;
                        return czi.c.d(0, 6, null, emailVerificationOtpFlow2, (b) emailVerificationOtpFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gbi.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.f97624a instanceof EmailVerificationOtpFlowInputData.Origin.PostOnboarding) {
            view.setBackground(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

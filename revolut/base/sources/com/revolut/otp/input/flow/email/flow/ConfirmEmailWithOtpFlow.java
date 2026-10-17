package com.revolut.otp.input.flow.email.flow;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import tni.f;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/otp/input/flow/email/flow/ConfirmEmailWithOtpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltni/f;", "Lyki/f;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmEmailWithOtpFlow extends ViewController<f> implements yki.f {
    public final Object K;
    public final Object L;
    public final Object M;

    public ConfirmEmailWithOtpFlow(ConfirmEmailWithOtpFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: tni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmEmailWithOtpFlow f272454b;

            {
                this.f272454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConfirmEmailWithOtpFlow confirmEmailWithOtpFlow = this.f272454b;
                        return czi.c.d(0, 6, null, confirmEmailWithOtpFlow, (b) confirmEmailWithOtpFlow.M.getValue());
                    default:
                        return (b) ((ini.a) this.f272454b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new tml.a(this, inputData, 2));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmEmailWithOtpFlow f272454b;

            {
                this.f272454b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConfirmEmailWithOtpFlow confirmEmailWithOtpFlow = this.f272454b;
                        return czi.c.d(0, 6, null, confirmEmailWithOtpFlow, (b) confirmEmailWithOtpFlow.M.getValue());
                    default:
                        return (b) ((ini.a) this.f272454b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ini.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ini.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (tni.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}

package com.revolut.feature.apm.upi.impl.flow.intent_payment;

import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import d2k.f;
import if2.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/intent_payment/UpiIntentPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/f;", "Lyki/f;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiIntentPaymentFlow extends ViewController<f> implements yki.f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public UpiIntentPaymentFlow(UpiIntentPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new s86.a(this, inputData, 13));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiIntentPaymentFlow f262327b;

            {
                this.f262327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((i) this.f262327b.L.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        UpiIntentPaymentFlow upiIntentPaymentFlow = this.f262327b;
                        return c.d(i2, 4, null, upiIntentPaymentFlow, (b) upiIntentPaymentFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: sf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiIntentPaymentFlow f262327b;

            {
                this.f262327b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((i) this.f262327b.L.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        UpiIntentPaymentFlow upiIntentPaymentFlow = this.f262327b;
                        return c.d(i22, 4, null, upiIntentPaymentFlow, (b) upiIntentPaymentFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sf2.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

package com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.y1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wrj.m;
import ws4.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/custom_amount/CreditCardRepayCustomAmountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lws4/c;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayCustomAmountFlow extends ViewController<c> implements f {
    public final Object K;
    public final boolean L;
    public final Object M;
    public final Object N;

    public CreditCardRepayCustomAmountFlow(CreditCardRepayCustomAmountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ws4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayCustomAmountFlow f299652b;

            {
                this.f299652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardRepayCustomAmountFlow creditCardRepayCustomAmountFlow = this.f299652b;
                        return czi.c.d(0, 6, null, creditCardRepayCustomAmountFlow, (b) creditCardRepayCustomAmountFlow.N.getValue());
                    default:
                        return (b) ((y1) this.f299652b.M.getValue()).d.get();
                }
            }
        });
        this.L = true;
        this.M = w.y0(new m(this, inputData, 2));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ws4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayCustomAmountFlow f299652b;

            {
                this.f299652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardRepayCustomAmountFlow creditCardRepayCustomAmountFlow = this.f299652b;
                        return czi.c.d(0, 6, null, creditCardRepayCustomAmountFlow, (b) creditCardRepayCustomAmountFlow.N.getValue());
                    default:
                        return (b) ((y1) this.f299652b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y1) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ws4.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}

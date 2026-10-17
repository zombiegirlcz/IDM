package com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments;

import at4.b;
import at4.c;
import at4.d;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.a2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lat4/d;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayFutureInstalmentsFlow extends ViewController<d> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public CreditCardRepayFutureInstalmentsFlow(CreditCardRepayFutureInstalmentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: at4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayFutureInstalmentsFlow f8994b;

            {
                this.f8994b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardRepayFutureInstalmentsFlow creditCardRepayFutureInstalmentsFlow = this.f8994b;
                        return czi.c.d(0, 6, null, creditCardRepayFutureInstalmentsFlow, (c) creditCardRepayFutureInstalmentsFlow.M.getValue());
                    default:
                        return (c) ((a2) this.f8994b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 0));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: at4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayFutureInstalmentsFlow f8994b;

            {
                this.f8994b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardRepayFutureInstalmentsFlow creditCardRepayFutureInstalmentsFlow = this.f8994b;
                        return czi.c.d(0, 6, null, creditCardRepayFutureInstalmentsFlow, (c) creditCardRepayFutureInstalmentsFlow.M.getValue());
                    default:
                        return (c) ((a2) this.f8994b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (a2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}

package com.revolut.feature.credit.card.impl.ui.statement_financing.flow;

import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import hl6.b;
import hw4.c;
import jm4.r2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/flow/CreditCardStatementFinancingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhw4/c;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementFinancingFlow extends ViewController<c> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public CreditCardStatementFinancingFlow(CreditCardStatementFinancingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: hw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingFlow f156097b;

            {
                this.f156097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardStatementFinancingFlow creditCardStatementFinancingFlow = this.f156097b;
                        return czi.c.d(0, 6, null, creditCardStatementFinancingFlow, (b) creditCardStatementFinancingFlow.M.getValue());
                    default:
                        return (b) ((r2) this.f156097b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 21));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingFlow f156097b;

            {
                this.f156097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardStatementFinancingFlow creditCardStatementFinancingFlow = this.f156097b;
                        return czi.c.d(0, 6, null, creditCardStatementFinancingFlow, (b) creditCardStatementFinancingFlow.M.getValue());
                    default:
                        return (b) ((r2) this.f156097b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (r2) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hw4.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}

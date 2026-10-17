package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.b1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe2.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentAnticipationFlow extends ViewController<Object> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public CreditCardInstalmentAnticipationFlow(CreditCardInstalmentAnticipationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ps4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentAnticipationFlow f239391b;

            {
                this.f239391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardInstalmentAnticipationFlow creditCardInstalmentAnticipationFlow = this.f239391b;
                        return czi.c.d(0, 6, null, creditCardInstalmentAnticipationFlow, (b) creditCardInstalmentAnticipationFlow.M.getValue());
                    default:
                        return (b) ((b1) this.f239391b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new c(this, inputData, 28));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ps4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentAnticipationFlow f239391b;

            {
                this.f239391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardInstalmentAnticipationFlow creditCardInstalmentAnticipationFlow = this.f239391b;
                        return czi.c.d(0, 6, null, creditCardInstalmentAnticipationFlow, (b) creditCardInstalmentAnticipationFlow.M.getValue());
                    default:
                        return (b) ((b1) this.f239391b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (b1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ps4.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}

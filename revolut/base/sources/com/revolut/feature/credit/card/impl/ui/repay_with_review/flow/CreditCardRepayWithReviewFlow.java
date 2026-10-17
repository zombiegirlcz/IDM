package com.revolut.feature.credit.card.impl.ui.repay_with_review.flow;

import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlow;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.flow.CreditCardRepayWithReviewFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.a3;
import jm4.e2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pu4.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpu4/c;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayWithReviewFlow extends ViewController<c> implements f {
    public final CreditCardRepayWithReviewFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public CreditCardRepayWithReviewFlow(CreditCardRepayWithReviewFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayWithReviewFlow f239818b;

            {
                this.f239818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((e2) this.f239818b.O.getValue()).d.get();
                    case 1:
                        int i2 = R$id.screen_transparent_container;
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow = this.f239818b;
                        return czi.c.d(i2, 4, null, creditCardRepayWithReviewFlow, (b) creditCardRepayWithReviewFlow.L.getValue());
                    default:
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow2 = this.f239818b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayWithReviewFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayWithReviewFlowContract$InputData creditCardRepayWithReviewFlowContract$InputData = creditCardRepayWithReviewFlow2.K;
                        creditCardRepayWithReviewFlowContract$InputData.getClass();
                        return new e2(a3Var, creditCardRepayWithReviewFlowContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayWithReviewFlow f239818b;

            {
                this.f239818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((e2) this.f239818b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow = this.f239818b;
                        return czi.c.d(i22, 4, null, creditCardRepayWithReviewFlow, (b) creditCardRepayWithReviewFlow.L.getValue());
                    default:
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow2 = this.f239818b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayWithReviewFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayWithReviewFlowContract$InputData creditCardRepayWithReviewFlowContract$InputData = creditCardRepayWithReviewFlow2.K;
                        creditCardRepayWithReviewFlowContract$InputData.getClass();
                        return new e2(a3Var, creditCardRepayWithReviewFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayWithReviewFlow f239818b;

            {
                this.f239818b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((e2) this.f239818b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow = this.f239818b;
                        return czi.c.d(i22, 4, null, creditCardRepayWithReviewFlow, (b) creditCardRepayWithReviewFlow.L.getValue());
                    default:
                        CreditCardRepayWithReviewFlow creditCardRepayWithReviewFlow2 = this.f239818b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayWithReviewFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayWithReviewFlowContract$InputData creditCardRepayWithReviewFlowContract$InputData = creditCardRepayWithReviewFlow2.K;
                        creditCardRepayWithReviewFlowContract$InputData.getClass();
                        return new e2(a3Var, creditCardRepayWithReviewFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (e2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (pu4.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

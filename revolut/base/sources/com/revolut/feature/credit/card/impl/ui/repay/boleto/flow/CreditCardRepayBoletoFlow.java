package com.revolut.feature.credit.card.impl.ui.repay.boleto.flow;

import au4.e;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlow;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.a3;
import jm4.x1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/flow/CreditCardRepayBoletoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lau4/e;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayBoletoFlow extends ViewController<e> implements f {
    public final CreditCardRepayBoletoFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreditCardRepayBoletoFlow(CreditCardRepayBoletoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: au4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayBoletoFlow f9485b;

            {
                this.f9485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow = this.f9485b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditCardRepayBoletoFlow, (b) creditCardRepayBoletoFlow.O.getValue());
                    case 1:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow2 = this.f9485b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayBoletoFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayBoletoFlowContract$InputData creditCardRepayBoletoFlowContract$InputData = creditCardRepayBoletoFlow2.K;
                        creditCardRepayBoletoFlowContract$InputData.getClass();
                        return new x1(a3Var, creditCardRepayBoletoFlowContract$InputData);
                    default:
                        return (b) ((x1) this.f9485b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: au4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayBoletoFlow f9485b;

            {
                this.f9485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow = this.f9485b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditCardRepayBoletoFlow, (b) creditCardRepayBoletoFlow.O.getValue());
                    case 1:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow2 = this.f9485b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayBoletoFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayBoletoFlowContract$InputData creditCardRepayBoletoFlowContract$InputData = creditCardRepayBoletoFlow2.K;
                        creditCardRepayBoletoFlowContract$InputData.getClass();
                        return new x1(a3Var, creditCardRepayBoletoFlowContract$InputData);
                    default:
                        return (b) ((x1) this.f9485b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: au4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayBoletoFlow f9485b;

            {
                this.f9485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow = this.f9485b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditCardRepayBoletoFlow, (b) creditCardRepayBoletoFlow.O.getValue());
                    case 1:
                        CreditCardRepayBoletoFlow creditCardRepayBoletoFlow2 = this.f9485b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardRepayBoletoFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardRepayBoletoFlowContract$InputData creditCardRepayBoletoFlowContract$InputData = creditCardRepayBoletoFlow2.K;
                        creditCardRepayBoletoFlowContract$InputData.getClass();
                        return new x1(a3Var, creditCardRepayBoletoFlowContract$InputData);
                    default:
                        return (b) ((x1) this.f9485b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (x1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (au4.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}

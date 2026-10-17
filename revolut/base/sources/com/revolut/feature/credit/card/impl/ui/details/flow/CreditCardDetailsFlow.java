package com.revolut.feature.credit.card.impl.ui.details.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import jm4.a3;
import jm4.t0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/details/flow/CreditCardDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardDetailsFlow extends ViewController<q> implements f {
    public final CreditCardDetailsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreditCardDetailsFlow(CreditCardDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDetailsFlow f117087b;

            {
                this.f117087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardDetailsFlow creditCardDetailsFlow = this.f117087b;
                        return czi.c.d(0, 6, null, creditCardDetailsFlow, (b) creditCardDetailsFlow.N.getValue());
                    case 1:
                        CreditCardDetailsFlow creditCardDetailsFlow2 = this.f117087b;
                        phm.a aVar = (phm.a) e.j(creditCardDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDetailsFlowContract$InputData creditCardDetailsFlowContract$InputData = creditCardDetailsFlow2.K;
                        creditCardDetailsFlowContract$InputData.getClass();
                        return new t0(a3Var, creditCardDetailsFlowContract$InputData);
                    default:
                        return (b) ((t0) this.f117087b.M.getValue()).f176361b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDetailsFlow f117087b;

            {
                this.f117087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardDetailsFlow creditCardDetailsFlow = this.f117087b;
                        return czi.c.d(0, 6, null, creditCardDetailsFlow, (b) creditCardDetailsFlow.N.getValue());
                    case 1:
                        CreditCardDetailsFlow creditCardDetailsFlow2 = this.f117087b;
                        phm.a aVar = (phm.a) e.j(creditCardDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDetailsFlowContract$InputData creditCardDetailsFlowContract$InputData = creditCardDetailsFlow2.K;
                        creditCardDetailsFlowContract$InputData.getClass();
                        return new t0(a3Var, creditCardDetailsFlowContract$InputData);
                    default:
                        return (b) ((t0) this.f117087b.M.getValue()).f176361b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: dr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardDetailsFlow f117087b;

            {
                this.f117087b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditCardDetailsFlow creditCardDetailsFlow = this.f117087b;
                        return czi.c.d(0, 6, null, creditCardDetailsFlow, (b) creditCardDetailsFlow.N.getValue());
                    case 1:
                        CreditCardDetailsFlow creditCardDetailsFlow2 = this.f117087b;
                        phm.a aVar = (phm.a) e.j(creditCardDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDetailsFlowContract$InputData creditCardDetailsFlowContract$InputData = creditCardDetailsFlow2.K;
                        creditCardDetailsFlowContract$InputData.getClass();
                        return new t0(a3Var, creditCardDetailsFlowContract$InputData);
                    default:
                        return (b) ((t0) this.f117087b.M.getValue()).f176361b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (t0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dr4.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}

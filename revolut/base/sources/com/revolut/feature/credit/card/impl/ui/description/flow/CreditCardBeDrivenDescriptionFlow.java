package com.revolut.feature.credit.card.impl.ui.description.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlow;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import jm4.a3;
import jm4.k0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/description/flow/CreditCardBeDrivenDescriptionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardBeDrivenDescriptionFlow extends ViewController<q> implements f {
    public final CreditCardBeDrivenDescriptionFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreditCardBeDrivenDescriptionFlow(CreditCardBeDrivenDescriptionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBeDrivenDescriptionFlow f324358b;

            {
                this.f324358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow = this.f324358b;
                        return c.d(R$id.screen_transparent_container, 4, null, creditCardBeDrivenDescriptionFlow, (b) creditCardBeDrivenDescriptionFlow.O.getValue());
                    case 1:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow2 = this.f324358b;
                        phm.a aVar = (phm.a) e.j(creditCardBeDrivenDescriptionFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = creditCardBeDrivenDescriptionFlow2.K;
                        creditCardBeDrivenDescriptionFlowContract$InputData.getClass();
                        return new k0(a3Var, creditCardBeDrivenDescriptionFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f324358b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBeDrivenDescriptionFlow f324358b;

            {
                this.f324358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow = this.f324358b;
                        return c.d(R$id.screen_transparent_container, 4, null, creditCardBeDrivenDescriptionFlow, (b) creditCardBeDrivenDescriptionFlow.O.getValue());
                    case 1:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow2 = this.f324358b;
                        phm.a aVar = (phm.a) e.j(creditCardBeDrivenDescriptionFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = creditCardBeDrivenDescriptionFlow2.K;
                        creditCardBeDrivenDescriptionFlowContract$InputData.getClass();
                        return new k0(a3Var, creditCardBeDrivenDescriptionFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f324358b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBeDrivenDescriptionFlow f324358b;

            {
                this.f324358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow = this.f324358b;
                        return c.d(R$id.screen_transparent_container, 4, null, creditCardBeDrivenDescriptionFlow, (b) creditCardBeDrivenDescriptionFlow.O.getValue());
                    case 1:
                        CreditCardBeDrivenDescriptionFlow creditCardBeDrivenDescriptionFlow2 = this.f324358b;
                        phm.a aVar = (phm.a) e.j(creditCardBeDrivenDescriptionFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = creditCardBeDrivenDescriptionFlow2.K;
                        creditCardBeDrivenDescriptionFlowContract$InputData.getClass();
                        return new k0(a3Var, creditCardBeDrivenDescriptionFlowContract$InputData);
                    default:
                        return (b) ((k0) this.f324358b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (zq4.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}

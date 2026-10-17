package com.revolut.feature.revolutpay.impl.ui.instore.flow;

import a0.d;
import aii.q;
import com.revolut.feature.revolutpay.impl.ui.instore.flow.InStorePaymentFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p7c.g;
import p7c.r;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/instore/flow/InStorePaymentFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/revolutpay/impl/ui/instore/flow/InStorePaymentFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InStorePaymentFlow extends BaseFlow<InStorePaymentFlowContract$Step, IOData$EmptyInput, q> {
    public final Object P;
    public final Object Q;

    public InStorePaymentFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: a9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InStorePaymentFlow f2404b;

            {
                this.f2404b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f2404b.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((r) aVar2.b()).D);
                        }
                        throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                    default:
                        return (b) ((g) this.f2404b.P.getValue()).f233611b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: a9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InStorePaymentFlow f2404b;

            {
                this.f2404b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f2404b.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new g(((r) aVar2.b()).D);
                        }
                        throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                    default:
                        return (b) ((g) this.f2404b.P.getValue()).f233611b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (a9c.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        InStorePaymentFlowContract$Step step = (InStorePaymentFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

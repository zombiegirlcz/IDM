package com.revolut.feature.acquiring.card_reader.order.impl.ui.flow;

import aii.q;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import db1.c;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderOrderFlow extends BaseFlow<CardReaderOrderFlowContract$Step, IOData$EmptyInput, q> {
    public final boolean P;
    public final Object Q;
    public final Object R;

    public CardReaderOrderFlow() {
        super(IOData$EmptyInput.f98299a);
        this.P = true;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: fb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderOrderFlow f133428b;

            {
                this.f133428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f133428b.m2()).a().get(db1.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new db1.c(((db1.b) aVar2.b()).f112646c);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", db1.b.class, " is not found"));
                    default:
                        return (b) ((db1.c) this.f133428b.Q.getValue()).f112649c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: fb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderOrderFlow f133428b;

            {
                this.f133428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f133428b.m2()).a().get(db1.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new db1.c(((db1.b) aVar2.b()).f112646c);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", db1.b.class, " is not found"));
                    default:
                        return (b) ((db1.c) this.f133428b.Q.getValue()).f112649c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (fb1.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CardReaderOrderFlowContract$Step step = (CardReaderOrderFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

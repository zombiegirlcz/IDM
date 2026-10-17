package com.revolut.feature.offboarding.impl.flow;

import a0.d;
import aii.q;
import com.revolut.feature.offboarding.impl.flow.RetailContainerFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/offboarding/impl/flow/RetailContainerFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/offboarding/impl/flow/RetailContainerFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_retail_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailContainerFlow extends BaseFlow<RetailContainerFlowContract$Step, IOData$EmptyInput, q> {
    public final Object P;
    public final Object Q;

    public RetailContainerFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: t79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailContainerFlow f268622b;

            {
                this.f268622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f268622b.m2()).a().get(r8l.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r8l.a.class, " is not found"));
                        }
                        s79.b bVar = ((s79.b) aVar2.b()).f260592b;
                        s79.a aVar3 = new s79.a();
                        aVar3.f260590a = e4m.b.b(new r96.a(7));
                        return aVar3;
                    default:
                        return (b) ((s79.a) this.f268622b.P.getValue()).f260590a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: t79.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RetailContainerFlow f268622b;

            {
                this.f268622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f268622b.m2()).a().get(r8l.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r8l.a.class, " is not found"));
                        }
                        s79.b bVar = ((s79.b) aVar2.b()).f260592b;
                        s79.a aVar3 = new s79.a();
                        aVar3.f260590a = e4m.b.b(new r96.a(7));
                        return aVar3;
                    default:
                        return (b) ((s79.a) this.f268622b.P.getValue()).f260590a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (s79.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (s79.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (t79.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        RetailContainerFlowContract$Step step = (RetailContainerFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

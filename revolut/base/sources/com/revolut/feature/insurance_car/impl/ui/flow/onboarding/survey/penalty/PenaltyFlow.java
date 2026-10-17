package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty;

import an7.c;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.PenaltyFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import ql7.k0;
import ql7.y0;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/penalty/PenaltyFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/penalty/PenaltyFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lan7/c;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PenaltyFlow extends BaseFlow<PenaltyFlowContract$Step, IOData$EmptyInput, c> {
    public final Object P;
    public final Object Q;

    public PenaltyFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: an7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PenaltyFlow f6570b;

            {
                this.f6570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PenaltyFlow penaltyFlow = this.f6570b;
                        phm.a aVar = (phm.a) e.j(penaltyFlow.m2()).a().get(fl7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new y0(((k0) aVar2.b()).f247359n, penaltyFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
                    default:
                        return (b) ((y0) this.f6570b.P.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: an7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PenaltyFlow f6570b;

            {
                this.f6570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PenaltyFlow penaltyFlow = this.f6570b;
                        phm.a aVar = (phm.a) e.j(penaltyFlow.m2()).a().get(fl7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new y0(((k0) aVar2.b()).f247359n, penaltyFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fl7.a.class, " is not found"));
                    default:
                        return (b) ((y0) this.f6570b.P.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (y0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (y0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (an7.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PenaltyFlowContract$Step step = (PenaltyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

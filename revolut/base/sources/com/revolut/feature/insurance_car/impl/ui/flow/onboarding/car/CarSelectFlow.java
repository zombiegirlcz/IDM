package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car;

import a0.d;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import km7.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ql7.k0;
import ql7.q;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lkm7/c;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CarSelectFlow extends BaseFlow<CarSelectFlowContract$Step, IOData$EmptyInput, c> {
    public final Object P;
    public final Object Q;

    public CarSelectFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: km7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarSelectFlow f185730b;

            {
                this.f185730b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CarSelectFlow carSelectFlow = this.f185730b;
                        phm.a aVar = (phm.a) e.j(carSelectFlow.m2()).a().get(fl7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new q(((k0) aVar2.b()).f247359n, carSelectFlow);
                        }
                        throw new IllegalStateException(d.q("Api ", fl7.a.class, " is not found"));
                    default:
                        return (b) ((q) this.f185730b.P.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: km7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarSelectFlow f185730b;

            {
                this.f185730b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CarSelectFlow carSelectFlow = this.f185730b;
                        phm.a aVar = (phm.a) e.j(carSelectFlow.m2()).a().get(fl7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new q(((k0) aVar2.b()).f247359n, carSelectFlow);
                        }
                        throw new IllegalStateException(d.q("Api ", fl7.a.class, " is not found"));
                    default:
                        return (b) ((q) this.f185730b.P.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (q) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (q) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (km7.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CarSelectFlowContract$Step step = (CarSelectFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

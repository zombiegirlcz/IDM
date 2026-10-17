package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import aii.q;
import com.revolut.feature.voluntary.offboarding.impl.R$id;
import com.revolut.feature.voluntary.offboarding.impl.R$layout;
import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/voluntary/offboarding/impl/ui/flow/VoluntaryOffboardingFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VoluntaryOffboardingFlow extends BaseFlow<VoluntaryOffboardingFlowContract$Step, IOData$EmptyInput, q> {
    public final int P;
    public final int Q;
    public final boolean R;
    public final Object S;
    public final Object T;

    public VoluntaryOffboardingFlow() {
        super(IOData$EmptyInput.f98299a);
        this.P = R$layout.flow_voluntary_offboarding;
        this.Q = R$id.voluntaryOffboardingFlow_container;
        this.R = true;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: jsg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VoluntaryOffboardingFlow f178173b;

            {
                this.f178173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f178173b.m2()).a().get(zrg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new fsg.e(((fsg.d) aVar2.b()).f137685p);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zrg.a.class, " is not found"));
                    default:
                        return (b) ((fsg.e) this.f178173b.S.getValue()).f137687b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: jsg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VoluntaryOffboardingFlow f178173b;

            {
                this.f178173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f178173b.m2()).a().get(zrg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new fsg.e(((fsg.d) aVar2.b()).f137685p);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zrg.a.class, " is not found"));
                    default:
                        return (b) ((fsg.e) this.f178173b.S.getValue()).f137687b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (fsg.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (fsg.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (jsg.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        VoluntaryOffboardingFlowContract$Step step = (VoluntaryOffboardingFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}

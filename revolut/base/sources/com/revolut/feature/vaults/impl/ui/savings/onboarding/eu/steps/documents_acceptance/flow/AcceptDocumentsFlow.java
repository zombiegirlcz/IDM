package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow;

import aii.q;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.AcceptDocumentsFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wpg.b;
import wpg.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/vaults/impl/ui/savings/onboarding/eu/steps/documents_acceptance/flow/AcceptDocumentsFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AcceptDocumentsFlow extends BaseFlow<AcceptDocumentsFlowContract$Step, IOData$EmptyInput, q> {
    public final Object P;
    public final Object Q;

    public AcceptDocumentsFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: erg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptDocumentsFlow f128665b;

            {
                this.f128665b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f128665b.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new wpg.b(((l) aVar2.b()).F);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                    default:
                        return (b) ((wpg.b) this.f128665b.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: erg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AcceptDocumentsFlow f128665b;

            {
                this.f128665b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f128665b.m2()).a().get(fpg.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new wpg.b(((l) aVar2.b()).F);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", fpg.c.class, " is not found"));
                    default:
                        return (b) ((wpg.b) this.f128665b.P.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AcceptDocumentsFlowContract$Step step = (AcceptDocumentsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

package com.revolut.feature.shared.help_centre.impl.faq;

import aii.q;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l40.v;
import no.d1;
import r7d.l;
import r7d.t;
import te0.w;
import tz6.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/shared/help_centre/impl/faq/FaqFlowContract$Step;", "Lcom/revolut/feature/shared/help_centre/api/faq/SharedFaqDestination$InputData;", "Laii/q;", "Lno/d1;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqFlow extends BaseFlow<FaqFlowContract$Step, SharedFaqDestination.InputData, q> implements d1 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqFlow(SharedFaqDestination.InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: u7d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqFlow f277736b;

            {
                this.f277736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FaqFlow faqFlow = this.f277736b;
                        phm.a aVar = (phm.a) ue0.e.j(faqFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f252135l;
                        SharedFaqDestination.InputData inputData2 = (SharedFaqDestination.InputData) faqFlow.G;
                        inputData2.getClass();
                        return new t(lVar, inputData2);
                    default:
                        return (b) ((t) ((v7d.a) this.f277736b.P.getValue())).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: u7d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqFlow f277736b;

            {
                this.f277736b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FaqFlow faqFlow = this.f277736b;
                        phm.a aVar = (phm.a) ue0.e.j(faqFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f252135l;
                        SharedFaqDestination.InputData inputData2 = (SharedFaqDestination.InputData) faqFlow.G;
                        inputData2.getClass();
                        return new t(lVar, inputData2);
                    default:
                        return (b) ((t) ((v7d.a) this.f277736b.P.getValue())).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        com.revolut.kompot.navigable.a.g2(this, ((v) ((c) ((u7d.b) this.Q.getValue())).C).e, null, new e(this, (Continuation) null, 28), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (v7d.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (v7d.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (u7d.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        FaqFlowContract$Step step = (FaqFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }
}

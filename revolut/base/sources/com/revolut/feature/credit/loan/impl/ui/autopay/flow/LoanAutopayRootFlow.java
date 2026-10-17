package com.revolut.feature.credit.loan.impl.ui.autopay.flow;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayRootFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import u45.h;
import u45.i;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayRootFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$InputData;", "Laii/q;", "Lin0/g;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanAutopayRootFlow extends BaseFlow<LoanAutopayFlowContract$Step, LoanAutopayFlowContract$InputData, q> implements g {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanAutopayRootFlow(LoanAutopayFlowContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: s55.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanAutopayRootFlow f259929b;

            {
                this.f259929b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanAutopayRootFlow loanAutopayRootFlow = this.f259929b;
                        phm.a aVar = (phm.a) ue0.e.j(loanAutopayRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).B;
                        LoanAutopayFlowContract$InputData loanAutopayFlowContract$InputData = (LoanAutopayFlowContract$InputData) loanAutopayRootFlow.G;
                        loanAutopayFlowContract$InputData.getClass();
                        return new i(hVar, loanAutopayFlowContract$InputData);
                    default:
                        return (a) ((i) this.f259929b.P.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: s55.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanAutopayRootFlow f259929b;

            {
                this.f259929b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanAutopayRootFlow loanAutopayRootFlow = this.f259929b;
                        phm.a aVar = (phm.a) ue0.e.j(loanAutopayRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).B;
                        LoanAutopayFlowContract$InputData loanAutopayFlowContract$InputData = (LoanAutopayFlowContract$InputData) loanAutopayRootFlow.G;
                        loanAutopayFlowContract$InputData.getClass();
                        return new i(hVar, loanAutopayFlowContract$InputData);
                    default:
                        return (a) ((i) this.f259929b.P.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (i) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s55.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        LoanAutopayFlowContract$Step step = (LoanAutopayFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}

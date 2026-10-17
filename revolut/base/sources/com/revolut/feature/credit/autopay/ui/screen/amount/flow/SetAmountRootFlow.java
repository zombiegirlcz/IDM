package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountRootFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import ik4.c;
import jm4.a3;
import jm4.i0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountRootFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$Step;", "Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$InputData;", "Lik4/c;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetAmountRootFlow extends BaseFlow<SetAmountFlowContract$Step, SetAmountFlowContract$InputData, c> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAmountRootFlow(SetAmountFlowContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ik4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetAmountRootFlow f161897b;

            {
                this.f161897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SetAmountRootFlow setAmountRootFlow = this.f161897b;
                        phm.a aVar = (phm.a) ue0.e.j(setAmountRootFlow.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        SetAmountFlowContract$InputData setAmountFlowContract$InputData = (SetAmountFlowContract$InputData) setAmountRootFlow.G;
                        setAmountFlowContract$InputData.getClass();
                        return new i0(a3Var, setAmountFlowContract$InputData);
                    default:
                        return (a) ((i0) this.f161897b.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ik4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetAmountRootFlow f161897b;

            {
                this.f161897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SetAmountRootFlow setAmountRootFlow = this.f161897b;
                        phm.a aVar = (phm.a) ue0.e.j(setAmountRootFlow.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        SetAmountFlowContract$InputData setAmountFlowContract$InputData = (SetAmountFlowContract$InputData) setAmountRootFlow.G;
                        setAmountFlowContract$InputData.getClass();
                        return new i0(a3Var, setAmountFlowContract$InputData);
                    default:
                        return (a) ((i0) this.f161897b.P.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (i0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (i0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (ik4.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        SetAmountFlowContract$Step step = (SetAmountFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

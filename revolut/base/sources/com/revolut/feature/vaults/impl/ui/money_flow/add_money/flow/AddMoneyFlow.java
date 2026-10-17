package com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import ipg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nmm.h;
import no.d1;
import te0.w;
import wpg.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/AddMoneyFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/AddMoneyFlowContract$Step;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/AddMoneyFlowContract$FlowInput;", "Lipg/b;", "Lno/d1;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddMoneyFlow extends BaseFlow<AddMoneyFlowContract$Step, AddMoneyFlowContract$FlowInput, b> implements d1 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyFlow(AddMoneyFlowContract$FlowInput flowInput) {
        super(flowInput);
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        this.P = w.y0(new ni1.a(this, flowInput, 24));
        this.Q = w.y0(new h(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AddMoneyFlowContract$Step step = (AddMoneyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

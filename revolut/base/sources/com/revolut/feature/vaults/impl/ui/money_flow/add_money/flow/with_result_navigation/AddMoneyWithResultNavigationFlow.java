package com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.with_result_navigation;

import aii.q;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import o10.c;
import oa2.b;
import qji.a;
import te0.w;
import wpg.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/with_result_navigation/AddMoneyWithResultNavigationFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/with_result_navigation/AddMoneyFlowWithResultNavigationContract$Step;", "Lcom/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/AddMoneyFlowContract$FlowInput;", "Laii/q;", "Lno/d1;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddMoneyWithResultNavigationFlow extends BaseFlow<AddMoneyFlowWithResultNavigationContract$Step, AddMoneyFlowContract$FlowInput, q> implements d1 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMoneyWithResultNavigationFlow(AddMoneyFlowContract$FlowInput flowInput) {
        super(flowInput);
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        this.P = w.y0(new b(this, flowInput, 27));
        this.Q = w.y0(new c(this, 29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final a Q2() {
        return (e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AddMoneyFlowWithResultNavigationContract$Step step = (AddMoneyFlowWithResultNavigationContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

package com.revolut.feature.credit.autopay.ui.screen.account_selection.flow;

import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import e58.d;
import e58.e;
import ek4.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/account_selection/flow/AutoPayExternalAccountFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/credit/autopay/ui/screen/account_selection/flow/AutoPayExternalAccountFlowContract$Step;", "Lcom/revolut/feature/credit/autopay/ui/screen/account_selection/flow/AutoPayExternalAccountFlowContract$InputData;", "Lek4/c;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoPayExternalAccountFlow extends BaseFlow<AutoPayExternalAccountFlowContract$Step, AutoPayExternalAccountFlowContract$InputData, c> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPayExternalAccountFlow(AutoPayExternalAccountFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new d(this, inputData, 22));
        this.Q = w.y0(new e(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (yj4.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (yj4.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (ek4.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AutoPayExternalAccountFlowContract$Step step = (AutoPayExternalAccountFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

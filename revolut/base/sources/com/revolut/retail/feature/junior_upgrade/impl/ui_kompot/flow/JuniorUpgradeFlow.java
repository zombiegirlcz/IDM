package com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import cvi.b;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/impl/ui_kompot/flow/JuniorUpgradeFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/junior_upgrade/impl/ui_kompot/flow/JuniorUpgradeFlowContract$Step;", "Lcom/revolut/retail/feature/junior_upgrade/impl/ui_kompot/flow/JuniorUpgradeFlowContract$InputData;", "Laii/q;", "feature_junior_upgrade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorUpgradeFlow extends BaseFlow<JuniorUpgradeFlowContract$Step, JuniorUpgradeFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;
    public final boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorUpgradeFlow(JuniorUpgradeFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 4));
        this.Q = w.y0(new co7.a(this, 17));
        this.R = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (yxj.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (yxj.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (cyj.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        JuniorUpgradeFlowContract$Step step = (JuniorUpgradeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean r2() {
        return Boolean.valueOf(this.R);
    }
}

package com.revolut.feature.wealth_protection.sso.impl.ui;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krh.b;
import nmm.h;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_protection/sso/impl/ui/WealthProtectionSsoFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/wealth_protection/sso/impl/ui/WealthProtectionSsoFlowContract$Step;", "Lcom/revolut/feature/wealth_protection/sso/impl/ui/WealthProtectionSsoFlowContract$InputData;", "Laii/q;", "feature_wealth_protection_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthProtectionSsoFlow extends BaseFlow<WealthProtectionSsoFlowContract$Step, WealthProtectionSsoFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthProtectionSsoFlow(WealthProtectionSsoFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new ni1.a(this, inputData, 26));
        this.Q = w.y0(new h(this, 16));
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
        WealthProtectionSsoFlowContract$Step step = (WealthProtectionSsoFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

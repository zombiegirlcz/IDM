package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nmm.h;
import nsh.e;
import o0l.c;
import o0l.d;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_give/PartnerGivingConsentFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_give/PartnerGivingConsentFlowContract$Step;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/partner_consent_give/PartnerGivingConsentFlowContract$InputData;", "Laii/q;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PartnerGivingConsentFlow extends BaseFlow<PartnerGivingConsentFlowContract$Step, PartnerGivingConsentFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerGivingConsentFlow(PartnerGivingConsentFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new e(this, inputData, 13));
        this.Q = w.y0(new h(this, 29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PartnerGivingConsentFlowContract$Step step = (PartnerGivingConsentFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

package com.revolut.feature.transfer.core.impl.ui.additional_information.flow;

import aii.q;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import e58.e;
import eq8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qji.a;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/additional_information/flow/AdditionalInformationFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/transfer/core/impl/ui/additional_information/flow/AdditionalInformationFlowContract$Step;", "Lcom/revolut/feature/transfer/core/impl/ui/additional_information/flow/AdditionalInformationFlowContract$InputData;", "Laii/q;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInformationFlow extends BaseFlow<AdditionalInformationFlowContract$Step, AdditionalInformationFlowContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalInformationFlow(AdditionalInformationFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 1));
        this.Q = w.y0(new e(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final a Q2() {
        return (lpf.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (lpf.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (eqf.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        AdditionalInformationFlowContract$Step step = (AdditionalInformationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

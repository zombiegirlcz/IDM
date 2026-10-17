package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow;

import aii.q;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import g8i.h;
import ghk.t;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/flow/ManualTransferFlowContract$Step;", "Lcom/revolut/feature/payments/money_request/api/navigation/ManualTransferInputData;", "Laii/q;", "Lin0/g;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualTransferFlow extends BaseFlow<ManualTransferFlowContract$Step, ManualTransferInputData, q> implements g {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualTransferFlow(ManualTransferInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new t(this, inputData, 23));
        this.Q = w.y0(new h(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (ytf.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (ytf.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (guf.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        ManualTransferFlowContract$Step step = (ManualTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}

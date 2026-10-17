package com.revolut.feature.apm.bizum.impl.ui.transfer.flow;

import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import mhd.b;
import ms1.t;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/flow/BizumTransferFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/flow/BizumTransferFlowContract$Step;", "Lcom/revolut/feature/apm/bizum/api/navigation/BizumTransferInputData;", "", "Lin0/g;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BizumTransferFlow extends BaseFlow<BizumTransferFlowContract$Step, BizumTransferInputData, Object> implements g {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizumTransferFlow(BizumTransferInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new b(this, inputData, 14));
        this.Q = w.y0(new r(this, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (t) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (t) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (mt1.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        BizumTransferFlowContract$Step step = (BizumTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}

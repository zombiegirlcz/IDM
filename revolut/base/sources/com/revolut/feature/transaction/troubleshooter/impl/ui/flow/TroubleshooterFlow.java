package com.revolut.feature.transaction.troubleshooter.impl.ui.flow;

import aii.q;
import android.content.Intent;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import off.c;
import qji.b;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$Step;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData;", "Laii/q;", "Lno/d1;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshooterFlow extends BaseFlow<TroubleshooterFlowContract$Step, TroubleshooterFlowContract$InputData, q> implements d1 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TroubleshooterFlow(TroubleshooterFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new vd1.a(this, inputData, 4));
        this.Q = w.y0(new vch.a(this, 5));
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
        return (vff.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void X2(int i, int i2, Intent intent) {
        if (i2 == 199333) {
            a aVar = (a) ((vff.a) this.Q.getValue());
            aVar.getClass();
            if (i == 3334445 && i2 == 199333) {
                aVar.I2();
            }
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        TroubleshooterFlowContract$Step step = (TroubleshooterFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

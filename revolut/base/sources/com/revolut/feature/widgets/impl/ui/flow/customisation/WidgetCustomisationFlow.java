package com.revolut.feature.widgets.impl.ui.flow.customisation;

import aii.q;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r1a.a;
import rgf.b;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/widgets/impl/ui/flow/customisation/WidgetCustomisationFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/widgets/impl/ui/flow/customisation/WidgetCustomisationFlowContact$EmptyStep;", "Lcom/revolut/feature/widgets/impl/ui/flow/customisation/WidgetCustomisationFlowContact$InputData;", "Laii/q;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCustomisationFlow extends BaseFlow<WidgetCustomisationFlowContact$EmptyStep, WidgetCustomisationFlowContact$InputData, q> {
    public final Lazy P;
    public final boolean Q;
    public final boolean R;
    public final int S;
    public final Lazy T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetCustomisationFlow(WidgetCustomisationFlowContact$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = j.b(new a(this, 28));
        this.Q = true;
        this.R = true;
        this.S = R$layout.base_flow_container;
        this.T = j.b(new b(this, inputData, 21));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (ssh.b) this.T.getValue();
    }

    @Override // qji.c
    public final qji.b R1() {
        return (ssh.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        WidgetCustomisationFlowContact$EmptyStep step = (WidgetCustomisationFlowContact$EmptyStep) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.valueOf(this.R);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}

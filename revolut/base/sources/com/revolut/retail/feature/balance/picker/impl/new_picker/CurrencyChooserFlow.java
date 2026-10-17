package com.revolut.retail.feature.balance.picker.impl.new_picker;

import co7.a;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.flow.CurrencyChooserFlowContract$Step;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import dki.s;
import g2j.d;
import h1j.b;
import ho.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/new_picker/CurrencyChooserFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$InputData;", "Lh1j/b;", "Lno/d1;", "Lho/h0;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CurrencyChooserFlow extends BaseFlow<CurrencyChooserFlowContract$Step, CurrencyChooserFlowDestination.InputData, b> implements d1, h0 {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyChooserFlow(CurrencyChooserFlowDestination.InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new cvi.b(this, inputData, 12));
        this.Q = w.y0(new a(this, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (h1j.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CurrencyChooserFlowContract$Step step = (CurrencyChooserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

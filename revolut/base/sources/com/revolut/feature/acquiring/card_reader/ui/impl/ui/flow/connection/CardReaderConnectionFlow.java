package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection;

import bc1.c;
import com.revolut.kompot.common.rx_navigable.flow.BaseRxFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xb1.h;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlow;", "Lcom/revolut/kompot/common/rx_navigable/flow/BaseRxFlow;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$InputData;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/a;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderConnectionFlow extends BaseRxFlow<CardReaderConnectionFlowContract$Step, CardReaderConnectionFlowContract$InputData, a> {
    public final Object R;
    public final Object S;

    public CardReaderConnectionFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CardReaderConnectionFlowContract$Step step = (CardReaderConnectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    public /* synthetic */ CardReaderConnectionFlow(int i) {
        this(new CardReaderConnectionFlowContract$InputData(true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReaderConnectionFlow(CardReaderConnectionFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = w.y0(new bc1.a(this, inputData, 0));
        this.S = w.y0(new bc1.b(this, 0));
    }
}

package com.revolut.feature.chooser.kompot.bridge;

import aii.q;
import aj3.h;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenBizArchBridgeFlow;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenKompotBridgeContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenBizArchBridgeFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$Step;", "Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$InputData;", "Laii/q;", "feature_chooser_kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooserScreenBizArchBridgeFlow extends BaseFlow<ChooserScreenKompotBridgeContract$Step, ChooserScreenKompotBridgeContract$InputData, q> {
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooserScreenBizArchBridgeFlow(ChooserScreenKompotBridgeContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: aj3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreenBizArchBridgeFlow f5381b;

            {
                this.f5381b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g gVar = new g();
                        ChooserScreenBizArchBridgeFlow chooserScreenBizArchBridgeFlow = this.f5381b;
                        gVar.f5385a = chooserScreenBizArchBridgeFlow;
                        ChooserScreenKompotBridgeContract$InputData chooserScreenKompotBridgeContract$InputData = (ChooserScreenKompotBridgeContract$InputData) chooserScreenBizArchBridgeFlow.G;
                        chooserScreenKompotBridgeContract$InputData.getClass();
                        gVar.f5386b = chooserScreenKompotBridgeContract$InputData;
                        s.h(gVar.f5385a, BaseFlow.class);
                        s.h(gVar.f5386b, ChooserScreenKompotBridgeContract$InputData.class);
                        return new h(gVar.f5386b);
                    default:
                        return (b) ((h) this.f5381b.P.getValue()).f5389c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: aj3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooserScreenBizArchBridgeFlow f5381b;

            {
                this.f5381b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g gVar = new g();
                        ChooserScreenBizArchBridgeFlow chooserScreenBizArchBridgeFlow = this.f5381b;
                        gVar.f5385a = chooserScreenBizArchBridgeFlow;
                        ChooserScreenKompotBridgeContract$InputData chooserScreenKompotBridgeContract$InputData = (ChooserScreenKompotBridgeContract$InputData) chooserScreenBizArchBridgeFlow.G;
                        chooserScreenKompotBridgeContract$InputData.getClass();
                        gVar.f5386b = chooserScreenKompotBridgeContract$InputData;
                        s.h(gVar.f5385a, BaseFlow.class);
                        s.h(gVar.f5386b, ChooserScreenKompotBridgeContract$InputData.class);
                        return new h(gVar.f5386b);
                    default:
                        return (b) ((h) this.f5381b.P.getValue()).f5389c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (dki.s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        ChooserScreenKompotBridgeContract$Step step = (ChooserScreenKompotBridgeContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

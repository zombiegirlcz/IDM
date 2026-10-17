package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root;

import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.n;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$Step;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/root/LitePosRootFlowContract$InputData;", "Lfd1/b;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LitePosRootFlow extends BaseFlow<LitePosRootFlowContract$Step, LitePosRootFlowContract$InputData, fd1.b> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(LitePosRootFlow.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenLitePosRootBinding;", 0))};
    public final boolean P;
    public final int Q;
    public final int R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LitePosRootFlow(LitePosRootFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        s.t(this, ae1.a.f);
        this.P = true;
        this.Q = R$layout.screen_lite_pos_root;
        this.R = R$id.litePosRootFlow_container;
        this.S = w.y0(new a07.b(this, inputData, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (n) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (n) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (ae1.b) ((n) this.S.getValue()).f193979b.get();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        LitePosRootFlowContract$Step step = (LitePosRootFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}

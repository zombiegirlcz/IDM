package com.revolut.sso.impl.ui.password_flow;

import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.models.UICustomization;
import dki.s;
import jol.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ljl.h0;
import no.d1;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/password_flow/PasswordFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$Step;", "Lcom/revolut/sso/impl/ui/password_flow/PasswordFlowContract$InputData;", "Lcom/revolut/sso/impl/ui/password_flow/a;", "Lno/d1;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasswordFlow extends BaseFlow<PasswordFlowContract$Step, PasswordFlowContract$InputData, a> implements d1 {
    public final Object P;
    public final int Q;
    public final int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordFlow(PasswordFlowContract$InputData inputData, UICustomization uiCustomization) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.P = w.y0(new a2.a(this, 25, inputData, uiCustomization));
        this.Q = R$layout.screen_transparent;
        this.R = R$id.screen_transparent_container;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (h0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (h0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (d) ((h0) this.P.getValue()).e.get();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        PasswordFlowContract$Step step = (PasswordFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }
}

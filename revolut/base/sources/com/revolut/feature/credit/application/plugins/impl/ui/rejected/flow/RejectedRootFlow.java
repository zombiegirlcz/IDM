package com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.r5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ph4.j;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/flow/RejectedRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RejectedRootFlow extends PluginFlowControllerV2 {
    public final RejectedRootFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public RejectedRootFlow(RejectedRootFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ph4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedRootFlow f236212b;

            {
                this.f236212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RejectedRootFlow rejectedRootFlow = this.f236212b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rejectedRootFlow, (j) rejectedRootFlow.P.getValue());
                    case 1:
                        RejectedRootFlow rejectedRootFlow2 = this.f236212b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData = rejectedRootFlow2.L;
                        rejectedRootFlowContract$InputData.getClass();
                        return new r5(c1Var, new iq3.a(), rejectedRootFlow2, rejectedRootFlowContract$InputData);
                    default:
                        return (j) ((r5) this.f236212b.O.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ph4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedRootFlow f236212b;

            {
                this.f236212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RejectedRootFlow rejectedRootFlow = this.f236212b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rejectedRootFlow, (j) rejectedRootFlow.P.getValue());
                    case 1:
                        RejectedRootFlow rejectedRootFlow2 = this.f236212b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData = rejectedRootFlow2.L;
                        rejectedRootFlowContract$InputData.getClass();
                        return new r5(c1Var, new iq3.a(), rejectedRootFlow2, rejectedRootFlowContract$InputData);
                    default:
                        return (j) ((r5) this.f236212b.O.getValue()).u.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ph4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedRootFlow f236212b;

            {
                this.f236212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RejectedRootFlow rejectedRootFlow = this.f236212b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rejectedRootFlow, (j) rejectedRootFlow.P.getValue());
                    case 1:
                        RejectedRootFlow rejectedRootFlow2 = this.f236212b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData = rejectedRootFlow2.L;
                        rejectedRootFlowContract$InputData.getClass();
                        return new r5(c1Var, new iq3.a(), rejectedRootFlow2, rejectedRootFlowContract$InputData);
                    default:
                        return (j) ((r5) this.f236212b.O.getValue()).u.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r5) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (r5) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

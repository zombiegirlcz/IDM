package com.revolut.feature.credit.application.plugins.impl.ui.failure.flow;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import czi.c;
import dw3.c1;
import dw3.d3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/failure/flow/FailureRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FailureRootFlow extends PluginFlowControllerV2 {
    public final FailureRootFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public FailureRootFlow(FailureRootFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FailureRootFlow f133441b;

            {
                this.f133441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FailureRootFlow failureRootFlow = this.f133441b;
                        return c.d(R$id.screen_transparent_container, 4, null, failureRootFlow, (b) failureRootFlow.P.getValue());
                    case 1:
                        FailureRootFlow failureRootFlow2 = this.f133441b;
                        phm.a aVar = (phm.a) e.j(failureRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FailureRootFlowContract$InputData failureRootFlowContract$InputData = failureRootFlow2.L;
                        failureRootFlowContract$InputData.getClass();
                        return new d3(c1Var, new iq3.a(), failureRootFlow2, failureRootFlowContract$InputData);
                    default:
                        return (b) ((d3) this.f133441b.O.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FailureRootFlow f133441b;

            {
                this.f133441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FailureRootFlow failureRootFlow = this.f133441b;
                        return c.d(R$id.screen_transparent_container, 4, null, failureRootFlow, (b) failureRootFlow.P.getValue());
                    case 1:
                        FailureRootFlow failureRootFlow2 = this.f133441b;
                        phm.a aVar = (phm.a) e.j(failureRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FailureRootFlowContract$InputData failureRootFlowContract$InputData = failureRootFlow2.L;
                        failureRootFlowContract$InputData.getClass();
                        return new d3(c1Var, new iq3.a(), failureRootFlow2, failureRootFlowContract$InputData);
                    default:
                        return (b) ((d3) this.f133441b.O.getValue()).u.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: fb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FailureRootFlow f133441b;

            {
                this.f133441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FailureRootFlow failureRootFlow = this.f133441b;
                        return c.d(R$id.screen_transparent_container, 4, null, failureRootFlow, (b) failureRootFlow.P.getValue());
                    case 1:
                        FailureRootFlow failureRootFlow2 = this.f133441b;
                        phm.a aVar = (phm.a) e.j(failureRootFlow2.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        FailureRootFlowContract$InputData failureRootFlowContract$InputData = failureRootFlow2.L;
                        failureRootFlowContract$InputData.getClass();
                        return new d3(c1Var, new iq3.a(), failureRootFlow2, failureRootFlowContract$InputData);
                    default:
                        return (b) ((d3) this.f133441b.O.getValue()).u.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (d3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fb4.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}

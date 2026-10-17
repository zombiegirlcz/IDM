package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController;
import dw3.c1;
import dw3.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;
import te0.w;
import ue0.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/common/prompt/flow/CreditPromptFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginSubFlowController;", "Lrv3/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditPromptFlow extends PluginSubFlowController<b> {
    public final CreditPromptFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreditPromptFlow(CreditPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: v74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptFlow f286554b;

            {
                this.f286554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditPromptFlow creditPromptFlow = this.f286554b;
                        phm.a aVar = (phm.a) e.j(creditPromptFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = creditPromptFlow.K;
                        creditPromptFlowContract$InputData.getClass();
                        return new q1(c1Var, creditPromptFlowContract$InputData);
                    case 1:
                        return (b) ((q1) this.f286554b.L.getValue()).d.get();
                    default:
                        CreditPromptFlow creditPromptFlow2 = this.f286554b;
                        return czi.c.d(0, 6, null, creditPromptFlow2, (b) creditPromptFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: v74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptFlow f286554b;

            {
                this.f286554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditPromptFlow creditPromptFlow = this.f286554b;
                        phm.a aVar = (phm.a) e.j(creditPromptFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = creditPromptFlow.K;
                        creditPromptFlowContract$InputData.getClass();
                        return new q1(c1Var, creditPromptFlowContract$InputData);
                    case 1:
                        return (b) ((q1) this.f286554b.L.getValue()).d.get();
                    default:
                        CreditPromptFlow creditPromptFlow2 = this.f286554b;
                        return czi.c.d(0, 6, null, creditPromptFlow2, (b) creditPromptFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: v74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditPromptFlow f286554b;

            {
                this.f286554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditPromptFlow creditPromptFlow = this.f286554b;
                        phm.a aVar = (phm.a) e.j(creditPromptFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.di.CreditApplicationPluginsApiComponent");
                        c1 c1Var = ((c1) ((dw3.e) objB)).m0;
                        CreditPromptFlowContract$InputData creditPromptFlowContract$InputData = creditPromptFlow.K;
                        creditPromptFlowContract$InputData.getClass();
                        return new q1(c1Var, creditPromptFlowContract$InputData);
                    case 1:
                        return (b) ((q1) this.f286554b.L.getValue()).d.get();
                    default:
                        CreditPromptFlow creditPromptFlow2 = this.f286554b;
                        return czi.c.d(0, 6, null, creditPromptFlow2, (b) creditPromptFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (q1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (v74.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController, oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}

package com.revolut.feature.workflow.sso.impl.ui.flow;

import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlow;
import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mvh.a;
import ovh.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/workflow/sso/impl/ui/flow/WorkflowSsoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmvh/a;", "Lyki/f;", "feature_workflow_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowSsoFlow extends ViewController<a> implements f {
    public final WorkflowSsoFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public WorkflowSsoFlow(WorkflowSsoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qvh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowSsoFlow f249698b;

            {
                this.f249698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WorkflowSsoFlow workflowSsoFlow = this.f249698b;
                        phm.a aVar = (phm.a) ue0.e.j(workflowSsoFlow.m2()).a().get(ovh.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovh.c.class, " is not found"));
                        }
                        kbb.c cVarA = ((ovh.c) aVar2.b()).a();
                        cVarA.f182550c = workflowSsoFlow;
                        WorkflowSsoFlowContract$InputData workflowSsoFlowContract$InputData = workflowSsoFlow.K;
                        workflowSsoFlowContract$InputData.getClass();
                        cVarA.d = workflowSsoFlowContract$InputData;
                        return (ovh.b) cVarA.build();
                    case 1:
                        return (b) ((ovh.b) this.f249698b.M.getValue()).f230228b.get();
                    default:
                        WorkflowSsoFlow workflowSsoFlow2 = this.f249698b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, workflowSsoFlow2, (b) workflowSsoFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qvh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowSsoFlow f249698b;

            {
                this.f249698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WorkflowSsoFlow workflowSsoFlow = this.f249698b;
                        phm.a aVar = (phm.a) ue0.e.j(workflowSsoFlow.m2()).a().get(ovh.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovh.c.class, " is not found"));
                        }
                        kbb.c cVarA = ((ovh.c) aVar2.b()).a();
                        cVarA.f182550c = workflowSsoFlow;
                        WorkflowSsoFlowContract$InputData workflowSsoFlowContract$InputData = workflowSsoFlow.K;
                        workflowSsoFlowContract$InputData.getClass();
                        cVarA.d = workflowSsoFlowContract$InputData;
                        return (ovh.b) cVarA.build();
                    case 1:
                        return (b) ((ovh.b) this.f249698b.M.getValue()).f230228b.get();
                    default:
                        WorkflowSsoFlow workflowSsoFlow2 = this.f249698b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, workflowSsoFlow2, (b) workflowSsoFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qvh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowSsoFlow f249698b;

            {
                this.f249698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WorkflowSsoFlow workflowSsoFlow = this.f249698b;
                        phm.a aVar = (phm.a) ue0.e.j(workflowSsoFlow.m2()).a().get(ovh.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovh.c.class, " is not found"));
                        }
                        kbb.c cVarA = ((ovh.c) aVar2.b()).a();
                        cVarA.f182550c = workflowSsoFlow;
                        WorkflowSsoFlowContract$InputData workflowSsoFlowContract$InputData = workflowSsoFlow.K;
                        workflowSsoFlowContract$InputData.getClass();
                        cVarA.d = workflowSsoFlowContract$InputData;
                        return (ovh.b) cVarA.build();
                    case 1:
                        return (b) ((ovh.b) this.f249698b.M.getValue()).f230228b.get();
                    default:
                        WorkflowSsoFlow workflowSsoFlow2 = this.f249698b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, workflowSsoFlow2, (b) workflowSsoFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (qvh.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}

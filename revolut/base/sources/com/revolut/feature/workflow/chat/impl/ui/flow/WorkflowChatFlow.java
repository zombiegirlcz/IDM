package com.revolut.feature.workflow.chat.impl.ui.flow;

import a0.d;
import aii.q;
import bth.b;
import com.revolut.feature.workflow.chat.impl.ui.flow.WorkflowChatFlow;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/chat/impl/ui/flow/WorkflowChatFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/workflow/chat/impl/ui/flow/WorkflowChatFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_workflow_chat_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowChatFlow extends BaseFlow<WorkflowChatFlowContract$Step, IOData$EmptyInput, q> {
    public final Object P;
    public final Object Q;

    public WorkflowChatFlow() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: dth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowChatFlow f117455b;

            {
                this.f117455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f117455b.m2()).a().get(zsh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new bth.b(((bth.a) aVar2.b()).f18577a);
                        }
                        throw new IllegalStateException(d.q("Api ", zsh.a.class, " is not found"));
                    default:
                        return (b) ((bth.b) this.f117455b.P.getValue()).f18578a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowChatFlow f117455b;

            {
                this.f117455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f117455b.m2()).a().get(zsh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new bth.b(((bth.a) aVar2.b()).f18577a);
                        }
                        throw new IllegalStateException(d.q("Api ", zsh.a.class, " is not found"));
                    default:
                        return (b) ((bth.b) this.f117455b.P.getValue()).f18578a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (s) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        WorkflowChatFlowContract$Step step = (WorkflowChatFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}

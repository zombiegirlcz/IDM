package kl;

import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public final class x extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ WorkflowLoadingFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(WorkflowLoadingFragment workflowLoadingFragment) {
        super(0);
        this.f = workflowLoadingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new w(this.f);
    }
}

package kl;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ WorkflowLoadingFragment v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(WorkflowLoadingFragment workflowLoadingFragment, Continuation continuation) {
        super(2, continuation);
        this.v = workflowLoadingFragment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            WorkflowLoadingFragment workflowLoadingFragment = this.v;
            Lifecycle lifecycle = workflowLoadingFragment.getViewLifecycleOwner().getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "getLifecycle(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            k7c.l0 l0Var = new k7c.l0(workflowLoadingFragment, null, 18);
            this.u = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, l0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}

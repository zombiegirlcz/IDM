package a5k;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f1444w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n1 f1445x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f1446y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Function1 function1, n1 n1Var, Function0 function0, Continuation continuation) {
        super(1, continuation);
        this.v = f0Var;
        this.f1444w = function1;
        this.f1445x = n1Var;
        this.f1446y = function0;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e0(this.v, this.f1444w, this.f1445x, this.f1446y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f0 f0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jvh.a aVar2 = f0Var.o;
            WorkflowName workflowName = new WorkflowName("EDIT_TAX_RESIDENCIES");
            this.u = 1;
            obj2 = aVar2.a(workflowName, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        String str = (String) obj2;
        return f0Var.A2(((pth.g) f0Var.f1453p).d(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), true, new a31.m(this.f1444w, 1, this.f1445x, this.f1446y)));
    }
}

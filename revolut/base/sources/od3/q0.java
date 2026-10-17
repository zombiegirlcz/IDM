package od3;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class q0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ActionsView.Item f224292w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ActionsView.Item item, Continuation continuation, s0 s0Var) {
        super(2, continuation);
        this.v = s0Var;
        this.f224292w = item;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q0(this.f224292w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ActionsView.Item item = this.f224292w;
            s0 s0Var = this.v;
            p0 p0Var = new p0(item, null, s0Var);
            this.u = 1;
            if (s0Var.p2(this, p0Var) == aVar) {
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

package buf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SelectableDelegate.Model f18833w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a1 a1Var, SelectableDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = a1Var;
        this.f18833w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.v, this.f18833w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            SelectableDelegate.Model model = this.f18833w;
            a1 a1Var = this.v;
            r0 r0Var = new r0(a1Var, model, null);
            this.u = 1;
            if (a1Var.p2(this, r0Var) == aVar) {
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

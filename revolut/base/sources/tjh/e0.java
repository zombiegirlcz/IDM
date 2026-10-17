package tjh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LargeActionButtonDelegate.Model f271724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(LargeActionButtonDelegate.Model model, Continuation continuation, h0 h0Var) {
        super(2, continuation);
        this.v = h0Var;
        this.f271724w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e0(this.f271724w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        LargeActionButtonDelegate.Model model = this.f271724w;
        h0 h0Var = this.v;
        d0 d0Var = new d0(model, null, h0Var);
        this.u = 1;
        h hVar = h0.Companion;
        Object objB = pu7.a.B(h0Var.e, "onLargeActionButtonClick", d0Var, this);
        return objB == aVar ? aVar : objB;
    }
}

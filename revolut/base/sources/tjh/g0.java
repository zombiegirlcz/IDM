package tjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f271731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(RowDelegate.Model model, Continuation continuation, h0 h0Var) {
        super(2, continuation);
        this.v = h0Var;
        this.f271731w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.f271731w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        RowDelegate.Model model = this.f271731w;
        h0 h0Var = this.v;
        f0 f0Var = new f0(model, null, h0Var);
        this.u = 1;
        h hVar = h0.Companion;
        Object objB = pu7.a.B(h0Var.e, "onRowClick", f0Var, this);
        return objB == aVar ? aVar : objB;
    }
}

package wed;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f296722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f296723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, vh vhVar, Continuation continuation) {
        super(2, continuation);
        this.f296722w = f0Var;
        this.f296723x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.f296722w, this.f296723x, continuation);
        e0Var.v = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
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
        vh vhVar = this.f296723x;
        f0 f0Var = this.f296722w;
        d0 d0Var = new d0(vhVar, null, coroutineScope, f0Var);
        this.v = null;
        this.u = 1;
        Object objB = pu7.a.B(f0Var.k, "onSwipeActionClick", d0Var, this);
        return objB == aVar ? aVar : objB;
    }
}

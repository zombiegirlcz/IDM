package wed;

import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vh f296719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f296720x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vh vhVar, Continuation continuation, CoroutineScope coroutineScope, f0 f0Var) {
        super(1, continuation);
        this.v = f0Var;
        this.f296719w = vhVar;
        this.f296720x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.f296719w, continuation, this.f296720x, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            CoroutineScope coroutineScope = this.f296720x;
            vh vhVar = this.f296719w;
            f0 f0Var = this.v;
            c0 c0Var = new c0(vhVar, null, coroutineScope, f0Var);
            this.u = 1;
            if (f0Var.p2(this, c0Var) == aVar) {
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

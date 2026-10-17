package n33;

import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardOrderAccountWrapper.Junior f211767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, CardOrderAccountWrapper.Junior junior, Continuation continuation) {
        super(2, continuation);
        this.v = t0Var;
        this.f211767w = junior;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.v, this.f211767w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        jid.z zVar = this.v.f211834y;
        String str = this.f211767w.f64934b;
        this.u = 1;
        Object objL = zVar.l(str, this);
        return objL == aVar ? aVar : objL;
    }
}

package r7i;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ a0 u;
    public final /* synthetic */ Subaccount v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Subaccount subaccount, Continuation continuation) {
        super(2, continuation);
        this.u = a0Var;
        this.v = subaccount;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return Boolean.valueOf(this.u.e.d(((Subaccount.Teen) this.v).f88959a, null));
    }
}

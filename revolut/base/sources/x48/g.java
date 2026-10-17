package x48;

import com.revolut.core.model.account.AccountId;
import io3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f302809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f302810x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, c cVar, AccountId.Joint joint, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f302809w = cVar;
        this.f302810x = joint;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f302809w, this.f302810x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        ufm.i iVarB = this.v.e.b(this.f302810x, l.CURRENT, this.f302809w.f302802a);
        this.u = 1;
        Object objB = nim.a.b(iVarB, this);
        return objB == aVar ? aVar : objB;
    }
}

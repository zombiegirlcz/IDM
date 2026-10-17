package z8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AliasRegistrationType f320050w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AliasRegistrationType aliasRegistrationType, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f320050w = aliasRegistrationType;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f320050w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        s8a.c cVar = this.v.f320051l;
        this.u = 1;
        Object objB = cVar.b(AccountId.Personal.f51414a, this.f320050w, this);
        return objB == aVar ? aVar : objB;
    }
}

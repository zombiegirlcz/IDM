package vwd;

import a3i.w;
import com.revolut.feature.address.models.Address;
import do3.n;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.stakingdetails.v2.a f292710w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.staking.impl.stakingdetails.v2.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f292710w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f292710w, continuation, 0);
            default:
                return new i(this.f292710w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.staking.impl.stakingdetails.v2.a aVar2 = this.f292710w;
                h hVar = new h(aVar2, null);
                this.v = 1;
                Object objP2 = aVar2.p2(this, hVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.staking.impl.stakingdetails.v2.a aVar4 = this.f292710w;
                if (i2 == 0) {
                    o.b(obj2);
                    d0 d0VarF = aVar4.o.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Address address = ((n) obj2).k;
                aVar4.H2(aVar4.f88159q, new w(11, address != null ? nz8.d.g(address) : null));
                return Unit.f186387a;
        }
    }
}

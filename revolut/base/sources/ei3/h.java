package ei3;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f126370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.l f126371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId.Personal f126372y;
    public final /* synthetic */ AccountId z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, xi0.b bVar, io3.l lVar, AccountId.Personal personal, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f126370w = bVar;
        this.f126371x = lVar;
        this.f126372y = personal;
        this.z = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f126370w, this.f126371x, this.f126372y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        wsg.n nVar = this.v.f126389h;
        AccountId accountId = this.f126372y;
        if (accountId == null) {
            accountId = this.z;
        }
        d0 d0VarR = osg.b.r(nVar, this.f126370w, this.f126371x, null, accountId, 28);
        this.u = 1;
        Object objB = nim.a.b(d0VarR, this);
        return objB == aVar ? aVar : objB;
    }
}

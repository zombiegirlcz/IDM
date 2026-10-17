package x48;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s6e.z;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f302811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f302812x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d dVar, AccountId.Joint joint, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f302811w = dVar;
        this.f302812x = joint;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f302811w, this.f302812x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        g6e.d dVar = this.v.d;
        d dVar2 = this.f302811w;
        String str = dVar2.f302804b;
        xi0.b bVar = dVar2.f302803a;
        String str2 = this.f302812x.f51412a;
        this.u = 1;
        Object objE = ((z) dVar).e(SubaccountType.Joint.f88961a, str, null, bVar, null, str2, this);
        return objE == aVar ? aVar : objE;
    }
}

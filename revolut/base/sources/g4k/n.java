package g4k;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements oim.n {
    public /* synthetic */ r u;
    public /* synthetic */ Pair v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f140568w;

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj4).longValue();
        n nVar = new n(4, (Continuation) obj5);
        nVar.u = (r) obj2;
        nVar.v = (Pair) obj3;
        nVar.f140568w = jLongValue;
        return nVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = this.u;
        Pair pair = this.v;
        long j2 = this.f140568w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new vf0.h(rVar, (Data) pair.f186385a, (kq2.f) pair.f186386b, new Long(j2));
    }
}

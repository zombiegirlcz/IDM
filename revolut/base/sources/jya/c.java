package jya;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.n;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements n {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f179354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ long f179355x;

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj4).longValue();
        c cVar = new c(4, (Continuation) obj5);
        cVar.f179354w = (Throwable) obj3;
        cVar.f179355x = jLongValue;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        Throwable th10 = this.f179354w;
        long j2 = this.f179355x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        if (i2 == 0) {
            o.b(obj2);
            i = (!(th10 instanceof b) || j2 >= 3) ? 0 : 1;
            if (i != 0) {
                this.f179354w = null;
                this.f179355x = j2;
                this.u = i;
                this.v = 1;
                if (k0.b(300L, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.u;
            o.b(obj2);
        }
        return Boolean.valueOf(i != 0);
    }
}

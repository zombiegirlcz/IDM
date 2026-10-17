package ryd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import skm.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f258355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.u;
        long jLongValue = ((Number) obj4).longValue();
        Continuation continuation = (Continuation) obj5;
        switch (i) {
            case 0:
                u uVar = new u(4, 0, continuation);
                uVar.f258355w = jLongValue;
                return uVar.invokeSuspend(Unit.f186387a);
            default:
                u uVar2 = new u(4, 1, continuation);
                uVar2.f258355w = jLongValue;
                return uVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                long j2 = this.f258355w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                boolean z = true;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (j2 < 2) {
                        this.f258355w = j2;
                        this.v = 1;
                        if (k0.b(2000L, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(z);
            default:
                long j3 = this.f258355w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                boolean z3 = true;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (j3 < 12) {
                        this.f258355w = j3;
                        this.v = 1;
                        if (k0.b(5000L, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(z3);
        }
    }
}

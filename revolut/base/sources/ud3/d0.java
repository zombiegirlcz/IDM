package ud3;

import com.revolut.feature.cashback.api.models.CashbackBySources;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import om4.s3;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f279092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CashbackBySources f279093x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, CashbackBySources cashbackBySources, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279092w = e0Var;
        this.f279093x = cashbackBySources;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.f279092w, this.f279093x, continuation, 0);
            case 1:
                return new d0(this.f279092w, this.f279093x, continuation, 1);
            case 2:
                return new d0(this.f279092w, this.f279093x, continuation, 2);
            default:
                return new d0(this.f279092w, this.f279093x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        Object objX2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CashbackBySources cashbackBySources = this.f279093x;
                Intrinsics.h(cashbackBySources);
                this.v = 1;
                Object objX3 = vkm.q.x(mo3.a.g(nim.a.v(((s3) this.f279092w.v).r(), new n(cashbackBySources, 0)), null, new u4i.u(26), 1), this);
                return objX3 == aVar ? aVar : objX3;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CashbackBySources cashbackBySources2 = this.f279093x;
                Intrinsics.h(cashbackBySources2);
                this.v = 1;
                if (cashbackBySources2.b(uc3.d.METAL) || cashbackBySources2.b(uc3.d.PLAN)) {
                    e0 e0Var = this.f279092w;
                    objX = vkm.q.x(new tse.c(rd0.e.b(m70.a.g(e0Var.f279096r.n(), null, new u4i.u(24), 1)), e0Var, 12), this);
                } else {
                    objX = new Pair(null, null);
                }
                return objX == aVar2 ? aVar2 : objX;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CashbackBySources cashbackBySources3 = this.f279093x;
                Intrinsics.h(cashbackBySources3);
                this.v = 1;
                Object objX4 = cashbackBySources3.b(uc3.d.PRO) ? vkm.q.x(rd0.e.b(m70.a.g(this.f279092w.f279097s.a(), null, new u4i.u(25), 1)), this) : null;
                return objX4 == aVar3 ? aVar3 : objX4;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CashbackBySources cashbackBySources4 = this.f279093x;
                Intrinsics.h(cashbackBySources4);
                this.v = 1;
                if (cashbackBySources4.b(uc3.d.STAYS) || cashbackBySources4.b(uc3.d.TRAVEL)) {
                    i9g.p pVar = (i9g.p) this.f279092w.f279098t;
                    objX2 = vkm.q.x(new tzh.g(rd0.e.b(m70.a.g(pd.b.r(pVar.f159830b.q(), new i9e.a(pVar, 3)), null, new u4i.u(23), 1)), 10), this);
                } else {
                    objX2 = null;
                }
                return objX2 == aVar4 ? aVar4 : objX2;
        }
    }
}

package hgb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_hub.a f152135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f152136x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f152135w = aVar;
        this.f152136x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f152135w, this.f152136x, continuation, 0);
            default:
                return new a0(this.f152135w, this.f152136x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a0) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarC = ((s06.j) this.f152135w.f82994s).c(this.f152136x, false, lg0.a.IGNORE);
                this.v = 1;
                Object objB = nim.a.b(d0VarC, this);
                return objB == aVar ? aVar : objB;
            default:
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
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar3 = this.f152135w;
                a0 a0Var = new a0(aVar3, this.f152136x, null, 0);
                this.v = 1;
                Object objP2 = aVar3.p2(this, a0Var);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}

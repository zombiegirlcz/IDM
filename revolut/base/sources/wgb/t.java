package wgb;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_promotion.b f297296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f297297x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f297296w = bVar;
        this.f297297x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f297296w, this.f297297x, continuation, 0);
            default:
                return new t(this.f297296w, this.f297297x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarC = ((s06.j) this.f297296w.f83025s).c(this.f297297x, false, lg0.a.IGNORE);
                    this.v = 1;
                    if (nim.a.b(d0VarC, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                String str = this.f297297x;
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = this.f297296w;
                u uVar = new u(bVar, str, null);
                this.v = 1;
                Object objP2 = bVar.p2(this, uVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}

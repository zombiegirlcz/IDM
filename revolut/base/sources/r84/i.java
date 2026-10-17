package r84;

import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f252361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252361w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f252361w, continuation, 0);
            default:
                return new i(this.f252361w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        switch (this.u) {
            case 0:
                j jVar = this.f252361w;
                AddDebtScreenContract$InputData addDebtScreenContract$InputData = jVar.f252362p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    Long l2 = ((e) jVar.t2()).f252355b;
                    if (l2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    long jLongValue = l2.longValue();
                    pu3.c cVar = ((e) jVar.t2()).f252356c ? pu3.c.JOINT : pu3.c.SOLO;
                    ww3.c cVar2 = jVar.f252363q;
                    h1 h1VarF = w0.F(addDebtScreenContract$InputData.f67428c);
                    pu3.d dVar = addDebtScreenContract$InputData.f67426a;
                    String str = ((e) jVar.t2()).f252354a;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Long l3 = cp5.c.y(addDebtScreenContract$InputData.f67426a) == pu3.e.LIMIT ? new Long(jLongValue) : null;
                    Long l4 = new Long(jLongValue);
                    if (cp5.c.y(addDebtScreenContract$InputData.f67426a) != pu3.e.MONTHLY_REPAYMENT) {
                        l4 = null;
                    }
                    pu3.a aVar2 = new pu3.a(dVar, str, l3, l4, addDebtScreenContract$InputData.f67426a == pu3.d.MORTGAGE ? cVar : null);
                    this.v = 1;
                    objA = cVar2.a(h1VarF, aVar2, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                jVar.v2(new f((pu3.b) objA));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    j jVar2 = this.f252361w;
                    i iVar = new i(jVar2, null, 0);
                    this.v = 1;
                    if (jVar2.p2(this, iVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package g84;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i f141273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pf4.n f141274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar, pf4.n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f141273w = iVar;
        this.f141274x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f141273w, this.f141274x, continuation, 0);
            case 1:
                return new r(this.f141273w, this.f141274x, continuation, 1);
            default:
                return new r(this.f141273w, this.f141274x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                e eVar = this.f141273w.f67384q;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    cv3.t tVar = cv3.u.Companion;
                    pf4.j jVar = (pf4.j) this.f141274x;
                    String str = jVar.f235443b;
                    Long l2 = new Long(jVar.f235444c);
                    tVar.getClass();
                    cv3.u uVarB = cv3.t.b(l2, str);
                    this.v = 1;
                    if (((m) eVar).g(null, uVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z1 z1Var = ((m) eVar).e;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Action action = ((pf4.f) this.f141274x).f235438a;
                    this.v = 1;
                    if (this.f141273w.Q2(action, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar = this.f141273w;
                    r rVar = new r(iVar, this.f141274x, null, 1);
                    this.v = 1;
                    if (iVar.p2(this, rVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

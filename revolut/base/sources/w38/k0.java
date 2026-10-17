package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountId f294187w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q0 q0Var, ProductAccountId productAccountId, Continuation continuation) {
        super(2, continuation);
        this.v = q0Var;
        this.f294187w = productAccountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k0 k0Var = new k0(this.v, this.f294187w, continuation);
        k0Var.u = obj2;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((v38.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v38.c cVar = (v38.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = cVar instanceof v38.b;
        q0 q0Var = this.v;
        if (z) {
            n38.d0 d0Var = ((v38.b) cVar).f285855a;
            if (d0Var.f211940g == n38.t.PENDING && d0Var.f) {
                return new vkm.y(new i0(q0Var, null), nim.a.v(rd0.e.b(q0Var.f294206c.J(AccountId.Personal.f51414a, w4l.h.f294642c)), new v(q0Var, d0Var, 0)));
            }
        }
        boolean z3 = cVar instanceof v38.a;
        ProductAccountId productAccountId = this.f294187w;
        if (!z3) {
            if (cVar instanceof v38.d) {
                return q0.o(q0Var, productAccountId, ((v38.d) cVar).f285857a);
            }
            return new vkm.y(new j0(q0Var, null), new go.g(zi0.c.O(new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Currency product!"))), 2));
        }
        n38.a aVar2 = ((v38.a) cVar).f285854a;
        String str = productAccountId.f89729a;
        u38.m.Companion.getClass();
        if (!Intrinsics.f(str, u38.m.e)) {
            return q0.o(q0Var, productAccountId, aVar2);
        }
        r38.b bVar = q0Var.e;
        efm.r rVarG = m70.a.g(nim.a.w(kli.a.h(r38.b.a(bVar, l38.a.c(aVar2)), r38.b.b(bVar, l38.a.c(aVar2))), new w29.a(11)), null, new w2.d(10), 1);
        od0.i.Companion.getClass();
        efm.r rVarSwitchMap = ue0.e.E(rVarG, od0.i.f224256b).switchMap(new vz4.c(new x(q0Var, aVar2, 1), 22));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rd0.e.b(rVarSwitchMap);
    }
}

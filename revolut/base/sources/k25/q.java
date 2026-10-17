package k25;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import ip0.yc0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAccountType.CreditCard v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f180345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CreditAccountType.CreditCard creditCard, u uVar, Continuation continuation) {
        super(2, continuation);
        this.v = creditCard;
        this.f180345w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, this.f180345w, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((yw4.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u uVar = this.f180345w;
        al4.n nVar = uVar.f180348a;
        yw4.p pVar = (yw4.p) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        yw4.q qVar = pVar.e;
        String str = pVar.f317325a;
        if (qVar == yw4.q.INACTIVE) {
            return new go.g(new Data(null, new ProductAccountNotFoundException(p.a.p("ProductAccount with facilityId:", this.v.f70624b, " is inactive")), false, 5, null), 2);
        }
        yw4.l lVar = pVar.f317331l;
        b bVar = u.Companion;
        yw4.l lVar2 = yw4.l.SPEND_ONLY;
        w4l.h hVar = w4l.h.f294642c;
        w4l.i iVar = w4l.i.f294643c;
        if (lVar == lVar2) {
            return nim.a.v(u0.i(((x2) nVar).i(pVar, iVar), uVar.t(zhm.u.c(str), hVar), uVar.o()), new k1.a(uVar, pVar, 3));
        }
        x2 x2Var = (x2) nVar;
        Flow flowI = x2Var.i(pVar, iVar);
        akg.n nVarV = nim.a.v(x2Var.t(str, iVar), new yc0(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 25));
        int i = 9;
        return nim.a.u(new im9.h((Continuation) null, uVar, pVar, i), u0.i(u0.i(flowI, n14.k.p(nVarV, new k1g.n(i)), n14.k.p(uVar.f180354l.a(str, iVar), new k1g.n(10))), u0.i(uVar.o(), uVar.t(zhm.u.c(str), hVar), n14.k.p(x2Var.z(str, iVar), new k1g.n(16))), u0.m(uVar.p(str, iVar), n14.k.p(uVar.f180361t.a(str, wr7.a.CREDIT_CARD, hVar), new k1g.n(17)))));
    }
}

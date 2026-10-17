package dtl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvestOrder.InvestSecuritiesOrder f117475w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, InvestOrder.InvestSecuritiesOrder investSecuritiesOrder, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f117475w = investSecuritiesOrder;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f117475w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = this.f117475w;
        m mVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vrl.g gVar = mVar.f117481l;
            String f104631b = investSecuritiesOrder.getF104631b();
            this.u = 1;
            if (((vrl.m) gVar).h(f104631b, this) != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        jhi.b bVarH = mo3.a.h(((vrl.m) mVar.f117481l).d(investSecuritiesOrder.getF104631b()), new dob.a(4), new dmb.m(27), 2);
        this.u = 2;
        Object objX = q.x(bVarH, this);
        return objX == aVar ? aVar : objX;
    }
}

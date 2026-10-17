package vrl;

import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            String strK = null;
            if (!it8.hasNext()) {
                Set setI1 = zhm.d0.i1(arrayList);
                boolean zIsEmpty = setI1.isEmpty();
                w4l.h hVar = w4l.h.f294642c;
                m mVar = this.v;
                return vkm.q.q(nim.a.v(zh9.u0.m(!zIsEmpty ? nim.a.v(rd0.e.b(ybl.b.b(mVar.f291655b, null, hVar, new s7a.m0(17, setI1), 1)), new vq0.g(20)) : zi0.c.i(zhm.r0.g()), mVar.f291657g.j(hVar)), new v77.a(list, 3)));
            }
            InvestOrder investOrder = (InvestOrder) it8.next();
            if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                strK = com.revolut.retail.trading.core.domain.orders.a.j((InvestOrder.InvestSecuritiesOrder) investOrder);
            } else if (!(investOrder instanceof InvestCommodityOrder)) {
                if (investOrder instanceof InvestMarginOrder) {
                    strK = com.revolut.retail.trading.core.domain.orders.a.k(investOrder);
                } else if (!(investOrder instanceof InvestFundOrder) && !(investOrder instanceof InvestMutualFundOrder) && !(investOrder instanceof InvestOptionOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (strK != null) {
                arrayList.add(strK);
            }
        }
    }
}

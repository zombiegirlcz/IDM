package dtl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import dce.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InvestOrder order;
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = ((RowDelegate.Model) vhVar.f54884b).u;
        if (obj3 instanceof InvestOrderExtended) {
            order = ((InvestOrderExtended) obj3).getOrder();
        } else {
            if (!(obj3 instanceof htl.e)) {
                return Unit.f186387a;
            }
            order = ((htl.e) obj3).f155460a.getOrder();
        }
        InvestOrder investOrder = order;
        b bVar = this.v.d;
        c displayOptions = new c(false);
        m mVar = (m) bVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        mVar.T2(new s0(mVar, investOrder, displayOptions, null, 22), new h(mVar, investOrder, 0));
        return Unit.f186387a;
    }
}

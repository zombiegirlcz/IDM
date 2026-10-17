package dtl;

import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ InvestOrder v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f117476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f117477x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InvestOrder investOrder, m mVar, c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = investOrder;
        this.f117476w = mVar;
        this.f117477x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f117476w, this.f117477x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            InvestOrder investOrder = this.v;
            boolean z = investOrder instanceof InvestOrder.InvestSecuritiesOrder;
            c displayOptions = this.f117477x;
            m mVar = this.f117476w;
            if (z) {
                this.u = 1;
                if (mVar.c3((InvestOrder.InvestSecuritiesOrder) investOrder, displayOptions, this) == aVar) {
                    return aVar;
                }
            } else if (investOrder instanceof InvestCommodityOrder) {
                InvestCommodityOrder investOrder2 = (InvestCommodityOrder) investOrder;
                Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                mVar.d3(investOrder2);
            } else if (investOrder instanceof InvestMarginOrder) {
                InvestMarginOrder investOrder3 = (InvestMarginOrder) investOrder;
                Intrinsics.checkNotNullParameter(investOrder3, "investOrder");
                Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
                if (displayOptions.f117468a) {
                    mVar.d3(investOrder3);
                } else {
                    mVar.Z2(investOrder3);
                }
            } else if (investOrder instanceof InvestFundOrder) {
                InvestFundOrder investOrder4 = (InvestFundOrder) investOrder;
                Intrinsics.checkNotNullParameter(investOrder4, "investOrder");
                mVar.d3(investOrder4);
            } else if (investOrder instanceof InvestMutualFundOrder) {
                InvestMutualFundOrder investOrder5 = (InvestMutualFundOrder) investOrder;
                Intrinsics.checkNotNullParameter(investOrder5, "investOrder");
                mVar.d3(investOrder5);
            } else {
                if (!(investOrder instanceof InvestOptionOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                mVar.d3(investOrder);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}

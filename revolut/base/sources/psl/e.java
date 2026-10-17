package psl;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$State;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239519a;

    public /* synthetic */ e(int i) {
        this.f239519a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f239519a;
        jsl.n nVar = jsl.n.f178225a;
        Object investTransactionsFilterImpl = null;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return jsl.m.f178223a;
            case 1:
                InvestOrder it8 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(it8));
            case 2:
                InvestOrder it9 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                if (it9 instanceof InvestOrder.InvestSecuritiesOrder) {
                    if (io3.h.o(it9.getD())) {
                        return null;
                    }
                    return new tsl.i((InvestOrder.InvestSecuritiesOrder) it9);
                }
                if (it9 instanceof InvestMarginOrder) {
                    return new tsl.h((InvestMarginOrder) it9);
                }
                if ((it9 instanceof InvestFundOrder) || (it9 instanceof InvestMutualFundOrder) || (it9 instanceof InvestOptionOrder) || (it9 instanceof InvestCommodityOrder)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                jsl.a0 update = (jsl.a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jsl.a0.a(update, null, null, null, null, null, null, null, null, null, null, null, zi0.c.P(Optional.empty(), false, null, 3), 2047);
            case 4:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Optional.ofNullable(it10.g());
            case 5:
                return ((Boolean) obj2).booleanValue() ? jsl.l.f178221a : nVar;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return nVar;
            case 7:
                jsl.a0 it11 = (jsl.a0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f178197b;
            case 8:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Optional.of(it12);
            case 9:
                jsl.a0 it13 = (jsl.a0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.d;
            case 10:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Optional.empty();
            case 11:
                tsl.j it14 = (tsl.j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return tsl.g.a(it14);
            case 12:
                InvestOrder it15 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return tsl.g.b(it15);
            case 13:
                tsl.j investOrderWrapper = (tsl.j) obj2;
                Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                InvestOrder investOrderA = investOrderWrapper.a();
                if (oi0.d.B(investOrderA.getF104635j())) {
                    InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                    String clientOrderId = investOrderA.getF104630a();
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(clientOrderId, "clientOrderId");
                    investTransactionsFilterImpl = new InvestTransactionsFilter.InvestTransactionsFilterImpl(null, null, null, clientOrderId, null, null, null, LDSFile.EF_SOD_TAG);
                }
                return Optional.ofNullable(investTransactionsFilterImpl);
            case 14:
                ChargeBreakdown it16 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Optional.of(it16);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 16:
                CreditCard it17 = (CreditCard) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new AnalyticsAccount.Personal.CreditCard(it17.f69793b);
            case 17:
                List list = (List) obj2;
                Intrinsics.h(list);
                Iterator it18 = list.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        Object next = it18.next();
                        if (((j61.c) next).f171657b.D0 != null) {
                            investTransactionsFilterImpl = next;
                        }
                    }
                }
                j61.c cVar = (j61.c) investTransactionsFilterImpl;
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalStateException("Missing transfer reasons");
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new ptf.h(iii.c.c(5), false);
            case 19:
                WorkflowFlowContract$State update2 = (WorkflowFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return WorkflowFlowContract$State.a(update2, null, null, null, null, null, 123);
            case 20:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return Boolean.TRUE;
            case 21:
                CmdFlowContract$State update3 = (CmdFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new CmdFlowContract$State(true);
            case 22:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((StakingAvailability) pair.f186386b).f88058a != null);
            case 23:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                io3.d dVar = (io3.d) pair2.f186385a;
                StakingAvailability stakingAvailability = (StakingAvailability) pair2.f186386b;
                String str = dVar.f163145a;
                StakingProduct stakingProduct = stakingAvailability.f88058a;
                Intrinsics.h(stakingProduct);
                return new yhm.r(str, stakingProduct, stakingAvailability.f88059b);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 25:
                StakingAvailability it19 = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.f88059b != null);
            case 26:
                StakingAvailability it20 = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                StakingPocket stakingPocket = it20.f88059b;
                Intrinsics.h(stakingPocket);
                return stakingPocket;
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ e(ptf.n nVar) {
        this.f239519a = 18;
    }
}

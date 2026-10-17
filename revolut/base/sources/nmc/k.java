package nmc;

import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import dfl.i0;
import dfl.q;
import dfl.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Function1 {
    public static RoboTransaction a(i0 trade) {
        ilc.c cVar;
        Intrinsics.checkNotNullParameter(trade, "trade");
        int i = j.f217272b[trade.p().ordinal()];
        if (i == 1 || i == 2) {
            cVar = ilc.c.PENDING;
        } else if (i == 3) {
            cVar = ilc.c.COMPLETED;
        } else if (i == 4) {
            cVar = ilc.c.FAILED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = ilc.c.CANCELLED;
        }
        ilc.c cVar2 = cVar;
        q qVarR = trade.r();
        Intrinsics.i(qVarR, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.transaction.AmountInvestValue");
        dj0.d dVarA0 = oi0.d.a0((dfl.a) qVarR);
        if (!(trade instanceof dfl.b)) {
            if (trade instanceof dfl.h) {
                return new RoboTransaction.Fee(cVar2, dVarA0, ofm.q.o(trade), ((dfl.h) trade).f114336a);
            }
            if (trade instanceof dfl.j) {
                dfl.j jVar = (dfl.j) trade;
                return new RoboTransaction.Dividend(cVar2, dVarA0, ofm.q.o(trade), jVar.f114375a, jVar.v, jVar.u);
            }
            if (trade instanceof z) {
                return new RoboTransaction.Refund(cVar2, dVarA0, ofm.q.o(trade), ((z) trade).f114531a);
            }
            throw new IllegalArgumentException("No RoboTransaction mapping for Trade " + trade);
        }
        dfl.b bVar = (dfl.b) trade;
        int i2 = j.f217271a[bVar.f114191s.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new RoboTransaction.Withdrawal(cVar2, dVarA0, ofm.q.o(trade), bVar.f114179a, bVar.f114194x);
        }
        String str = bVar.k;
        if (str != null) {
            return new RoboTransaction.RecurringDeposit(cVar2, dVarA0, ofm.q.o(trade), bVar.f114179a, str);
        }
        return new RoboTransaction.OneOffContribution(cVar2, dVarA0, ofm.q.o(trade), bVar.f114179a, pd.b.j(bVar.f114195y), pd.b.j(bVar.z));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((i0) obj2);
    }
}

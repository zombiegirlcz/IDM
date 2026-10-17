package sif;

import a4l.b;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xhf.h;
import xhf.x0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final boolean a(TransactionContext.DataSet dataSet, TransactionContext.TransactionData join) {
        Intrinsics.checkNotNullParameter(dataSet, "<this>");
        Intrinsics.checkNotNullParameter(join, "join");
        if (dataSet instanceof TransactionContext.DataSet.AllIncluded) {
            return true;
        }
        if (dataSet instanceof TransactionContext.DataSet.AllExcluded) {
            return false;
        }
        if (dataSet instanceof TransactionContext.DataSet.Included) {
            return ((TransactionContext.DataSet.Included) dataSet).f60270a.contains(join);
        }
        if (dataSet instanceof TransactionContext.DataSet.Excluded) {
            return !((TransactionContext.DataSet.Excluded) dataSet).f60269a.contains(join);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long b(h hVar) {
        b taxes;
        jo3.a total;
        b taxes2;
        jo3.a total2;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String currency = hVar.getCurrency();
        x0 transactionCharges = hVar.getTransactionCharges();
        if (!Intrinsics.f(currency, (transactionCharges == null || (taxes2 = transactionCharges.getTaxes()) == null || (total2 = taxes2.getTotal()) == null) ? null : total2.getCurrency())) {
            return hVar.getAmount() - hVar.getFee();
        }
        long amount = hVar.getAmount() - hVar.getFee();
        x0 transactionCharges2 = hVar.getTransactionCharges();
        return amount - ((transactionCharges2 == null || (taxes = transactionCharges2.getTaxes()) == null || (total = taxes.getTotal()) == null) ? 0L : total.getAmount());
    }
}

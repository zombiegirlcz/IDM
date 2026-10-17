package me3;

import cam.f;
import he3.h;
import he3.j;
import he3.l;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.h3;
import tof.p6;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends f {

    @NotNull
    public static final a Companion = new a();

    @Override // cam.f
    public final j d(String groupKey, List groupedTransactions, dj0.d amount, HashMap dailyTotals, List transactions) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new j(groupKey, amount, dailyTotals, Intrinsics.f(groupKey, "other") ? l.CARD_OTHER : l.CARD, transactions);
    }

    @Override // cam.f
    public final String m(h transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        h3 h3Var = transaction.f151559a.A;
        p6 p6Var = h3Var != null ? h3Var.f272780b : null;
        return (p6Var == null || Intrinsics.f(p6Var.e, Boolean.TRUE)) ? "other" : p6Var.f272991a;
    }
}

package me3;

import cam.f;
import he3.h;
import he3.j;
import he3.l;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.h3;
import tof.j5;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    @NotNull
    public static final d Companion = new d();

    @Override // cam.f
    public final j d(String groupKey, List groupedTransactions, dj0.d amount, HashMap dailyTotals, List transactions) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new j(groupKey, amount, dailyTotals, Intrinsics.f(groupKey, "other") ? l.COUNTRY_OTHER : l.COUNTRY, transactions);
    }

    @Override // cam.f
    public final String m(h transaction) {
        j5 j5Var;
        String str;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        a3 a3Var = transaction.f151559a;
        if (a3Var.N) {
            return "other";
        }
        wi0.b bVar = a3Var.M;
        if (bVar != null && (str = bVar.f297794a) != null) {
            return str;
        }
        h3 h3Var = a3Var.A;
        String str2 = (h3Var == null || (j5Var = h3Var.f272779a) == null) ? null : j5Var.f272852h;
        return str2 == null ? "other" : str2;
    }
}

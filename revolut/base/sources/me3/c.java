package me3;

import cam.f;
import he3.j;
import he3.l;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e9l.a aVar, int i) {
        super(aVar);
        this.f204599b = i;
    }

    @Override // cam.f
    public final j d(String groupKey, List groupedTransactions, dj0.d amount, HashMap dailyTotals, List transactions) {
        switch (this.f204599b) {
            case 0:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.CARDHOLDERS, transactions);
            case 1:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.CURRENCY, transactions);
            case 2:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.MERCHANT, transactions);
            case 3:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.PARTICIPANTS, transactions);
            case 4:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.SAVINGS_OPERATION_TYPE, transactions);
            case 5:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.SAVINGS_TRANSACTION_TYPE, transactions);
            case 6:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.SOURCE_ACCOUNT, transactions);
            default:
                Intrinsics.checkNotNullParameter(groupKey, "groupKey");
                Intrinsics.checkNotNullParameter(groupedTransactions, "groupedTransactions");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new j(groupKey, amount, dailyTotals, l.CATEGORY, transactions);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // cam.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m(he3.h r5) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me3.c.m(he3.h):java.lang.String");
    }
}

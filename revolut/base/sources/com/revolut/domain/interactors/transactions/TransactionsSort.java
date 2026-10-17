package com.revolut.domain.interactors.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/interactors/transactions/TransactionsSort;", "", "<init>", "(Ljava/lang/String;I)V", "NO_SORT", "DEFAULT", "STARTED_DATE_ASC", "STARTED_DATE_DESC", "CREATED_DATE_ASC", "COMPLETED_DATE_DESC", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsSort {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionsSort[] $VALUES;
    public static final TransactionsSort NO_SORT = new TransactionsSort("NO_SORT", 0);
    public static final TransactionsSort DEFAULT = new TransactionsSort("DEFAULT", 1);
    public static final TransactionsSort STARTED_DATE_ASC = new TransactionsSort("STARTED_DATE_ASC", 2);
    public static final TransactionsSort STARTED_DATE_DESC = new TransactionsSort("STARTED_DATE_DESC", 3);
    public static final TransactionsSort CREATED_DATE_ASC = new TransactionsSort("CREATED_DATE_ASC", 4);
    public static final TransactionsSort COMPLETED_DATE_DESC = new TransactionsSort("COMPLETED_DATE_DESC", 5);

    private static final /* synthetic */ TransactionsSort[] $values() {
        return new TransactionsSort[]{NO_SORT, DEFAULT, STARTED_DATE_ASC, STARTED_DATE_DESC, CREATED_DATE_ASC, COMPLETED_DATE_DESC};
    }

    static {
        TransactionsSort[] transactionsSortArr$values = $values();
        $VALUES = transactionsSortArr$values;
        $ENTRIES = s.n(transactionsSortArr$values);
    }

    private TransactionsSort(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TransactionsSort valueOf(String str) {
        return (TransactionsSort) Enum.valueOf(TransactionsSort.class, str);
    }

    public static TransactionsSort[] values() {
        return (TransactionsSort[]) $VALUES.clone();
    }
}

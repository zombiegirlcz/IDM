package com.revolut.domain.interactors.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/revolut/domain/interactors/transactions/TransactionsPerformanceTracker$Scenario", "", "Lcom/revolut/domain/interactors/transactions/TransactionsPerformanceTracker$Scenario;", "", "traceName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTraceName", "()Ljava/lang/String;", "HOME_DB", "HOME_DOMAIN", "HOME_UI", "LIST_DOMAIN", "LIST_UI", "DETAILS_UI", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsPerformanceTracker$Scenario {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionsPerformanceTracker$Scenario[] $VALUES;

    @NotNull
    private final String traceName;
    public static final TransactionsPerformanceTracker$Scenario HOME_DB = new TransactionsPerformanceTracker$Scenario("HOME_DB", 0, "TXN_HOME_DB");
    public static final TransactionsPerformanceTracker$Scenario HOME_DOMAIN = new TransactionsPerformanceTracker$Scenario("HOME_DOMAIN", 1, "TXN_HOME_DOMAIN");
    public static final TransactionsPerformanceTracker$Scenario HOME_UI = new TransactionsPerformanceTracker$Scenario("HOME_UI", 2, "TXN_HOME_UI");
    public static final TransactionsPerformanceTracker$Scenario LIST_DOMAIN = new TransactionsPerformanceTracker$Scenario("LIST_DOMAIN", 3, "TXN_LIST_DOMAIN");
    public static final TransactionsPerformanceTracker$Scenario LIST_UI = new TransactionsPerformanceTracker$Scenario("LIST_UI", 4, "TXN_LIST_UI");
    public static final TransactionsPerformanceTracker$Scenario DETAILS_UI = new TransactionsPerformanceTracker$Scenario("DETAILS_UI", 5, "TXN_DETAILS_UI");

    private static final /* synthetic */ TransactionsPerformanceTracker$Scenario[] $values() {
        return new TransactionsPerformanceTracker$Scenario[]{HOME_DB, HOME_DOMAIN, HOME_UI, LIST_DOMAIN, LIST_UI, DETAILS_UI};
    }

    static {
        TransactionsPerformanceTracker$Scenario[] transactionsPerformanceTracker$ScenarioArr$values = $values();
        $VALUES = transactionsPerformanceTracker$ScenarioArr$values;
        $ENTRIES = s.n(transactionsPerformanceTracker$ScenarioArr$values);
    }

    private TransactionsPerformanceTracker$Scenario(String str, int i, String str2) {
        this.traceName = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TransactionsPerformanceTracker$Scenario valueOf(String str) {
        return (TransactionsPerformanceTracker$Scenario) Enum.valueOf(TransactionsPerformanceTracker$Scenario.class, str);
    }

    public static TransactionsPerformanceTracker$Scenario[] values() {
        return (TransactionsPerformanceTracker$Scenario[]) $VALUES.clone();
    }

    @NotNull
    public final String getTraceName() {
        return this.traceName;
    }
}

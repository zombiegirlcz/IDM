package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementPeriodType;", "", "<init>", "(Ljava/lang/String;I)V", "TAX_YEAR", "CALENDAR_YEAR", "LAST_FULL_YEAR", "CUSTOM", "MONTH", "ALL_TIME", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementPeriodType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatementPeriodType[] $VALUES;
    public static final StatementPeriodType TAX_YEAR = new StatementPeriodType("TAX_YEAR", 0);
    public static final StatementPeriodType CALENDAR_YEAR = new StatementPeriodType("CALENDAR_YEAR", 1);
    public static final StatementPeriodType LAST_FULL_YEAR = new StatementPeriodType("LAST_FULL_YEAR", 2);
    public static final StatementPeriodType CUSTOM = new StatementPeriodType("CUSTOM", 3);
    public static final StatementPeriodType MONTH = new StatementPeriodType("MONTH", 4);
    public static final StatementPeriodType ALL_TIME = new StatementPeriodType("ALL_TIME", 5);

    private static final /* synthetic */ StatementPeriodType[] $values() {
        return new StatementPeriodType[]{TAX_YEAR, CALENDAR_YEAR, LAST_FULL_YEAR, CUSTOM, MONTH, ALL_TIME};
    }

    static {
        StatementPeriodType[] statementPeriodTypeArr$values = $values();
        $VALUES = statementPeriodTypeArr$values;
        $ENTRIES = s.n(statementPeriodTypeArr$values);
    }

    private StatementPeriodType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static StatementPeriodType valueOf(String str) {
        return (StatementPeriodType) Enum.valueOf(StatementPeriodType.class, str);
    }

    public static StatementPeriodType[] values() {
        return (StatementPeriodType[]) $VALUES.clone();
    }
}

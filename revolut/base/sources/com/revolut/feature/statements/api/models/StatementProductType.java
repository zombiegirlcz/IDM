package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementProductType;", "", "<init>", "(Ljava/lang/String;I)V", "SAVINGS", "JOINT_SAVINGS", "COMMODITIES", "STOCK", "CRYPTO", "JOINT_CURRENT", "PERSONAL_CURRENT", "PRO", "ROBO", "MARGIN_TRADE", "TAX_ADVANTAGED_INVESTING", "JUNIOR", "JOINT_CURRENT_ANNUAL_FEE", "PERSONAL_CURRENT_ANNUAL_FEE", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementProductType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatementProductType[] $VALUES;
    public static final StatementProductType SAVINGS = new StatementProductType("SAVINGS", 0);
    public static final StatementProductType JOINT_SAVINGS = new StatementProductType("JOINT_SAVINGS", 1);
    public static final StatementProductType COMMODITIES = new StatementProductType("COMMODITIES", 2);
    public static final StatementProductType STOCK = new StatementProductType("STOCK", 3);
    public static final StatementProductType CRYPTO = new StatementProductType("CRYPTO", 4);
    public static final StatementProductType JOINT_CURRENT = new StatementProductType("JOINT_CURRENT", 5);
    public static final StatementProductType PERSONAL_CURRENT = new StatementProductType("PERSONAL_CURRENT", 6);
    public static final StatementProductType PRO = new StatementProductType("PRO", 7);
    public static final StatementProductType ROBO = new StatementProductType("ROBO", 8);
    public static final StatementProductType MARGIN_TRADE = new StatementProductType("MARGIN_TRADE", 9);
    public static final StatementProductType TAX_ADVANTAGED_INVESTING = new StatementProductType("TAX_ADVANTAGED_INVESTING", 10);
    public static final StatementProductType JUNIOR = new StatementProductType("JUNIOR", 11);
    public static final StatementProductType JOINT_CURRENT_ANNUAL_FEE = new StatementProductType("JOINT_CURRENT_ANNUAL_FEE", 12);
    public static final StatementProductType PERSONAL_CURRENT_ANNUAL_FEE = new StatementProductType("PERSONAL_CURRENT_ANNUAL_FEE", 13);

    private static final /* synthetic */ StatementProductType[] $values() {
        return new StatementProductType[]{SAVINGS, JOINT_SAVINGS, COMMODITIES, STOCK, CRYPTO, JOINT_CURRENT, PERSONAL_CURRENT, PRO, ROBO, MARGIN_TRADE, TAX_ADVANTAGED_INVESTING, JUNIOR, JOINT_CURRENT_ANNUAL_FEE, PERSONAL_CURRENT_ANNUAL_FEE};
    }

    static {
        StatementProductType[] statementProductTypeArr$values = $values();
        $VALUES = statementProductTypeArr$values;
        $ENTRIES = s.n(statementProductTypeArr$values);
    }

    private StatementProductType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static StatementProductType valueOf(String str) {
        return (StatementProductType) Enum.valueOf(StatementProductType.class, str);
    }

    public static StatementProductType[] values() {
        return (StatementProductType[]) $VALUES.clone();
    }
}

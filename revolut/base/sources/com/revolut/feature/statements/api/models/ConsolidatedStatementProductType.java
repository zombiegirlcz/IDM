package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/statements/api/models/ConsolidatedStatementProductType;", "", "<init>", "(Ljava/lang/String;I)V", "SAVINGS", "COMMODITIES", "STOCK", "CRYPTO", "toStatementProductType", "Lcom/revolut/feature/statements/api/models/StatementProductType;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsolidatedStatementProductType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsolidatedStatementProductType[] $VALUES;
    public static final ConsolidatedStatementProductType SAVINGS = new ConsolidatedStatementProductType("SAVINGS", 0);
    public static final ConsolidatedStatementProductType COMMODITIES = new ConsolidatedStatementProductType("COMMODITIES", 1);
    public static final ConsolidatedStatementProductType STOCK = new ConsolidatedStatementProductType("STOCK", 2);
    public static final ConsolidatedStatementProductType CRYPTO = new ConsolidatedStatementProductType("CRYPTO", 3);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsolidatedStatementProductType.values().length];
            try {
                iArr[ConsolidatedStatementProductType.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsolidatedStatementProductType.SAVINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsolidatedStatementProductType.CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsolidatedStatementProductType.COMMODITIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ConsolidatedStatementProductType[] $values() {
        return new ConsolidatedStatementProductType[]{SAVINGS, COMMODITIES, STOCK, CRYPTO};
    }

    static {
        ConsolidatedStatementProductType[] consolidatedStatementProductTypeArr$values = $values();
        $VALUES = consolidatedStatementProductTypeArr$values;
        $ENTRIES = s.n(consolidatedStatementProductTypeArr$values);
    }

    private ConsolidatedStatementProductType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ConsolidatedStatementProductType valueOf(String str) {
        return (ConsolidatedStatementProductType) Enum.valueOf(ConsolidatedStatementProductType.class, str);
    }

    public static ConsolidatedStatementProductType[] values() {
        return (ConsolidatedStatementProductType[]) $VALUES.clone();
    }

    @NotNull
    public final StatementProductType toStatementProductType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return StatementProductType.STOCK;
        }
        if (i == 2) {
            return StatementProductType.SAVINGS;
        }
        if (i == 3) {
            return StatementProductType.CRYPTO;
        }
        if (i == 4) {
            return StatementProductType.COMMODITIES;
        }
        throw new NoWhenBranchMatchedException();
    }
}

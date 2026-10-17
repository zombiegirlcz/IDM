package aue;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNT_LIMIT;
    public static final c ALL_TRANSACTIONS_LIMIT;
    public static final c CARDS_HIGH_RISK_COUNTRY_LIMIT;
    public static final c COUNTRY_SPECIFIC_LIMIT;
    public static final c DAILY_LIMIT;
    public static final c MONTHLY_LIMIT;
    public static final c SINGLE_TRANSACTION_MAX_LIMIT;
    public static final c UNVERIFIED_CARDS_LIMIT;
    public static final c WEEKLY_LIMIT;
    public static final c YEARLY_LIMIT;

    static {
        c cVar = new c("UNVERIFIED_CARDS_LIMIT", 0);
        UNVERIFIED_CARDS_LIMIT = cVar;
        c cVar2 = new c("COUNTRY_SPECIFIC_LIMIT", 1);
        COUNTRY_SPECIFIC_LIMIT = cVar2;
        c cVar3 = new c("CARDS_HIGH_RISK_COUNTRY_LIMIT", 2);
        CARDS_HIGH_RISK_COUNTRY_LIMIT = cVar3;
        c cVar4 = new c("ACCOUNT_LIMIT", 3);
        ACCOUNT_LIMIT = cVar4;
        c cVar5 = new c("DAILY_LIMIT", 4);
        DAILY_LIMIT = cVar5;
        c cVar6 = new c("ALL_TRANSACTIONS_LIMIT", 5);
        ALL_TRANSACTIONS_LIMIT = cVar6;
        c cVar7 = new c("SINGLE_TRANSACTION_MAX_LIMIT", 6);
        SINGLE_TRANSACTION_MAX_LIMIT = cVar7;
        c cVar8 = new c("WEEKLY_LIMIT", 7);
        WEEKLY_LIMIT = cVar8;
        c cVar9 = new c("MONTHLY_LIMIT", 8);
        MONTHLY_LIMIT = cVar9;
        c cVar10 = new c("YEARLY_LIMIT", 9);
        YEARLY_LIMIT = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}

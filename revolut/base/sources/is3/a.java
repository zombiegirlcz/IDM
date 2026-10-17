package is3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IBAN_ACCOUNT_NOT_FOUND;
    public static final a INCOME_ASSESSMENT_NOT_AVAILABLE;
    public static final a INCOME_ASSESSMENT_NOT_AVAILABLE_OVER_LIMIT;
    public static final a INCOME_ASSESSMENT_NOT_AVAILABLE_UNDER_LIMIT;
    public static final a NOT_MATCHING_CURRENCY;
    public static final a NO_MATCHING_ACCOUNT_FOUND;
    public static final a UNKNOWN_BANK;
    public static final a UNKNOWN_BANK_OVER_LIMIT;
    public static final a UNKNOWN_BANK_UNDER_LIMIT;

    static {
        a aVar = new a("IBAN_ACCOUNT_NOT_FOUND", 0);
        IBAN_ACCOUNT_NOT_FOUND = aVar;
        a aVar2 = new a("NO_MATCHING_ACCOUNT_FOUND", 1);
        NO_MATCHING_ACCOUNT_FOUND = aVar2;
        a aVar3 = new a("NOT_MATCHING_CURRENCY", 2);
        NOT_MATCHING_CURRENCY = aVar3;
        a aVar4 = new a("UNKNOWN_BANK", 3);
        UNKNOWN_BANK = aVar4;
        a aVar5 = new a("UNKNOWN_BANK_OVER_LIMIT", 4);
        UNKNOWN_BANK_OVER_LIMIT = aVar5;
        a aVar6 = new a("UNKNOWN_BANK_UNDER_LIMIT", 5);
        UNKNOWN_BANK_UNDER_LIMIT = aVar6;
        a aVar7 = new a("INCOME_ASSESSMENT_NOT_AVAILABLE", 6);
        INCOME_ASSESSMENT_NOT_AVAILABLE = aVar7;
        a aVar8 = new a("INCOME_ASSESSMENT_NOT_AVAILABLE_OVER_LIMIT", 7);
        INCOME_ASSESSMENT_NOT_AVAILABLE_OVER_LIMIT = aVar8;
        a aVar9 = new a("INCOME_ASSESSMENT_NOT_AVAILABLE_UNDER_LIMIT", 8);
        INCOME_ASSESSMENT_NOT_AVAILABLE_UNDER_LIMIT = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}

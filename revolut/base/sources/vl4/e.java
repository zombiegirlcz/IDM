package vl4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CARRIED_OVER_BALANCE;
    public static final e POST_PURCHASE;
    public static final e PRE_PURCHASE;
    public static final e REFERENCE;
    public static final e STATEMENT_FINANCING;
    public static final e STATEMENT_FINANCING_ADJUSTMENT;
    public static final e UNKNOWN;

    static {
        e eVar = new e("PRE_PURCHASE", 0);
        PRE_PURCHASE = eVar;
        e eVar2 = new e("STATEMENT_FINANCING", 1);
        STATEMENT_FINANCING = eVar2;
        e eVar3 = new e("POST_PURCHASE", 2);
        POST_PURCHASE = eVar3;
        e eVar4 = new e("STATEMENT_FINANCING_ADJUSTMENT", 3);
        STATEMENT_FINANCING_ADJUSTMENT = eVar4;
        e eVar5 = new e("CARRIED_OVER_BALANCE", 4);
        CARRIED_OVER_BALANCE = eVar5;
        e eVar6 = new e("REFERENCE", 5);
        REFERENCE = eVar6;
        e eVar7 = new e("UNKNOWN", 6);
        UNKNOWN = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

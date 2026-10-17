package fva;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ADHOC;
    public static final e BI_MONTHLY;
    public static final e BI_WEEKLY;
    public static final e DAILY;
    public static final e HALF_YEARLY;
    public static final e MONTHLY;
    public static final e QUARTERLY;
    public static final e TEN_DAYS;
    public static final e TRIMESTER;
    public static final e TWICE_WEEKLY;
    public static final e UNKNOWN;
    public static final e WEEKLY;
    public static final e YEARLY;

    static {
        e eVar = new e("ADHOC", 0);
        ADHOC = eVar;
        e eVar2 = new e("WEEKLY", 1);
        WEEKLY = eVar2;
        e eVar3 = new e("BI_WEEKLY", 2);
        BI_WEEKLY = eVar3;
        e eVar4 = new e("MONTHLY", 3);
        MONTHLY = eVar4;
        e eVar5 = new e("QUARTERLY", 4);
        QUARTERLY = eVar5;
        e eVar6 = new e("HALF_YEARLY", 5);
        HALF_YEARLY = eVar6;
        e eVar7 = new e("YEARLY", 6);
        YEARLY = eVar7;
        e eVar8 = new e("DAILY", 7);
        DAILY = eVar8;
        e eVar9 = new e("TWICE_WEEKLY", 8);
        TWICE_WEEKLY = eVar9;
        e eVar10 = new e("TEN_DAYS", 9);
        TEN_DAYS = eVar10;
        e eVar11 = new e("BI_MONTHLY", 10);
        BI_MONTHLY = eVar11;
        e eVar12 = new e("TRIMESTER", 11);
        TRIMESTER = eVar12;
        e eVar13 = new e("UNKNOWN", 12);
        UNKNOWN = eVar13;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

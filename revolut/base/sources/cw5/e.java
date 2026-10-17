package cw5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ONE_DAY;
    public static final e ONE_MONTH;
    public static final e ONE_WEEK;
    public static final e ONE_YEAR;

    static {
        e eVar = new e("ONE_DAY", 0);
        ONE_DAY = eVar;
        e eVar2 = new e("ONE_WEEK", 1);
        ONE_WEEK = eVar2;
        e eVar3 = new e("ONE_MONTH", 2);
        ONE_MONTH = eVar3;
        e eVar4 = new e("ONE_YEAR", 3);
        ONE_YEAR = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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

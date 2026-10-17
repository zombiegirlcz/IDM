package iob;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements Comparable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DAYS;
    public static final e HOURS;
    public static final e MINUTES;
    public static final e MONTHS;
    public static final e SECONDS;

    static {
        e eVar = new e("MONTHS", 0);
        MONTHS = eVar;
        e eVar2 = new e("DAYS", 1);
        DAYS = eVar2;
        e eVar3 = new e("HOURS", 2);
        HOURS = eVar3;
        e eVar4 = new e("MINUTES", 3);
        MINUTES = eVar4;
        e eVar5 = new e("SECONDS", 4);
        SECONDS = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

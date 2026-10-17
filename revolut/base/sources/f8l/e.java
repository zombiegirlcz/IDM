package f8l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e LIMIT;
    public static final e MARKET;
    public static final e RECURRING;
    public static final e STOP;

    static {
        e eVar = new e("MARKET", 0);
        MARKET = eVar;
        e eVar2 = new e("LIMIT", 1);
        LIMIT = eVar2;
        e eVar3 = new e("STOP", 2);
        STOP = eVar3;
        e eVar4 = new e("RECURRING", 3);
        RECURRING = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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

package w5h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e GOOD;
    public static final e LIQUIDATION;
    public static final e UNKNOWN;
    public static final e WARNING;

    static {
        e eVar = new e("GOOD", 0);
        GOOD = eVar;
        e eVar2 = new e("WARNING", 1);
        WARNING = eVar2;
        e eVar3 = new e("LIQUIDATION", 2);
        LIQUIDATION = eVar3;
        e eVar4 = new e("UNKNOWN", 3);
        UNKNOWN = eVar4;
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

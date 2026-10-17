package f7d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AFTERNOON;
    public static final e EVENING;
    public static final e MORNING;
    public static final e NIGHT;

    static {
        e eVar = new e("MORNING", 0);
        MORNING = eVar;
        e eVar2 = new e("AFTERNOON", 1);
        AFTERNOON = eVar2;
        e eVar3 = new e("EVENING", 2);
        EVENING = eVar3;
        e eVar4 = new e("NIGHT", 3);
        NIGHT = eVar4;
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

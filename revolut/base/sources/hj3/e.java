package hj3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ALL_SCREENS;
    public static final e END_SCREEN;
    public static final e NONE;

    static {
        e eVar = new e("NONE", 0);
        NONE = eVar;
        e eVar2 = new e("ALL_SCREENS", 1);
        ALL_SCREENS = eVar2;
        e eVar3 = new e("END_SCREEN", 2);
        END_SCREEN = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
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

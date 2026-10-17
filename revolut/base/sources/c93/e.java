package c93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DISPOSABLE;
    public static final e PHYSICAL;
    public static final e VIRTUAL;

    static {
        e eVar = new e("PHYSICAL", 0);
        PHYSICAL = eVar;
        e eVar2 = new e("VIRTUAL", 1);
        VIRTUAL = eVar2;
        e eVar3 = new e("DISPOSABLE", 2);
        DISPOSABLE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
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

package hha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PERSONAL;
    public static final e PERSONAL_JOINT;
    public static final e PERSONAL_UNDER_18;
    public static final e UNKNOWN;
    public static final e YOUTH;

    static {
        e eVar = new e("PERSONAL", 0);
        PERSONAL = eVar;
        e eVar2 = new e("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = eVar2;
        e eVar3 = new e("YOUTH", 2);
        YOUTH = eVar3;
        e eVar4 = new e("PERSONAL_UNDER_18", 3);
        PERSONAL_UNDER_18 = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
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

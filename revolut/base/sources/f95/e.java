package f95;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTIVE;
    public static final e DEACTIVATING;
    public static final e INACTIVE;
    public static final e LATE;
    public static final e TERMINATED;

    static {
        e eVar = new e("ACTIVE", 0);
        ACTIVE = eVar;
        e eVar2 = new e("INACTIVE", 1);
        INACTIVE = eVar2;
        e eVar3 = new e("DEACTIVATING", 2);
        DEACTIVATING = eVar3;
        e eVar4 = new e("LATE", 3);
        LATE = eVar4;
        e eVar5 = new e("TERMINATED", 4);
        TERMINATED = eVar5;
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

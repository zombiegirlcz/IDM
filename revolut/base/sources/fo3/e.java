package fo3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTIVE;
    public static final e DELETED;
    public static final e LOCKED;
    public static final e TERMINATED;

    static {
        e eVar = new e("ACTIVE", 0);
        ACTIVE = eVar;
        e eVar2 = new e("LOCKED", 1);
        LOCKED = eVar2;
        e eVar3 = new e("DELETED", 2);
        DELETED = eVar3;
        e eVar4 = new e("TERMINATED", 3);
        TERMINATED = eVar4;
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

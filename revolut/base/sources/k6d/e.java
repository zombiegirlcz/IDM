package k6d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTIVE;
    public static final e ARCHIVED;
    public static final e PENDING;

    static {
        e eVar = new e("PENDING", 0);
        PENDING = eVar;
        e eVar2 = new e("ACTIVE", 1);
        ACTIVE = eVar2;
        e eVar3 = new e("ARCHIVED", 2);
        ARCHIVED = eVar3;
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

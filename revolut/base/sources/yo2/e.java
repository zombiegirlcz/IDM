package yo2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CREATED;
    public static final e FAILED;
    public static final e PENDING;
    public static final e SUCCESS;
    public static final e WARNING;

    static {
        e eVar = new e("PENDING", 0);
        PENDING = eVar;
        e eVar2 = new e("CREATED", 1);
        CREATED = eVar2;
        e eVar3 = new e("SUCCESS", 2);
        SUCCESS = eVar3;
        e eVar4 = new e("WARNING", 3);
        WARNING = eVar4;
        e eVar5 = new e("FAILED", 4);
        FAILED = eVar5;
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

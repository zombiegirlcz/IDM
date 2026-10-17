package zz1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e COMPLETED;
    public static final e CREATED;
    public static final e FAILED;
    public static final e PROCESSING;

    static {
        e eVar = new e("CREATED", 0);
        CREATED = eVar;
        e eVar2 = new e("PROCESSING", 1);
        PROCESSING = eVar2;
        e eVar3 = new e("COMPLETED", 2);
        COMPLETED = eVar3;
        e eVar4 = new e("FAILED", 3);
        FAILED = eVar4;
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

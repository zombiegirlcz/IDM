package aa0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e INVALID_PAN;
    public static final e NOT_A_PAN;
    public static final e VALID;

    static {
        e eVar = new e("VALID", 0);
        VALID = eVar;
        e eVar2 = new e("NOT_A_PAN", 1);
        NOT_A_PAN = eVar2;
        e eVar3 = new e("INVALID_PAN", 2);
        INVALID_PAN = eVar3;
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

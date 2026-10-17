package li8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e INCORRECT_AGE;
    public static final e INVALID_AGE_DIFFERENCE;
    public static final e TOO_YOUNG;

    static {
        e eVar = new e("INCORRECT_AGE", 0);
        INCORRECT_AGE = eVar;
        e eVar2 = new e("TOO_YOUNG", 1);
        TOO_YOUNG = eVar2;
        e eVar3 = new e("INVALID_AGE_DIFFERENCE", 2);
        INVALID_AGE_DIFFERENCE = eVar3;
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

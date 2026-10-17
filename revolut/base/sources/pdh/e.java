package pdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PURPOSE_LEARNING;
    public static final e PURPOSE_PRESERVE_CAPITAL;
    public static final e UNKNOWN;

    static {
        e eVar = new e("PURPOSE_PRESERVE_CAPITAL", 0);
        PURPOSE_PRESERVE_CAPITAL = eVar;
        e eVar2 = new e("PURPOSE_LEARNING", 1);
        PURPOSE_LEARNING = eVar2;
        e eVar3 = new e("UNKNOWN", 2);
        UNKNOWN = eVar3;
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

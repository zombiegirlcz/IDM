package ju3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CLOSE_APPLICATION;
    public static final e CLOSE_SCREEN;
    public static final e IGNORE_INCOME_CHECK;
    public static final e RETRY_INCOME_CHECK;

    static {
        e eVar = new e("RETRY_INCOME_CHECK", 0);
        RETRY_INCOME_CHECK = eVar;
        e eVar2 = new e("IGNORE_INCOME_CHECK", 1);
        IGNORE_INCOME_CHECK = eVar2;
        e eVar3 = new e("CLOSE_APPLICATION", 2);
        CLOSE_APPLICATION = eVar3;
        e eVar4 = new e("CLOSE_SCREEN", 3);
        CLOSE_SCREEN = eVar4;
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

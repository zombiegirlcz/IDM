package okb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e EXPIRED;
    public static final e INVALID;
    public static final e VALID;
    public static final e VERIFYING;

    static {
        e eVar = new e("INVALID", 0);
        INVALID = eVar;
        e eVar2 = new e("EXPIRED", 1);
        EXPIRED = eVar2;
        e eVar3 = new e("VERIFYING", 2);
        VERIFYING = eVar3;
        e eVar4 = new e("VALID", 3);
        VALID = eVar4;
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

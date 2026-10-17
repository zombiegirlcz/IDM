package fwf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e RETRY;
    public static final e SEE_ALL_EXPIRED;

    static {
        e eVar = new e("RETRY", 0);
        RETRY = eVar;
        e eVar2 = new e("SEE_ALL_EXPIRED", 1);
        SEE_ALL_EXPIRED = eVar2;
        e[] eVarArr = {eVar, eVar2};
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

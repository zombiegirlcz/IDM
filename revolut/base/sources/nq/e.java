package nq;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e IN_HOUSE;
    public static final e ONFIDO;
    public static final e UNKNOWN;

    static {
        e eVar = new e("ONFIDO", 0);
        ONFIDO = eVar;
        e eVar2 = new e("IN_HOUSE", 1);
        IN_HOUSE = eVar2;
        e eVar3 = new e("UNKNOWN", 2);
        UNKNOWN = eVar3;
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

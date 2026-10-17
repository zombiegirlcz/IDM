package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v FINCRIME_HARD;
    public static final v FINCRIME_SOFT;
    public static final v INITIATED_BY_USER;

    static {
        v vVar = new v("FINCRIME_SOFT", 0);
        FINCRIME_SOFT = vVar;
        v vVar2 = new v("FINCRIME_HARD", 1);
        FINCRIME_HARD = vVar2;
        v vVar3 = new v("INITIATED_BY_USER", 2);
        INITIATED_BY_USER = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}

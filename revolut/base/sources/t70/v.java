package t70;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v RESTRICTED;
    public static final v SYSTEM;
    public static final v SYSTEM_AND_PER_APP;

    static {
        v vVar = new v("RESTRICTED", 0);
        RESTRICTED = vVar;
        v vVar2 = new v("SYSTEM", 1);
        SYSTEM = vVar2;
        v vVar3 = new v("SYSTEM_AND_PER_APP", 2);
        SYSTEM_AND_PER_APP = vVar3;
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

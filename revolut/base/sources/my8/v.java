package my8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v DISABLED;
    public static final v IF_POSSIBLE;
    public static final v REQUIRED;

    static {
        v vVar = new v("REQUIRED", 0);
        REQUIRED = vVar;
        v vVar2 = new v("IF_POSSIBLE", 1);
        IF_POSSIBLE = vVar2;
        v vVar3 = new v("DISABLED", 2);
        DISABLED = vVar3;
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

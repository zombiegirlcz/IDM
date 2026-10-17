package g8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v BUSINESS;
    public static final v INDIVIDUAL;
    public static final v UNKNOWN;

    static {
        v vVar = new v("INDIVIDUAL", 0);
        INDIVIDUAL = vVar;
        v vVar2 = new v("BUSINESS", 1);
        BUSINESS = vVar2;
        v vVar3 = new v("UNKNOWN", 2);
        UNKNOWN = vVar3;
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

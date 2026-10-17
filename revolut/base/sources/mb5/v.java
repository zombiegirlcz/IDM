package mb5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACTIVE;
    public static final v INACTIVE;

    static {
        v vVar = new v("ACTIVE", 0);
        ACTIVE = vVar;
        v vVar2 = new v("INACTIVE", 1);
        INACTIVE = vVar2;
        v[] vVarArr = {vVar, vVar2};
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

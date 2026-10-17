package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class v2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v2[] $VALUES;
    public static final v2 REQUIRED;

    static {
        v2 v2Var = new v2("REQUIRED", 0);
        REQUIRED = v2Var;
        v2[] v2VarArr = {v2Var};
        $VALUES = v2VarArr;
        $ENTRIES = vc.s.n(v2VarArr);
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) $VALUES.clone();
    }
}

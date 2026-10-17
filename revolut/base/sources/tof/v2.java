package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v2[] $VALUES;
    public static final v2 APPROVED;
    public static final v2 DECLINED;
    public static final v2 PENDING;
    public static final v2 TIMEOUT;

    static {
        v2 v2Var = new v2("APPROVED", 0);
        APPROVED = v2Var;
        v2 v2Var2 = new v2("DECLINED", 1);
        DECLINED = v2Var2;
        v2 v2Var3 = new v2("PENDING", 2);
        PENDING = v2Var3;
        v2 v2Var4 = new v2("TIMEOUT", 3);
        TIMEOUT = v2Var4;
        v2[] v2VarArr = {v2Var, v2Var2, v2Var3, v2Var4};
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

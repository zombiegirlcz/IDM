package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v1[] $VALUES;
    public static final v1 ONE_OFF;
    public static final v1 POST_CONSUMPTION;
    public static final v1 SUBSCRIPTION;

    static {
        v1 v1Var = new v1("SUBSCRIPTION", 0);
        SUBSCRIPTION = v1Var;
        v1 v1Var2 = new v1("POST_CONSUMPTION", 1);
        POST_CONSUMPTION = v1Var2;
        v1 v1Var3 = new v1("ONE_OFF", 2);
        ONE_OFF = v1Var3;
        v1[] v1VarArr = {v1Var, v1Var2, v1Var3};
        $VALUES = v1VarArr;
        $ENTRIES = vc.s.n(v1VarArr);
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }
}

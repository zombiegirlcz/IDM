package ueg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 FAILED;
    public static final h0 IDLE;
    public static final h0 LOADING;

    static {
        h0 h0Var = new h0("IDLE", 0);
        IDLE = h0Var;
        h0 h0Var2 = new h0("LOADING", 1);
        LOADING = h0Var2;
        h0 h0Var3 = new h0("FAILED", 2);
        FAILED = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}

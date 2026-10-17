package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class v0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 FAST;
    public static final v0 MEDIUM;
    public static final v0 NONE;
    public static final v0 SLOW;

    static {
        v0 v0Var = new v0("FAST", 0);
        FAST = v0Var;
        v0 v0Var2 = new v0("MEDIUM", 1);
        MEDIUM = v0Var2;
        v0 v0Var3 = new v0("SLOW", 2);
        SLOW = v0Var3;
        v0 v0Var4 = new v0("NONE", 3);
        NONE = v0Var4;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3, v0Var4};
        $VALUES = v0VarArr;
        $ENTRIES = vc.s.n(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}

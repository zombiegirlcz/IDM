package ix0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 NOT_A_VIEW_GROUP;
    public static final z0 NO_ELIGIBLE_CHILDREN;
    public static final z0 UNKNOWN_NESTING;
    public static final z0 UNSUPPORTED_CHILD;

    static {
        z0 z0Var = new z0("NOT_A_VIEW_GROUP", 0);
        NOT_A_VIEW_GROUP = z0Var;
        z0 z0Var2 = new z0("UNSUPPORTED_CHILD", 1);
        UNSUPPORTED_CHILD = z0Var2;
        z0 z0Var3 = new z0("UNKNOWN_NESTING", 2);
        UNKNOWN_NESTING = z0Var3;
        z0 z0Var4 = new z0("NO_ELIGIBLE_CHILDREN", 3);
        NO_ELIGIBLE_CHILDREN = z0Var4;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4};
        $VALUES = z0VarArr;
        $ENTRIES = vc.s.n(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}

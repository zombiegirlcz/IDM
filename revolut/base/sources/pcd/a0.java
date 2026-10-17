package pcd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 ACTIVE;
    public static final a0 INACTIVE;
    public static final a0 INVITED;
    public static final a0 LEFT;
    public static final a0 REFUSED;
    public static final a0 REMOVED;

    static {
        a0 a0Var = new a0("INVITED", 0);
        INVITED = a0Var;
        a0 a0Var2 = new a0("ACTIVE", 1);
        ACTIVE = a0Var2;
        a0 a0Var3 = new a0("INACTIVE", 2);
        INACTIVE = a0Var3;
        a0 a0Var4 = new a0("REFUSED", 3);
        REFUSED = a0Var4;
        a0 a0Var5 = new a0("LEFT", 4);
        LEFT = a0Var5;
        a0 a0Var6 = new a0("REMOVED", 5);
        REMOVED = a0Var6;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}

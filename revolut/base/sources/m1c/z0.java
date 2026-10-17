package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 COMPLETED;
    public static final z0 PENDING;

    static {
        z0 z0Var = new z0("COMPLETED", 0);
        COMPLETED = z0Var;
        z0 z0Var2 = new z0("PENDING", 1);
        PENDING = z0Var2;
        z0[] z0VarArr = {z0Var, z0Var2};
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

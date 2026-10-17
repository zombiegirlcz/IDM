package j19;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 DARK;
    public static final z0 LIGHT;
    public static final z0 TRANSPARENT;

    static {
        z0 z0Var = new z0("LIGHT", 0);
        LIGHT = z0Var;
        z0 z0Var2 = new z0("DARK", 1);
        DARK = z0Var2;
        z0 z0Var3 = new z0("TRANSPARENT", 2);
        TRANSPARENT = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
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

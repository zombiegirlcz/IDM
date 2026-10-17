package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class z4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z4[] $VALUES;
    public static final z4 DASHED;
    public static final z4 SOLID;
    public static final z4 TRANSPARENT;

    static {
        z4 z4Var = new z4("TRANSPARENT", 0);
        TRANSPARENT = z4Var;
        z4 z4Var2 = new z4("SOLID", 1);
        SOLID = z4Var2;
        z4 z4Var3 = new z4("DASHED", 2);
        DASHED = z4Var3;
        z4[] z4VarArr = {z4Var, z4Var2, z4Var3};
        $VALUES = z4VarArr;
        $ENTRIES = vc.s.n(z4VarArr);
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) $VALUES.clone();
    }
}

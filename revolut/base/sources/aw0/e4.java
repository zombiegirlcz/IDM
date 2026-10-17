package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e4[] $VALUES;
    public static final e4 ACTIVE;
    public static final e4 GONE;
    public static final e4 INACTIVE;

    static {
        e4 e4Var = new e4("GONE", 0);
        GONE = e4Var;
        e4 e4Var2 = new e4("ACTIVE", 1);
        ACTIVE = e4Var2;
        e4 e4Var3 = new e4("INACTIVE", 2);
        INACTIVE = e4Var3;
        e4[] e4VarArr = {e4Var, e4Var2, e4Var3};
        $VALUES = e4VarArr;
        $ENTRIES = vc.s.n(e4VarArr);
    }

    public static e4 valueOf(String str) {
        return (e4) Enum.valueOf(e4.class, str);
    }

    public static e4[] values() {
        return (e4[]) $VALUES.clone();
    }
}

package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s8[] $VALUES;
    public static final s8 DEFAULT;
    public static final s8 INTRICATE;
    public static final s8 MULTICOLOR;

    static {
        s8 s8Var = new s8("DEFAULT", 0);
        DEFAULT = s8Var;
        s8 s8Var2 = new s8("MULTICOLOR", 1);
        MULTICOLOR = s8Var2;
        s8 s8Var3 = new s8("INTRICATE", 2);
        INTRICATE = s8Var3;
        s8[] s8VarArr = {s8Var, s8Var2, s8Var3};
        $VALUES = s8VarArr;
        $ENTRIES = vc.s.n(s8VarArr);
    }

    public static s8 valueOf(String str) {
        return (s8) Enum.valueOf(s8.class, str);
    }

    public static s8[] values() {
        return (s8[]) $VALUES.clone();
    }
}

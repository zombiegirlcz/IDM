package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 COMPACT;
    public static final a1 DEFAULT;

    static {
        a1 a1Var = new a1("DEFAULT", 0);
        DEFAULT = a1Var;
        a1 a1Var2 = new a1("COMPACT", 1);
        COMPACT = a1Var2;
        a1[] a1VarArr = {a1Var, a1Var2};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}

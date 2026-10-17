package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a2[] $VALUES;
    public static final a2 PRIMARY;
    public static final a2 RED;

    static {
        a2 a2Var = new a2("PRIMARY", 0);
        PRIMARY = a2Var;
        a2 a2Var2 = new a2("RED", 1);
        RED = a2Var2;
        a2[] a2VarArr = {a2Var, a2Var2};
        $VALUES = a2VarArr;
        $ENTRIES = vc.s.n(a2VarArr);
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) $VALUES.clone();
    }
}

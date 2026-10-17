package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 MONO;
    public static final k1 SOLID;

    static {
        k1 k1Var = new k1("SOLID", 0);
        SOLID = k1Var;
        k1 k1Var2 = new k1("MONO", 1);
        MONO = k1Var2;
        k1[] k1VarArr = {k1Var, k1Var2};
        $VALUES = k1VarArr;
        $ENTRIES = vc.s.n(k1VarArr);
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}

package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 CREATED;
    public static final j1 PROCESSED;
    public static final j1 UNKNOWN;

    static {
        j1 j1Var = new j1("CREATED", 0);
        CREATED = j1Var;
        j1 j1Var2 = new j1("PROCESSED", 1);
        PROCESSED = j1Var2;
        j1 j1Var3 = new j1("UNKNOWN", 2);
        UNKNOWN = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}

package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d9[] $VALUES;
    public static final d9 FIVE;
    public static final d9 THREE;

    static {
        d9 d9Var = new d9("THREE", 0);
        THREE = d9Var;
        d9 d9Var2 = new d9("FIVE", 1);
        FIVE = d9Var2;
        d9[] d9VarArr = {d9Var, d9Var2};
        $VALUES = d9VarArr;
        $ENTRIES = vc.s.n(d9VarArr);
    }

    public static d9 valueOf(String str) {
        return (d9) Enum.valueOf(d9.class, str);
    }

    public static d9[] values() {
        return (d9[]) $VALUES.clone();
    }
}

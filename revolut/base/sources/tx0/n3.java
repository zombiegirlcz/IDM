package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class n3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n3[] $VALUES;
    public static final n3 COLLAPSED;
    public static final n3 EXPANDED;

    static {
        n3 n3Var = new n3("EXPANDED", 0);
        EXPANDED = n3Var;
        n3 n3Var2 = new n3("COLLAPSED", 1);
        COLLAPSED = n3Var2;
        n3[] n3VarArr = {n3Var, n3Var2};
        $VALUES = n3VarArr;
        $ENTRIES = vc.s.n(n3VarArr);
    }

    public static n3 valueOf(String str) {
        return (n3) Enum.valueOf(n3.class, str);
    }

    public static n3[] values() {
        return (n3[]) $VALUES.clone();
    }
}

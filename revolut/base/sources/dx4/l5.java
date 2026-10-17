package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class l5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l5[] $VALUES;
    public static final l5 CIRCLE;
    public static final l5 ORIGINAL;

    static {
        l5 l5Var = new l5("ORIGINAL", 0);
        ORIGINAL = l5Var;
        l5 l5Var2 = new l5("CIRCLE", 1);
        CIRCLE = l5Var2;
        l5[] l5VarArr = {l5Var, l5Var2};
        $VALUES = l5VarArr;
        $ENTRIES = vc.s.n(l5VarArr);
    }

    public static l5 valueOf(String str) {
        return (l5) Enum.valueOf(l5.class, str);
    }

    public static l5[] values() {
        return (l5[]) $VALUES.clone();
    }
}

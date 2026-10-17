package v30;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 BOLD;
    public static final j0 HEADING_1;
    public static final j0 HEADING_2;
    public static final j0 HEADING_3;
    public static final j0 ITALIC;
    public static final j0 NORMAL_TEXT;

    static {
        j0 j0Var = new j0("ITALIC", 0);
        ITALIC = j0Var;
        j0 j0Var2 = new j0("BOLD", 1);
        BOLD = j0Var2;
        j0 j0Var3 = new j0("NORMAL_TEXT", 2);
        NORMAL_TEXT = j0Var3;
        j0 j0Var4 = new j0("HEADING_1", 3);
        HEADING_1 = j0Var4;
        j0 j0Var5 = new j0("HEADING_2", 4);
        HEADING_2 = j0Var5;
        j0 j0Var6 = new j0("HEADING_3", 5);
        HEADING_3 = j0Var6;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}

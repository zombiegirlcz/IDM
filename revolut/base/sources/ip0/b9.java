package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b9[] $VALUES;
    public static final b9 MATCH_PARENT;
    public static final b9 WRAP_CONTENT;

    @yhm.d
    public static final b9 WRAP_CONTENT_WITH_PADDINGS;

    static {
        b9 b9Var = new b9("MATCH_PARENT", 0);
        MATCH_PARENT = b9Var;
        b9 b9Var2 = new b9("WRAP_CONTENT_WITH_PADDINGS", 1);
        WRAP_CONTENT_WITH_PADDINGS = b9Var2;
        b9 b9Var3 = new b9("WRAP_CONTENT", 2);
        WRAP_CONTENT = b9Var3;
        b9[] b9VarArr = {b9Var, b9Var2, b9Var3};
        $VALUES = b9VarArr;
        $ENTRIES = vc.s.n(b9VarArr);
    }

    public static b9 valueOf(String str) {
        return (b9) Enum.valueOf(b9.class, str);
    }

    public static b9[] values() {
        return (b9[]) $VALUES.clone();
    }
}

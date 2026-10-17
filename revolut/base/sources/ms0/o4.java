package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o4[] $VALUES;
    public static final o4 CONTENT_VISIBLE;
    public static final o4 INDICATOR_VISIBLE;

    static {
        o4 o4Var = new o4("CONTENT_VISIBLE", 0);
        CONTENT_VISIBLE = o4Var;
        o4 o4Var2 = new o4("INDICATOR_VISIBLE", 1);
        INDICATOR_VISIBLE = o4Var2;
        o4[] o4VarArr = {o4Var, o4Var2};
        $VALUES = o4VarArr;
        $ENTRIES = vc.s.n(o4VarArr);
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) $VALUES.clone();
    }
}

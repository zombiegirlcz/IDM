package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r4[] $VALUES;
    public static final r4 ACTION;
    public static final r4 TEXT;

    static {
        r4 r4Var = new r4("TEXT", 0);
        TEXT = r4Var;
        r4 r4Var2 = new r4("ACTION", 1);
        ACTION = r4Var2;
        r4[] r4VarArr = {r4Var, r4Var2};
        $VALUES = r4VarArr;
        $ENTRIES = vc.s.n(r4VarArr);
    }

    public static r4 valueOf(String str) {
        return (r4) Enum.valueOf(r4.class, str);
    }

    public static r4[] values() {
        return (r4[]) $VALUES.clone();
    }
}

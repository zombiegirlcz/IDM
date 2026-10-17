package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d5[] $VALUES;
    public static final d5 HIDDEN;
    public static final d5 SHOWN;
    public static final d5 UNKNOWN;

    static {
        d5 d5Var = new d5("UNKNOWN", 0);
        UNKNOWN = d5Var;
        d5 d5Var2 = new d5("SHOWN", 1);
        SHOWN = d5Var2;
        d5 d5Var3 = new d5("HIDDEN", 2);
        HIDDEN = d5Var3;
        d5[] d5VarArr = {d5Var, d5Var2, d5Var3};
        $VALUES = d5VarArr;
        $ENTRIES = vc.s.n(d5VarArr);
    }

    public static d5 valueOf(String str) {
        return (d5) Enum.valueOf(d5.class, str);
    }

    public static d5[] values() {
        return (d5[]) $VALUES.clone();
    }
}

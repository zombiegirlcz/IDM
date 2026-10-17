package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c2[] $VALUES;
    public static final c2 INDEFINITE;
    public static final c2 LONG;
    public static final c2 SHORT;

    static {
        c2 c2Var = new c2("SHORT", 0);
        SHORT = c2Var;
        c2 c2Var2 = new c2("LONG", 1);
        LONG = c2Var2;
        c2 c2Var3 = new c2("INDEFINITE", 2);
        INDEFINITE = c2Var3;
        c2[] c2VarArr = {c2Var, c2Var2, c2Var3};
        $VALUES = c2VarArr;
        $ENTRIES = vc.s.n(c2VarArr);
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }
}

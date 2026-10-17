package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 CLOSE;
    public static final c1 UPGRADE;

    static {
        c1 c1Var = new c1("CLOSE", 0);
        CLOSE = c1Var;
        c1 c1Var2 = new c1("UPGRADE", 1);
        UPGRADE = c1Var2;
        c1[] c1VarArr = {c1Var, c1Var2};
        $VALUES = c1VarArr;
        $ENTRIES = vc.s.n(c1VarArr);
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}

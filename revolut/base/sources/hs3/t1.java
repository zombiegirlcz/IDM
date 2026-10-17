package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 EXIT;
    public static final t1 SPINNER_AND_POPUP;

    static {
        t1 t1Var = new t1("SPINNER_AND_POPUP", 0);
        SPINNER_AND_POPUP = t1Var;
        t1 t1Var2 = new t1("EXIT", 1);
        EXIT = t1Var2;
        t1[] t1VarArr = {t1Var, t1Var2};
        $VALUES = t1VarArr;
        $ENTRIES = vc.s.n(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}

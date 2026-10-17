package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 LIST;
    public static final o1 PROMPT;

    static {
        o1 o1Var = new o1("PROMPT", 0);
        PROMPT = o1Var;
        o1 o1Var2 = new o1("LIST", 1);
        LIST = o1Var2;
        o1[] o1VarArr = {o1Var, o1Var2};
        $VALUES = o1VarArr;
        $ENTRIES = vc.s.n(o1VarArr);
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}

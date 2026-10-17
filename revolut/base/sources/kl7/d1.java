package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 SELECTOR;
    public static final d1 SIMPLE;

    static {
        d1 d1Var = new d1("SIMPLE", 0);
        SIMPLE = d1Var;
        d1 d1Var2 = new d1("SELECTOR", 1);
        SELECTOR = d1Var2;
        d1[] d1VarArr = {d1Var, d1Var2};
        $VALUES = d1VarArr;
        $ENTRIES = vc.s.n(d1VarArr);
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}

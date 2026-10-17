package kfj;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;
    public static final h1 PORTING_CREATE;
    public static final h1 PORTING_UPDATE;

    static {
        h1 h1Var = new h1("PORTING_CREATE", 0);
        PORTING_CREATE = h1Var;
        h1 h1Var2 = new h1("PORTING_UPDATE", 1);
        PORTING_UPDATE = h1Var2;
        h1[] h1VarArr = {h1Var, h1Var2};
        $VALUES = h1VarArr;
        $ENTRIES = vc.s.n(h1VarArr);
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }
}

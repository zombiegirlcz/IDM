package gu7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v4[] $VALUES;
    public static final v4 CLAIMS_VIA_CARD;
    public static final v4 DIAL;
    public static final v4 EMAIL;
    public static final v4 UNKNOWN;
    public static final v4 WEBPAGE;

    static {
        v4 v4Var = new v4("DIAL", 0);
        DIAL = v4Var;
        v4 v4Var2 = new v4("WEBPAGE", 1);
        WEBPAGE = v4Var2;
        v4 v4Var3 = new v4("EMAIL", 2);
        EMAIL = v4Var3;
        v4 v4Var4 = new v4("CLAIMS_VIA_CARD", 3);
        CLAIMS_VIA_CARD = v4Var4;
        v4 v4Var5 = new v4("UNKNOWN", 4);
        UNKNOWN = v4Var5;
        v4[] v4VarArr = {v4Var, v4Var2, v4Var3, v4Var4, v4Var5};
        $VALUES = v4VarArr;
        $ENTRIES = vc.s.n(v4VarArr);
    }

    public static v4 valueOf(String str) {
        return (v4) Enum.valueOf(v4.class, str);
    }

    public static v4[] values() {
        return (v4[]) $VALUES.clone();
    }
}

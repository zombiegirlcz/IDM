package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h3[] $VALUES;
    public static final h3 ACTIVE;
    public static final h3 ACTIVE_CONTEXTUAL_THEME;
    public static final h3 ACTIVE_NOT_CLICKABLE;
    public static final h3 ERROR;
    public static final h3 INACTIVE_CONTEXTUAL_THEME;
    public static final h3 LOADING;

    static {
        h3 h3Var = new h3("ERROR", 0);
        ERROR = h3Var;
        h3 h3Var2 = new h3("LOADING", 1);
        LOADING = h3Var2;
        h3 h3Var3 = new h3("ACTIVE", 2);
        ACTIVE = h3Var3;
        h3 h3Var4 = new h3("ACTIVE_CONTEXTUAL_THEME", 3);
        ACTIVE_CONTEXTUAL_THEME = h3Var4;
        h3 h3Var5 = new h3("INACTIVE_CONTEXTUAL_THEME", 4);
        INACTIVE_CONTEXTUAL_THEME = h3Var5;
        h3 h3Var6 = new h3("ACTIVE_NOT_CLICKABLE", 5);
        ACTIVE_NOT_CLICKABLE = h3Var6;
        h3[] h3VarArr = {h3Var, h3Var2, h3Var3, h3Var4, h3Var5, h3Var6};
        $VALUES = h3VarArr;
        $ENTRIES = vc.s.n(h3VarArr);
    }

    public static h3 valueOf(String str) {
        return (h3) Enum.valueOf(h3.class, str);
    }

    public static h3[] values() {
        return (h3[]) $VALUES.clone();
    }
}

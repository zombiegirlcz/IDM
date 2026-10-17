package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h4[] $VALUES;
    public static final h4 LABEL_THEN_PERCENT;
    public static final h4 PERCENT_THEN_LABEL;

    static {
        h4 h4Var = new h4("LABEL_THEN_PERCENT", 0);
        LABEL_THEN_PERCENT = h4Var;
        h4 h4Var2 = new h4("PERCENT_THEN_LABEL", 1);
        PERCENT_THEN_LABEL = h4Var2;
        h4[] h4VarArr = {h4Var, h4Var2};
        $VALUES = h4VarArr;
        $ENTRIES = vc.s.n(h4VarArr);
    }

    public static h4 valueOf(String str) {
        return (h4) Enum.valueOf(h4.class, str);
    }

    public static h4[] values() {
        return (h4[]) $VALUES.clone();
    }
}

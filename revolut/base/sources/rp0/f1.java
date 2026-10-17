package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 ABOVE_ANCHOR_VIEW;
    public static final f1 BOTTOM;

    static {
        f1 f1Var = new f1("BOTTOM", 0);
        BOTTOM = f1Var;
        f1 f1Var2 = new f1("ABOVE_ANCHOR_VIEW", 1);
        ABOVE_ANCHOR_VIEW = f1Var2;
        f1[] f1VarArr = {f1Var, f1Var2};
        $VALUES = f1VarArr;
        $ENTRIES = vc.s.n(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}

package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 ANIMATING_HIDE;
    public static final o1 ANIMATING_SHOW;
    public static final o1 HIDDEN;
    public static final o1 SHOWN;

    static {
        o1 o1Var = new o1("SHOWN", 0);
        SHOWN = o1Var;
        o1 o1Var2 = new o1("ANIMATING_SHOW", 1);
        ANIMATING_SHOW = o1Var2;
        o1 o1Var3 = new o1("HIDDEN", 2);
        HIDDEN = o1Var3;
        o1 o1Var4 = new o1("ANIMATING_HIDE", 3);
        ANIMATING_HIDE = o1Var4;
        o1[] o1VarArr = {o1Var, o1Var2, o1Var3, o1Var4};
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

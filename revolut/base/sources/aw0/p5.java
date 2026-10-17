package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p5[] $VALUES;
    public static final p5 DEFAULT;
    public static final p5 OVERLAID;

    static {
        p5 p5Var = new p5("DEFAULT", 0);
        DEFAULT = p5Var;
        p5 p5Var2 = new p5("OVERLAID", 1);
        OVERLAID = p5Var2;
        p5[] p5VarArr = {p5Var, p5Var2};
        $VALUES = p5VarArr;
        $ENTRIES = vc.s.n(p5VarArr);
    }

    public static p5 valueOf(String str) {
        return (p5) Enum.valueOf(p5.class, str);
    }

    public static p5[] values() {
        return (p5[]) $VALUES.clone();
    }
}

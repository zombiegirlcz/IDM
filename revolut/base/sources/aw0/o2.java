package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 SUCCESS;
    public static final o2 WARNING;

    static {
        o2 o2Var = new o2("SUCCESS", 0);
        SUCCESS = o2Var;
        o2 o2Var2 = new o2("WARNING", 1);
        WARNING = o2Var2;
        o2[] o2VarArr = {o2Var, o2Var2};
        $VALUES = o2VarArr;
        $ENTRIES = vc.s.n(o2VarArr);
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }
}

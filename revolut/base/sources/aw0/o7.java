package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o7[] $VALUES;
    public static final o7 DEFAULT;

    static {
        o7 o7Var = new o7("DEFAULT", 0);
        DEFAULT = o7Var;
        o7[] o7VarArr = {o7Var};
        $VALUES = o7VarArr;
        $ENTRIES = vc.s.n(o7VarArr);
    }

    public static o7 valueOf(String str) {
        return (o7) Enum.valueOf(o7.class, str);
    }

    public static o7[] values() {
        return (o7[]) $VALUES.clone();
    }
}

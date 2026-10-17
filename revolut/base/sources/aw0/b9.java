package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b9[] $VALUES;
    public static final b9 NEGATIVE;
    public static final b9 NEUTRAL;
    public static final b9 POSITIVE;

    static {
        b9 b9Var = new b9("POSITIVE", 0);
        POSITIVE = b9Var;
        b9 b9Var2 = new b9("NEGATIVE", 1);
        NEGATIVE = b9Var2;
        b9 b9Var3 = new b9("NEUTRAL", 2);
        NEUTRAL = b9Var3;
        b9[] b9VarArr = {b9Var, b9Var2, b9Var3};
        $VALUES = b9VarArr;
        $ENTRIES = vc.s.n(b9VarArr);
    }

    public static b9 valueOf(String str) {
        return (b9) Enum.valueOf(b9.class, str);
    }

    public static b9[] values() {
        return (b9[]) $VALUES.clone();
    }
}

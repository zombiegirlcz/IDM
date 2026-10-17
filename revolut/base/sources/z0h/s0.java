package z0h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 ANALYST_RATINGS;
    public static final s0 FUNDAMENTALS;
    public static final s0 INSIGHTS;
    public static final s0 TECHNICALS_AND_SENTIMENT;

    static {
        s0 s0Var = new s0("INSIGHTS", 0);
        INSIGHTS = s0Var;
        s0 s0Var2 = new s0("TECHNICALS_AND_SENTIMENT", 1);
        TECHNICALS_AND_SENTIMENT = s0Var2;
        s0 s0Var3 = new s0("FUNDAMENTALS", 2);
        FUNDAMENTALS = s0Var3;
        s0 s0Var4 = new s0("ANALYST_RATINGS", 3);
        ANALYST_RATINGS = s0Var4;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}

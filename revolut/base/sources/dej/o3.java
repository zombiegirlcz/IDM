package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class o3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o3[] $VALUES;
    public static final o3 PRIORITY_RANK;
    public static final o3 USAGE_RELEVANCE;

    static {
        o3 o3Var = new o3("PRIORITY_RANK", 0);
        PRIORITY_RANK = o3Var;
        o3 o3Var2 = new o3("USAGE_RELEVANCE", 1);
        USAGE_RELEVANCE = o3Var2;
        o3[] o3VarArr = {o3Var, o3Var2};
        $VALUES = o3VarArr;
        $ENTRIES = vc.s.n(o3VarArr);
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) $VALUES.clone();
    }
}

package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ob0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ob0[] $VALUES;
    public static final ob0 DP_24;
    public static final ob0 DP_40;

    static {
        ob0 ob0Var = new ob0("DP_24", 0);
        DP_24 = ob0Var;
        ob0 ob0Var2 = new ob0("DP_40", 1);
        DP_40 = ob0Var2;
        ob0[] ob0VarArr = {ob0Var, ob0Var2};
        $VALUES = ob0VarArr;
        $ENTRIES = vc.s.n(ob0VarArr);
    }

    public static ob0 valueOf(String str) {
        return (ob0) Enum.valueOf(ob0.class, str);
    }

    public static ob0[] values() {
        return (ob0[]) $VALUES.clone();
    }
}

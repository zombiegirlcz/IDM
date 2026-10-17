package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ao0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ao0[] $VALUES;
    public static final ao0 DEFAULT;
    public static final ao0 LOCKED;

    static {
        ao0 ao0Var = new ao0("DEFAULT", 0);
        DEFAULT = ao0Var;
        ao0 ao0Var2 = new ao0("LOCKED", 1);
        LOCKED = ao0Var2;
        ao0[] ao0VarArr = {ao0Var, ao0Var2};
        $VALUES = ao0VarArr;
        $ENTRIES = vc.s.n(ao0VarArr);
    }

    public static ao0 valueOf(String str) {
        return (ao0) Enum.valueOf(ao0.class, str);
    }

    public static ao0[] values() {
        return (ao0[]) $VALUES.clone();
    }
}

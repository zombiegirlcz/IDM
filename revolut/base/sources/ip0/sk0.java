package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class sk0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sk0[] $VALUES;
    public static final sk0 DAY;
    public static final sk0 NIGHT;
    public static final sk0 SYSTEM;

    static {
        sk0 sk0Var = new sk0("DAY", 0);
        DAY = sk0Var;
        sk0 sk0Var2 = new sk0("NIGHT", 1);
        NIGHT = sk0Var2;
        sk0 sk0Var3 = new sk0("SYSTEM", 2);
        SYSTEM = sk0Var3;
        sk0[] sk0VarArr = {sk0Var, sk0Var2, sk0Var3};
        $VALUES = sk0VarArr;
        $ENTRIES = vc.s.n(sk0VarArr);
    }

    public static sk0 valueOf(String str) {
        return (sk0) Enum.valueOf(sk0.class, str);
    }

    public static sk0[] values() {
        return (sk0[]) $VALUES.clone();
    }
}

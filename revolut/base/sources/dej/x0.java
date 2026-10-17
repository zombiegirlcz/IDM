package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class x0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 RECEIVER_NAME;

    static {
        x0 x0Var = new x0("RECEIVER_NAME", 0);
        RECEIVER_NAME = x0Var;
        x0[] x0VarArr = {x0Var};
        $VALUES = x0VarArr;
        $ENTRIES = vc.s.n(x0VarArr);
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }
}

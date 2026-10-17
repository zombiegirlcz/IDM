package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class k4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k4[] $VALUES;
    public static final k4 CROSSED;

    static {
        k4 k4Var = new k4("CROSSED", 0);
        CROSSED = k4Var;
        k4[] k4VarArr = {k4Var};
        $VALUES = k4VarArr;
        $ENTRIES = vc.s.n(k4VarArr);
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) $VALUES.clone();
    }
}

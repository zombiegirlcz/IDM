package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class y1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y1[] $VALUES;
    public static final y1 PT16;

    static {
        y1 y1Var = new y1("PT16", 0);
        PT16 = y1Var;
        y1[] y1VarArr = {y1Var};
        $VALUES = y1VarArr;
        $ENTRIES = vc.s.n(y1VarArr);
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) $VALUES.clone();
    }
}

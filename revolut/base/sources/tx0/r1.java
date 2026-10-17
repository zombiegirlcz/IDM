package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 COLLAPSED;
    public static final r1 EXPANDED;

    static {
        r1 r1Var = new r1("EXPANDED", 0);
        EXPANDED = r1Var;
        r1 r1Var2 = new r1("COLLAPSED", 1);
        COLLAPSED = r1Var2;
        r1[] r1VarArr = {r1Var, r1Var2};
        $VALUES = r1VarArr;
        $ENTRIES = vc.s.n(r1VarArr);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}

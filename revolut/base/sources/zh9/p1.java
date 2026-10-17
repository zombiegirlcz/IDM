package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;
    public static final p1 Cards;
    public static final p1 Shopping;

    static {
        p1 p1Var = new p1("Cards", 0);
        Cards = p1Var;
        p1 p1Var2 = new p1("Shopping", 1);
        Shopping = p1Var2;
        p1[] p1VarArr = {p1Var, p1Var2};
        $VALUES = p1VarArr;
        $ENTRIES = vc.s.n(p1VarArr);
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }
}

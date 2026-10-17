package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class z1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 FOOTER;
    public static final z1 PLAIN;

    static {
        z1 z1Var = new z1("PLAIN", 0);
        PLAIN = z1Var;
        z1 z1Var2 = new z1("FOOTER", 1);
        FOOTER = z1Var2;
        z1[] z1VarArr = {z1Var, z1Var2};
        $VALUES = z1VarArr;
        $ENTRIES = vc.s.n(z1VarArr);
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }
}

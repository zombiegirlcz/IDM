package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class z2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z2[] $VALUES;
    public static final z2 PAYMENT_LINK;
    public static final z2 UNSPECIFIED;

    static {
        z2 z2Var = new z2("UNSPECIFIED", 0);
        UNSPECIFIED = z2Var;
        z2 z2Var2 = new z2("PAYMENT_LINK", 1);
        PAYMENT_LINK = z2Var2;
        z2[] z2VarArr = {z2Var, z2Var2};
        $VALUES = z2VarArr;
        $ENTRIES = vc.s.n(z2VarArr);
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) $VALUES.clone();
    }
}

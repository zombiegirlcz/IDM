package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 CANCELED;
    public static final i0 CLAIMED;
    public static final i0 LATE;
    public static final i0 OUTSTANDING;
    public static final i0 PAID;
    public static final i0 SCHEDULED;
    public static final i0 UNKNOWN;

    static {
        i0 i0Var = new i0("SCHEDULED", 0);
        SCHEDULED = i0Var;
        i0 i0Var2 = new i0("PAID", 1);
        PAID = i0Var2;
        i0 i0Var3 = new i0("LATE", 2);
        LATE = i0Var3;
        i0 i0Var4 = new i0("CANCELED", 3);
        CANCELED = i0Var4;
        i0 i0Var5 = new i0("OUTSTANDING", 4);
        OUTSTANDING = i0Var5;
        i0 i0Var6 = new i0("CLAIMED", 5);
        CLAIMED = i0Var6;
        i0 i0Var7 = new i0("UNKNOWN", 6);
        UNKNOWN = i0Var7;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}

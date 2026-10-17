package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 CANCELLED;
    public static final s1 COMPLETED;
    public static final s1 PENDING;
    public static final s1 UNKNOWN;

    static {
        s1 s1Var = new s1("PENDING", 0);
        PENDING = s1Var;
        s1 s1Var2 = new s1("COMPLETED", 1);
        COMPLETED = s1Var2;
        s1 s1Var3 = new s1("CANCELLED", 2);
        CANCELLED = s1Var3;
        s1 s1Var4 = new s1("UNKNOWN", 3);
        UNKNOWN = s1Var4;
        s1[] s1VarArr = {s1Var, s1Var2, s1Var3, s1Var4};
        $VALUES = s1VarArr;
        $ENTRIES = vc.s.n(s1VarArr);
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) $VALUES.clone();
    }
}

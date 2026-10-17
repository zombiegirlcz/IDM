package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 GUARANTEED;
    public static final s1 MEMORY;
    public static final s1 SNOWBALL;

    static {
        s1 s1Var = new s1("MEMORY", 0);
        MEMORY = s1Var;
        s1 s1Var2 = new s1("GUARANTEED", 1);
        GUARANTEED = s1Var2;
        s1 s1Var3 = new s1("SNOWBALL", 2);
        SNOWBALL = s1Var3;
        s1[] s1VarArr = {s1Var, s1Var2, s1Var3};
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

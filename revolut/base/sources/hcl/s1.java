package hcl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 CHRONOLOGICAL;
    public static final s1 INFORMATIVE;

    static {
        s1 s1Var = new s1("INFORMATIVE", 0);
        INFORMATIVE = s1Var;
        s1 s1Var2 = new s1("CHRONOLOGICAL", 1);
        CHRONOLOGICAL = s1Var2;
        s1[] s1VarArr = {s1Var, s1Var2};
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

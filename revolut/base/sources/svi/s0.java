package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 LOOSE;
    public static final s0 STRICT;

    static {
        s0 s0Var = new s0("STRICT", 0);
        STRICT = s0Var;
        s0 s0Var2 = new s0("LOOSE", 1);
        LOOSE = s0Var2;
        s0[] s0VarArr = {s0Var, s0Var2};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}

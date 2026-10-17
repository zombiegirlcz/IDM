package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class r1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 BASIC;
    public static final r1 REVERSED_OTP;

    static {
        r1 r1Var = new r1("BASIC", 0);
        BASIC = r1Var;
        r1 r1Var2 = new r1("REVERSED_OTP", 1);
        REVERSED_OTP = r1Var2;
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

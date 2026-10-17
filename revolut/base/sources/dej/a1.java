package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 DYNAMIC_FORM;
    public static final a1 OTP;
    public static final a1 PAC;
    public static final a1 POWER_OF_ATTORNEY;

    static {
        a1 a1Var = new a1("PAC", 0);
        PAC = a1Var;
        a1 a1Var2 = new a1("POWER_OF_ATTORNEY", 1);
        POWER_OF_ATTORNEY = a1Var2;
        a1 a1Var3 = new a1("DYNAMIC_FORM", 2);
        DYNAMIC_FORM = a1Var3;
        a1 a1Var4 = new a1("OTP", 3);
        OTP = a1Var4;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}

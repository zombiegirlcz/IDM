package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class n1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 INSTALLATION_LINK;
    public static final n1 SYSTEM_API_ACTIVATION_CODE;
    public static final n1 SYSTEM_API_ACTIVATION_CODE_ICCID;
    public static final n1 UNKNOWN;

    static {
        n1 n1Var = new n1("SYSTEM_API_ACTIVATION_CODE_ICCID", 0);
        SYSTEM_API_ACTIVATION_CODE_ICCID = n1Var;
        n1 n1Var2 = new n1("SYSTEM_API_ACTIVATION_CODE", 1);
        SYSTEM_API_ACTIVATION_CODE = n1Var2;
        n1 n1Var3 = new n1("INSTALLATION_LINK", 2);
        INSTALLATION_LINK = n1Var3;
        n1 n1Var4 = new n1("UNKNOWN", 3);
        UNKNOWN = n1Var4;
        n1[] n1VarArr = {n1Var, n1Var2, n1Var3, n1Var4};
        $VALUES = n1VarArr;
        $ENTRIES = vc.s.n(n1VarArr);
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}

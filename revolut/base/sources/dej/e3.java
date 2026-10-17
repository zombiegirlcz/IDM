package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class e3 implements a2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e3[] $VALUES;
    public static final e3 ACCIDENTAL_PURCHASE;
    public static final e3 DEVICE_IS_CARRIER_BLOCKED;
    public static final e3 ESIM_INSTALLED_BUT_NOT_WORKING;
    public static final e3 NOT_ABLE_TO_INSTALL_ESIM;
    public static final e3 OTHER;
    public static final e3 UNKNOWN;

    static {
        e3 e3Var = new e3("NOT_ABLE_TO_INSTALL_ESIM", 0);
        NOT_ABLE_TO_INSTALL_ESIM = e3Var;
        e3 e3Var2 = new e3("ESIM_INSTALLED_BUT_NOT_WORKING", 1);
        ESIM_INSTALLED_BUT_NOT_WORKING = e3Var2;
        e3 e3Var3 = new e3("DEVICE_IS_CARRIER_BLOCKED", 2);
        DEVICE_IS_CARRIER_BLOCKED = e3Var3;
        e3 e3Var4 = new e3("ACCIDENTAL_PURCHASE", 3);
        ACCIDENTAL_PURCHASE = e3Var4;
        e3 e3Var5 = new e3("OTHER", 4);
        OTHER = e3Var5;
        e3 e3Var6 = new e3("UNKNOWN", 5);
        UNKNOWN = e3Var6;
        e3[] e3VarArr = {e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6};
        $VALUES = e3VarArr;
        $ENTRIES = vc.s.n(e3VarArr);
    }

    public static e3 valueOf(String str) {
        return (e3) Enum.valueOf(e3.class, str);
    }

    public static e3[] values() {
        return (e3[]) $VALUES.clone();
    }

    @Override // dej.a2
    public final String getValue() {
        return name();
    }
}

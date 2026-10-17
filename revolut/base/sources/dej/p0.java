package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class p0 implements a2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 CAN_NOT_TRANSFER_MY_NUMBER;
    public static final p0 ESIM_INSTALLED_BUT_NOT_WORKING;
    public static final p0 NOT_ABLE_TO_INSTALL_ESIM;
    public static final p0 OTHER;
    public static final p0 POOR_NETWORK_QUALITY;
    public static final p0 TOO_EXPENSIVE;
    public static final p0 UNKNOWN;

    static {
        p0 p0Var = new p0("NOT_ABLE_TO_INSTALL_ESIM", 0);
        NOT_ABLE_TO_INSTALL_ESIM = p0Var;
        p0 p0Var2 = new p0("ESIM_INSTALLED_BUT_NOT_WORKING", 1);
        ESIM_INSTALLED_BUT_NOT_WORKING = p0Var2;
        p0 p0Var3 = new p0("CAN_NOT_TRANSFER_MY_NUMBER", 2);
        CAN_NOT_TRANSFER_MY_NUMBER = p0Var3;
        p0 p0Var4 = new p0("POOR_NETWORK_QUALITY", 3);
        POOR_NETWORK_QUALITY = p0Var4;
        p0 p0Var5 = new p0("TOO_EXPENSIVE", 4);
        TOO_EXPENSIVE = p0Var5;
        p0 p0Var6 = new p0("OTHER", 5);
        OTHER = p0Var6;
        p0 p0Var7 = new p0("UNKNOWN", 6);
        UNKNOWN = p0Var7;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6, p0Var7};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    @Override // dej.a2
    public final String getValue() {
        return name();
    }
}

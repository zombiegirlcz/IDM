package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class d2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 ACTIVATE_PLAN;
    public static final d2 ACTIVATION_INSTRUCTIONS;
    public static final d2 ADD_NUMBER;
    public static final d2 BILLING;
    public static final d2 CONFIRM_TRANSFER_DETAILS;
    public static final d2 INSTALLATION_TROUBLESHOOTER;
    public static final d2 INSTALL_ESIM;
    public static final d2 INVOICES;
    public static final d2 PLAN_CANCELLATION;
    public static final d2 PLAN_WITHDRAWAL;
    public static final d2 REQUEST_PAC;
    public static final d2 RESTART_PLAN;
    public static final d2 SHARE_ESIM;
    public static final d2 TRANSFER_NUMBER;
    public static final d2 TRANSFER_TO_THIS_DEVICE;
    public static final d2 UNFREEZE;
    public static final d2 UPGRADE_PLAN;

    static {
        d2 d2Var = new d2("BILLING", 0);
        BILLING = d2Var;
        d2 d2Var2 = new d2("INVOICES", 1);
        INVOICES = d2Var2;
        d2 d2Var3 = new d2("INSTALL_ESIM", 2);
        INSTALL_ESIM = d2Var3;
        d2 d2Var4 = new d2("SHARE_ESIM", 3);
        SHARE_ESIM = d2Var4;
        d2 d2Var5 = new d2("RESTART_PLAN", 4);
        RESTART_PLAN = d2Var5;
        d2 d2Var6 = new d2("UNFREEZE", 5);
        UNFREEZE = d2Var6;
        d2 d2Var7 = new d2("TRANSFER_TO_THIS_DEVICE", 6);
        TRANSFER_TO_THIS_DEVICE = d2Var7;
        d2 d2Var8 = new d2("TRANSFER_NUMBER", 7);
        TRANSFER_NUMBER = d2Var8;
        d2 d2Var9 = new d2("ADD_NUMBER", 8);
        ADD_NUMBER = d2Var9;
        d2 d2Var10 = new d2("REQUEST_PAC", 9);
        REQUEST_PAC = d2Var10;
        d2 d2Var11 = new d2("UPGRADE_PLAN", 10);
        UPGRADE_PLAN = d2Var11;
        d2 d2Var12 = new d2("CONFIRM_TRANSFER_DETAILS", 11);
        CONFIRM_TRANSFER_DETAILS = d2Var12;
        d2 d2Var13 = new d2("PLAN_WITHDRAWAL", 12);
        PLAN_WITHDRAWAL = d2Var13;
        d2 d2Var14 = new d2("PLAN_CANCELLATION", 13);
        PLAN_CANCELLATION = d2Var14;
        d2 d2Var15 = new d2("ACTIVATE_PLAN", 14);
        ACTIVATE_PLAN = d2Var15;
        d2 d2Var16 = new d2("ACTIVATION_INSTRUCTIONS", 15);
        ACTIVATION_INSTRUCTIONS = d2Var16;
        d2 d2Var17 = new d2("INSTALLATION_TROUBLESHOOTER", 16);
        INSTALLATION_TROUBLESHOOTER = d2Var17;
        d2[] d2VarArr = {d2Var, d2Var2, d2Var3, d2Var4, d2Var5, d2Var6, d2Var7, d2Var8, d2Var9, d2Var10, d2Var11, d2Var12, d2Var13, d2Var14, d2Var15, d2Var16, d2Var17};
        $VALUES = d2VarArr;
        $ENTRIES = vc.s.n(d2VarArr);
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}

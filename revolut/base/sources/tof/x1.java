package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class x1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 BACS;
    public static final x1 BPAY;
    public static final x1 BREB;
    public static final x1 DE;
    public static final x1 F24;
    public static final x1 GIRO_INSTANT;
    public static final x1 INTER_GIRO1;
    public static final x1 MASAV_BATCH;
    public static final x1 NET_BANKING;
    public static final x1 NPP;
    public static final x1 NPP_OSKO;
    public static final x1 NPP_SINGLE_CREDIT_TRANSFER;
    public static final x1 PIX;
    public static final x1 POSTAL_CHECK;
    public static final x1 PSE;
    public static final x1 SEPA_DIRECT_DEBIT_CORE;
    public static final x1 TAPI;
    public static final x1 TAPI_CO;
    public static final x1 UPI;

    static {
        x1 x1Var = new x1("NPP", 0);
        NPP = x1Var;
        x1 x1Var2 = new x1("NPP_OSKO", 1);
        NPP_OSKO = x1Var2;
        x1 x1Var3 = new x1("NPP_SINGLE_CREDIT_TRANSFER", 2);
        NPP_SINGLE_CREDIT_TRANSFER = x1Var3;
        x1 x1Var4 = new x1("DE", 3);
        DE = x1Var4;
        x1 x1Var5 = new x1("PIX", 4);
        PIX = x1Var5;
        x1 x1Var6 = new x1("UPI", 5);
        UPI = x1Var6;
        x1 x1Var7 = new x1("NET_BANKING", 6);
        NET_BANKING = x1Var7;
        x1 x1Var8 = new x1("TAPI", 7);
        TAPI = x1Var8;
        x1 x1Var9 = new x1("TAPI_CO", 8);
        TAPI_CO = x1Var9;
        x1 x1Var10 = new x1("PSE", 9);
        PSE = x1Var10;
        x1 x1Var11 = new x1("BREB", 10);
        BREB = x1Var11;
        x1 x1Var12 = new x1("GIRO_INSTANT", 11);
        GIRO_INSTANT = x1Var12;
        x1 x1Var13 = new x1("INTER_GIRO1", 12);
        INTER_GIRO1 = x1Var13;
        x1 x1Var14 = new x1("POSTAL_CHECK", 13);
        POSTAL_CHECK = x1Var14;
        x1 x1Var15 = new x1("F24", 14);
        F24 = x1Var15;
        x1 x1Var16 = new x1("MASAV_BATCH", 15);
        MASAV_BATCH = x1Var16;
        x1 x1Var17 = new x1("SEPA_DIRECT_DEBIT_CORE", 16);
        SEPA_DIRECT_DEBIT_CORE = x1Var17;
        x1 x1Var18 = new x1("BACS", 17);
        BACS = x1Var18;
        x1 x1Var19 = new x1("BPAY", 18);
        BPAY = x1Var19;
        x1[] x1VarArr = {x1Var, x1Var2, x1Var3, x1Var4, x1Var5, x1Var6, x1Var7, x1Var8, x1Var9, x1Var10, x1Var11, x1Var12, x1Var13, x1Var14, x1Var15, x1Var16, x1Var17, x1Var18, x1Var19};
        $VALUES = x1VarArr;
        $ENTRIES = vc.s.n(x1VarArr);
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}

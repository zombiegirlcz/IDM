package yb;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum h0 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    private static final SparseArray<h0> valueMap;
    private final int value;

    static {
        h0 h0Var = UNKNOWN_MOBILE_SUBTYPE;
        h0 h0Var2 = GPRS;
        h0 h0Var3 = EDGE;
        h0 h0Var4 = UMTS;
        h0 h0Var5 = CDMA;
        h0 h0Var6 = EVDO_0;
        h0 h0Var7 = EVDO_A;
        h0 h0Var8 = RTT;
        h0 h0Var9 = HSDPA;
        h0 h0Var10 = HSUPA;
        h0 h0Var11 = HSPA;
        h0 h0Var12 = IDEN;
        h0 h0Var13 = EVDO_B;
        h0 h0Var14 = LTE;
        h0 h0Var15 = EHRPD;
        h0 h0Var16 = HSPAP;
        h0 h0Var17 = GSM;
        h0 h0Var18 = TD_SCDMA;
        h0 h0Var19 = IWLAN;
        h0 h0Var20 = LTE_CA;
        SparseArray<h0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, h0Var);
        sparseArray.put(1, h0Var2);
        sparseArray.put(2, h0Var3);
        sparseArray.put(3, h0Var4);
        sparseArray.put(4, h0Var5);
        sparseArray.put(5, h0Var6);
        sparseArray.put(6, h0Var7);
        sparseArray.put(7, h0Var8);
        sparseArray.put(8, h0Var9);
        sparseArray.put(9, h0Var10);
        sparseArray.put(10, h0Var11);
        sparseArray.put(11, h0Var12);
        sparseArray.put(12, h0Var13);
        sparseArray.put(13, h0Var14);
        sparseArray.put(14, h0Var15);
        sparseArray.put(15, h0Var16);
        sparseArray.put(16, h0Var17);
        sparseArray.put(17, h0Var18);
        sparseArray.put(18, h0Var19);
        sparseArray.put(19, h0Var20);
    }

    h0(int i) {
        this.value = i;
    }

    public static h0 a(int i) {
        return valueMap.get(i);
    }

    public final int b() {
        return this.value;
    }
}

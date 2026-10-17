package yb;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum i0 {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    private static final SparseArray<i0> valueMap;
    private final int value;

    static {
        i0 i0Var = MOBILE;
        i0 i0Var2 = WIFI;
        i0 i0Var3 = MOBILE_MMS;
        i0 i0Var4 = MOBILE_SUPL;
        i0 i0Var5 = MOBILE_DUN;
        i0 i0Var6 = MOBILE_HIPRI;
        i0 i0Var7 = WIMAX;
        i0 i0Var8 = BLUETOOTH;
        i0 i0Var9 = DUMMY;
        i0 i0Var10 = ETHERNET;
        i0 i0Var11 = MOBILE_FOTA;
        i0 i0Var12 = MOBILE_IMS;
        i0 i0Var13 = MOBILE_CBS;
        i0 i0Var14 = WIFI_P2P;
        i0 i0Var15 = MOBILE_IA;
        i0 i0Var16 = MOBILE_EMERGENCY;
        i0 i0Var17 = PROXY;
        i0 i0Var18 = VPN;
        i0 i0Var19 = NONE;
        SparseArray<i0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, i0Var);
        sparseArray.put(1, i0Var2);
        sparseArray.put(2, i0Var3);
        sparseArray.put(3, i0Var4);
        sparseArray.put(4, i0Var5);
        sparseArray.put(5, i0Var6);
        sparseArray.put(6, i0Var7);
        sparseArray.put(7, i0Var8);
        sparseArray.put(8, i0Var9);
        sparseArray.put(9, i0Var10);
        sparseArray.put(10, i0Var11);
        sparseArray.put(11, i0Var12);
        sparseArray.put(12, i0Var13);
        sparseArray.put(13, i0Var14);
        sparseArray.put(14, i0Var15);
        sparseArray.put(15, i0Var16);
        sparseArray.put(16, i0Var17);
        sparseArray.put(17, i0Var18);
        sparseArray.put(-1, i0Var19);
    }

    i0(int i) {
        this.value = i;
    }

    public static i0 a(int i) {
        return valueMap.get(i);
    }

    public final int b() {
        return this.value;
    }
}

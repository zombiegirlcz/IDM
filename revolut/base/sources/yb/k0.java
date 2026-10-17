package yb;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum k0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<k0> valueMap;
    private final int value;

    static {
        k0 k0Var = DEFAULT;
        k0 k0Var2 = UNMETERED_ONLY;
        k0 k0Var3 = UNMETERED_OR_DAILY;
        k0 k0Var4 = FAST_IF_RADIO_AWAKE;
        k0 k0Var5 = NEVER;
        k0 k0Var6 = UNRECOGNIZED;
        SparseArray<k0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, k0Var);
        sparseArray.put(1, k0Var2);
        sparseArray.put(2, k0Var3);
        sparseArray.put(3, k0Var4);
        sparseArray.put(4, k0Var5);
        sparseArray.put(-1, k0Var6);
    }

    k0(int i) {
        this.value = i;
    }
}

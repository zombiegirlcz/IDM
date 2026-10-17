package yb;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes16.dex */
public enum a0 {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<a0> valueMap;
    private final int value;

    static {
        a0 a0Var = NOT_SET;
        a0 a0Var2 = EVENT_OVERRIDE;
        SparseArray<a0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, a0Var);
        sparseArray.put(5, a0Var2);
    }

    a0(int i) {
        this.value = i;
    }
}

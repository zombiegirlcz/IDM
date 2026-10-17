package sp1;

import com.revolut.feature.apm.bills.core.api.model.BillTransferDarfType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264875a;

    static {
        int[] iArr = new int[BillTransferDarfType.values().length];
        try {
            iArr[BillTransferDarfType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BillTransferDarfType.SIMPLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264875a = iArr;
    }
}

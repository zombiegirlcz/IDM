package wu5;

import av5.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300069a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TRANSACTION_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.CURRENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f300069a = iArr;
    }
}

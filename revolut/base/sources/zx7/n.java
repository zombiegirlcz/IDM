package zx7;

import zw7.y0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f326082a;

    static {
        int[] iArr = new int[y0.values().length];
        try {
            iArr[y0.CANCELLATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y0.RENEWAL_OPT_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f326082a = iArr;
    }
}

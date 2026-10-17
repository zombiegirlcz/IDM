package da4;

import ny3.j;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112472a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112472a = iArr;
    }
}

package tjj;

import dej.k1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271799a;

    static {
        int[] iArr = new int[k1.values().length];
        try {
            iArr[k1.PAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k1.FUTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f271799a = iArr;
    }
}

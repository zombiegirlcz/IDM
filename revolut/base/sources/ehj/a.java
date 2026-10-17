package ehj;

import dej.m1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126198a;

    static {
        int[] iArr = new int[m1.values().length];
        try {
            iArr[m1.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m1.SUCCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m1.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m1.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f126198a = iArr;
    }
}

package ms0;

import aw0.f7;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208237a;

    static {
        int[] iArr = new int[f7.values().length];
        try {
            iArr[f7.HEALTHY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f7.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f7.CRITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208237a = iArr;
    }
}

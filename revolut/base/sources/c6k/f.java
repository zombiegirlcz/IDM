package c6k;

import tof.f2;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21817a;

    static {
        int[] iArr = new int[f2.values().length];
        try {
            iArr[f2.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f2.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f2.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f21817a = iArr;
    }
}

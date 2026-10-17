package pva;

import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240037a;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f240037a = iArr;
    }
}

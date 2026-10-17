package hof;

import tof.v6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154284a;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f154284a = iArr;
    }
}

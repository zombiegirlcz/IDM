package nbe;

import ibd.f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214075a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f214075a = iArr;
    }
}

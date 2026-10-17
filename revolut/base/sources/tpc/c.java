package tpc;

import k4l.d0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273335a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273335a = iArr;
    }
}

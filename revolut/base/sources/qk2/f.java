package qk2;

import c93.r;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246954a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.ELIGIBLE_TO_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f246954a = iArr;
    }
}

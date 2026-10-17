package qk2;

import c93.r;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f246957a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f246957a = iArr;
    }
}

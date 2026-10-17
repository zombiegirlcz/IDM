package vhg;

import nhg.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289481a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f289481a = iArr;
    }
}

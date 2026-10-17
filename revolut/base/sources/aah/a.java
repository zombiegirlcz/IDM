package aah;

import z0h.r1;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2822a;

    static {
        int[] iArr = new int[r1.values().length];
        try {
            iArr[r1.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r1.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2822a = iArr;
    }
}

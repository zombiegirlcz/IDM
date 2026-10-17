package fbe;

import qua.k;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133546a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f133546a = iArr;
    }
}

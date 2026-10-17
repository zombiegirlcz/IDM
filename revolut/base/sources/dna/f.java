package dna;

import rp0.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116254a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.PROGRAMMATICALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f116254a = iArr;
    }
}

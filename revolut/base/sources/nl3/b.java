package nl3;

import ml3.v;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216990a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f216990a = iArr;
    }
}

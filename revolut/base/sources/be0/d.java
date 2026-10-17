package be0;

import sd0.f;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14647a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.FORCE_RELOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.LAZY_RELOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14647a = iArr;
    }
}

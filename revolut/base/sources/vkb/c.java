package vkb;

import npg.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289898a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.TAX_RESIDENCY_MISSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.TIN_MISSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.SAVINGS_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.ALL_SET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f289898a = iArr;
    }
}

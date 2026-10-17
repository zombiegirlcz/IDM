package xq3;

import grl.r2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308100a;

    static {
        int[] iArr = new int[r2.values().length];
        try {
            iArr[r2.ADD_NEW_PRODUCT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r2.GLOBAL_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f308100a = iArr;
    }
}

package d4d;

import mgd.f;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111277a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.TARGET_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.PRICE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f111277a = iArr;
    }
}

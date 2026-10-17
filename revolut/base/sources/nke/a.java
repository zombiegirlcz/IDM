package nke;

import vke.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216800a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.NEWS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PROMO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f216800a = iArr;
    }
}

package z5j;

import wd6.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319631a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f319631a = iArr;
    }
}

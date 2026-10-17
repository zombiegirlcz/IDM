package dyh;

import wd6.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121133a;

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
        f121133a = iArr;
    }
}

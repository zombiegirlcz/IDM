package wnd;

import xnd.u0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298823a;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.INCOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f298823a = iArr;
    }
}

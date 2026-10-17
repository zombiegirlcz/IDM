package h0e;

import lyd.t;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148383a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.CURRENCIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.ACCOUNTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.ASSETS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f148383a = iArr;
    }
}

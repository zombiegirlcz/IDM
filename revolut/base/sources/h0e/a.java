package h0e;

import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f148374a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.FORMAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.LANGUAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.SHOW_AMOUNTS_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.HIDE_BALANCES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.ACCOUNTS_FILTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f148374a = iArr;
    }
}

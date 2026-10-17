package y45;

import p35.u0;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310793a;

    static {
        int[] iArr = new int[u0.values().length];
        try {
            iArr[u0.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u0.DIRECT_DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f310793a = iArr;
    }
}

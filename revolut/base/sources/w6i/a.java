package w6i;

import v6i.g;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f295447a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f295447a = iArr;
    }
}

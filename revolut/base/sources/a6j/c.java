package a6j;

import y5j.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1700a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1700a = iArr;
    }
}

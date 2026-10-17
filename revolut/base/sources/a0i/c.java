package a0i;

import myh.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f389a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.TAKE_PROFIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.STOP_LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f389a = iArr;
    }
}

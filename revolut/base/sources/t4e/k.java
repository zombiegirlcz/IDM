package t4e;

import jel.e2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267985a;

    static {
        int[] iArr = new int[e2.values().length];
        try {
            iArr[e2.AVERAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2.WORST_PERFORMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2.SINGLE_ASSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f267985a = iArr;
    }
}

package ts0;

import aw0.v6;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273878b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.OVERLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273877a = iArr;
        int[] iArr2 = new int[v6.values().length];
        try {
            iArr2[v6.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v6.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f273878b = iArr2;
    }
}

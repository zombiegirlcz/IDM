package w4k;

import f5j.r;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f294614b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.CHEQUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f294613a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.Waiting.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[f.Warning.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f294614b = iArr2;
    }
}

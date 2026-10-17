package nk2;

import c93.r;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f216625b;

    static {
        int[] iArr = new int[tj2.c.values().length];
        try {
            iArr[tj2.c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tj2.c.DAILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f216624a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.ELIGIBLE_TO_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f216625b = iArr2;
    }
}

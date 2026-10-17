package nk2;

import c93.r;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f216640b;

    static {
        int[] iArr = new int[tj2.c.values().length];
        try {
            iArr[tj2.c.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tj2.c.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f216639a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.ELIGIBLE_TO_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f216640b = iArr2;
    }
}

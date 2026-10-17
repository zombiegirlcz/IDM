package pig;

import hfg.p0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f236496b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.MILES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f236495a = iArr;
        int[] iArr2 = new int[p0.values().length];
        try {
            iArr2[p0.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p0.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f236496b = iArr2;
    }
}

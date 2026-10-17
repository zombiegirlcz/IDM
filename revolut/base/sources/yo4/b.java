package yo4;

import yw4.q;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315556b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q.DEACTIVATING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f315555a = iArr;
        int[] iArr2 = new int[xo4.q.values().length];
        try {
            iArr2[xo4.q.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[xo4.q.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[xo4.q.LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[xo4.q.DEACTIVATING.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[xo4.q.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f315556b = iArr2;
    }
}

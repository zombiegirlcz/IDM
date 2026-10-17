package znd;

import ip0.oj0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f323753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f323754c;

    static {
        int[] iArr = new int[yld.d.values().length];
        try {
            iArr[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f323752a = iArr;
        int[] iArr2 = new int[fnd.a.values().length];
        try {
            iArr2[fnd.a.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[fnd.a.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f323753b = iArr2;
        int[] iArr3 = new int[oj0.values().length];
        try {
            iArr3[oj0.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[oj0.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[oj0.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f323754c = iArr3;
    }
}

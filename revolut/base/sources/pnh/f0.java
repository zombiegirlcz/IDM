package pnh;

import dfl.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f237773b;

    static {
        int[] iArr = new int[nel.z.values().length];
        try {
            iArr[nel.z.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f237772a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[q0.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f237773b = iArr2;
    }
}

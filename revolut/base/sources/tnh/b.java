package tnh;

import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272450b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272449a = iArr;
        int[] iArr2 = new int[iih.b.values().length];
        try {
            iArr2[iih.b.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[iih.b.WITHDRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f272450b = iArr2;
    }
}

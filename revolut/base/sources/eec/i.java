package eec;

import u6c.z;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125174a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.HIGH_GAMBLING_RISK_ACCEPTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.LOW_GAMBLING_RISK_ACCEPTANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f125174a = iArr;
    }
}

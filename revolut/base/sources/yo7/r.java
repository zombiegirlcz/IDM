package yo7;

import kl7.p1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315631a;

    static {
        int[] iArr = new int[p1.values().length];
        try {
            iArr[p1.CLAIM_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p1.CLAIM_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p1.CLAIM_NOT_SETTLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p1.CLAIM_EXCEEDS_AMOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f315631a = iArr;
    }
}

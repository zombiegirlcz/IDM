package i85;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159470a;

    static {
        int[] iArr = new int[n35.h.values().length];
        try {
            iArr[n35.h.PartialHealthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n35.h.PartialOutstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n35.h.PartialOverdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n35.h.PartialOutstandingOverdue.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n35.h.FullRepayment.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f159470a = iArr;
    }
}

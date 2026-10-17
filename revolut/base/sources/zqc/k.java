package zqc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324461b;

    static {
        int[] iArr = new int[kqc.g.values().length];
        try {
            iArr[kqc.g.CANCELLED_BY_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kqc.g.REJECTED_BY_COUNTERPARTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324460a = iArr;
        int[] iArr2 = new int[bqc.k.values().length];
        try {
            iArr2[bqc.k.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bqc.k.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bqc.k.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f324461b = iArr2;
    }
}

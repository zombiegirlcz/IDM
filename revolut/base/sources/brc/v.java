package brc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17999b;

    static {
        int[] iArr = new int[bqc.k.values().length];
        try {
            iArr[bqc.k.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bqc.k.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bqc.k.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17998a = iArr;
        int[] iArr2 = new int[kqc.g.values().length];
        try {
            iArr2[kqc.g.REJECTED_BY_COUNTERPARTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kqc.g.EMPLOYER_NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[kqc.g.SOURCE_ACCOUNT_NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[kqc.g.INTERNAL_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[kqc.g.CANCELLED_BY_USER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[kqc.g.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f17999b = iArr2;
    }
}

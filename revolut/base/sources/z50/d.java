package z50;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f319404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f319405b;

    static {
        int[] iArr = new int[w30.d.values().length];
        try {
            iArr[w30.d.BUSY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w30.d.NO_ANSWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w30.d.CANCELED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w30.d.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w30.d.CLIENT_CONNECTION_ISSUES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w30.d.DROPPED_WHILE_WAITING_FOR_AGENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w30.d.OTHER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f319404a = iArr;
        int[] iArr2 = new int[w30.g.values().length];
        try {
            iArr2[w30.g.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w30.g.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w30.g.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[w30.g.SCHEDULED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[w30.g.OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        f319405b = iArr2;
    }
}

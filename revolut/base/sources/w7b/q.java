package w7b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f295511a;

    static {
        int[] iArr = new int[r5b.p.values().length];
        try {
            iArr[r5b.p.SCHEDULE_CARD_TERMINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r5b.p.TERMINATE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r5b.p.FREEZE_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r5b.p.DOWNGRADE_PLAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r5b.p.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f295511a = iArr;
    }
}

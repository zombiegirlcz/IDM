package n6f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212783a;

    static {
        int[] iArr = new int[xdh.b.values().length];
        try {
            iArr[xdh.b.PENDING_INITIAL_FUNDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xdh.b.PENDING_CASH_ALLOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xdh.b.PENDING_REBALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xdh.b.PENDING_TEMPLATE_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xdh.b.PENDING_TEMPLATE_ALLOCATION_CHANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[xdh.b.NO_REBALANCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f212783a = iArr;
    }
}

package m6i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f203140c;

    static {
        int[] iArr = new int[j8l.d.values().length];
        try {
            iArr[j8l.d.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j8l.d.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f203138a = iArr;
        int[] iArr2 = new int[k8l.a.values().length];
        try {
            iArr2[k8l.a.MOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k8l.a.WITHDRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k8l.a.ADD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f203139b = iArr2;
        int[] iArr3 = new int[com.revolut.shared.feature.move_money.api.navigation.b.values().length];
        try {
            iArr3[com.revolut.shared.feature.move_money.api.navigation.b.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[com.revolut.shared.feature.move_money.api.navigation.b.TARGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f203140c = iArr3;
    }
}

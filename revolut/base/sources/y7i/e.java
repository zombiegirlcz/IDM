package y7i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f311525b;

    static {
        int[] iArr = new int[com.revolut.shared.feature.move_money.api.navigation.b.values().length];
        try {
            iArr[com.revolut.shared.feature.move_money.api.navigation.b.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.shared.feature.move_money.api.navigation.b.TARGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f311524a = iArr;
        int[] iArr2 = new int[k8l.a.values().length];
        try {
            iArr2[k8l.a.MOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k8l.a.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k8l.a.WITHDRAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f311525b = iArr2;
    }
}

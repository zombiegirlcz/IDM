package ss6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f265346b;

    static {
        int[] iArr = new int[com.revolut.feature.freelancer.api.navigation.a.values().length];
        try {
            iArr[com.revolut.feature.freelancer.api.navigation.a.DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.freelancer.api.navigation.a.BOOSTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.freelancer.api.navigation.a.PLAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f265345a = iArr;
        int[] iArr2 = new int[com.revolut.feature.freelancer.api.navigation.b.values().length];
        try {
            iArr2[com.revolut.feature.freelancer.api.navigation.b.ACCOUNT_CHECK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f265346b = iArr2;
    }
}

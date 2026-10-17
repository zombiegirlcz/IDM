package l25;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191621b;

    static {
        int[] iArr = new int[yw4.l.values().length];
        try {
            iArr[yw4.l.FULL_ACCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yw4.l.SPEND_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f191620a = iArr;
        int[] iArr2 = new int[com.revolut.feature.credit.card.api.navigation.deeplink.a.values().length];
        try {
            iArr2[com.revolut.feature.credit.card.api.navigation.deeplink.a.ACCOUNT_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.credit.card.api.navigation.deeplink.a.PAYMENT_UNSUCCESSFUL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f191621b = iArr2;
    }
}

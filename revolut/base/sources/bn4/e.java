package bn4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17069b;

    static {
        int[] iArr = new int[com.revolut.feature.credit.card.api.navigation.deeplink.b.values().length];
        try {
            iArr[com.revolut.feature.credit.card.api.navigation.deeplink.b.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.credit.card.api.navigation.deeplink.b.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17068a = iArr;
        int[] iArr2 = new int[yw4.l.values().length];
        try {
            iArr2[yw4.l.SPEND_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yw4.l.FULL_ACCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f17069b = iArr2;
    }
}

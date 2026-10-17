package mq4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207871a;

    static {
        int[] iArr = new int[com.revolut.feature.credit.card.api.navigation.a.values().length];
        try {
            iArr[com.revolut.feature.credit.card.api.navigation.a.ADD_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.credit.card.api.navigation.a.INITIAL_DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.credit.card.api.navigation.a.WITHDRAWAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f207871a = iArr;
    }
}

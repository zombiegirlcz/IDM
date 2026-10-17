package au6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9500a;

    static {
        int[] iArr = new int[com.revolut.feature.freelancer.impl.network.errorhandling.a.values().length];
        try {
            iArr[com.revolut.feature.freelancer.impl.network.errorhandling.a.ACCOUNT_NOT_EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.freelancer.impl.network.errorhandling.a.PENDING_CASHBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.freelancer.impl.network.errorhandling.a.POCKET_NOT_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.freelancer.impl.network.errorhandling.a.PENDING_SALE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.freelancer.impl.network.errorhandling.a.WITHDRAWING_BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f9500a = iArr;
    }
}

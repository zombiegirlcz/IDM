package tu9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274540a;

    static {
        int[] iArr = new int[com.revolut.feature.payments.messaging.data.api.model.a.values().length];
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.a.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.a.CLAIMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.a.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.a.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.payments.messaging.data.api.model.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f274540a = iArr;
    }
}

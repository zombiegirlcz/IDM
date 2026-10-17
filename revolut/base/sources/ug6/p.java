package ug6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279963a;

    static {
        int[] iArr = new int[com.revolut.feature.external_accounts.models.a.values().length];
        try {
            iArr[com.revolut.feature.external_accounts.models.a.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.external_accounts.models.a.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.external_accounts.models.a.AWAITING_AUTHORIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f279963a = iArr;
    }
}

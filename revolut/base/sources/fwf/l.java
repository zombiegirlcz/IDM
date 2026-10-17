package fwf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f138629b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SEE_ALL_EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138628a = iArr;
        int[] iArr2 = new int[com.revolut.feature.transport.api.navigation.a.values().length];
        try {
            iArr2[com.revolut.feature.transport.api.navigation.a.TICKET_ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.transport.api.navigation.a.TICKET_EXTENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature.transport.api.navigation.a.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f138629b = iArr2;
    }
}

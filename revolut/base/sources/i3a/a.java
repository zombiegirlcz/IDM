package i3a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158163a;

    static {
        int[] iArr = new int[l4a.a.values().length];
        try {
            iArr[l4a.a.SEND_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l4a.a.REQUEST_MONEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l4a.a.FREELANCER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l4a.a.ONBOARD_FREELANCER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f158163a = iArr;
    }
}

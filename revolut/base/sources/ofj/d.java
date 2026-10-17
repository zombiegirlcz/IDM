package ofj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224898a;

    static {
        int[] iArr = new int[dej.p.values().length];
        try {
            iArr[dej.p.RESUBSCRIBE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dej.p.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dej.p.PORTING_CREATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dej.p.PORTING_UPDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f224898a = iArr;
    }
}

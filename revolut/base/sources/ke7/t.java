package ke7;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f183036a;

    static {
        int[] iArr = new int[be7.a.values().length];
        try {
            iArr[be7.a.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[be7.a.RINGING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[be7.a.CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[be7.a.CONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[be7.a.RECONNECTING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[be7.a.DISCONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f183036a = iArr;
    }
}

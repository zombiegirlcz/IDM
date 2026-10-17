package kw7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190298a;

    static {
        int[] iArr = new int[gw7.a.values().length];
        try {
            iArr[gw7.a.CAR_INSURANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw7.a.PET_INSURANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw7.a.EMBEDDED_INSURANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f190298a = iArr;
    }
}

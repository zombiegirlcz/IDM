package yna;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315331a;

    static {
        int[] iArr = new int[hha.k.values().length];
        try {
            iArr[hha.k.SALARY_HUB_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hha.k.PARTNER_SALARY_ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hha.k.SALARY_HUB_GRACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hha.k.PARTNER_SALARY_GRACE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hha.k.SALARY_OPT_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[hha.k.SALARY_ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f315331a = iArr;
    }
}

package aja;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5525a;

    static {
        int[] iArr = new int[via.a.values().length];
        try {
            iArr[via.a.ORGANIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[via.a.REFERRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[via.a.AFFILIATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[via.a.PARTNERSHIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[via.a.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f5525a = iArr;
    }
}

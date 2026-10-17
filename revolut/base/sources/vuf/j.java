package vuf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292372a;

    static {
        int[] iArr = new int[f.values().length];
        f292372a = iArr;
        try {
            iArr[f.ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f292372a[f.TO_BE_ACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f292372a[f.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f292372a[f.NOT_PURCHASED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f292372a[f.PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

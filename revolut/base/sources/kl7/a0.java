package kl7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185290a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.DRIVER_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.DRIVING_LICENCE_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f185290a = iArr;
    }
}

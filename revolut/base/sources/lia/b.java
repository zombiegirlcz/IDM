package lia;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195442a;

    static {
        int[] iArr = new int[kia.a.values().length];
        try {
            iArr[kia.a.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kia.a.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kia.a.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f195442a = iArr;
    }
}

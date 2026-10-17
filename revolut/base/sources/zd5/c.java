package zd5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f321311a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SAME_CURRENCIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.DIFFERENT_CURRENCIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f321311a = iArr;
    }
}

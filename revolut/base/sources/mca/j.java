package mca;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204337a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.BANK_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.OWNER_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f204337a = iArr;
    }
}

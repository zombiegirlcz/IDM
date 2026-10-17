package knd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186156a;

    static {
        int[] iArr = new int[amd.i.values().length];
        try {
            iArr[amd.i.SOURCE_ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.i.CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.i.PARTICIPANTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f186156a = iArr;
    }
}

package amd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6309a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CREDIT_CARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.LOANS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.PAY_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.LINKED_CREDIT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f6309a = iArr;
    }
}

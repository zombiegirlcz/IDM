package kl7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185291a;

    static {
        int[] iArr = new int[b2.values().length];
        try {
            iArr[b2.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b2.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b2.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b2.VALIDATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f185291a = iArr;
    }
}

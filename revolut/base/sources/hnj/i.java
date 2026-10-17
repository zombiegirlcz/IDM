package hnj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154127a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CONTINUE_WITH_REFUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.PROCEED_WITH_CANCELLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.NO_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f154127a = iArr;
    }
}

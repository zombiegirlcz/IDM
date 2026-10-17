package ack;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3171a;

    static {
        int[] iArr = new int[kbk.h.values().length];
        try {
            iArr[kbk.h.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kbk.h.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kbk.h.RECEIVER_PRIVACY_BLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3171a = iArr;
    }
}

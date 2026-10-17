package fg6;

import se6.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f134903a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PAYMENT_INITIATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f134903a = iArr;
    }
}

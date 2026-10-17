package b8c;

import a8c.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13147a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.APP_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.WEB_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13147a = iArr;
    }
}

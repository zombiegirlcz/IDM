package pyb;

import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240740a;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.REVOLUT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f240740a = iArr;
    }
}

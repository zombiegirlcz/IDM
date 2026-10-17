package r8j;

import io3.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252465a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.LOCKED_GIFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f252465a = iArr;
    }
}

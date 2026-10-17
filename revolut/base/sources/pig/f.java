package pig;

import ip0.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236480a;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f236480a = iArr;
    }
}

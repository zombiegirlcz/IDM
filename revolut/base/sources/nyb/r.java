package nyb;

import m1c.x0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220833a;

    static {
        int[] iArr = new int[x0.values().length];
        try {
            iArr[x0.OPTED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x0.OPTED_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f220833a = iArr;
    }
}

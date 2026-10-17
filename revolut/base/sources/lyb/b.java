package lyb;

import p1c.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200774a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.FORCE_FULL_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.NORMAL_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f200774a = iArr;
    }
}

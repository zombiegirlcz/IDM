package y1f;

import p1c.h;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310374a;

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
        f310374a = iArr;
    }
}

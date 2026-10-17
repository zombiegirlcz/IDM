package ojc;

import ibd.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225753a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.INTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.EXTERNAL_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f225753a = iArr;
    }
}

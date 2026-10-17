package y1a;

import ibd.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f310356a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.CARD_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.EXTERNAL_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f310356a = iArr;
    }
}

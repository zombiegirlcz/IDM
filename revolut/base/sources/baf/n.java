package baf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14061a;

    static {
        int[] iArr = new int[u8f.h.values().length];
        try {
            iArr[u8f.h.ACAT_FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.h.ACAT_PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u8f.h.DRS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u8f.h.FOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u8f.h.DTC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[u8f.h.ISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f14061a = iArr;
    }
}

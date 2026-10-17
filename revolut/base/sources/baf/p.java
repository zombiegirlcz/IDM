package baf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f14063b;

    static {
        int[] iArr = new int[u8f.d.values().length];
        try {
            iArr[u8f.d.OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.d.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u8f.d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14062a = iArr;
        int[] iArr2 = new int[u8f.h.values().length];
        try {
            iArr2[u8f.h.ACAT_FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u8f.h.ACAT_PARTIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u8f.h.DRS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[u8f.h.FOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u8f.h.DTC.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[u8f.h.ISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f14063b = iArr2;
    }
}

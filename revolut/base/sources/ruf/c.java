package ruf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257545a;

    static {
        int[] iArr = new int[bxf.h.values().length];
        try {
            iArr[bxf.h.TIME_LIMITED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bxf.h.LONG_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bxf.h.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bxf.h.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bxf.h.ONE_TRIP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f257545a = iArr;
    }
}

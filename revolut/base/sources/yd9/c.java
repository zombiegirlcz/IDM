package yd9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312658b;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.TAKE_PROFIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wd6.h.STOP_LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f312657a = iArr;
        int[] iArr2 = new int[wd6.e.values().length];
        try {
            iArr2[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f312658b = iArr2;
    }
}

package h3i;

import e3i.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f149134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f149135c;

    static {
        int[] iArr = new int[r0i.c.values().length];
        try {
            iArr[r0i.c.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0i.c.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0i.c.TP_SL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f149133a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.ABOVE_THE_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.BELOW_THE_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f149134b = iArr2;
        int[] iArr3 = new int[wd6.e.values().length];
        try {
            iArr3[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f149135c = iArr3;
    }
}

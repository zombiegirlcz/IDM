package h5i;

import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f149564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f149565c;

    static {
        int[] iArr = new int[f8l.e.values().length];
        try {
            iArr[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f149563a = iArr;
        int[] iArr2 = new int[f8l.b.values().length];
        try {
            iArr2[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f149564b = iArr2;
        int[] iArr3 = new int[h.values().length];
        try {
            iArr3[h.TAKE_PROFIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[h.STOP_LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[h.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[h.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f149565c = iArr3;
    }
}

package q9h;

import q0h.l;
import q0h.m;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f243900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f243901c;

    static {
        int[] iArr = new int[q0h.e.values().length];
        try {
            iArr[q0h.e.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0h.e.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0h.e.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f243899a = iArr;
        int[] iArr2 = new int[m.values().length];
        try {
            iArr2[m.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f243900b = iArr2;
        int[] iArr3 = new int[l.values().length];
        try {
            iArr3[l.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[l.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[l.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f243901c = iArr3;
    }
}

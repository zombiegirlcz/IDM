package l8h;

import xzg.b0;
import xzg.x;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f192990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f192991c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f192989a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[a.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f192990b = iArr2;
        int[] iArr3 = new int[x.values().length];
        try {
            iArr3[x.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f192991c = iArr3;
        int[] iArr4 = new int[b0.values().length];
        try {
            iArr4[b0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[b0.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[b0.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[b0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}

package uah;

import mzg.e;
import mzg.f;
import xzg.l0;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f278659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f278660c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f278658a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f278659b = iArr2;
        int[] iArr3 = new int[n0.values().length];
        try {
            iArr3[n0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[n0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f278660c = iArr3;
        int[] iArr4 = new int[l0.values().length];
        try {
            iArr4[l0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[l0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[l0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[l0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[l0.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
    }
}

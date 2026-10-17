package boh;

import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17460b;

    static {
        int[] iArr = new int[wnh.b.values().length];
        try {
            iArr[wnh.b.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wnh.b.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wnh.b.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wnh.b.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f17459a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[wnh.a.values().length];
        try {
            iArr3[wnh.a.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[wnh.a.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[wnh.a.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f17460b = iArr3;
        int[] iArr4 = new int[d0.values().length];
        try {
            iArr4[d0.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[d0.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[d0.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
    }
}

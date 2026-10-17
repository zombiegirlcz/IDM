package jof;

import io3.l;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f176950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f176951c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f176949a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.FX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f.ATM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.ATM_SURCHARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f.MERCHANT_SURCHARGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.FX_WEEKEND.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.FX_RARE_CURRENCY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f176950b = iArr2;
        int[] iArr3 = new int[y6.values().length];
        try {
            iArr3[y6.ATM.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[y6.CARD_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f176951c = iArr3;
        int[] iArr4 = new int[l.values().length];
        try {
            iArr4[l.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
    }
}

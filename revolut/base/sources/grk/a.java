package grk;

import cel.k;
import cel.l;
import krk.i;
import krk.j;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f146052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f146053c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[cel.a.values().length];
        try {
            iArr[cel.a.EPS_ANN_GROWTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cel.a.EPS_GROWTH_CONTRIBUTION_ANN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cel.a.PE_RATIO_ANN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cel.a.DIV_YLD_ANN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cel.a.SALES_ANN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cel.a.NET_INCOME_ANN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[cel.a.PE_RATIO_CONTRIBUTION_ANN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[cel.a.DIV_YLD_CONTRIBUTION_ANN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[cel.a.PROFIT_MARGIN_ANN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[cel.a.SALES_ANN_GROWTH.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[cel.a.SALES_QTR.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[cel.a.NET_INCOME_QTR.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[cel.a.PROFIT_MARGIN_QTR.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[cel.a.SALES_QTR_GROWTH.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[cel.a.EPS_SURPRISE_BASIS_ANN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[cel.a.EPS_ANN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[cel.a.EPS_SURPRISE_BASIS_QTR.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[cel.a.EPS_QTR.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[cel.a.EPS_QTR_GROWTH.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[cel.a.EPS_ANN_CALENDARISED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[cel.a.EPS_ANN_GROWTH_CALENDARISED.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[cel.a.DPS_ANN_CALENDARISED.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        f146051a = iArr;
        int[] iArr2 = new int[krk.b.values().length];
        try {
            iArr2[krk.b.EPS_ANN_GROWTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[krk.b.EPS_GROWTH_CONTRIBUTION_ANN.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[krk.b.PE_RATIO_ANN.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[krk.b.DIV_YLD_ANN.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[krk.b.SALES_ANN.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[krk.b.NET_INCOME_ANN.ordinal()] = 6;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[krk.b.PE_RATIO_CONTRIBUTION_ANN.ordinal()] = 7;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[krk.b.DIV_YLD_CONTRIBUTION_ANN.ordinal()] = 8;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[krk.b.PROFIT_MARGIN_ANN.ordinal()] = 9;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[krk.b.SALES_ANN_GROWTH.ordinal()] = 10;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[krk.b.SALES_QTR.ordinal()] = 11;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[krk.b.NET_INCOME_QTR.ordinal()] = 12;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[krk.b.PROFIT_MARGIN_QTR.ordinal()] = 13;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[krk.b.SALES_QTR_GROWTH.ordinal()] = 14;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[krk.b.EPS_SURPRISE_BASIS_ANN.ordinal()] = 15;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[krk.b.EPS_ANN.ordinal()] = 16;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[krk.b.EPS_SURPRISE_BASIS_QTR.ordinal()] = 17;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[krk.b.EPS_QTR.ordinal()] = 18;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[krk.b.EPS_QTR_GROWTH.ordinal()] = 19;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[krk.b.EPS_ANN_CALENDARISED.ordinal()] = 20;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[krk.b.EPS_ANN_GROWTH_CALENDARISED.ordinal()] = 21;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[krk.b.DPS_ANN_CALENDARISED.ordinal()] = 22;
        } catch (NoSuchFieldError unused44) {
        }
        f146052b = iArr2;
        int[] iArr3 = new int[i.values().length];
        try {
            iArr3[i.Q1.ordinal()] = 1;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr3[i.Q2.ordinal()] = 2;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr3[i.Q3.ordinal()] = 3;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr3[i.Q4.ordinal()] = 4;
        } catch (NoSuchFieldError unused48) {
        }
        f146053c = iArr3;
        int[] iArr4 = new int[k.values().length];
        try {
            iArr4[k.Q1.ordinal()] = 1;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr4[k.Q2.ordinal()] = 2;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr4[k.Q3.ordinal()] = 3;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr4[k.Q4.ordinal()] = 4;
        } catch (NoSuchFieldError unused52) {
        }
        d = iArr4;
        int[] iArr5 = new int[l.values().length];
        try {
            iArr5[l.ACTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr5[l.ESTIMATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused54) {
        }
        e = iArr5;
        int[] iArr6 = new int[j.values().length];
        try {
            iArr6[j.ACTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr6[j.ESTIMATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused56) {
        }
        f = iArr6;
    }
}

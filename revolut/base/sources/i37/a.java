package i37;

import ds6.j;
import ds6.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f158109c;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.INCOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SOCIAL_SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.VAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158107a = iArr;
        int[] iArr2 = new int[ds6.a.values().length];
        try {
            iArr2[ds6.a.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ds6.a.BI_MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ds6.a.QUARTERLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ds6.a.FOUR_MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ds6.a.HALF_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ds6.a.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ds6.a.SINGLE_INSTALMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ds6.a.TWO_INSTALMENTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ds6.a.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        f158108b = iArr2;
        int[] iArr3 = new int[s.values().length];
        try {
            iArr3[s.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[s.FILING_PERIOD_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[s.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[s.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        f158109c = iArr3;
    }
}

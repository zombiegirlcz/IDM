package qb2;

import com.revolut.feature.apm.core.models.payments_authorisations.Purpose;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f244083a;

    static {
        int[] iArr = new int[Purpose.values().length];
        try {
            iArr[Purpose.MORTGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Purpose.UTILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Purpose.LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Purpose.DEPENDANT_SUPPORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Purpose.GAMBLING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Purpose.RETAIL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Purpose.SALARY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Purpose.PERSONAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Purpose.GOVERNMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Purpose.PENSION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Purpose.TAX.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[Purpose.OTHER_SERVICES.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f244083a = iArr;
    }
}

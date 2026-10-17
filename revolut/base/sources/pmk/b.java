package pmk;

import hha.h0;
import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f237608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f237609c;

    static {
        int[] iArr = new int[nha.a.values().length];
        try {
            iArr[nha.a.AT_RISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f237607a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[w0.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w0.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.PLUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.ESSENTIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w0.BASIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[w0.STANDARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w0.PRIVATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w0.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        f237608b = iArr2;
        int[] iArr3 = new int[h0.values().length];
        try {
            iArr3[h0.EMPLOYEE_DISCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[h0.PARTNER_SALARY_DISCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[h0.SALARY_HUB_DISCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[h0.PLAN_REFERRAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[h0.MINIMUM_BALANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        f237609c = iArr3;
    }
}

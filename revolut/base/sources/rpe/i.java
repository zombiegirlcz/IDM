package rpe;

import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f256383b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.MISSING_TIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.MISSING_RESIDENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f256382a = iArr;
        int[] iArr2 = new int[ExemptionReason.values().length];
        try {
            iArr2[ExemptionReason.STUDENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ExemptionReason.TEACHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ExemptionReason.TEMPORARY_RESIDENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ExemptionReason.US_STUDENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ExemptionReason.US_TEACHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ExemptionReason.DIPLOMAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ExemptionReason.TIN_PENDING.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ExemptionReason.LOW_INCOME.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ExemptionReason.NO_LONGER_TAX_RESIDENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        f256383b = iArr2;
    }
}

package sv8;

import my8.r;
import yt8.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f265850b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.AU_ADDITIONAL_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f265849a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.DOCUMENT_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[r.JP_MY_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r.ADDRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r.CREDIT_ONBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r.TAX_RESIDENCY.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r.SAVINGS.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[r.STUDENT_TIN_ABSENCE_PROOF.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[r.DIPLOMAT_TIN_ABSENCE_PROOF.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[r.DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[r.TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[r.NAME_VERIFICATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        f265850b = iArr2;
    }
}

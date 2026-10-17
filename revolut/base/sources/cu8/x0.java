package cu8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108910b;

    static {
        int[] iArr = new int[my8.t.values().length];
        try {
            iArr[my8.t.CANCEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[my8.t.SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[my8.t.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[my8.t.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f108909a = iArr;
        int[] iArr2 = new int[my8.r.values().length];
        try {
            iArr2[my8.r.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[my8.r.JP_MY_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[my8.r.ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[my8.r.CREDIT_ONBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[my8.r.STUDENT_TIN_ABSENCE_PROOF.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[my8.r.DIPLOMAT_TIN_ABSENCE_PROOF.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[my8.r.DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[my8.r.TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[my8.r.NAME_VERIFICATION.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[my8.r.TAX_RESIDENCY.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[my8.r.SAVINGS.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[my8.r.DOCUMENT_ID.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        f108910b = iArr2;
    }
}

package ozc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f231309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f231310b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.STATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.HELP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.EVIDENCE_TYPES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.DESCRIPTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.INCOME_DESTINATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h.FREQUENCY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[h.AMOUNT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[h.EVIDENCE_LIST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[h.REQUEST_DOCUMENTS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[h.SUMMARY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[h.RESUBMIT_SUMMARY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[h.DOCUMENT_LIST.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[h.BANK_STATEMENT_EVIDENCE_LIST.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[h.NOTE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[h.OTHER_DOCUMENT.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[h.QUESTION.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        f231309a = iArr;
        int[] iArr2 = new int[f0d.e.values().length];
        try {
            iArr2[f0d.e.EVIDENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        f231310b = iArr2;
    }
}

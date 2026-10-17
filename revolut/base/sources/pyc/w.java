package pyc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f240806b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.USER_ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.VERIFICATION_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f240805a = iArr;
        int[] iArr2 = new int[j.values().length];
        try {
            iArr2[j.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j.STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j.STATUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j.EVIDENCE_TYPES.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j.EVIDENCE_LIST.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[j.EVIDENCE_DESCRIPTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[j.ADD_NOTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[j.SUMMARY.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[j.DOCUMENT_TYPE.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[j.OTHER_DOCUMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        f240806b = iArr2;
    }
}

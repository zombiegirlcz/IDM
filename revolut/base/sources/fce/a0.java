package fce;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f133701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f133702b;

    static {
        int[] iArr = new int[a2a.g.values().length];
        try {
            iArr[a2a.g.CARD_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a2a.g.EXTERNAL_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a2a.g.STANDING_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f133701a = iArr;
        int[] iArr2 = new int[fva.e.values().length];
        try {
            iArr2[fva.e.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fva.e.BI_WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[fva.e.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[fva.e.QUARTERLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[fva.e.HALF_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[fva.e.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[fva.e.ADHOC.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[fva.e.DAILY.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[fva.e.TWICE_WEEKLY.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[fva.e.TEN_DAYS.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[fva.e.BI_MONTHLY.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[fva.e.TRIMESTER.ordinal()] = 12;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[fva.e.UNKNOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused16) {
        }
        f133702b = iArr2;
    }
}

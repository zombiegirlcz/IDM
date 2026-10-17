package yem;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f313051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f313052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f313053c;

    static {
        int[] iArr = new int[f.values().length];
        f313053c = iArr;
        try {
            iArr[f.PREMIUM_RATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f313053c[f.TOLL_FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f313053c[f.MOBILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f313053c[f.FIXED_LINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f313053c[f.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f313053c[f.SHARED_COST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f313053c[f.VOIP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f313053c[f.PERSONAL_NUMBER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f313053c[f.PAGER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f313053c[f.UAN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f313053c[f.VOICEMAIL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr2 = new int[e.values().length];
        f313052b = iArr2;
        try {
            iArr2[e.E164.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f313052b[e.INTERNATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f313052b[e.RFC3966.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f313052b[e.NATIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        int[] iArr3 = new int[n.values().length];
        f313051a = iArr3;
        try {
            iArr3[n.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f313051a[n.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f313051a[n.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f313051a[n.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
    }
}

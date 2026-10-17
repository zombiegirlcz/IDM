package yna;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f315349c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[s69.k.values().length];
        try {
            iArr[s69.k.PROFILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s69.k.CHATS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315347a = iArr;
        int[] iArr2 = new int[qla.a.values().length];
        try {
            iArr2[qla.a.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qla.a.INDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qla.a.REVOLUT_X.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f315348b = iArr2;
        int[] iArr3 = new int[do3.t.values().length];
        try {
            iArr3[do3.t.NOT_VERIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[do3.t.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[do3.t.GRADUATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f315349c = iArr3;
        int[] iArr4 = new int[s69.l.values().length];
        try {
            iArr4[s69.l.REVOLUT_FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[s69.l.LEGACY_INBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}

package qr3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f248640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f248641c;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.REJECTED_UNDISCLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f248639a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.INFORMATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[g.REMEDIABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[g.NON_REMEDIABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[g.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[g.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[g.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f248640b = iArr2;
        int[] iArr3 = new int[d.values().length];
        try {
            iArr3[d.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[d.MONTHS.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f248641c = iArr3;
    }
}

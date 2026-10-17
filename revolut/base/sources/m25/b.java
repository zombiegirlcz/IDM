package m25;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f201698b;

    static {
        int[] iArr = new int[yw4.l.values().length];
        try {
            iArr[yw4.l.SPEND_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yw4.l.FULL_ACCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f201697a = iArr;
        int[] iArr2 = new int[yw4.o.values().length];
        try {
            iArr2[yw4.o.FORBEARANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[yw4.o.TDPD_THRESHOLD_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yw4.o.FACILITY_TERMINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yw4.o.FACILITY_DEACTIVATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yw4.o.DEBTOR_MARKED_WITH_PLAIS_TAG.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yw4.o.OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f201698b = iArr2;
    }
}

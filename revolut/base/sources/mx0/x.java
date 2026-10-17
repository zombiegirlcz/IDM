package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210098b;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.SCROLLABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.SCROLLABLE_CENTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.NON_SCROLLABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.NON_SCROLLABLE_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.FLEXBOX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l.COMPACT_FLEXBOX.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l.DYNAMIC_MORE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l.DYNAMIC_CIRCLE_ACTIONS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[l.HEADER_CIRCLE_ACTIONS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[l.HEADER_STYLED_CIRCLE_ACTIONS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f210097a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.NEGATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        f210098b = iArr2;
    }
}

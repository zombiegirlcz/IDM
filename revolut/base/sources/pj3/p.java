package pj3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f236646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f236647c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[fj3.f.values().length];
        try {
            iArr[fj3.f.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fj3.f.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fj3.f.DYNAMIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f236645a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o.LAST_PAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o.DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f236646b = iArr2;
        int[] iArr3 = new int[hj3.e.values().length];
        try {
            iArr3[hj3.e.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[hj3.e.END_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[hj3.e.ALL_SCREENS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f236647c = iArr3;
        int[] iArr4 = new int[hj3.f.values().length];
        try {
            iArr4[hj3.f.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[hj3.f.FIN_CRIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
    }
}

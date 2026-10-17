package t5f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f268088b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CONSERVATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.CAUTIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.AGGRESSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f268087a = iArr;
        int[] iArr2 = new int[xdh.a.values().length];
        try {
            iArr2[xdh.a.CONSERVATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[xdh.a.CAUTIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[xdh.a.BALANCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[xdh.a.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[xdh.a.AGGRESSIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f268088b = iArr2;
    }
}

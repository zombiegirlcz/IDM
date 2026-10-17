package gyi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f147895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f147896b;

    static {
        int[] iArr = new int[svi.p.values().length];
        try {
            iArr[svi.p.METAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[svi.p.ULTRA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[svi.p.PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[svi.p.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[svi.p.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f147895a = iArr;
        int[] iArr2 = new int[svi.q.values().length];
        try {
            iArr2[svi.q.LIMITED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[svi.q.GIFTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[svi.q.RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[svi.q.UNLIMITED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[svi.q.COMPANION.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[svi.q.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f147896b = iArr2;
    }
}

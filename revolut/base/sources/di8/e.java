package di8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f114949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f114950c;

    static {
        int[] iArr = new int[yja.b.values().length];
        try {
            iArr[yja.b.NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yja.b.ALREADY_SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yja.b.CLOSE_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yja.b.NEXT_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f114948a = iArr;
        int[] iArr2 = new int[mh8.h.values().length];
        try {
            iArr2[mh8.h.Skip.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[mh8.h.Once.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mh8.h.Always.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f114949b = iArr2;
        int[] iArr3 = new int[th8.a.values().length];
        try {
            iArr3[th8.a.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[th8.a.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[th8.a.MAX_TOTAL_ACCOUNT_LIMIT_REACHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[th8.a.MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f114950c = iArr3;
    }
}

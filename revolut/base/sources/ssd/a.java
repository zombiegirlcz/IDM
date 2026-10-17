package ssd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f265368b;

    static {
        int[] iArr = new int[bla.c.values().length];
        try {
            iArr[bla.c.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bla.c.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bla.c.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bla.c.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f265367a = iArr;
        int[] iArr2 = new int[cfl.b.values().length];
        try {
            iArr2[cfl.b.TERMINATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cfl.b.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cfl.b.ONBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cfl.b.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cfl.b.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[cfl.b.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f265368b = iArr2;
    }
}

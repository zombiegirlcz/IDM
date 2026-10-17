package jyk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179468a;

    static {
        int[] iArr = new int[yzg.c.values().length];
        try {
            iArr[yzg.c.NOT_ONBOARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yzg.c.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yzg.c.ELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yzg.c.CLAIMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yzg.c.NOT_ELIGIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f179468a = iArr;
    }
}

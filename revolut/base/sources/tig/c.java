package tig;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f271523b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.WITH_SUCCESS_DESCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.WITHOUT_SUCCESS_DESCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.WITH_SPARE_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f271522a = iArr;
        int[] iArr2 = new int[hfg.c.values().length];
        try {
            iArr2[hfg.c.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hfg.c.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f271523b = iArr2;
    }
}

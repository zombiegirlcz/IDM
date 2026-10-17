package q97;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f243650b;

    static {
        int[] iArr = new int[z2.values().length];
        try {
            iArr[z2.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z2.CUSTODIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z2.PERSONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f243649a = iArr;
        int[] iArr2 = new int[bla.c.values().length];
        try {
            iArr2[bla.c.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[bla.c.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bla.c.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bla.c.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f243650b = iArr2;
    }
}

package d9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112306b;

    static {
        int[] iArr = new int[d1.values().length];
        f112306b = iArr;
        try {
            iArr[d1.CREATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f112306b[d1.FIELD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f112306b[d1.GETTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f112306b[d1.IS_GETTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f112306b[d1.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f112306b[d1.SETTER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f112306b[d1.ALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[g.values().length];
        f112305a = iArr2;
        try {
            iArr2[g.ANY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f112305a[g.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f112305a[g.NON_PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f112305a[g.PROTECTED_AND_PUBLIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f112305a[g.PUBLIC_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}

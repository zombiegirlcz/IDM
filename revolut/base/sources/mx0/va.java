package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210056b;

    static {
        int[] iArr = new int[ua.values().length];
        try {
            iArr[ua.Body3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ua.Emphasis1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f210055a = iArr;
        int[] iArr2 = new int[qa.values().length];
        try {
            iArr2[qa.SECONDARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qa.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f210056b = iArr2;
    }
}

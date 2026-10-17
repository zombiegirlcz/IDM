package k50;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181197b;

    static {
        int[] iArr = new int[v0.values().length];
        try {
            iArr[v0.PROMPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v0.MESSAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f181196a = iArr;
        int[] iArr2 = new int[v30.c0.values().length];
        try {
            iArr2[v30.c0.SUPPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v30.c0.ASSISTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v30.c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f181197b = iArr2;
    }
}

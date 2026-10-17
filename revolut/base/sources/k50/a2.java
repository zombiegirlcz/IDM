package k50;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181025b;

    static {
        int[] iArr = new int[v0.values().length];
        try {
            iArr[v0.MESSAGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v0.PROMPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f181024a = iArr;
        int[] iArr2 = new int[l30.f.values().length];
        try {
            iArr2[l30.f.MESSAGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l30.f.SUGGESTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f181025b = iArr2;
    }
}

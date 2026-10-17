package et0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129113a;

    static {
        int[] iArr = new int[xo0.e.values().length];
        try {
            iArr[xo0.e.CHAT_INPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xo0.e.REPLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xo0.e.SUGGESTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xo0.e.PROMPT_SUGGESTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f129113a = iArr;
    }
}

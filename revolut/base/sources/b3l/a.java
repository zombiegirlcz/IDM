package b3l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12140a;

    static {
        int[] iArr = new int[tmi.a.values().length];
        try {
            iArr[tmi.a.TermsAndPrivacyPolicy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tmi.a.ServiceTerms.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tmi.a.PrivacyPolicy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tmi.a.NoLinks.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f12140a = iArr;
    }
}

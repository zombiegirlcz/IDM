package vo8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f290919b;

    static {
        int[] iArr = new int[po8.f.values().length];
        try {
            iArr[po8.f.CONTACT_DISCOVERABILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[po8.f.REVTAG_DISCOVERABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290918a = iArr;
        int[] iArr2 = new int[eb8.j.values().length];
        try {
            iArr2[eb8.j.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[eb8.j.FORBIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f290919b = iArr2;
    }
}

package lrd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f199499a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.REVOLUT_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.LINK_EXTERNAL_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.PROPERTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.OTHER_ASSETS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f199499a = iArr;
    }
}

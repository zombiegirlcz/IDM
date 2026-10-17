package no;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217840a;

    static {
        int[] iArr = new int[o2.values().length];
        try {
            iArr[o2.SEND_ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o2.SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o2.SEND_ONLY_CHANGES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o2.SEND_PER_DAY_OR_CHANGES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f217840a = iArr;
    }
}

package jb9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f172617a;

    static {
        int[] iArr = new int[v89.a.values().length];
        try {
            iArr[v89.a.PASSCODE_CONTAINS_CURRENT_DATE_ERROR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v89.a.PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE_ERROR_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v89.a.PASSCODE_IS_NOT_STRONG_ERROR_CODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f172617a = iArr;
    }
}

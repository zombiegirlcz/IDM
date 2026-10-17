package xs;

import vs.f;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308381a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DATE_OF_BIRTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.EXPIRY_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.SECURITY_CODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f308381a = iArr;
    }
}

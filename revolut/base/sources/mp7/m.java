package mp7;

import kl7.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207779a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u.FAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f207779a = iArr;
    }
}

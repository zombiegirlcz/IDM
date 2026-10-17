package jk4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f175083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f175084b;

    static {
        int[] iArr = new int[bk4.i.values().length];
        try {
            iArr[bk4.i.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f175083a = iArr;
        int[] iArr2 = new int[bk4.h.values().length];
        try {
            iArr2[bk4.h.POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[bk4.h.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f175084b = iArr2;
    }
}

package sb4;

import xu3.z;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261504a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f261504a = iArr;
    }
}

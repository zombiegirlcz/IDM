package ywb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317412a;

    static {
        int[] iArr = new int[tvb.d.values().length];
        try {
            iArr[tvb.d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tvb.d.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tvb.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f317412a = iArr;
    }
}

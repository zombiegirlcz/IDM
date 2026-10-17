package unc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281412a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.ENABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281412a = iArr;
    }
}

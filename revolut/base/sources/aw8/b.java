package aw8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10750a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ACCESS_DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.DISABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f10750a = iArr;
    }
}

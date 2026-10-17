package ar5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8519a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.COMPATIBLE_ADDRESSES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.INCOMPATIBLE_ADDRESSES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8519a = iArr;
    }
}

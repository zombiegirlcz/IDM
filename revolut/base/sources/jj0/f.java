package jj0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174621a;

    static {
        int[] iArr = new int[zm0.e.values().length];
        try {
            iArr[zm0.e.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zm0.e.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zm0.e.TRANSIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f174621a = iArr;
    }
}

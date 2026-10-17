package ksf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189452a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CATEGORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.REASON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.PREDEFINED_CATEGORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.PREDEFINED_REASON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f189452a = iArr;
    }
}

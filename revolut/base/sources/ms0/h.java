package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208267b;

    static {
        int[] iArr = new int[cw0.h.values().length];
        try {
            iArr[cw0.h.REMOVABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cw0.h.EDITABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208266a = iArr;
        int[] iArr2 = new int[cw0.f.values().length];
        try {
            iArr2[cw0.f.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cw0.f.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f208267b = iArr2;
    }
}

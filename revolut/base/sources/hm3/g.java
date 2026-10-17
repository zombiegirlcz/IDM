package hm3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f153530b;

    static {
        int[] iArr = new int[kbk.h.values().length];
        try {
            iArr[kbk.h.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kbk.h.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kbk.h.RECEIVER_PRIVACY_BLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f153529a = iArr;
        int[] iArr2 = new int[yja.b.values().length];
        try {
            iArr2[yja.b.NEXT_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yja.b.ALREADY_SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yja.b.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yja.b.CLOSE_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f153530b = iArr2;
    }
}

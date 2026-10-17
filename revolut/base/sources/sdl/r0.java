package sdl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f262057b;

    static {
        int[] iArr = new int[cfl.o.values().length];
        try {
            iArr[cfl.o.TRANSFER_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.o.TRANSFER_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f262056a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.TRANSFER_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q0.TRANSFER_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f262057b = iArr2;
    }
}

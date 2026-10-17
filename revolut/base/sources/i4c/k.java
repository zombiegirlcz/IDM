package i4c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158404a;

    static {
        int[] iArr = new int[d3c.o.values().length];
        try {
            iArr[d3c.o.AWAITING_DISPATCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d3c.o.DISPATCHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d3c.o.DELIVERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d3c.o.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f158404a = iArr;
    }
}

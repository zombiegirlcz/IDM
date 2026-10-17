package vr9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291537b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.OWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.OWES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f291536a = iArr;
        int[] iArr2 = new int[st9.b.values().length];
        try {
            iArr2[st9.b.DUMB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[st9.b.SMART.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f291537b = iArr2;
    }
}

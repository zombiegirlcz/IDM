package ht0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f155114b;

    static {
        int[] iArr = new int[ms0.v.values().length];
        try {
            iArr[ms0.v.NoBackground.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f155113a = iArr;
        int[] iArr2 = new int[iw0.e.values().length];
        try {
            iArr2[iw0.e.GREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[iw0.e.RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[iw0.e.GREY.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f155114b = iArr2;
    }
}

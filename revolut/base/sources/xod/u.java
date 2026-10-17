package xod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307826b;

    static {
        int[] iArr = new int[qzi.i.values().length];
        try {
            iArr[qzi.i.Personal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qzi.i.Joint.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f307825a = iArr;
        int[] iArr2 = new int[qzi.g.values().length];
        try {
            iArr2[qzi.g.OVERSPENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qzi.g.ON_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qzi.g.NOT_ON_TRACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f307826b = iArr2;
    }
}

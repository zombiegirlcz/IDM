package aie;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5237a;

    static {
        int[] iArr = new int[qv0.k.values().length];
        try {
            iArr[qv0.k.Middle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qv0.k.Bottom.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qv0.k.Top.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qv0.k.Single.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qv0.k.Header.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qv0.k.OutOfGroup.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f5237a = iArr;
    }
}

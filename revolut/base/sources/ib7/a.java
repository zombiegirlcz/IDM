package ib7;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f160107b;

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
        f160106a = iArr;
        int[] iArr2 = new int[na7.b.values().length];
        try {
            iArr2[na7.b.SECRET.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[na7.b.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f160107b = iArr2;
    }
}

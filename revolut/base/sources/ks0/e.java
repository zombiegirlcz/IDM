package ks0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f189068b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.Group.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.Box.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f189067a = iArr;
        int[] iArr2 = new int[qv0.k.values().length];
        try {
            iArr2[qv0.k.Top.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qv0.k.Middle.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qv0.k.Bottom.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qv0.k.Single.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qv0.k.Header.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qv0.k.OutOfGroup.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f189068b = iArr2;
    }
}

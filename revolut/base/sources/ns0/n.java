package ns0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f218711b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.Sign.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.Percentage.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.Separator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.Currency.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.Other.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f218710a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.Move.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l.FadeIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l.RollIn.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[l.FadeOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[l.RollOut.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f218711b = iArr2;
    }
}

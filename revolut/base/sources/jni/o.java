package jni;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f176798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f176799c;

    static {
        int[] iArr = new int[lni.b.values().length];
        try {
            iArr[lni.b.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lni.b.TELEPHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lni.b.WHATSAPP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f176797a = iArr;
        int[] iArr2 = new int[mni.b.values().length];
        try {
            iArr2[mni.b.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mni.b.TELEPHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[mni.b.WHATSAPP.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f176798b = iArr2;
        int[] iArr3 = new int[lni.j.values().length];
        try {
            iArr3[lni.j.REAUTHENTICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[lni.j.SIGN_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[lni.j.SIGN_UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f176799c = iArr3;
    }
}

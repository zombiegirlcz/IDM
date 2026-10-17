package yjl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314541b;

    static {
        int[] iArr = new int[jkl.i.values().length];
        try {
            iArr[jkl.i.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jkl.i.RCS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jkl.i.SMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jkl.i.TELEPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jkl.i.WHATSAPP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f314540a = iArr;
        int[] iArr2 = new int[mni.b.values().length];
        try {
            iArr2[mni.b.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mni.b.RCS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[mni.b.SMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[mni.b.TELEPHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[mni.b.WHATSAPP.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f314541b = iArr2;
    }
}

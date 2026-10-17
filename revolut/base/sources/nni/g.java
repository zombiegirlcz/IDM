package nni;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217686a;

    static {
        int[] iArr = new int[mni.b.values().length];
        try {
            iArr[mni.b.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mni.b.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mni.b.TELEPHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mni.b.WHATSAPP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[mni.b.RCS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f217686a = iArr;
    }
}

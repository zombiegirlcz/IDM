package jni;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176808a;

    static {
        int[] iArr = new int[lni.b.values().length];
        try {
            iArr[lni.b.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lni.b.WHATSAPP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lni.b.TELEPHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f176808a = iArr;
    }
}

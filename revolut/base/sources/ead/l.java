package ead;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124203a;

    static {
        int[] iArr = new int[t9d.d.values().length];
        try {
            iArr[t9d.d.Pdf.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t9d.d.Email.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t9d.d.Payment.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f124203a = iArr;
    }
}

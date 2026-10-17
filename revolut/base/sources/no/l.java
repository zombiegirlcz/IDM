package no;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217809a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.Business.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.Retail.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.Junior.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.RevolutX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.Terminal.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f217809a = iArr;
    }
}

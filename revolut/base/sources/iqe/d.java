package iqe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167821a;

    static {
        int[] iArr = new int[gqe.b.values().length];
        try {
            iArr[gqe.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gqe.b.DOCUMENTS_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gqe.b.REVIEWING_DOCUMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f167821a = iArr;
    }
}

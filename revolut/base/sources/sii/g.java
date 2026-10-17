package sii;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263639a;

    static {
        int[] iArr = new int[uii.c.values().length];
        try {
            iArr[uii.c.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uii.c.DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uii.c.EXPLANATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f263639a = iArr;
    }
}

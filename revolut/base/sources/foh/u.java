package foh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136983a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.MOVER_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.TIME_SPAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f136983a = iArr;
    }
}

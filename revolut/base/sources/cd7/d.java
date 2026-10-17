package cd7;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23206a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.Joint.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.Personal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f23206a = iArr;
    }
}

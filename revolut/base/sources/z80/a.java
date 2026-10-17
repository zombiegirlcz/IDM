package z80;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f320031a;

    static {
        int[] iArr = new int[yk0.b.values().length];
        try {
            iArr[yk0.b.INTERNATIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yk0.b.E164.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yk0.b.NATIONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yk0.b.RFC3966.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f320031a = iArr;
    }
}

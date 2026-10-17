package zph;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324310b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324309a = iArr;
        int[] iArr2 = new int[soh.h.values().length];
        try {
            iArr2[soh.h.CLOSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[soh.h.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f324310b = iArr2;
    }
}

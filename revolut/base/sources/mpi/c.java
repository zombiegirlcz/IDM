package mpi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207818b;

    static {
        int[] iArr = new int[al0.a.values().length];
        try {
            iArr[al0.a.OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[al0.a.ONLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f207817a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.STATUS_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b.BOTTOM_DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f207818b = iArr2;
    }
}

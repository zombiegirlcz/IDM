package br9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17960b;

    static {
        int[] iArr = new int[ar9.c.values().length];
        try {
            iArr[ar9.c.DUMB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ar9.c.SMART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17959a = iArr;
        int[] iArr2 = new int[st9.b.values().length];
        try {
            iArr2[st9.b.DUMB.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[st9.b.SMART.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f17960b = iArr2;
    }
}

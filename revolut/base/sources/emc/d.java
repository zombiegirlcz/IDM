package emc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127648a;

    static {
        int[] iArr = new int[xdh.c.values().length];
        try {
            iArr[xdh.c.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xdh.c.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xdh.c.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xdh.c.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xdh.c.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f127648a = iArr;
    }
}

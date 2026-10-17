package gu4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146698a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.INACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.NON_CONFIGURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f146698a = iArr;
    }
}

package vlk;

import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290501a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w0.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f290501a = iArr;
    }
}

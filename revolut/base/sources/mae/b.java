package mae;

import hha.w0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203998a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.PREMIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.METAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w0.ULTRA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f203998a = iArr;
    }
}

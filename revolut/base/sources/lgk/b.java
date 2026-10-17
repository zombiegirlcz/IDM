package lgk;

import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195127a;

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
        f195127a = iArr;
    }
}

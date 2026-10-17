package ac1;

import fa1.g;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3015a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.EXTREMELY_LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SUFFICIENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3015a = iArr;
    }
}

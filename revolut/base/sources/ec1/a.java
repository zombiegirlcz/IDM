package ec1;

import fa1.g;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124406a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.SUFFICIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.LOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.EXTREMELY_LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f124406a = iArr;
    }
}

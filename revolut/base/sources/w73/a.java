package w73;

import n93.f;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f295463a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f295463a = iArr;
    }
}

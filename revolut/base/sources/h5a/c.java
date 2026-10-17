package h5a;

import c5a.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149520a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.EMBEDDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.FULLSCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f149520a = iArr;
    }
}

package vf;

import xf.n;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f288378a;

    static {
        int[] iArr = new int[n.values().length];
        f288378a = iArr;
        try {
            iArr[n.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f288378a[n.FOREGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

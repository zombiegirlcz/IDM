package xhc;

import ggc.x;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305849a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f305849a = iArr;
    }
}

package iy0;

import dy0.r;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169578a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.SHOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f169578a = iArr;
    }
}

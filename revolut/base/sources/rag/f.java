package rag;

import ufi.h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252850a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.EXACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.NEARBY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.EXTENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f252850a = iArr;
    }
}

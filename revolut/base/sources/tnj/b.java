package tnj;

import dej.o1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272461a;

    static {
        int[] iArr = new int[o1.values().length];
        try {
            iArr[o1.INSTALLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o1.ORDERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272461a = iArr;
    }
}

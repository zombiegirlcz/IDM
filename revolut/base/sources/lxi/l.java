package lxi;

import svi.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200590a;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.ULTRA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f200590a = iArr;
    }
}
